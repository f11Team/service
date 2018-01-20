package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.ScoreUploadMapper;
import cn.com.wtrj.jx.web.portal.model.dao.TeacherMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserRoleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.Teacher;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.service.TeacherService;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.Role;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;

	@Autowired
	private WtrjUserMapper wtrjUserMapper;

	@Autowired
	private ScoreUploadMapper scoreUploadMapper;
	
	@Autowired
	private WtrjTeacherMapper wtrjTeacherMapper;
	
	private WtrjUserRoleMapper roleMapper;
	
	@Override
	public Teacher getTeacher(int id) {

		Teacher t = teacherMapper.selectByPrimaryKey(id);

		if (t != null) {
			List<School> ss = teacherMapper.findTeacherSelectionSchools(String.valueOf(id));
			t.setSlist(ss);
		}
		return t;
	}

	@Override
	@Transactional
	public void addTeacher(Teacher teacher) {

		List<TeacherPermission> tps = teacherMapper.findTeacherPermissionsByPhone(teacher.getPhone());

		boolean has = false;

		// 判断用户是否存在
		if (tps != null && tps.size() > 0) {
			has = true;
		}

		if (has) {
			// 判断 录入不存在的教习学校关联信息
			for (School s : teacher.getSchools()) {

				boolean need = true;
				Integer teacherId = null;

				for (TeacherPermission tp : tps) {

					teacherId = tp.getTeacherId();

					if (tp.getSchoolCode().equals(s.getCode())) {
						need = false;
					}
				}

				if (need) {
					teacherMapper.insertTeacherPermission(teacherId, s.getCode(), s.getName(), "100");
				}
			}

		} else {
			List<WtrjUser> us = wtrjUserMapper.findUserForTeacher(teacher.getPhone(), teacher.getJobNumber());
			Integer userId = null;
			if (us == null || us.size() == 0) {
				WtrjUser u = new WtrjUser();
				u.setName(teacher.getJobNumber());
				u.setPwd("123456");
				u.setTel(teacher.getPhone());
				wtrjUserMapper.insert(u);
				
				userId = u.getId();
				
			} else {
				userId = us.get(0).getId();
			}
			teacher.setUserId(userId);
			teacherMapper.insert(teacher);

			if (teacher.getId() != null && teacher.getSchools() != null && teacher.getSchools().length > 0) {
				for (School s : teacher.getSchools()) {
					teacherMapper.insertTeacherPermission(teacher.getId(), s.getCode(), s.getName(), "100");
				}
			}
		}

	}

	@Override
	public void deleteTeacher(int id) {

	}

	@Override
	public List<Teacher> searchTeachersByPage(Integer start, Integer end, List<String> schoolCodes, String search) {
		return teacherMapper.selectTeachersByPage(start, end, schoolCodes, search);
	}

	@Override
	public int countTeachers(List<String> schoolCodes, String search) {
		return teacherMapper.countTeachers(schoolCodes, search);
	}

	@Override
	public List<School> findTeacherSelectionSchools(String teacherId) {
		return teacherMapper.findTeacherSelectionSchools(teacherId);
	}

	@Override
	public List<School> findUserSchools(Integer teacherId) {
		return teacherMapper.findUserSchools(teacherId);
	}

	@Override
	public List<TeacherPermission> findTeacherSchoolPermissionInfos(Integer teacherId) {
		return teacherMapper.findTeacherSchoolPermissionInfos(teacherId);
	}

	@Override
	public List<Grade> findGradesBySchoolCode(String schoolCode) {

		List<Grade> gs = teacherMapper.findGradesBySchoolCode(schoolCode);

		List<SchoolClass> cs = teacherMapper.findClassesBySchoolCode(schoolCode);

		for (Grade g : gs) {

			if ("1".equals(g.getStage())) {
				g.setStageName("小学");
			}

			if ("2".equals(g.getStage())) {
				g.setStageName("初中");
			}

			if ("3".equals(g.getStage())) {
				g.setStageName("高中");
			}

			for (SchoolClass c : cs) {

				if (c.getGrade().equals(g.getGrade()) && c.getStage().equals(g.getStage())) {

					if (g.getClasses() == null) {
						g.setClasses(new ArrayList<SchoolClass>());
						g.getClasses().add(c);
					} else {
						g.getClasses().add(c);
					}
				}

			}

		}

		return gs;
	}

	@Override
	public List<TeacherPermission> findTeacherRoleInfos(String roleType, String schoolCode, Integer teacherId) {

		return teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, roleType);

	}

	@Override
	public List<Role> findTeacherRoles(Integer teacherId, String schoolCode) {

		List<Role> roles = new ArrayList<Role>();

		/*
		 * List<TeacherPermission> ptList =
		 * teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "0");
		 * 
		 * if(ptList != null && ptList.size() > 0) { roles.add(new Role("0",
		 * "工作人员", null)); }
		 */

		List<TeacherPermission> rkList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "1");

		if (rkList != null && rkList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : rkList) {
				sb.append(tp.getClassName());
				sb.append(" [").append(tp.getCourseName()).append("]<br/>");
			}

			roles.add(new Role("1", "任课教师", sb.toString()));
		}

		List<TeacherPermission> jyList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "2");

		if (jyList != null && jyList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : jyList) {
				
				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}
				
				sb.append(" ").append(tp.getCourseName()).append("<br/>");
			}
			roles.add(new Role("2", "教研组长", sb.toString()));
		}

		List<TeacherPermission> bkList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "3");

		if (bkList != null && bkList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : bkList) {

				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}

				sb.append(tp.getGrade()).append("年级 ");
				sb.append("[").append(tp.getCourseName()).append("]<br/>");
			}
			roles.add(new Role("3", "备课组长", sb.toString()));
		}

		List<TeacherPermission> njList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "4");

		if (njList != null && njList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : njList) {

				if ("1".equals(tp.getStage())) {
					sb.append("小学 ");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}

				sb.append(tp.getGrade()).append("年级").append("<br/>");
			}
			roles.add(new Role("4", "年级组长", sb.toString()));
		}

		List<TeacherPermission> bzrList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "5");

		if (bzrList != null && bzrList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : bzrList) {

				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}

				sb.append(tp.getGrade()).append("年级  ");

				sb.append(tp.getClassName());
				sb.append("<br/>");
			}
			roles.add(new Role("5", "班主任", sb.toString()));
		}

		List<TeacherPermission> xbldList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "6");

		if (xbldList != null && xbldList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : xbldList) {
				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}
				
				sb.append("<br/>");
			}
			roles.add(new Role("6", "学部领导", sb.toString()));
		}
		
		List<TeacherPermission> sfList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "7");

		if (sfList != null && sfList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : sfList) {

				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}

				sb.append(tp.getGrade()).append("年级  ");

				sb.append(tp.getClassName());
				sb.append("<br/>");
			}
			roles.add(new Role("7", "生辅老师", sb.toString()));
		}
		
		List<TeacherPermission> dyldList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "8");

		if (dyldList != null && dyldList.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (TeacherPermission tp : dyldList) {
				if ("1".equals(tp.getStage())) {
					sb.append("小学");
				}

				if ("2".equals(tp.getStage())) {
					sb.append("初中");
				}

				if ("3".equals(tp.getStage())) {
					sb.append("高中");
				}
				
				sb.append("<br/>");
			}
			roles.add(new Role("8", "德育老师", sb.toString()));
		}

		return roles;
	}

	@Override
	public void addTeacherRole(TeacherPermission tp) {

		if (tp != null) {
			if ("1".equals(tp.getRoleType())) {

				for (SchoolClass c : tp.getClasses()) {

					TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
							Integer.valueOf(c.getGrade()), Integer.valueOf(c.getClassId()), tp.getCourseCode(), "2",
							tp.getSchoolName(), c.getClassName(), c.getStage(), tp.getCourseName());

					teacherMapper.saveTeacherPermission(t);

				}

			}

			if ("2".equals(tp.getRoleType())) {
				tp.setType("6");
				
				
				List<String> stages = teacherMapper.findTeacherStages(tp.getSchoolCode());
				
				if(stages != null && stages.size() >0) {
					for(String stage : stages) {
						
						tp.setStage(stage);

						teacherMapper.saveTeacherPermission(tp);
						
					}
				}
				

			}

			if ("3".equals(tp.getRoleType())) {

				/*
				 * for(String g : tp.getGrades()) {
				 * 
				 * TeacherPermission t = new
				 * TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
				 * Integer.valueOf(g), tp.getCourseCode(), "4",
				 * tp.getSchoolName(), tp.getStage(), tp.getCourseName());
				 * 
				 * teacherMapper.saveTeacherPermission(t);
				 * 
				 * }
				 */

				for (Grade g : tp.getGrades()) {

					TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
							Integer.valueOf(g.getGrade()), tp.getCourseCode(), "4", tp.getSchoolName(), g.getStage(),
							tp.getCourseName());

					teacherMapper.saveTeacherPermission(t);

				}

			}

			if ("4".equals(tp.getRoleType())) {

				// for(String g : tp.getGrades()) {
				for (Grade g : tp.getGrades()) {
					TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
							// Integer.valueOf(g), "5",
							Integer.valueOf(g.getGrade()), "5", tp.getSchoolName(), g.getStage());

					teacherMapper.saveTeacherPermission(t);

				}
			}

			if ("5".equals(tp.getRoleType())) {

				for (SchoolClass c : tp.getClasses()) {

					TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
							Integer.valueOf(c.getGrade()), Integer.valueOf(c.getClassId()), "1", tp.getSchoolName(),
							c.getClassName(), c.getStage());

					teacherMapper.saveTeacherPermission(t);

				}

			}

			if ("6".equals(tp.getRoleType())) {

				List<String> stages = teacherMapper.findTeacherStages(tp.getSchoolCode());
				
				if(stages != null && stages.size() >0) {
					for(String stage : stages) {
						
						TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(), "101",
								tp.getSchoolName(), stage);

						teacherMapper.saveTeacherPermission(t);
						
					}
				}
			}
			if ("7".equals(tp.getRoleType())) {

				for (SchoolClass c : tp.getClasses()) {

					TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(),
							Integer.valueOf(c.getGrade()), Integer.valueOf(c.getClassId()), "3", tp.getSchoolName(),
							c.getClassName(), c.getStage());

					teacherMapper.saveTeacherPermission(t);

				}

			}
			if ("8".equals(tp.getRoleType())) {

				List<String> stages = teacherMapper.findTeacherStages(tp.getSchoolCode());
				
				if(stages != null && stages.size() >0) {
					for(String stage : stages) {
						
						TeacherPermission t = new TeacherPermission(tp.getTeacherId(), tp.getSchoolCode(), "7",
								tp.getSchoolName(), stage);

						teacherMapper.saveTeacherPermission(t);
						
					}
				}
			}
			
		}

	}

	@Override
	public Teacher findTeacherByPhone(String phone) {
		return teacherMapper.findTeacherByPhone(phone);
	}

	@Override
	public void deleteTeacherRole(Integer teacherId, String type, String schoolCode) {
		teacherMapper.deleteTeacherRole(teacherId, type, schoolCode);
	}

	@Override
	public void editTeacher(Teacher teacher, List<School> list) {

		// Teacher t = teacherMapper.selectByPrimaryKey(teacher.getId());

		List<School> removeList = new ArrayList<School>();

		Teacher t = teacherMapper.selectByPrimaryKey(teacher.getId());

		if (t != null) {

			List<TeacherPermission> tps = teacherMapper.findTeacherSchoolPermissionInfos(t.getId());

			// ▼▼设计变更--员工号、手机号同步 20170924 wusm
			// if(!teacher.getPhone().equals(t.getPhone())) {
			// //通过手机号
			// WtrjUser u = wtrjUserMapper.findUserByPhone(t.getPhone());
			// if(u != null) {
			// u.setTel(teacher.getPhone());
			// wtrjUserMapper.updateByPrimaryKey(u);
			// }
			// else {
			// //通过员工号
			// u = wtrjUserMapper.findUserByJobNumber(t.getJobNumber());
			// if(u != null) {
			// u.setTel(teacher.getPhone());
			// wtrjUserMapper.updateByPrimaryKey(u);
			// }
			// }
			// }
			if (!teacher.getPhone().equals(t.getPhone())
					|| (teacher.getJobNumber() != null && !teacher.getJobNumber().equals(t.getJobNumber()))) {
				if (t.getUserId() != null) {
					// 通过手机号
					WtrjUser u = wtrjUserMapper.selectByPrimaryKey(t.getUserId());
					if (u != null) {
						u.setTel(teacher.getPhone());
						u.setName(teacher.getJobNumber());
						wtrjUserMapper.updateByPrimaryKey(u);
					}
				} else {
					List<WtrjUser> us = wtrjUserMapper.findUserForTeacher(teacher.getPhone(), teacher.getJobNumber());
					Integer userId = null;
					if (us == null || us.size() == 0) {
						WtrjUser u = new WtrjUser();
						u.setName(teacher.getJobNumber());
						u.setPwd("123456");
						u.setTel(teacher.getPhone());
						wtrjUserMapper.insert(u);
						
						userId = u.getId();
						
					} else {
						WtrjUser u = us.get(0);
						u.setTel(teacher.getPhone());
						u.setName(teacher.getJobNumber());
						wtrjUserMapper.updateByPrimaryKey(u);
						
						userId = us.get(0).getId();
					}
					teacher.setUserId(userId);
				}
			}
			// ▲▲设计变更--员工号、手机号同步
			WtrjTeacher wt = new WtrjTeacher();
			wt.setId(teacher.getId());
			wt.setJobNumber(teacher.getJobNumber());
			wt.setPhone(teacher.getPhone());
			wt.setUserId(teacher.getUserId());
			wt.setName(teacher.getName());
			wt.setSex(Integer.valueOf(teacher.getSex()));
			wtrjTeacherMapper.updateByPrimaryKeySelective(wt);

			// 获取没有选中的学校
			for (School s : list) {
				removeList.add(s);
				for (School c : teacher.getSchools()) {
					if (c.getCode().equals(s.getCode())) {
						removeList.remove(s);
					}
				}

			}

			for (School s : removeList) {
				// 没选中的在历史记录中存在的需要删除
				teacherMapper.deleteTeacherRole(teacher.getId(), "", s.getCode());

			}

			for (School s : teacher.getSchools()) {
				boolean need = true;

				for (TeacherPermission tp : tps) {
					if (tp.getSchoolCode().equals(s.getCode())) {
						need = false;
					}
				}

				// 选中的历史记录中存在的不需要处理
				if (need) {
					teacherMapper.insertTeacherPermission(teacher.getId(), s.getCode(), s.getName(), "100");
				}

			}

		}

	}

	@Override
	public List<Role> findTeacherRoleTypes(Integer teacherId, String schoolCode) {

		List<Role> roles = new ArrayList<Role>();

		List<TeacherPermission> rkList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "1");

		if (rkList != null && rkList.size() > 0) {
			Role r = new Role("1", "任课教师", "");

			List<String> classes = new ArrayList<String>();
			List<String> classNames = new ArrayList<String>();
			List<String> stages = new ArrayList<String>();
			List<String> grades = new ArrayList<String>();
			//设置任课教师关联信息
			for (TeacherPermission tp : rkList) {
				classes.add(String.valueOf(tp.getClassId()));
				classNames.add(tp.getClassName());
				stages.add(tp.getStage());
				grades.add(String.valueOf(tp.getGrade()));
			}
			r.setClasses(classes);
			r.setClassNames(classNames);
			r.setStage(stages);
			r.setGrades(grades);
			roles.add(r);
		}

		List<TeacherPermission> jyList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "2");

		if (jyList != null && jyList.size() > 0) {
			List<String> courses = new ArrayList<String>();
			List<String> courseNames = new ArrayList<String>();
			
			for (TeacherPermission tp : jyList) {
				courses.add(tp.getCourseCode());
				courseNames.add(tp.getCourseName());
			}
			
			Role r = new Role("2", "教研组长", "");
			
			r.setCourses(courses);
			r.setCourseNames(courseNames);
			
			roles.add(r);
		}

		List<TeacherPermission> bkList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "3");

		if (bkList != null && bkList.size() > 0) {
			
			List<String> stages = new ArrayList<String>();
			List<String> grades = new ArrayList<String>();
			List<String> courses = new ArrayList<String>();
			List<String> courseNames = new ArrayList<String>();
			
			for (TeacherPermission tp : bkList) {
				stages.add(tp.getStage());
				grades.add(String.valueOf(tp.getGrade()));
				courses.add(tp.getCourseCode());
				courseNames.add(tp.getCourseName());
			}
			
			Role r = new Role("3", "备课组长", "");
			
			r.setStage(stages);
			r.setGrades(grades);
			r.setCourses(courses);
			r.setCourseNames(courseNames);
			
			roles.add(r);
		}

		List<TeacherPermission> njList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "4");

		if (njList != null && njList.size() > 0) {
			
			Role r = new Role("4", "年级组长", "");
			
			List<String> stages = new ArrayList<String>();
			List<String> grades = new ArrayList<String>();
			
			for (TeacherPermission tp : njList) {
				stages.add(tp.getStage());
				grades.add(String.valueOf(tp.getGrade()));
			}
			r.setStage(stages);
			r.setGrades(grades);
			
			roles.add(r);
		}

		List<TeacherPermission> bzrList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "5");

		if (bzrList != null && bzrList.size() > 0) {

			Role r = new Role("5", "班主任", "");

			List<String> classes = new ArrayList<String>();
			List<String> classNames = new ArrayList<String>();
			List<String> stages = new ArrayList<String>();
			List<String> grades = new ArrayList<String>();

			for (TeacherPermission tp : bzrList) {
				classes.add(String.valueOf(tp.getClassId()));
				classNames.add(tp.getClassName());
				stages.add(tp.getStage());
				grades.add(String.valueOf(tp.getGrade()));
			}

			r.setClasses(classes);
			r.setStage(stages);
			r.setGrades(grades);
			r.setClassNames(classNames);

			roles.add(r);

		}

		List<TeacherPermission> xbldList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "6");

		if (xbldList != null && xbldList.size() > 0) {
			roles.add(new Role("6", "学部领导", ""));
		}

		List<TeacherPermission> sfList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "7");

		if (sfList != null && sfList.size() > 0) {
			roles.add(new Role("7", "生辅老师", ""));
		}

		List<TeacherPermission> dyList = teacherMapper.findTeacherRoleInfo(teacherId, schoolCode, "8");

		if (dyList != null && dyList.size() > 0) {
			roles.add(new Role("8", "德育老师", ""));
		}

		return roles;
	}
	

	@Override
	public List<String> findTeacherStages(String schoolCode) {
		return teacherMapper.findTeacherStages(schoolCode);
	}

	@Override
	public List<TeacherPermission> findTeacherPermissionClass(Integer teacherId, String type, String schoolCode) {

		List<TeacherPermission> classes = null;
		String teacherType="";
		if("1".equals(type)) {
			teacherType="2";
		}else if("2".equals(type)) {
			teacherType="6";
		}else if("3".equals(type)) {
			teacherType="4";
		}else if("4".equals(type)) {
			teacherType="5";
		}else if("5".equals(type)) {
			teacherType="1";
		}else if("6".equals(type)) {
			teacherType="101";
		}else if("7".equals(type)) {
			teacherType="3";
		}else if("8".equals(type)) {
			teacherType="7";
		}else {
			teacherType="100";
		}
		if ("8".equals(type)) {
			List<SchoolClass> tcs = scoreUploadMapper.findClassesBySchoolCode(schoolCode);
			if (tcs != null && tcs.size() > 0) {
				classes = new ArrayList<TeacherPermission>();

				for (SchoolClass c : tcs) {
					TeacherPermission cls = new TeacherPermission();
					cls.setClassId(Integer.valueOf(c.getClassId()));
					cls.setClassName(c.getClassName());
					cls.setSchoolCode(c.getSchoolCode());
					cls.setSchoolName(c.getSchoolName());
					cls.setGrade(Integer.valueOf(c.getGrade()));
					cls.setStage(c.getStage());
					classes.add(cls);
				}
			}
		} else {
			classes = this.teacherMapper.findTeacherClassesPermissionInfosByTeacherIdAndSchoolCode(teacherId,
					schoolCode,teacherType);
		}

		return classes;
	}

	@Override
	public List<String> findTeacherGrades(String schoolCode, String stage) {
		return teacherMapper.findTeacherGrades(schoolCode, stage);
	}

	@Override
	public List<SchoolClass> findTeacherClasses(String schoolCode, String stage, String grade) {
		return teacherMapper.findTeacherClasses(schoolCode, stage, grade);
	}

	@Override
	public WtrjTeacher findTeacherById(Integer id) {
		return wtrjTeacherMapper.selectByPrimaryKey(id);
	}

	@Override
	public String selectUserRoleById(Integer id) {
		return roleMapper.selectRoleByUserId(id);
	}

	


}
