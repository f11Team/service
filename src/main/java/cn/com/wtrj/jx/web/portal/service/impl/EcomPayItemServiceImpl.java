package cn.com.wtrj.jx.web.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomPayItemMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPayItem;
import cn.com.wtrj.jx.web.portal.service.IWtrjEcomPayItemService;

@Service
public class EcomPayItemServiceImpl implements IWtrjEcomPayItemService {
	
	@Autowired
	private WtrjEcomPayItemMapper payItemMapper;
	@Override
	public WtrjEcomPayItem searchById(Integer id) {
		return payItemMapper.selectByPrimaryKey(id);
	}

}
