package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEmployeeDto;

public interface IEmployeeService {
	
	public Integer countEmployee(String search);
	
	public List<MtEmployeeDto> searchEmployeeByPage(Integer start, Integer end , String search);

	public int countEmployee(String schoolCode, String search);

	public List<MtEmployeeDto> searchEmployeeByPage(String schoolCode, int start, int end, String search);

}
