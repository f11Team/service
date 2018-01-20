package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.Teacher;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.Role;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;

public interface TeacherService {
	
	Teacher getTeacher(int id);
	
	void addTeacher(Teacher teacher);
	
	void editTeacher(Teacher teacher, List<School> list);
	
	void deleteTeacher(int id);

	
	
	/**
	 * 根据指定条件分页获取用户信息
	 * 
	 * @param start
	 * @param limit
	 * @param search
	 * @return
	 */
	List<Teacher> searchTeachersByPage(Integer start, Integer end, List<String> schoolCodes, String search);

	/**
	 * 根据指定条件检索用户数量
	 * @param search
	 * @return
	 */
	int countTeachers(List<String> schoolCodes, String search);

	List<School> findTeacherSelectionSchools(String teacherId);
	
	List<School> findUserSchools(Integer teacherId);
	
	List<TeacherPermission> findTeacherSchoolPermissionInfos(Integer teacherId);
	
	List<Grade> findGradesBySchoolCode(String schoolCode);
	
	public List<Role> findTeacherRoles(Integer teacherId, String schoolCode);
	
	public List<Role> findTeacherRoleTypes(Integer teacherId, String schoolCode);
	
	public List<String> findTeacherStages(String schoolCode);
	
	public List<String> findTeacherGrades(String schoolCode, String stage);
	
	public List<SchoolClass> findTeacherClasses(String schoolCode, String stage, String grade);
	
	public List<TeacherPermission> findTeacherRoleInfos(String roleType, String schoolCode, Integer teacherId);
	
	public void addTeacherRole(TeacherPermission tp);
	
	public Teacher findTeacherByPhone(String phone);
	
	public void deleteTeacherRole(Integer teacherId, String type, String schoolCode);
	
	public List<TeacherPermission> findTeacherPermissionClass(Integer teacherId, String type, String schoolCode);

	WtrjTeacher findTeacherById(Integer id);
	
	String selectUserRoleById(Integer id);
	
	
	
	
}
