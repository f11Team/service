package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;

public interface MtProfitMapper {

	/**
	 * 查询盈利表中所有不重复的年份
	 * 
	 * @return 年份集合List<Integer>
	 */
	List<Integer> selectYears();

	/**
	 * 查询某一年所有的盈利情况（净利）
	 * 
	 * @return List<WtrjProfit>
	 */
	List<MtIntegerAndBigDecimalBean> searchProfitAllYear(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

	/**
	 * 查询某一年某月所有公司盈利情况（净利），并且以关联的板块分组
	 * 
	 * @param month
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchProfitByMonth(@Param(value = "year") Integer year, @Param(value = "month") Integer month,
			@Param(value = "userId") Integer userId);

	/**
	 * 查询某一年某月教育板块所有的盈利情况（净利）
	 * 
	 * @param month
	 * @param project
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchProfitByMonthAndProject(@Param(value = "year") Integer year, @Param(value = "month") Integer month,
			@Param(value = "project") String project, @Param(value = "userId") Integer userId);

	/**
	 * 查询某一年所有的盈利情况（毛利）
	 * 
	 * @return List<WtrjProfit>
	 */
	List<MtIntegerAndBigDecimalBean> searchGrossProfitAllYear(Integer year);

	/**
	 * 查询某一年某月所有公司盈利情况（毛利），并且以关联的板块分组
	 * 
	 * @param month
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchGrossProfitByMonth(@Param(value = "year") Integer year, @Param(value = "month") Integer month);

	/**
	 * 查询某一年某月教育板块所有的盈利情况（毛利）
	 * 
	 * @param month
	 * @param project
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchGrossProfitByMonthAndProject(@Param(value = "year") Integer year, @Param(value = "month") Integer month,
			@Param(value = "project") String project);

}
