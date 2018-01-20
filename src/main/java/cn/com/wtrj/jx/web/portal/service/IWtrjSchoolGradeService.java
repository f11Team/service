package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

/**
 * 按学校code查询包含的学部
 * 
 * @author admin
 *
 */
public interface IWtrjSchoolGradeService {
	/**
	 * 按学校code查询包含的学部编号
	 * 
	 * @param schoolCode
	 *            学校code
	 * @return
	 */
	List<Integer> searchStageBySchool(String schoolCode);

	/**
	 * 按学校编号和学部查询包含的年级编号
	 * 
	 * @param schoolCode
	 *            学校code
	 * @param stage
	 *            学部号
	 * @return
	 */
	List<Integer> searchGradeBySchoolAndStage(String schoolCode, int stage);

	/**
	 * 按学校code集合查询包含的学部编号
	 * 
	 * @param schoolCodes
	 *            学校code集合
	 * @return
	 */
	List<Integer> searchStageBySchoolCode(List<Integer> schoolCodes);

	/**
	 * 
	 * @param schoolCodes
	 * @param stage
	 * @return
	 */
	List<Integer> searchGradeByStage(Integer stage, List<Integer> schoolCodes);

	/**
	 * 按学校code集合和学部查询schoolCode
	 * 
	 * @param schoolCodes
	 *            某个校区对应的code集合
	 * @param stage
	 *            学部
	 * @return schoolCode
	 */
	String findSchoolCodeBySchoolCodesAndStage(List<Integer> schoolCodes, Integer stage);
}