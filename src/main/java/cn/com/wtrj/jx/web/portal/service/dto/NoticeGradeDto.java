package cn.com.wtrj.jx.web.portal.service.dto;

/**
 * 通知公告（家长）发送年级权限
 * 
 * @author wusm
 *
 */
public class NoticeGradeDto {
	protected String schoolCode;
	
	protected String schoolName;
	
	protected Integer stage;
	
	protected Integer grade;

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
	
}
