package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;
import cn.com.wtrj.jx.web.portal.model.mt.dao.EmployeeFileMapper;
import cn.com.wtrj.jx.web.portal.service.EmployeeFileService;

@Service
public class EmployeeFileServiceImpl implements EmployeeFileService {

	@Resource
	private EmployeeFileMapper employeeFileMapper;
	
	/**
	 * 分页数据
	 */
	@Override
	public List<WtrjEmployee> employeeSelect(int startRowNum,int endRowNum,String employeeNameStr) {
		List<WtrjEmployee> list = employeeFileMapper.selectByPaging(startRowNum, endRowNum,employeeNameStr);
		return list;
	}

	/**
	 * 数据总条数
	 */
	@Override
	public int countnum(String employeeNameStr) {
		int countNum = employeeFileMapper.selectCount(employeeNameStr);
		return countNum;
	}

}
