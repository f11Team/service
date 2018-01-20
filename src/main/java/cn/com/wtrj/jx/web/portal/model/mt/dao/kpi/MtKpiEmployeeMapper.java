package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiEmployee;

public interface MtKpiEmployeeMapper {

	List<MtKpiEmployee> searchForAdd(@Param(value = "kpiInsId") Integer kpiInsId);

	List<MtKpiEmployee> search(@Param(value = "kpiInsId") Integer kpiInsId);
}
