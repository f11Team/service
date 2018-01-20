package cn.com.wtrj.jx.web.portal.service.common.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.TeacherPermissionMapper;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.service.common.ITeacherPermissionService;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.TeacherPermissionDto;

@Service
public class TeacherPermissionService implements ITeacherPermissionService {

	@Autowired
	private TeacherPermissionMapper tpMapper;
	
	/*@Override
	public TeacherPermissionDto findTeacherPermissionByPhone(String phone) {
		List<TeacherPermission> tps = tpMapper.findTeacherPermissionByPhone(phone);
		
		if(tps != null && tps.size() >0) {
			
			boolean isJy = false;
			boolean isBk = false;
			boolean isRk = false;
			Integer teacherId = null;
			String teacherName = null;
			
			LinkedHashMap<String, School> schools = new LinkedHashMap<>();
			
			for(TeacherPermission tp : tps) {
				
				if(schools != null && schools.size() == 0) {
					*//**
					 * 设置用户学校，年级，班级关系
					 *//*
					School s = schools.get(tp.getSchoolCode());
					s = getSchoolReferenceInfo(tp.getSchoolCode(), tp.getSchoolName(), tp.getStage());
					schools.put(tp.getSchoolCode(), s);
				}
				else {
					School s = schools.get(tp.getSchoolCode());
					if(s == null) {
						s = new School(tp.getSchoolCode(), tp.getSchoolName(), tp.getStage());
						schools.put(tp.getSchoolCode(), s);
					}
				}
				
				//判断任课教师:学校、年级、班级、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
					 && StringUtils.isNotBlank(tp.getCourseCode())
							 && tp.getGrade() != null && tp.getGrade() > 0 && tp.getClassId() != null) {
					isRk = true;
				}
				
				//判断教研组长：学校、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
						 && StringUtils.isNotBlank(tp.getCourseCode())) {
					isJy = true;
				}
				
				
				
				//判断备课组长：学校、年级、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
						 && StringUtils.isNotBlank(tp.getCourseCode())
								 && tp.getGrade() != null && tp.getGrade() > 0) {
					isBk = true;
				}
				
				teacherId = tp.getTeacherId();
				teacherName = tp.getTeacherName();
			}
			
			TeacherPermissionDto tpd = new TeacherPermissionDto(phone, teacherId,
						teacherName, isRk, isJy, isBk, tps, schools);
			
			return tpd;
		}
		
		return null;
	}*/
	
	private School getSchoolReferenceInfo(String code, String name, String stage) {
		List<TeacherPermission> tps = tpMapper.getSchoolReferenceInfoByCode(code);
		
		if(tps != null && tps.size() >0) {
			
			School s = new School(code, name, stage);
			
			for(TeacherPermission tp : tps) {
				
				if(s.getGrades() == null) {
					s.setGrades(new HashSet<Integer>());
				}
				
				if(tp.getGrade() != null) {
					s.getGrades().add(tp.getGrade());
				}
				
				if(s.getCourses() == null) {
					s.setCourses(new HashMap<String, String>());
				}
				
				s.getCourses().put(tp.getCourseCode(), tp.getCourseName());
				
			}
			
			return s;
			
		}
		
		return null;
	}

	@Override
	public TeacherPermissionDto findTeacherSchoolReferenceInfoByTeacherId(String teacherId) {

		List<TeacherPermission> tps = tpMapper.findTeacherPermissionByTeacherId(teacherId);
		
		if(tps != null && tps.size() >0) {
			
			LinkedHashMap<String, School> schools = new LinkedHashMap<>();
			
//			Integer teacherId = null;
			String teacherName = null;
			
			for(TeacherPermission tp : tps) {
				
				if(schools != null && schools.size() == 0) {
					/**
					 * 设置用户学校，年级，班级关系
					 */
					School s = schools.get(tp.getSchoolCode());
					s = getSchoolReferenceInfo(tp.getSchoolCode(), tp.getSchoolName(), tp.getStage());
					schools.put(tp.getSchoolCode(), s);
				}
				else {
					School s = schools.get(tp.getSchoolCode());
					if(s == null) {
						s = new School(tp.getSchoolCode(), tp.getSchoolName(), tp.getStage());
						schools.put(tp.getSchoolCode(), s);
					}
				}
				
//				teacherId = tp.getTeacherId();
				teacherName = tp.getTeacherName();
				
			}
			
			TeacherPermissionDto tpd = new TeacherPermissionDto(schools);
			tpd.setTeacherId(Integer.valueOf(teacherId));
			tpd.setTeacherName(teacherName);
			
			return tpd;
		}
		
		return null;
	
	}

	@Override
	public TeacherPermissionDto findTeacherPermissionInfoByTeacherId(String teacherId) {

		List<TeacherPermission> tps = tpMapper.findTeacherPermissionByTeacherId(teacherId);
		
		if(tps != null && tps.size() >0) {
			
			boolean isJy = false;
			boolean isBk = false;
			boolean isRk = false;
//			Integer teacherId = null;
			String teacherName = null;
			
			LinkedHashMap<String, School> schools = new LinkedHashMap<>();
			
			for(TeacherPermission tp : tps) {
				
				School s = schools.get(tp.getSchoolCode());
				if(s == null) {
					s = new School(tp.getSchoolCode(), tp.getSchoolName(), tp.getStage());
				}
				
				if(s.getGrades() == null) {
					s.setGrades(new HashSet<Integer>());
				}
				
				if(s.getCourses() == null) {
					s.setCourses(new HashMap<String, String>());
				}
				
				s.getGrades().add(tp.getGrade());
				s.getCourses().put(tp.getCourseCode(), tp.getCourseName());
				schools.put(tp.getSchoolCode(), s);
				
				//判断任课教师:学校、年级、班级、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
					 && StringUtils.isNotBlank(tp.getCourseCode())
							 && tp.getGrade() != null && tp.getGrade() > 0 && tp.getClassId() != null) {
					isRk = true;
				}
				
				//判断教研组长：学校、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
						 && StringUtils.isNotBlank(tp.getCourseCode()) && tp.getGrade() == null) {
					isJy = true;
				}
				
				
				
				//判断备课组长：学校、年级、科目
				if(StringUtils.isNotBlank(tp.getSchoolCode())
						 && StringUtils.isNotBlank(tp.getCourseCode())
								 && tp.getGrade() != null && tp.getGrade() > 0 && tp.getClassId() == null) {
					isBk = true;
				}
				
				//teacherId = tp.getTeacherId();
				teacherName = tp.getTeacherName();
			}
			
			TeacherPermissionDto tpd = new TeacherPermissionDto("", Integer.valueOf(teacherId),
						teacherName, isRk, isJy, isBk, tps, schools);
			
			return tpd;
		}
		
		return null;

	}

	@Override
	public List<TeacherPermission> findSchoolsByTeacherId(String teacherId) {
		return tpMapper.findSchoolsByTeacherId(teacherId);
	}

	@Override
	public List<TeacherPermission> findGrades(String teacherId, String schoolCode) {
		return tpMapper.findGrades(teacherId, schoolCode);
	}

	@Override
	public List<TeacherPermission> findClasses(String teacherId, String schoolCode, String grade, String stage) {
		return tpMapper.findClasses(teacherId, schoolCode, grade, stage);
	}

	@Override
	public List<TeacherPermission> findCourses(String teacherId, String schoolCode, String grade, String stage) {
		return tpMapper.findCourses(teacherId, schoolCode, grade, stage);
	}

	@Override
	public List<TeacherPermission> findCoursesByClassId(String teacherId, String schoolCode, String grade, String stage,
			String classId) {
		return tpMapper.findCoursesByClassId(teacherId, schoolCode, grade, stage, classId);
	}

}
