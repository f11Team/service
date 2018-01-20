package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfo;

public class MtKpiInfo extends WtrjKpiInfo {

	private String employeeName;

	private String employeeNumber;

	private String jiaoyanzuName;

	private Integer rank;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getJiaoyanzuName() {
		return jiaoyanzuName;
	}

	public void setJiaoyanzuName(String jiaoyanzuName) {
		this.jiaoyanzuName = jiaoyanzuName;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
}
