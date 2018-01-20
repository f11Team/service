package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlan;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlanRes;

public interface MtKpiPlanMapper {

	public List<MtKpiPlan> selectKpiPlan(@Param(value = "kpiInsId") Integer kpiInsId);

	public List<MtKpiPlanRes> selectKpiPlanJy(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "code") String code, @Param(value = "excludEmployeeId") Integer excludEmployeeId);

	public List<MtKpiPlanRes> selectKpiPlanNj(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "code") String code, @Param(value = "excludEmployeeId") Integer excludEmployeeId);
}
