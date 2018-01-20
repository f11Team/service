package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.List;

import cn.com.wtrj.jx.web.portal.service.dto.School;

public class Teacher implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// 用户ID
	private Integer id;
	
	private String name;
	
	private String phone;
	
	private String sex;
	
	private String jobNumber;
	
	private School [] schools;
	
	private List<School> slist;
	
	// 用户表关联ID--wusm 20170924
	private Integer userId;
	
	private String loginUserName;
	
	private String loginUserPhone;

	// 微信账号信息--wusm 20170925
	private String wxAccount;
	
    private String wxMobile;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public School[] getSchools() {
		return schools;
	}

	public void setSchools(School[] schools) {
		this.schools = schools;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public List<School> getSlist() {
		return slist;
	}

	public void setSlist(List<School> slist) {
		this.slist = slist;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public String getLoginUserPhone() {
		return loginUserPhone;
	}

	public void setLoginUserPhone(String loginUserPhone) {
		this.loginUserPhone = loginUserPhone;
	}

	public String getWxAccount() {
		return wxAccount;
	}

	public void setWxAccount(String wxAccount) {
		this.wxAccount = wxAccount;
	}

	public String getWxMobile() {
		return wxMobile;
	}

	public void setWxMobile(String wxMobile) {
		this.wxMobile = wxMobile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
