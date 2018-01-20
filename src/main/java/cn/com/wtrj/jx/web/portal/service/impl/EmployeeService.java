package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.MtEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEmployeeDto;
import cn.com.wtrj.jx.web.portal.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private MtEmployeeMapper mapper;
	
	@Override
	public List<MtEmployeeDto> searchEmployeeByPage(Integer start, Integer end, String search) {
		return mapper.selectEmployeeByPage(start, end, search);
	}

	@Override
	public Integer countEmployee(String search) {
		return mapper.countEmployee(search);
	}

	@Override
	public int countEmployee(String schoolCode, String search) {
		return mapper.countEmployeeBySchool(schoolCode, search);
	}

	@Override
	public List<MtEmployeeDto> searchEmployeeByPage(String schoolCode, int start, int end, String search) {
		return mapper.selectSchoolEmployeeByPage(schoolCode, start, end, search);
	}
	
}
