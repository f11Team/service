package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.TaxBean;

/**
 * 税务表Mapper
 * 
 * @author jitao
 *
 */
public interface TaxMapper {
	/**
	 * 查询所有不重复的年份
	 * 
	 * @return 不重复年份集合
	 */
	public List<Integer> searchTaxAllYears();

	/**
	 * 按年份查询税务表信息
	 * 
	 * @return 年份查询税务表信息
	 */
	public List<TaxBean> searchTaxInfoByYear(@Param(value = "year") int year, @Param(value = "userId") int userId);

	/**
	 * 按板块查询税务信息
	 * 
	 * @param year
	 *            年份
	 * @param month
	 *            月份
	 * @return 板块税务信息
	 */
	public List<TaxBean> searchTaxInfoByProject(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "userId") int userId);

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
	public List<TaxBean> searchTaxInfoBySchool(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

}
