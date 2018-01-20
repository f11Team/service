package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestItem;

public interface WcsQuestItemService {
	
	List<WcsQuestItem> findAllItemCode();
	
	List<WcsQuestItem> findAllItem();
}
