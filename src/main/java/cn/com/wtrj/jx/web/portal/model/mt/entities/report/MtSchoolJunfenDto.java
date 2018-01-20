package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

public class MtSchoolJunfenDto {
	private String schoolCode;
	
	private String schoolName;
	
	private String subject;
	
	private Double junfen;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public Double getJunfen() {
		return junfen;
	}

	public void setJunfen(Double junfen) {
		this.junfen = junfen;
	}
}
