package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlan;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlanRes;

/**
 * 教师绩效考核预评设定
 *
 */
public interface IKpiPlanService {

	public List<MtKpiPlan> selectKpiPlan(Integer kpiInsId);

	public void save(List<MtKpiPlan> params);

	/**
	 * 查询指导评分人数表
	 * 
	 * @param kpiInsId
	 *            考核活动ID（必选）
	 * @param code
	 *            教研组编码（必选）
	 * @param excludEmployeeId
	 *            不包含人员ID（可选）
	 * @return
	 */
	public List<MtKpiPlanRes> selectKpiPlanJy(Integer kpiInsId, String code, Integer excludEmployeeId);

	/**
	 * 查询指导评分人数表
	 * 
	 * @param kpiInsId
	 *            考核活动ID（必选）
	 * @param code
	 *            年级组编码（必选）
	 * @param excludEmployeeId
	 *            不包含人员ID（可选）
	 * @return
	 */
	public List<MtKpiPlanRes> selectKpiPlanNj(Integer kpiInsId, String code, Integer excludEmployeeId);
}
