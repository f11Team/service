package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WcsQuestItemMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestItem;
import cn.com.wtrj.jx.web.portal.service.WcsQuestItemService;

@Service
public class WcsQuestItemServiceImpl implements WcsQuestItemService {

	@Autowired
	public WcsQuestItemMapper questItemMapper;
	
	@Override
	public List<WcsQuestItem> findAllItemCode() {
		return questItemMapper.findAllItemCode();
	}

	@Override
	public List<WcsQuestItem> findAllItem() {
		return questItemMapper.findAllItem();
	}

}
