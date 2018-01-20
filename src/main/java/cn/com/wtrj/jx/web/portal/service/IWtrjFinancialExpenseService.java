package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;

/**
 * 财务费用情况表访问数据库操作
 * 
 * @author zhangbin
 *
 */
public interface IWtrjFinancialExpenseService {

	/**
	 * 以月份为分组条件，查询当前年份所有数据
	 * 
	 * @param year
	 * @return
	 */
	List<MtIntegerAndBigDecimalBean> searchFinancialOneYear(Integer year, Integer userId);

	/**
	 * 查询费用情况表中所有不重复的年份
	 * 
	 * @return
	 */
	List<Integer> searchYears();

	/**
	 * 以费用科目为分组条件在费用情况表中查询某年某月的所有数据
	 * 
	 * @param year
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialOneMonth(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate);

	/**
	 * 以板块为分组条件查询某年所有数据
	 * 
	 * @param year
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialGroupByProject(Integer year, Integer userId);

	/**
	 * 查询某板块（教育）某年所有财务费用数据
	 * 
	 * @param year
	 * @param project
	 *            某板块
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialBySomeProject(Integer year, String project, Integer userId);

	/**
	 * 查询某年某公司所有财务费用数据
	 * 
	 * @param year
	 * @param orgName
	 *            某公司
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialByOrgNickName(Integer year, String orgNickName);

}
