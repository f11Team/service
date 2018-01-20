package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.Teacher;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;

public interface TeacherMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher teacher);

    void update(Teacher teacher);
    
    Teacher selectByPrimaryKey(Integer id);
    
    List<TeacherPermission> findTeacherPermissionsByPhone(String phone);
    
    public List<Teacher> selectTeachersByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
    		@Param(value = "schoolCodes") List<String> schoolCodes,
			@Param(value = "name") String name);

	public int countTeachers(@Param(value = "schoolCodes") List<String> schoolCodes,@Param("name") String name);
    
	List<School> findTeacherSelectionSchools(String teacherId);
	
	List<School> findUserSchools(Integer teacherId);

	void insertTeacherPermission(@Param("teacherId") Integer teacherId,@Param("schoolCode") String schoolCode,@Param("schoolName") String schoolName, @Param("type") String type);
	
	void saveTeacherPermission(TeacherPermission tp);
	
	List<TeacherPermission> findTeacherSchoolPermissionInfosByTeacherIdAndSchoolCode(@Param("teacherId") Integer teacherId,@Param("schoolCode") String schoolCode);
	
	List<TeacherPermission> findTeacherClassesPermissionInfosByTeacherIdAndSchoolCode(@Param("teacherId") Integer teacherId,@Param("schoolCode") String schoolCode,@Param("type")String type);
	
	List<TeacherPermission> findTeacherSchoolPermissionInfos(Integer teacherId);
	
	List<Grade> findGradesBySchoolCode(String schoolCode);
	
	List<SchoolClass> findClassesBySchoolCode(String schoolCode);
	
	public Teacher findTeacherByPhone(String phone);
	
	public Teacher findTeacherByJobNumber(String jobNumber);
	
	public List<String> findTeacherStages(String schoolCode);
	
	public List<String> findTeacherGrades(@Param("schoolCode") String schoolCode, @Param("stage")  String stage);
	
	public List<SchoolClass> findTeacherClasses(@Param("schoolCode") String schoolCode, @Param("stage")  String stage, @Param("grade") String grade);
	
	public List<TeacherPermission> findTeacherRoleInfo(@Param("teacherId") Integer teacherId, @Param("schoolCode") String schoolCode, @Param("roleType") String roleType);
	
	public void deleteTeacherRole(@Param("teacherId") Integer teacherId, @Param("type") String type, @Param("schoolCode") String schoolCode);

	
}