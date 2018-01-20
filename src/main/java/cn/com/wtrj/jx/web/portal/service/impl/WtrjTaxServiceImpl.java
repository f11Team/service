package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomDailyActivitiesTagMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTag;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTagExample;
import cn.com.wtrj.jx.web.portal.service.IWtrjTaxService;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class WtrjTaxServiceImpl implements IWtrjTaxService {

	@Autowired
	WtrjEcomDailyActivitiesTagMapper wtrjEcomDailyActivitiesTagMapper;


	@Override
	public List<WtrjEcomDailyActivitiesTag> findAll() {
		WtrjEcomDailyActivitiesTagExample example=new WtrjEcomDailyActivitiesTagExample();	
		example.createCriteria().andNameIsNotNull();
		return wtrjEcomDailyActivitiesTagMapper.selectByExample(example);
		//return wtrjEcomTagMapper.selectByExample(example);
	}


}
