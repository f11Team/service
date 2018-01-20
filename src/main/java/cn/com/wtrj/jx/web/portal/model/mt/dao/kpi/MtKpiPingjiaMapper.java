package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPingjiaDto;

public interface MtKpiPingjiaMapper {

	/**
	 * 查询员工自评项目信息
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	public List<MtKpiPingjiaDto> selectPingjiaItemTc(@Param(value = "employeeId") Integer employeeId,
			@Param(value = "kpiInsId") Integer kpiInsId);

	/**
	 * 查询教研组评价项目信息
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	public List<MtKpiPingjiaDto> selectPingjiaItemJy(@Param(value = "employeeId") Integer employeeId,
			@Param(value = "kpiInsId") Integer kpiInsId);

	/**
	 * 查询年级组评价项目信息
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	public List<MtKpiPingjiaDto> selectPingjiaItemNj(@Param(value = "employeeId") Integer employeeId,
			@Param(value = "kpiInsId") Integer kpiInsId);

	/**
	 * 查询教务处评价项目信息
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	public List<MtKpiPingjiaDto> selectPingjiaItemJw(@Param(value = "employeeId") Integer employeeId,
			@Param(value = "kpiInsId") Integer kpiInsId);

}
