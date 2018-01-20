package cn.com.wtrj.jx.web.portal.service.wtrjEdu;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlan;

public interface IWtrjEduPlanService {

	int insert(WtrjEduPlan wtrjEduPlan);

	int update(WtrjEduPlan wtrjEduPlan);

	WtrjEduPlan get(Integer id);

	int updateDelFlag(Integer id, String delFalg);

	int updateStatus(Integer id, String status,String score);

	/**
	 * 根据教师ID，教师查询自己的教务计划
	 * 
	 * @param id
	 *            教师ID
	 * @param start
	 * @param end
	 * @return
	 */
	List<WtrjEduPlan> getTeacherEduPlanByPage(Integer teacherId, Integer start, Integer end);

	/**
	 * 总数
	 * 
	 * @param teacherId
	 * @return
	 */
	int countTeacherEduPlanByPage(Integer teacherId);

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
	List<WtrjEduPlan> getVerifyEduPlanByPage(
			String type,
			String schoolCode,
			String schoolYear,
			String schoolTerm,
			String course,
			String grade,
			String status,
			String teacherName,
			Integer start, Integer end);

	int countVerifyEduPlanByPage(String type,
			String schoolCode,
			String schoolYear,
			String schoolTerm,
			String course,
			String grade,
			String status,
			String teacherName);

	/**
	 * 审核教务计划是否通过
	 * 
	 * @param id
	 * @param status
	 * @return
	 */
	int updateVerify(Integer id, String status, String score);
}
