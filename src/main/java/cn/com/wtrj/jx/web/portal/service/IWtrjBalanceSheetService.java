package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.BalanceSheetBean;

/**
 * 资产负债表业务逻辑接口层
 * 
 * @author jitao
 *
 */
public interface IWtrjBalanceSheetService {

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
	public List<BalanceSheetBean> searchBalanceSheetInfoByYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate);

	/**
	 * 按年月查询资产负债板块数据
	 * 
	 * @return 板块资产负债数据
	 */
	public List<BalanceSheetBean> searchBalanceSheetInfoByProject(int year, int month, int userId);

	/**
	 * 按板块年月查询资产负债校区收支数据
	 * 
	 * @return 校区资产负债数据
	 */
	public List<BalanceSheetBean> searchBalanceSheetInfoBySchool(String project, int year, int month, int userId);
	/**2017-09-06**/
	public List<BalanceSheetBean> searchBalanceSheetMubiaoByResult(Integer year,Integer userId, String segementCode, String orgCode,
			String startDate, String endDate, List<BalanceSheetBean> mubiaoList);
}
