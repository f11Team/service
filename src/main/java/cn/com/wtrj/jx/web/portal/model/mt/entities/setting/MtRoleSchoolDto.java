package cn.com.wtrj.jx.web.portal.model.mt.entities.setting;

public class MtRoleSchoolDto {
	
	private String schoolCode;
	
	private String schoolName;
	
	private Integer zsSchoolId;
	
	private String roleId;
	
	private String zsGrade;
	
	private String nickName;

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

	public Integer getZsSchoolId() {
		return zsSchoolId;
	}

	public void setZsSchoolId(Integer zsSchoolId) {
		this.zsSchoolId = zsSchoolId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getZsGrade() {
		return zsGrade;
	}

	public void setZsGrade(String zsGrade) {
		this.zsGrade = zsGrade;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
