package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.LoginParentStudentInfoMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.LoginParentStudentInfoBean;
import cn.com.wtrj.jx.web.portal.service.LoginParentStudentInfoService;

/**
 * 查询登录家长学生信息接口实现层
 * @author jitao
 *
 */
@Service
public class LoginParentStudentInfoServiceImpl implements LoginParentStudentInfoService{

	@Autowired
	LoginParentStudentInfoMapper loginParentStudentInfoMapper;
	
	@Override
	public List<LoginParentStudentInfoBean> searchLoginParentStudentInfo(String  parentPhone) {
		
		return loginParentStudentInfoMapper.searchLoginParentStudentInfo(parentPhone);
	}

}
