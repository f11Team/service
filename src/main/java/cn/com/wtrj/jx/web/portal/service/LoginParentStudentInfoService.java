package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.LoginParentStudentInfoBean;

/**
 * 查询登录家长学生信息接口层
 * @author jitao
 *
 */
public interface LoginParentStudentInfoService {

	/**
	 * 查询登录家长学生信息
	 * @return  登录家长学生信息
	 */
	public List<LoginParentStudentInfoBean> searchLoginParentStudentInfo(String  parentPhone);
}
