package cn.com.wtrj.jx.web.portal.model.mt.dao;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;

public interface MtdmParentMapper {
	public MtParent getParentByPhone(String phone);

	public int update(MtParent parent);
}
