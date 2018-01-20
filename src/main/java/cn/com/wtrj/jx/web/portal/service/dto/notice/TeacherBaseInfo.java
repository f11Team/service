package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;

/**
 * 教师基本信息
 * @author wusm
 *
 */
public class TeacherBaseInfo  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1786427802545499419L;

	private Integer teacherId;
	
	private String teacherName;
	
	private String mobile;

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
}
