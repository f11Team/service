package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.IncomeExpenditureBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtOrgShouzhiValueDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectMothShouzhiDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectShouzhiValueDto;

public interface IncomeExpenditureMapper {

	/**
	 * 查询收支表中所有不重复的年份
	 * 
	 * @return 收支表中所有不重复的年份集合
	 */
	public List<Integer> searchAllYears();

	/**
	 * 按年份查询该年每月收支数据
	 * 
	 * @return 该年每月收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByYear(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

	/**
	 * 按年月查询收支板块数据
	 * 
	 * @return 板块收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProject(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "userId") int userId);

	/**
	 * 按板块年月查询收支校区收支数据
	 * 
	 * @return 校区收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoBySchool(@Param(value = "project") String project, @Param(value = "year") int year,
			@Param(value = "month") int month, @Param(value = "userId") int userId);

	/**
	 * 按年查询收支板块数据
	 * 
	 * @return 板块收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProject2(@Param(value = "year") int year, @Param(value = "userId") Integer userId);

	/**
	 * 按年和板块查询收支月数据
	 * 
	 * @return 收支月数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProjectAndYear(@Param(value = "year") int year, @Param(value = "project") String project,
			@Param(value = "userId") Integer userId);

	/**
	 * 按年和板块和月份查询收支数据
	 * 
	 * @return 收支数据
	 */
	public List<IncomeExpenditureBean> searchInfoByProjectAndYearAndMonth(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "project") String project, @Param(value = "userId") Integer userId);

	public List<MtProjectMothShouzhiDto> selectProjectDataByMonth(@Param(value = "year") int year, @Param(value = "userId") Integer userId);

	public List<MtProjectShouzhiValueDto> selectShouruByProject(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "userId") Integer userId);

	public List<MtProjectShouzhiValueDto> selectZhichuByProject(@Param(value = "year") int year, @Param(value = "month") int month,
			@Param(value = "userId") Integer userId);

	public List<MtOrgShouzhiValueDto> selectOrgShouruData(@Param(value = "project") String project, @Param(value = "year") int year,
			@Param(value = "month") int month, @Param(value = "userId") Integer userId);

	public List<MtOrgShouzhiValueDto> selectOrgZhichuData(@Param(value = "project") String project, @Param(value = "year") int year,
			@Param(value = "month") int month, @Param(value = "userId") Integer userId);

}
