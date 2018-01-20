package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;

public class NoticeParentKey  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2787270760893057682L;

	private String schoolCode;
	
	private Integer stage;
	
	private Integer grade;
	
	private Integer classNo;
	
	private String parentName;
	
	private String parentPhone;
	
	private Boolean checked;
	
	private String studentName;
	
	private String className;
	
	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getClassNo() {
		return classNo;
	}

	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}
	
	public String getParentKeyNo(){
		return schoolCode + "_" + stage + "_" + grade + "_" + classNo + "_" + parentPhone;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
