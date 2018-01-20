package cn.com.wtrj.jx.web.portal.service.attendance.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomSwipeCardRecMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRec;
import cn.com.wtrj.jx.web.portal.service.attendance.IWtrjEcomSwipeCardRecService;

@Service
public class WtrjEcomSwipeCardRecServiceImpl implements IWtrjEcomSwipeCardRecService {
	@Autowired
	private WtrjEcomSwipeCardRecMapper wtrjEcomSwipeCardRecServiceImpl;

	@Override
	public void saveWtrjEcomSwipeCardRec(WtrjEcomSwipeCardRec wtrjEcomSwipeCardRec) {
		wtrjEcomSwipeCardRecServiceImpl.insert(wtrjEcomSwipeCardRec);
	}
}
