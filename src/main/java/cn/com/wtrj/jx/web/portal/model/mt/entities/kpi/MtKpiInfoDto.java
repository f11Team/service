package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.util.Date;

public class MtKpiInfoDto {
	private Integer id;

	private String kpiIns;

	private Double score;

	private String teacherName;

	private Integer employeeId;

	private String employeeNo;

	private Date kpiTime;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKpiIns() {
		return kpiIns;
	}

	public void setKpiIns(String kpiIns) {
		this.kpiIns = kpiIns;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Date getKpiTime() {
		return kpiTime;
	}

	public void setKpiTime(Date kpiTime) {
		this.kpiTime = kpiTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
