package cn.com.wtrj.jx.web.portal.service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPayItem;

public interface IWtrjEcomPayItemService {
	/**
	 * 按ID查找收费项目
	 * @return
	 */
	WtrjEcomPayItem searchById(Integer id);
}
