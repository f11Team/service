package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;

public class NoticeClassKey  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String schoolCode;
	
	private Integer stage;
	
	private Integer grade;
	
	private Integer classNo;
	
	private String className;
	
	private Integer classId;

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
	
	public String getClassKeyNo(){
		return this.schoolCode + "_" + this.stage + "_"+ this.grade + "_"+ this.classNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	
}
