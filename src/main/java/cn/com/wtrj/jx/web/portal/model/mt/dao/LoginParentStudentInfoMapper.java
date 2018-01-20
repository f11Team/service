package cn.com.wtrj.jx.web.portal.model.mt.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.LoginParentStudentInfoBean;

/**
 * 登录家长学生信息Mapper
 * @author jitao
 *
 */
public interface LoginParentStudentInfoMapper {

	/**
	 * 查询登录家长学生信息
	 * @return  登录家长学生信息
	 */
	public List<LoginParentStudentInfoBean> searchLoginParentStudentInfo(@Param(value = "parentPhone")String  parentPhone);
}
