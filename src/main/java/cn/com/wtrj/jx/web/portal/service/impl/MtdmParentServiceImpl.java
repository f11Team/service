package cn.com.wtrj.jx.web.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtdmParentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;
import cn.com.wtrj.jx.web.portal.service.MtdmParentService;

@Service
public class MtdmParentServiceImpl implements MtdmParentService {
	
	@Autowired
	private MtdmParentMapper mtdmParentMapper;
	
	@Autowired
	private WtrjParentMapper wtrjParentMapper;
	
	@Override
	public MtParent getParentByPhone(String phone) {
		return mtdmParentMapper.getParentByPhone(phone);
	}
	
	@Override
	public WtrjParent getParentById(Integer id) {
		return wtrjParentMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int update(MtParent parent) {
		return mtdmParentMapper.update(parent);
	}

}
