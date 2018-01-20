package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

public class MtNianjizuMemberDto {
	private String nianjizuCode;
	
	private Integer employeeId;
	
	private String employeeName;
	
	private String employeeNumber;
	
	private String sex;

	public String getNianjizuCode() {
		return nianjizuCode;
	}

	public void setNianjizuCode(String nianjizuCode) {
		this.nianjizuCode = nianjizuCode;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
}
