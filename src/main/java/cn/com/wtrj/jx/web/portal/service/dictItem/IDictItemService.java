package cn.com.wtrj.jx.web.portal.service.dictItem;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjDictItem;

public interface IDictItemService {
	/**
	 * 在字典项目表中按code查询记录
	 * 
	 * @param code
	 * @return
	 */
	WtrjDictItem findByCode(String code);
}
