package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.BalanceSheetBean;

/**
 * 资产负债表Mapper
 * 
 * @author jitao
 *
 */
public interface BalanceSheetMapper {
	/**
	 * 查询所有不重复的年份
	 * 
	 * @return 不重复年份集合
	 */
	public List<Integer> searchBalanceSheetAllYears();

	/**
	 * 按年份查询资产负债表信息
	 * 
	 * @return 年份查询资产负债表信息
	 */
	public List<BalanceSheetBean> searchBalanceSheetInfoByYear(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

	/**
	 * 按年月查询资产负债板块数据
	 * 
	 * @return 板块资产负债数据
	 */
	public List<BalanceSheetBean> searchBalanceSheetInfoByProject(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "userId") int userId);

	/**
	 * 按板块年月查询资产负债校区收支数据
	 * 
	 * @return 校区资产负债数据
	 */
	public List<BalanceSheetBean> searchBalanceSheetInfoBySchool(@Param(value = "project") String project, @Param(value = "year") int year,
			@Param(value = "month") int month, @Param(value = "userId") int userId);

}
