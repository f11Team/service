package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;

public interface TeacherPermissionMapper {
	
	public List<TeacherPermission> findTeacherPermissionByTeacherId(String teacherId);
	
	public List<TeacherPermission> getSchoolReferenceInfoByCode(String code);
	
	public List<TeacherPermission> findSchoolsByTeacherId(String teacherId);
	
	public List<TeacherPermission> findGrades(@Param("teacherId") String teacherId, @Param("schoolCode") String schoolCode);
	
	public List<TeacherPermission> findClasses(@Param("teacherId") String teacherId, @Param("schoolCode") String schoolCode, @Param("grade") String grade, @Param("stage") String stage);
	
	public List<TeacherPermission> findCourses(@Param("teacherId") String teacherId, @Param("schoolCode") String schoolCode, @Param("grade") String grade, @Param("stage") String stage);
	
	public List<TeacherPermission> findCoursesByClassId(@Param("teacherId") String teacherId, @Param("schoolCode") String schoolCode, @Param("grade") String grade, @Param("stage") String stage,  @Param("classId") String classId);
	
	
}
