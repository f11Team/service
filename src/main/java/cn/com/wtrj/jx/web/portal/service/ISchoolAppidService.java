package cn.com.wtrj.jx.web.portal.service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppid;

public interface ISchoolAppidService {
	
	public WtrjEcomSchoolAppid searchByShoolCode(String schoolCode, String appKey);
}
