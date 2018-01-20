package cn.com.wtrj.jx.web.portal.service;

import java.util.List;
import java.util.Set;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;

public interface ITeacherService {
	public static final String HEAD_TEACHER = "1";
	public static final String NOT_HEAD_TEACHER = "0";
	
	WtrjTeacher searchTeacherByPhone(String phone);
	
	/**
	 * 查询指定学生的班主任信息
	 * @param studentId
	 * @param headTeacher
	 * @return
	 */
	public WtrjTeacher findHeadTeacherByStudentId(Integer studentId, String teacherType);
	
	public List<WtrjTeacher> selectTeacherByStudentId(Integer studentId);
	/**
	 * 通过id 查询老师信息
	 * @param id
	 * @return
	 */
	public WtrjTeacher findTeacherById(Integer id);
	
	
	/**
	 * 通过手机号 查询老师的教务计划权限信息
	 * @param id
	 * @return
	 */
	public Set<String> findTeacherEduPlanPemission(String phone);
	
	/**
	 * 通过手机号查询教师工号信息
	 * @param phones
	 * @return
	 */
	public List<String> findTeacherInfoByPhones(List<String> phones);
	
	
}
