package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiIns;

public interface MtKpiInsMapper {

	List<MtKpiIns> searchPage(Map<String, Object> param);

	List<WtrjKpiIns> searchByUser(@Param(value = "employeeId") Integer employeeId);
}
