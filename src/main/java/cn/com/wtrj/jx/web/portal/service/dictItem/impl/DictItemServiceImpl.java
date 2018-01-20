package cn.com.wtrj.jx.web.portal.service.dictItem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjDictItemMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDictItem;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDictItemExample;
import cn.com.wtrj.jx.web.portal.service.dictItem.IDictItemService;

@Service
public class DictItemServiceImpl implements IDictItemService {
	@Autowired
	private WtrjDictItemMapper mapper;

	@Override
	public WtrjDictItem findByCode(String code) {
		WtrjDictItemExample example = new WtrjDictItemExample();
		example.createCriteria().andCodeEqualTo(code);
		return mapper.selectByExample(example).get(0);
	}

}
