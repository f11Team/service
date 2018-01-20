package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MtSchoolGradeMapper {
	// 查询指定code的学校所包含的学校集合
	List<Integer> searchStageBySchool(String schoolCode);

	List<Integer> searchGradeBySchoolAndStage(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") int stage);

	/**
	 * 按学校CODE查询对应的学部列表,除锦江外，其余校区均为3个code。例:5为郫县，则6 7 8分别对应其小学、初中、高中 锦江为4个（含国高）
	 * 
	 * @param schoolCodeList
	 *            学校对应code集合
	 * @return 学校对应学部列表
	 */
	List<Integer> searchStageBySchoolCode(@Param(value = "schoolCodeList") List<Integer> schoolCodeList);

	List<Integer> searchGradeByStage(@Param(value = "stage") Integer stage,
			@Param(value = "schoolCodes") List<Integer> schoolCodes);

	// List<Integer> searchClassByGrade(Integer schoolCodes,Integer stage ,
	// List<Integer> grade);

	/**
	 * 按学校code集合和学部查询schoolCode
	 * 
	 * @param schoolCodes
	 *            某个校区对应的code集合
	 * @param stage
	 *            学部
	 * @return schoolCode
	 */
	String findSchoolCodeBySchoolCodesAndStage(@Param(value = "schoolCodes") List<Integer> schoolCodes,
			@Param("stage") Integer stage);

}
