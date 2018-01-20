package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.TaxBean;

/**
 * 税务表业务逻辑接口层
 * 
 * @author jitao
 *
 */
public interface TaxService {
	/**
	 * 查询税务表所有不重复的年份
	 * 
	 * @return 不重复年份集合
	 */
	public List<Integer> searchTaxAllYears();

	/**
	 * 按年份查询税务表信息
	 * 
	 * @param year
	 *            年份
	 * @return 年份查询税务表信息
	 */
	public List<TaxBean> searchTaxInfoByYear(int year, int userId);

	/**
	 * 按板块查询税务信息
	 * 
	 * @param year
	 *            年份
	 * @param month
	 *            月份
	 * @return 板块税务信息
	 */
	public List<TaxBean> searchTaxInfoByProject(int year, int month, int userId);

	/**
	 * 按校区查询税务信息
	 * 
	 * @param project
	 *            板块
	 * @param year
	 *            年份
	 * @param month
	 *            月份
	 * @return 校区税务信息
	 */
	public List<TaxBean> searchTaxInfoBySchool(Integer year, Integer userId, String segementCode, String orgCode, String startDate, String endDate);
	
	/**2017-09-06**/
	public List<TaxBean> searchTaxInfoMubiaoByResult(Integer year, Integer userId,	String segementCode, String orgCode, String startDate,
			String endDate, List<TaxBean> mubiaoList);
}
