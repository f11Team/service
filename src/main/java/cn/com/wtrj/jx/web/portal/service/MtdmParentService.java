package cn.com.wtrj.jx.web.portal.service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;

public interface MtdmParentService {
	public MtParent getParentByPhone(String phone);
	
	public WtrjParent getParentById(Integer id);
	
	public int update(MtParent parent);
	
}
