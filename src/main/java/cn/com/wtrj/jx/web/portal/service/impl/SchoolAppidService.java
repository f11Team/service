package cn.com.wtrj.jx.web.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomSchoolAppidMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppid;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppidKey;
import cn.com.wtrj.jx.web.portal.service.ISchoolAppidService;

@Service
public class SchoolAppidService implements ISchoolAppidService {

	@Autowired
	WtrjEcomSchoolAppidMapper mapper;
	
	@Override
	public WtrjEcomSchoolAppid searchByShoolCode(String schoolCode, String appKey) {
		WtrjEcomSchoolAppidKey key = new WtrjEcomSchoolAppidKey();
		key.setSchoolCode(schoolCode);
		key.setAppKey(appKey);
		return mapper.selectByPrimaryKey(key);
	}

}
