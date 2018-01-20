package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParentExample;
import cn.com.wtrj.jx.web.portal.service.IParentService;

@Service
public class ParentServiceImpl implements IParentService {

	@Autowired
	private WtrjParentMapper mapper;
	
	@Override
	public WtrjParent searchParentByPhone(String phone) {
		WtrjParentExample example = new WtrjParentExample();
		example.createCriteria().andPhoneEqualTo(phone);
		List<WtrjParent> ps = mapper.selectByExample(example);
		if (ps != null && ps.size() == 1) {
			return ps.get(0);
		}
		return null;
	}

}
