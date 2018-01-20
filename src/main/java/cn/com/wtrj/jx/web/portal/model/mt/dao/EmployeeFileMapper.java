package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;


public interface EmployeeFileMapper {
	//分页查询
	List<WtrjEmployee> selectByPaging(@Param("startRowNum")int startRowNum,@Param("endRowNum")int endRowNum,@Param("employeeNameStr")String employeeNameStr);
	//总条数
	int selectCount(@Param("employeeNameStr")String employeeNameStr);
}
