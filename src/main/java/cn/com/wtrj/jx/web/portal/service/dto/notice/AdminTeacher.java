package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;

/**
 * 班级无关教师/人员信息（非班主任/任课老师/生辅老师）
 * @author wusm
 *
 */
public class AdminTeacher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer teacherId;
	
	private String teacherName;
	
	private String mobile;
	
	private String schoolCode;
	
	private Integer stage;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	
}
