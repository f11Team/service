package cn.com.wtrj.jx.web.portal.service.dict.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.DictMapper;
import cn.com.wtrj.jx.web.portal.model.entities.DictItem;
import cn.com.wtrj.jx.web.portal.service.dict.IDictService;

@Service
public class DictServiceImpl implements IDictService {

	@Autowired
	private DictMapper dictMapper;
	
	@Override
	public List<DictItem> findDictItemsByCode(String code) {
		return dictMapper.findDictItemsByCode(code);
	}

	@Override
	public DictItem findDictItemByCode(String code) {
		return dictMapper.findDictItemByCode(code);
	}

	@Override
	public List<DictItem> findDictItems() {
		return dictMapper.findDictItems();
	}

}
