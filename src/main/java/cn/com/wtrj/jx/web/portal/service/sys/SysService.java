package cn.com.wtrj.jx.web.portal.service.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.SysMapper;

@Service
public class SysService {
	
	@Autowired
	private SysMapper sysMapper;
	
	public int queryFromDual() {
		return sysMapper.queryFromDual();
	}
	
}
