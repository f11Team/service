package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployee;

public class MtKpiEmployee extends WtrjKpiEmployee {

	private String employeeNumber;

	private String employeeName;

	private String jiaoyanzuName;

	private String nianjizuName;

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJiaoyanzuName() {
		return jiaoyanzuName;
	}

	public void setJiaoyanzuName(String jiaoyanzuName) {
		this.jiaoyanzuName = jiaoyanzuName;
	}

	public String getNianjizuName() {
		return nianjizuName;
	}

	public void setNianjizuName(String nianjizuName) {
		this.nianjizuName = nianjizuName;
	}

}
