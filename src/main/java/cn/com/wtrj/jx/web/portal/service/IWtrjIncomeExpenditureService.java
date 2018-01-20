package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.IncomeExpenditureBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtOrgShouzhiValueDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectMothShouzhiDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectShouzhiValueDto;

/**
 * 集团收入支出表业务逻辑层
 * 
 * @author jitao
 *
 */
public interface IWtrjIncomeExpenditureService {
	/**
	 * 查询收支表的所有不重复年份
	 * 
	 * @return 收支表的所有不重复年份集合
	 */
	public List<Integer> searchAllYears();

	/**
	 * 按年份查询该年每月收支数据
	 * 
	 * @return 该年每月收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate);

	/**
	 * 按年月查询收支板块数据
	 * 
	 * @return 板块收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProject(int year, int month, int userId);

	/**
	 * 按板块年月查询收支板块数据
	 * 
	 * @return 板块收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoBySchool(String project, int year, int month, int userId);

	/**
	 * 按年查询收支板块数据
	 * 
	 * @return 板块收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProject2(int year, int userId);

	/**
	 * 按年和板块查询收支月数据
	 * 
	 * @return 收支月数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProjectAndYear(int year, String project, int userId);

	/**
	 * 按年和板块和月份查询收支数据
	 * 
	 * @return 收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProjectAndYearAndMonth(int year, int month, String project, int userId);

	public List<MtProjectMothShouzhiDto> searchProjectShouzhiByMonth(int year, int userId);

	public List<MtProjectShouzhiValueDto> searchProjectShouruData(int year, int month, int userId);

	public List<MtProjectShouzhiValueDto> searchProjectZhichuData(int year, int month, int userId);

	public List<MtOrgShouzhiValueDto> searchOrgShouruDta(String project, int year, int month, int userId);

	public List<MtOrgShouzhiValueDto> searchOrgZhichuDta(String project, int year, int month, int userId);
	/**2017-09-06**/
	public List<IncomeExpenditureBean> searchInfoMubiaoYuResult(Integer year,Integer userId, String segementCode, String orgCode,
			String startDate, String endDate,List<IncomeExpenditureBean> mubiaoList);
}
