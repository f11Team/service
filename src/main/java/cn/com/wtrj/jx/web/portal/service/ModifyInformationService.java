package cn.com.wtrj.jx.web.portal.service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.LoginParentStudentInfoBean;

public interface ModifyInformationService {
	
	//修改更新
	boolean studentParentUpdate(LoginParentStudentInfoBean loginParentStudentInfoBean);
	//添加
	int studentParentAdd();
	//查询
	Long stuParentAddSelect(WtrjStudent wtrjStudent);
}
