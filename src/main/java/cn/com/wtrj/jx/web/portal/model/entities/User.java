package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class User implements Serializable {
	private static final long serialVersionUID = 1L; 
	// 用户ID
	private Integer id;
	// 账户
	private String account;
	// 密码
	private String password;
	// 人员姓名
	private String username;
	// 状态
	private String status;
	// 创建日期
	private Date created;
	// 员工ID
	private Integer employeeId;
	// 所属学校编码
	private String schoolCode;
	// 教师编号
	private String employeeNumber;
	// 教师姓名
	private String employeeName;
	
	// 教师ID
	private Integer teacherId;
	// 教师姓名
	private String teacherName;
	
	
	
	// 手机号
	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getEmployeeId() {
		if (employeeId == null) {
			return 0;
		} else {
			return employeeId;
		}
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getSchoolCode() {
		if (StringUtils.isEmpty(schoolCode)) {
			return "";
		} else {
			return schoolCode;
		}
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getEmployeeNumber() {
		if (StringUtils.isEmpty(employeeNumber)) {
			return "";
		} else {
			return employeeNumber;
		}
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		if (StringUtils.isEmpty(employeeName)) {
			return "";
		} else {
			return employeeName;
		}
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}