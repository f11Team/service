package cn.com.wtrj.jx.web.portal.service;


import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;


public interface EmployeeFileService {
	//查询员工档案wtrjEmployee
	List<WtrjEmployee> employeeSelect(int startRow,int pagesize,String employeeName);
	//查询数据总条数
	int countnum(String employeeNameStr);
}
