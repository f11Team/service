package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;

public class TeacherPermissionDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String phone;
	private Integer teacherId;
	
	private String teacherName;
	
	private Boolean isRk;
	
	private Boolean isJy;
	
	private Boolean isBk;
	
	private LinkedHashMap<String, School> schools;
	
	private List<TeacherPermission> tps;
	
	public TeacherPermissionDto() {
	}

	
	
	public TeacherPermissionDto(LinkedHashMap<String, School> schools) {
		this.schools = schools;
	}

	public TeacherPermissionDto(String phone, Integer teacherId, String teacherName, Boolean isRk, Boolean isJy, Boolean isBk,
			List<TeacherPermission> tps, LinkedHashMap<String, School> schools) {
		this.phone = phone;
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.isRk = isRk;
		this.isJy = isJy;
		this.isBk = isBk;
		this.tps = tps;
		this.schools = schools;
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

	public Boolean getIsRk() {
		return isRk;
	}

	public void setIsRk(Boolean isRk) {
		this.isRk = isRk;
	}

	public Boolean getIsJy() {
		return isJy;
	}

	public void setIsJy(Boolean isJy) {
		this.isJy = isJy;
	}

	public Boolean getIsBk() {
		return isBk;
	}

	public void setIsBk(Boolean isBk) {
		this.isBk = isBk;
	}

	public List<TeacherPermission> getTps() {
		return tps;
	}

	public void setTps(List<TeacherPermission> tps) {
		this.tps = tps;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public LinkedHashMap<String, School> getSchools() {
		return schools;
	}

	public void setSchools(LinkedHashMap<String, School> schools) {
		this.schools = schools;
	}
	
}
