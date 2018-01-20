package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String studentCode;
	
	private String name;
	
	private String idCardNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + ", idCardNumber=" + idCardNumber + "]";
	}
	
}
