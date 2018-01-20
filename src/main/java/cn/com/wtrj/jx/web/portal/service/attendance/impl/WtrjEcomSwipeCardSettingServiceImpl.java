package cn.com.wtrj.jx.web.portal.service.attendance.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomSwipeCardSettingMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSetting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSettingExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSettingExample.Criteria;
import cn.com.wtrj.jx.web.portal.service.attendance.IWtrjEcomSwipeCardSettingService;

@Service
public class WtrjEcomSwipeCardSettingServiceImpl implements IWtrjEcomSwipeCardSettingService {
	@Autowired
	private WtrjEcomSwipeCardSettingMapper wtrjEcomSwipeCardSettingServiceImpl;
	
	@Override
	public WtrjEcomSwipeCardSetting findWtrjEcomSwipeCardSettingByIp(String ip) {
		WtrjEcomSwipeCardSettingExample example = new WtrjEcomSwipeCardSettingExample();
		Criteria criteria = example.createCriteria();
		criteria.andIpEqualTo(ip);
		return wtrjEcomSwipeCardSettingServiceImpl.selectByExample(example).get(0);
	}
}
