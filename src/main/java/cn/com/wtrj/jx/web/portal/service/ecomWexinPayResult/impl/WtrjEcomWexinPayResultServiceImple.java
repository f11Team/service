package cn.com.wtrj.jx.web.portal.service.ecomWexinPayResult.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomWexinPayResultMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomWexinPayResult;
import cn.com.wtrj.jx.web.portal.service.ecomWexinPayResult.IWtrjEcomWexinPayResultService;

@Service
public class WtrjEcomWexinPayResultServiceImple implements IWtrjEcomWexinPayResultService {
	
	@Autowired
	private WtrjEcomWexinPayResultMapper weXinPayResultMapper;
	
	@Override
	@Transactional
	public void insertSelective(WtrjEcomWexinPayResult record) {
		weXinPayResultMapper.insertSelective(record);
	}

}
