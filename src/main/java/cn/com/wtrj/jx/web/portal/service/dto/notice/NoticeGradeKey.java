package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;

public class NoticeGradeKey  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String schoolCode;
	
	private Integer stage;
	
	private Integer grade;
	
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
	
	public String getGradeKeyNo(){
		return this.schoolCode + "_" + this.stage + "_"+ this.grade;
	}

}
