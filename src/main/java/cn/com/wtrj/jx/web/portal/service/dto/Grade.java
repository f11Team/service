package cn.com.wtrj.jx.web.portal.service.dto;

import java.util.List;

public class Grade {
	
	private String schoolCode;
	
	private String schoolName;
	
	private String grade;
	
	private String stage;
	
	private String stageName;
	
	private List<SchoolClass> classes;
	
	public List<SchoolClass> getClasses() {
		return classes;
	}

	public void setClasses(List<SchoolClass> classes) {
		this.classes = classes;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}
	
}
