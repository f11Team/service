package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoAttach;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoDetail;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoJwEmployee;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPingjiaDto;

/**
 * 绩效评价保存通用服务接口层
 *
 */
public interface IKpiPingjiaService {

	/**
	 * 查询员工自评项目
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	List<MtKpiPingjiaDto> selectPingjiaItemTc(Integer employeeId, Integer kpiInsId);

	/**
	 * 查询教研组评价项目
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	List<MtKpiPingjiaDto> selectPingjiaItemJy(Integer employeeId, Integer kpiInsId);

	/**
	 * 查询年级组评价项目
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	List<MtKpiPingjiaDto> selectPingjiaItemNj(Integer employeeId, Integer kpiInsId);

	/**
	 * 查询教务处评价项目
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @return
	 */
	List<MtKpiPingjiaDto> selectPingjiaItemJw(Integer employeeId, Integer kpiInsId);

	/**
	 * 查询项目附件
	 * 
	 * @param employeeId
	 *            员工ID
	 * @param kpiInsId
	 *            考核活动ID
	 * @param itemId
	 *            模板项目ID
	 * @return
	 */
	List<WtrjKpiInfoAttach> selectPingjiaItemAttach(Integer employeeId, Integer kpiInsId);

	/**
	 * 保存评价信息
	 * 
	 * @param details
	 *            绩效考核成绩明细
	 * @param info
	 *            绩效考核汇总
	 * @return
	 */
	void savePingjia(List<WtrjKpiInfoDetail> details, WtrjKpiInfo info);

	void savePingjiaNew(List<MtKpiInfoJwEmployee> params);

	/**
	 * 保存绩效考核汇总
	 * 
	 * @param params
	 */
	void saveKpiInfo(List<MtKpiInfo> params);

	/**
	 * 查询指定员工的绩效评价汇总
	 * 
	 * @param kpiInsId
	 *            考核活动ID
	 * @param employeeId
	 *            员工ID
	 * @return
	 */
	WtrjKpiInfo getKpiInfo(Integer kpiInsId, Integer employeeId);

	/**
	 * 根据附件ID查找附件信息
	 * 
	 * @param attachId
	 *            附件ID
	 * @return
	 */
	WtrjKpiInfoAttach selectAttach(Integer attachId);

	/**
	 * 删除附件
	 * 
	 * @param attachId
	 *            附件ID
	 */
	void deleteAttach(Integer attachId);

	/**
	 * 保存附件
	 * 
	 */
	void saveAttach(List<WtrjKpiInfoAttach> attaches);

}
