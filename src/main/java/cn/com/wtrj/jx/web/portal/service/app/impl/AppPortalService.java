package cn.com.wtrj.jx.web.portal.service.app.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjAppPortalMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjAppPortal;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjAppPortalExample;
import cn.com.wtrj.jx.web.portal.service.app.IAppPortalService;

@Service
public class AppPortalService implements IAppPortalService {

	@Autowired
	WtrjAppPortalMapper mapper;
	
	@Override
	public List<WtrjAppPortal> searchAppPortal() {
		WtrjAppPortalExample example = new WtrjAppPortalExample();
		return mapper.selectByExample(example );
	}

}
