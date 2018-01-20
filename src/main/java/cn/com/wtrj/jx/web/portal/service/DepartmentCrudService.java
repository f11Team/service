package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartment;

/**
 * 部门表增删改查
 * @author sx
 *
 */
public interface DepartmentCrudService {
	//查询
	List<WtrjDepartment> departmentQuery();
	//以code查询
	String departmentQueryCode(WtrjDepartment wdm);
	//删除
	int departmentDelete(WtrjDepartment wdm);
	//更新
	int departmentUpdate(WtrjDepartment wdm);
	//添加
	int departmentAdd(WtrjDepartment wdm);
}
