package cn.com.wtrj.jx.web.portal.service.common;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.service.dto.TeacherPermissionDto;

public interface ITeacherPermissionService {
	
	public TeacherPermissionDto findTeacherSchoolReferenceInfoByTeacherId(String teacherId);
	
	public TeacherPermissionDto findTeacherPermissionInfoByTeacherId(String teacherId);
	
	public List<TeacherPermission> findSchoolsByTeacherId(String teacherId);
	
	public List<TeacherPermission> findGrades(String teacherId, String schoolCode);
	
	public List<TeacherPermission> findClasses(String teacherId,  String schoolCode,  String grade,  String stage);
	
	public List<TeacherPermission> findCourses(String teacherId,  String schoolCode,  String grade,  String stage);
	
	public List<TeacherPermission> findCoursesByClassId(String teacherId,  String schoolCode,  String grade,  String stage, String classId);
	
}
