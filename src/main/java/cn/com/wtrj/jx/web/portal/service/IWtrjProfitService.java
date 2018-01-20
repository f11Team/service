package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;

/**
 * 盈利表service接口
 * 
 * @author zhangbin
 *
 */
public interface IWtrjProfitService {

	/**
	 * 查询某一年所有的盈利情况（净利）
	 * 
	 * @return List<MtProfit> 所有月份盈利情况（净利）的集合
	 */
	List<MtIntegerAndBigDecimalBean> searchProfitOneYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate);
	
	/**
	 * 查询盈利情况时按照目标与其他结果比较（净利）
	 * 
	 * @return List<MtProfit> 所有月份盈利情况（净利）的集合
	 */
	List<MtIntegerAndBigDecimalBean> searchProfitMubiaoYuResult(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate,List<MtIntegerAndBigDecimalBean> mubiaoList);

	/**
	 * 查询某一年某月所有公司盈利情况（净利），并且以关联的板块分组
	 * 
	 * @param month
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchProfitByMonth(Integer year, Integer month, Integer userId);

	/**
	 * 查询某一年某月教育板块所有的盈利情况（净利）
	 * 
	 * @param month
	 * @param project
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchProfitByMonthAndProject(Integer year, Integer month, String project, Integer userId);

	/**
	 * 查询某一年所有的盈利情况（毛利）
	 * 
	 * @return List<MtProfit> 所有月份盈利情况（毛利）的集合
	 */
	List<MtIntegerAndBigDecimalBean> searchGrossProfitOneYear(Integer year);

	/**
	 * 查询某一年某月所有公司盈利情况（毛利），并且以关联的板块分组
	 * 
	 * @param month
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchGrossProfitByMonth(Integer year, Integer month);

	/**
	 * 查询某一年某月教育板块所有的盈利情况（毛利）
	 * 
	 * @param month
	 * @param project
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchGrossProfitByMonthAndProject(Integer year, Integer month, String project);

	/**
	 * 查询不重复的所有年份
	 * 
	 * @return
	 */
	List<Integer> searchYears();
}
