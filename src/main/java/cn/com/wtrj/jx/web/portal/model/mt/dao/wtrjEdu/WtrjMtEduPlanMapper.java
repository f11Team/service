package cn.com.wtrj.jx.web.portal.model.mt.dao.wtrjEdu;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlan;

public interface WtrjMtEduPlanMapper {

	/**
	 * 根据教师ID，教师查询自己的教务计划
	 * 
	 * @param id
	 * @param start
	 * @param end
	 * @return
	 */
	List<WtrjEduPlan> getTeacherEduPlanByPage(@Param("id") Integer teacherId, @Param("start") Integer start,
			@Param("end") Integer end);

	/**
	 * 
	 * @param teacherId
	 * @return
	 */
	int countTeacherEduPlanByPage(@Param("id") Integer teacherId);

	/**
	 * 审核教务计划
	 * 
	 * @param roleType
	 *            计划角色类型
	 * @param schoolCode
	 *            学校编码
	 * @param grade
	 *            年级
	 * @param teacherName
	 *            教师姓名
	 * @param start
	 * @param end
	 * @return
	 */
	List<WtrjEduPlan> getVerifyEduPlanByPage(@Param("type")	String type,	
			@Param("schoolCode") String schoolCode,
			@Param("schoolYear") String schoolYear,
			@Param("schoolTerm") String schoolTerm,
			@Param("course") String course,
			@Param("grade") String grade,
			@Param("status") String status,
			@Param("teacherName") String teacherName,
			@Param("start") Integer start,
			@Param("end") Integer end);

	int countVerifyEduPlanByPage(@Param("type")		String type,	
			@Param("schoolCode") String schoolCode,
			@Param("schoolYear") String schoolYear,
			@Param("schoolTerm") String schoolTerm,
			@Param("course") String course,
			@Param("grade") String grade,
			@Param("status") String status,
			@Param("teacherName") String teacherName);

	
}
