package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;

public interface MtFinancialMapper {

	/**
	 * 查询财务费用情况表中所有不重复的年份
	 * 
	 * @return 年份集合List<Integer>
	 */
	List<Integer> selectYears();

	/**
	 * 查询某一年所有的财务费用情况
	 * 
	 * @return List<WtrjProfit>
	 */
	List<MtIntegerAndBigDecimalBean> searchFinancialOneYear(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId);

	/**
	 * 以费用科目为分组条件在费用情况表中查询某年某月的所有数据
	 * 
	 * @param year
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialOneMonth(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

	/**
	 * 以板块为分组条件查询某年所有数据
	 * 
	 * @param year
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialGroupByProject(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId);

	/**
	 * 查询某板块（教育）某年所有财务费用数据
	 * 
	 * @param year
	 * @param project
	 *            某板块
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialBySomeProject(@Param(value = "year") Integer year, @Param(value = "project") String project,
			@Param(value = "userId") Integer userId);

	/**
	 * 查询某年某公司所有财务费用数据
	 * 
	 * @param year
	 * @param orgName
	 *            某公司
	 * @return
	 */
	List<MtStringAndBigDecimalBean> searchFinancialByOrgNickName(@Param(value = "year") Integer year, @Param(value = "orgNickName") String orgNickName);

}
