package cn.com.wtrj.jx.web.portal.service.notice.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomClassMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomPermissionMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomPermissionRelationMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolGradeClassMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolGradeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolInfoMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionRelation;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionRelationExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeKey;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfoExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtEcomClassMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtPermissionMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassParentDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassTeacherDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseClassDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseTeacher;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtHeaderTeacher;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtPermissionClassInfoDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolTeacherInfo;
import cn.com.wtrj.jx.web.portal.service.dto.notice.AdminTeacher;
import cn.com.wtrj.jx.web.portal.service.dto.notice.EcomPermisson;
import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeClassKey;
import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeGradeKey;
import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeParentKey;
import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeTeacherKey;
import cn.com.wtrj.jx.web.portal.service.dto.notice.TeacherBaseInfo;
import cn.com.wtrj.jx.web.portal.service.notice.IEcomPermissionService;
import cn.com.wtrj.jx.web.portal.util.Constant;

@Service
public class EcomPermissionService implements IEcomPermissionService {

	@Autowired
	protected WtrjEcomPermissionMapper teacherAuthMapper;

	@Autowired
	protected WtrjSchoolGradeMapper schoolGradeMapper;

	@Autowired
	protected WtrjSchoolGradeClassMapper classMapper;

	@Autowired
	protected MtNoticeMapper noticeMapper;

	@Autowired
	protected WtrjEcomClassMapper classInfoMapper;

	@Autowired
	protected WtrjSchoolInfoMapper schoolInfoMapper;

	@Autowired
	protected MtEcomClassMapper ecomClassMapper;

	@Autowired
	protected MtPermissionMapper mtPermissionMapper;
	
	@Autowired
	protected WtrjEcomPermissionRelationMapper permissionRelationMapper;

	private List<MtPermissionClassInfoDto> searchClass(String schoolCode) {
		return ecomClassMapper.selectPermissionClassInfo(schoolCode, null, null);
	}

	private List<MtPermissionClassInfoDto> searchClass(String schoolCode, Integer stage) {
		return ecomClassMapper.selectPermissionClassInfo(schoolCode, stage, null);
	}

	private List<MtPermissionClassInfoDto> searchClass(String schoolCode, Integer stage, Integer grade) {
		return ecomClassMapper.selectPermissionClassInfo(schoolCode, stage, grade);
	}

	/**
	 * 获取学校所属年级
	 * 
	 * @param schoolCode
	 * @return
	 */
	private List<WtrjSchoolGradeKey> searchGrade(String schoolCode) {
		WtrjSchoolGradeExample example = new WtrjSchoolGradeExample();
		example.createCriteria().andSchoolCodeEqualTo(schoolCode);
		return schoolGradeMapper.selectByExample(example);
	}

	/**
	 * 获取学校所属年级--指定学部
	 * 
	 * @param schoolCode
	 * @return
	 */
	private List<WtrjSchoolGradeKey> searchGrade(String schoolCode, Integer stage) {
		WtrjSchoolGradeExample example = new WtrjSchoolGradeExample();
		example.createCriteria().andSchoolCodeEqualTo(schoolCode).andStageEqualTo(stage);
		return schoolGradeMapper.selectByExample(example);
	}

	@Override
	public EcomPermisson searchTeacherPermisson(Integer teacherId) {
		EcomPermisson permission = new EcomPermisson();

		WtrjEcomPermissionExample example = new WtrjEcomPermissionExample();
		example.createCriteria().andTeacherIdEqualTo(teacherId);

		List<WtrjEcomPermission> records = teacherAuthMapper.selectByExample(example);

		for (WtrjEcomPermission record : records) {
			String schoolCode = record.getSchoolCode();
			Integer stage = record.getStage() == null ? 0 : Integer.valueOf(record.getStage());
			Integer grade = record.getGrade() == null ? 0 : record.getGrade();
			Integer classId = record.getClassId() == null ? 0 : record.getClassId();
			String course = record.getCourseCode();
			String courseName = record.getCourseName();
			String type = record.getType();

			if (StringUtils.isNotEmpty(schoolCode)) {

				if (classId > 0 && StringUtils.isEmpty(course) && Constant.PermissionType.HEADER_TEACHER.equals(type)) { // 班主任
					// TODO--生辅老师暂不考虑
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// -------------------合并年级---------------------------
					this.mergeGradeToPermisson(schoolCode, stage, grade, permission);

					// --------------------合并班级--------------------------------
					WtrjEcomClass classInfo = classInfoMapper.selectByPrimaryKey(classId);
					this.mergeClassToPermisson(schoolCode, stage, grade, classInfo.getClassNo(),
							classInfo.getClassName(), classId, null, permission);

				} else if (classId > 0 && StringUtils.isNotEmpty(course)
						&& Constant.PermissionType.COURSE_TEAHCER.equals(type)) { // 课任老师TODO

					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// -------------------合并年级---------------------------
					this.mergeGradeToPermisson(schoolCode, stage, grade, permission);

					// --------------------合并班级--------------------------------
					WtrjEcomClass classInfo = classInfoMapper.selectByPrimaryKey(classId);
					this.mergeClassToPermisson(schoolCode, stage, grade, classInfo.getClassNo(),
							classInfo.getClassName(), classId, null, permission);

				} else if (grade > 0 && StringUtils.isNotEmpty(course)
						&& Constant.PermissionType.BEIKE_TEACHER.equals(type)) { // 备课组
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// -------------------合并年级---------------------------
					this.mergeGradeToPermisson(schoolCode, stage, grade, permission);

					// 获取班级
					List<MtCourseClassDto> dtos = noticeMapper.selectCourseClasses(schoolCode, stage, grade, course);

					for (MtCourseClassDto dto : dtos) {
						this.mergeClassToPermisson(schoolCode, stage, grade, dto.getClassNo(), dto.getClassName(),
								dto.getClassId(), course, permission);
					}
				} else if (grade > 0 && StringUtils.isEmpty(course)
						&& Constant.PermissionType.GRADE_LEADER.equals(type)) { // 年级组
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// -------------------合并年级---------------------------
					this.mergeGradeToPermisson(schoolCode, stage, grade, permission);

					// 获取班级
					List<MtPermissionClassInfoDto> dtos = this.searchClass(schoolCode, stage, grade);

					for (MtPermissionClassInfoDto dto : dtos) {
						this.mergeClassToPermisson(schoolCode, stage, grade, dto.getClassNo(), dto.getClassName(),
								dto.getClassId(), null, permission);
					}

				} else if (stage > 0 && StringUtils.isNotEmpty(course)
						&& Constant.PermissionType.RESEACHER_LEADER.equals(type)) { // 教研组
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// 根据学校+学部,获取年级
					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode, stage);
					for (WtrjSchoolGradeKey g : gs) {
						this.mergeGradeToPermisson(schoolCode, stage, g.getGrade(), permission);
					}

					// 合并所有班级
					List<MtPermissionClassInfoDto> csKeys = this.searchClass(schoolCode, stage);
					for (MtPermissionClassInfoDto c : csKeys) {
						this.mergeClassToPermisson(c.getSchoolCode(), c.getStage(), c.getGrade(), c.getClassNo(),
								c.getClassName(), c.getClassId(), course, permission);
					}
				} else if (StringUtils.isNotEmpty(schoolCode) && stage > 0 && grade == 0
						&& Constant.PermissionType.STAGE_LEADER.equals(type)) { // 学部领导
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// 合并年级--单独指定学校的情况,获取学校的所有年级
					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode, stage);
					for (WtrjSchoolGradeKey g : gs) {
						this.mergeGradeToPermisson(schoolCode, stage, g.getGrade(), permission);
					}

					// 合并所有班级
					List<MtPermissionClassInfoDto> csKeys = this.searchClass(schoolCode, stage);
					for (MtPermissionClassInfoDto ck : csKeys) {
						this.mergeClassToPermisson(ck.getSchoolCode(), ck.getStage(), ck.getGrade(), ck.getClassNo(),
								ck.getClassName(), ck.getClassId(), null, permission);
					}

					// 学部领导，获取班主任/任课老师/生辅老师以外的所有老师
					this.mergeStageTeacherInfo(schoolCode, stage, permission);
				} else if (StringUtils.isNotEmpty(schoolCode) && stage == 0 && grade == 0
						&& Constant.PermissionType.STAGE_LEADER.equals(type)) { // 学部领导
					// 合并学校
					this.mergeSchoolToPermisson(schoolCode, permission);

					// 合并年级--单独指定学校的情况,获取学校的所有年级
					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode);
					for (WtrjSchoolGradeKey g : gs) {
						this.mergeGradeToPermisson(g.getSchoolCode(), g.getStage(), g.getGrade(), permission);
					}

					// 合并所有班级
					List<MtPermissionClassInfoDto> cs = this.searchClass(schoolCode);
					for (MtPermissionClassInfoDto ck : cs) {
						this.mergeClassToPermisson(ck.getSchoolCode(), ck.getStage(), ck.getGrade(), ck.getClassNo(),
								ck.getClassName(), ck.getClassId(), null, permission);
					}

					// 学部领导，获取班主任/任课老师/生辅老师以外的所有老师
					this.mergeStageTeacherInfo(schoolCode, permission);
				}
			}
		}

		// 获取完整的学校信息
		WtrjSchoolInfoExample schoolExample = new WtrjSchoolInfoExample();
		schoolExample.createCriteria().andCodeIn(permission.getOwnedSchools());
		List<WtrjSchoolInfo> schools = schoolInfoMapper.selectByExample(schoolExample);
		permission.setOwnedSchoolInfos(schools);

		// 补充教师的学校信息
		Map<String, WtrjSchoolInfo> schoolMap = new HashMap<String, WtrjSchoolInfo>();
		for (WtrjSchoolInfo school : schools) {
			schoolMap.put(school.getCode(), school);
		}
		List<NoticeTeacherKey> teachers = permission.getOwnedTeachers();
		if (teachers != null) {
			for (NoticeTeacherKey teacher : teachers) {
				WtrjSchoolInfo ws = schoolMap.get(teacher.getSchoolCode());
				teacher.setSchoolName(ws == null ? "" : ws.getName());
			}
		}

		// 初始化教师基本信息
		initTeacherBaseInfos(permission);

		// 初始化教师选中信息
		initTeacherSelectStatus(permission);

		return permission;
	}

	private void initTeacherBaseInfos(EcomPermisson permission) {
		Map<Integer, TeacherBaseInfo> baseMap = permission.getOwnedTeachersBaseInfo();
		if (baseMap == null) {
			baseMap = new HashMap<Integer, TeacherBaseInfo>();
		}
		if (permission.getOwnedTeachers() != null) {
			for (NoticeTeacherKey key : permission.getOwnedTeachers()) {
				if (baseMap.get(key.getTeacherId()) == null) {
					TeacherBaseInfo teacher = new TeacherBaseInfo();
					teacher.setTeacherId(key.getTeacherId());
					teacher.setMobile(key.getTeacherPhone());
					teacher.setTeacherName(key.getTeacherName());

					baseMap.put(key.getTeacherId(), teacher);
				}

			}
		}

		if (permission.getOwnedAdminTeachers() != null) {
			for (AdminTeacher key : permission.getOwnedAdminTeachers()) {
				if (baseMap.get(key.getTeacherId()) == null) {
					TeacherBaseInfo teacher = new TeacherBaseInfo();
					teacher.setTeacherId(key.getTeacherId());
					teacher.setMobile(key.getMobile());
					teacher.setTeacherName(key.getTeacherName());

					baseMap.put(key.getTeacherId(), teacher);
				}
			}
		}
		permission.setOwnedTeachersBaseInfo(baseMap);

	}

	/**
	 * 保存学部领导所对应的教师（班主任、课任老师、生辅老师除外）
	 * 
	 * @param schoolCode
	 * @param stage
	 * @param permission
	 */
	private void mergeStageTeacherInfo(String schoolCode, Integer stage, EcomPermisson permission) {
		List<MtSchoolTeacherInfo> teachers = noticeMapper.selectSchoolStageTeachers(schoolCode, String.valueOf(stage));
		dealAdminTeachers(permission, teachers);
	}

	private void mergeStageTeacherInfo(String schoolCode, EcomPermisson permission) {
		List<MtSchoolTeacherInfo> teachers = noticeMapper.selectSchoolTeachers(schoolCode);
		dealAdminTeachers(permission, teachers);
	}

	private void dealAdminTeachers(EcomPermisson permission, List<MtSchoolTeacherInfo> teachers) {
		if (teachers != null) {
			List<AdminTeacher> admins = permission.getOwnedAdminTeachers();
			if (admins == null) {
				admins = new ArrayList<AdminTeacher>();
			}
			for (MtSchoolTeacherInfo t : teachers) {
				AdminTeacher at = new AdminTeacher();
				at.setMobile(t.getMobile());
				at.setSchoolCode(t.getSchoolCode());
				at.setStage(t.getStage());
				at.setTeacherName(t.getTeacherName());
				at.setTeacherId(t.getTeacherId());

				admins.add(at);
			}
			permission.setOwnedAdminTeachers(admins);
		}
	}

	private void initTeacherSelectStatus(EcomPermisson permission) {
		Map<Integer, Boolean> teacherSelectStatusMap = permission.getTeacherSelectedMap();
		if (teacherSelectStatusMap == null) {
			teacherSelectStatusMap = new HashMap<Integer, Boolean>();
		}
		if (permission.getOwnedTeachers() != null) {
			for (NoticeTeacherKey key : permission.getOwnedTeachers()) {
				teacherSelectStatusMap.put(key.getTeacherId(), false);
			}
		}

		if (permission.getOwnedAdminTeachers() != null) {
			for (AdminTeacher at : permission.getOwnedAdminTeachers()) {
				teacherSelectStatusMap.put(at.getTeacherId(), false);
			}
		}
		permission.setTeacherSelectedMap(teacherSelectStatusMap);
	}

	/**
	 * 追加学校到权限表
	 * 
	 * @param schoolCode
	 * @param permission
	 */
	private void mergeSchoolToPermisson(String schoolCode, EcomPermisson permission) {
		List<String> schools = permission.getOwnedSchools();
		if (schools == null) {
			schools = new ArrayList<String>();
		}

		if (!schools.contains(schoolCode)) {
			schools.add(schoolCode);
		}

		permission.setOwnedSchools(schools);
	}

	/**
	 * 追加年级到权限表
	 * 
	 * @param schoolCode
	 * @param permission
	 */
	private void mergeGradeToPermisson(String schoolCode, Integer stage, Integer grade, EcomPermisson permission) {
		List<WtrjSchoolGradeKey> gs = new ArrayList<WtrjSchoolGradeKey>();
		WtrjSchoolGradeKey key = new WtrjSchoolGradeKey();
		key.setSchoolCode(schoolCode);
		key.setStage(stage);
		key.setGrade(grade);
		gs.add(key);

		List<NoticeGradeKey> grades = permission.getOwnedGrades();
		if (grades == null) {
			grades = new ArrayList<NoticeGradeKey>();
		}

		// 既存判断用Key
		List<String> checkList = new ArrayList<String>();
		for (NoticeGradeKey noticeGradeKey : grades) {
			checkList.add(noticeGradeKey.getGradeKeyNo());
		}

		for (WtrjSchoolGradeKey gradeInfo : gs) {
			String newKey = gradeInfo.getSchoolCode() + "_" + gradeInfo.getStage() + "_" + gradeInfo.getGrade();
			if (!checkList.contains(newKey)) {
				checkList.add(newKey);
				NoticeGradeKey gk = new NoticeGradeKey();
				gk.setGrade(gradeInfo.getGrade());
				gk.setSchoolCode(gradeInfo.getSchoolCode());
				gk.setStage(gradeInfo.getStage());

				grades.add(gk);
			}
		}

		permission.setOwnedGrades(grades);

	}

	/**
	 * 追加班级到权限表
	 * 
	 * @param schoolCode
	 * @param permission
	 */
	private void mergeClassToPermisson(String schoolCode, Integer stage, Integer grade, Integer classNo,
			String className, Integer classId, String courseCode, EcomPermisson permission) {

		List<NoticeClassKey> classes = permission.getOwnedClasses();
		if (classes == null) {
			classes = new ArrayList<NoticeClassKey>();
		}
		// 既存班级判断用Key
		List<String> checkList = new ArrayList<String>();
		for (NoticeClassKey key : classes) {
			checkList.add(key.getClassKeyNo());
		}

		// 关联教师
		List<NoticeTeacherKey> teachers = permission.getOwnedTeachers();
		if (teachers == null) {
			teachers = new ArrayList<NoticeTeacherKey>();
		}
		List<String> checkTeacherList = new ArrayList<String>();
		for (NoticeTeacherKey key : teachers) {
			checkTeacherList.add(key.getTeacherKeyNo());
		}

		// 关联家长
		List<NoticeParentKey> parents = permission.getOwnedParents();
		if (parents == null) {
			parents = new ArrayList<NoticeParentKey>();
		}

		List<String> checkParentList = new ArrayList<String>();
		for (NoticeParentKey key : parents) {
			checkParentList.add(key.getParentKeyNo());
		}

		String newKey = schoolCode + "_" + stage + "_" + grade + "_" + classNo;
		if (!checkList.contains(newKey)) {
			checkList.add(newKey);
			NoticeClassKey gk = new NoticeClassKey();
			gk.setGrade(grade);
			gk.setSchoolCode(schoolCode);
			gk.setStage(stage);
			gk.setClassNo(classNo);
			gk.setClassName(className);
			gk.setClassId(classId);

			classes.add(gk);
		}

		// 获取教师数据
		List<MtClassTeacherDto> ps = noticeMapper.selectClassTeachers(schoolCode, stage, grade, classNo, courseCode);
		for (MtClassTeacherDto p : ps) {
			String newPk = p.getSchoolCode() + "_" + p.getStage() + "_" + p.getGrade() + "_" + p.getClassNo() + "_"
					+ p.getTeacherPhone();

			if (!checkTeacherList.contains(newPk)) {
				checkTeacherList.add(newPk);
				NoticeTeacherKey gk = new NoticeTeacherKey();
				gk.setTeacherId(p.getTeacherId());
				gk.setGrade(p.getGrade());
				gk.setSchoolCode(p.getSchoolCode());
				gk.setStage(p.getStage());
				gk.setClassNo(p.getClassNo());
				gk.setTeacherPhone(p.getTeacherPhone());
				gk.setTeacherName(p.getTeacherName());
				gk.setCourseCode(p.getCourseCode());
				gk.setCourseName(p.getCourseName());
				gk.setRole(p.getRole());
				gk.setClassId(p.getClassId());

				teachers.add(gk);
			}
		}

		// 获取家长数据
		List<MtClassParentDto> cps = noticeMapper.selectClassParents(schoolCode, stage, grade, classNo);
		for (MtClassParentDto p : cps) {
			String newPk = p.getSchoolCode() + "_" + p.getStage() + "_" + p.getGrade() + "_" + p.getClassNo() + "_"
					+ p.getParentPhone();

			if (!checkParentList.contains(newPk)) {
				checkParentList.add(newPk);
				NoticeParentKey gk = new NoticeParentKey();
				gk.setGrade(p.getGrade());
				gk.setSchoolCode(p.getSchoolCode());
				gk.setStage(p.getStage());
				gk.setClassNo(p.getClassNo());
				gk.setParentPhone(p.getParentPhone());
				gk.setParentName(p.getParentName());
				gk.setStudentName(p.getStudentName());
				gk.setClassName(p.getClassName());

				parents.add(gk);
			}
		}

		permission.setOwnedClasses(classes);
		permission.setOwnedTeachers(teachers);
		permission.setOwnedParents(parents);
	}

	@Override
	public String getSchoolNameByCode(String schoolCode) {
		WtrjSchoolInfo school = schoolInfoMapper.selectByPrimaryKey(schoolCode);
		if (school != null) {
			return school.getName();
		}
		return "";
	}

	@Override
	public List<MtCourseTeacher> searchCourseTeacherByStudendId(Integer studentId) {

		return mtPermissionMapper.selectCourseTeacherByStudentId(studentId);
	}

	@Override
	public MtHeaderTeacher serachHeaderTeacherByStudentId(Integer studentId) {
		List<MtHeaderTeacher> teachers = mtPermissionMapper.selectHeaderTeacherByStudentId(studentId);
		if (teachers != null && teachers.size() > 0) {
			return teachers.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjEcomPermission> searchTeacherByCourseAndRole(List<Integer> teacherIds, List<String> courseCodes,
			List<String> roles) {
		WtrjEcomPermissionExample example = new WtrjEcomPermissionExample();
		Criteria criterial = example.createCriteria();
		boolean check = false;
		if (teacherIds != null && teacherIds.size() > 0) {
			criterial = criterial.andTeacherIdIn(teacherIds);
			check = true;
		}
		if (courseCodes != null && courseCodes.size() > 0) {
			criterial = criterial.andCourseCodeIn(courseCodes);
			check = true;
		}
		if (roles != null && roles.size() > 0) {
			criterial = criterial.andTypeIn(roles);
			check = true;
		}
		if (!check) {
			return new ArrayList<WtrjEcomPermission>();
		}
		return teacherAuthMapper.selectByExample(example);
	}

	@Override
	public List<WtrjEcomPermission> searchTeacherByCourseAndRole(List<Integer> teacherIds, List<String> courseCodes,
			String[] grades, List<String> roles) {
		WtrjEcomPermissionExample example = new WtrjEcomPermissionExample();
		Criteria criterial = example.createCriteria();
		boolean check = false;
		if (teacherIds != null && teacherIds.size() > 0) {
			criterial = criterial.andTeacherIdIn(teacherIds);
			check = true;
		}
		if (courseCodes != null && courseCodes.size() > 0) {
			criterial = criterial.andCourseCodeIn(courseCodes);
			check = true;
		}
		if (grades != null && grades.length > 0) {
			criterial = criterial.andSchoolCodeEqualTo(grades[0]).andStageEqualTo(grades[1])
					.andGradeEqualTo(Integer.valueOf(grades[2]));
			check = true;
		}
		if (roles != null && roles.size() > 0) {
			criterial = criterial.andTypeIn(roles);
			check = true;
		}
		if (!check) {
			return new ArrayList<WtrjEcomPermission>();
		}
		return teacherAuthMapper.selectByExample(example);
	}

	@Override
	public List<WtrjEcomPermission> searchTeacherForStageRoles(List<Integer> teacherIds, List<String> schoolCodes,
			List<String> otherRoles) {
		WtrjEcomPermissionExample example = new WtrjEcomPermissionExample();
		example.createCriteria().andSchoolCodeIn(schoolCodes).andTeacherIdIn(teacherIds).andTypeIn(otherRoles);
		return teacherAuthMapper.selectByExample(example);
	}

	@Transactional
	@Override
	public void savePermissionRelation(Integer belongTeacherId, List<WtrjEcomPermissionRelation> records) {
		WtrjEcomPermissionRelationExample example = new WtrjEcomPermissionRelationExample();
		example.createCriteria().andBelongTeacherIdEqualTo(belongTeacherId);
		permissionRelationMapper.deleteByExample(example);
		
		for (WtrjEcomPermissionRelation record : records) {
			permissionRelationMapper.insertSelective(record);
		}
	}

}
