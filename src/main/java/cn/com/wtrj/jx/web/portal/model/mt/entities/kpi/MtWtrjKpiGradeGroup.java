package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroup;

public class MtWtrjKpiGradeGroup extends WtrjKpiGradeGroup {

	// 学校名称
	private String schoolName;

	// 年级组长姓名
	private String employeeName;

	// 组员
	private List<MtKpiEmpls> empls;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<MtKpiEmpls> getEmpls() {
		return empls;
	}

	public void setEmpls(List<MtKpiEmpls> empls) {
		this.empls = empls;
	}

}
