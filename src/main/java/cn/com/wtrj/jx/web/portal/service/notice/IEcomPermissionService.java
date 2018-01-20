package cn.com.wtrj.jx.web.portal.service.notice;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionRelation;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseTeacher;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtHeaderTeacher;
import cn.com.wtrj.jx.web.portal.service.dto.notice.EcomPermisson;

public interface IEcomPermissionService {
	
	/**
	 * 获取给家长/教师发送通知公告的权限
	 * 
	 * @param teacherId
	 * @return
	 */
	public EcomPermisson searchTeacherPermisson(Integer teacherId);
	
	public String getSchoolNameByCode(String schoolCode);

	/**
	 * 根据学生ID获取任课老师数据
	 * 
	 * @param studentId 学生ID
	 * @return
	 */
	List<MtCourseTeacher> searchCourseTeacherByStudendId(Integer studentId);
	
	/**
	 * 根据学生ID获取班主任信息
	 * 
	 * @param studentId 学生ID
	 * @return
	 */
	MtHeaderTeacher serachHeaderTeacherByStudentId(Integer studentId);
	
	/**
	 * 通知发送教师筛选--在指定的教师范围内，根据指定的课程、角色等信息过滤教师
	 * 
	 * @param teacherIds
	 * @param courseCodes
	 * @param roles
	 * @return
	 */
	List<WtrjEcomPermission> searchTeacherByCourseAndRole(List<Integer> teacherIds, List<String> courseCodes, List<String> roles);
	List<WtrjEcomPermission> searchTeacherByCourseAndRole(List<Integer> teacherIds, List<String> courseCodes, String[] grades, List<String> roles);

	public List<WtrjEcomPermission> searchTeacherForStageRoles(List<Integer> teacherIds, List<String> schoolCodes,
			List<String> otherRoles);
	
	public void savePermissionRelation(Integer belongTeacherId, List<WtrjEcomPermissionRelation> records);
	
}
