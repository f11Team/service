package cn.com.wtrj.jx.web.portal.service.dict;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.DictItem;

public interface IDictService {
	public List<DictItem> findDictItemsByCode(String code);
	
	public List<DictItem> findDictItems();
	
	public DictItem findDictItemByCode(String code);
	
}
