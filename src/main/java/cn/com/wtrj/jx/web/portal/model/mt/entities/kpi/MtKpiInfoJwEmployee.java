package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.io.Serializable;
import java.util.List;

public class MtKpiInfoJwEmployee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer kpiInsId;

	private Integer employeeId;

	private List<MtKpiInfoJwDetail> ds;

	public Integer getKpiInsId() {
		return kpiInsId;
	}

	public void setKpiInsId(Integer kpiInsId) {
		this.kpiInsId = kpiInsId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public List<MtKpiInfoJwDetail> getDs() {
		return ds;
	}

	public void setDs(List<MtKpiInfoJwDetail> ds) {
		this.ds = ds;
	}

}
