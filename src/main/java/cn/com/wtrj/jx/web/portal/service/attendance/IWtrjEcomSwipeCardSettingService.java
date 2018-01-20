package cn.com.wtrj.jx.web.portal.service.attendance;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSetting;

public interface IWtrjEcomSwipeCardSettingService {
	WtrjEcomSwipeCardSetting findWtrjEcomSwipeCardSettingByIp(String ip);
}
