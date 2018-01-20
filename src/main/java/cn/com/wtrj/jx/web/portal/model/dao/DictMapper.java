package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.DictItem;

public interface DictMapper {
	
	public List<DictItem> findDictItemsByCode(String code);
	public DictItem findDictItemByCode(String code);
	public List<DictItem> findDictItems();
	
}