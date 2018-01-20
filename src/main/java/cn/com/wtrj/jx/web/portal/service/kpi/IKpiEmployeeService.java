package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployeeKey;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiEmployee;

/**
 * [参评人员设定]业务层
 *
 */
public interface IKpiEmployeeService {

	List<MtKpiEmployee> searchForAdd(Integer kpiInsId);

	List<MtKpiEmployee> search(Integer kpiInsId);

	void save(List<WtrjKpiEmployee> params);

	void delete(WtrjKpiEmployeeKey key);
}
