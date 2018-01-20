package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.CapitalMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.CapitalBean;
import cn.com.wtrj.jx.web.portal.service.IWtrjCapitalService;

/**
 * 资金报表业务逻辑实现层
 * 
 * @author jitao
 *
 */
@Service
public class WtrjCapitalServiceImpl implements IWtrjCapitalService {

	@Autowired
	CapitalMapper capitalMapper;

	@Override
	public List<CapitalBean> searchCapitalInfoByType(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate) {
		List<CapitalBean> list = capitalMapper.searchCapitalInfoByType(year, userId, segementCode, orgCode, startDate, endDate);
		return list;
	}

	@Override
	public List<CapitalBean> searchCapitalInfoByProject(String type, int userId) {
		List<CapitalBean> list = capitalMapper.searchCapitalInfoByProject(type, userId);
		return list;
	}

	@Override
	public List<CapitalBean> searchCapitalInfoBySchool(String project, String type, int userId) {
		List<CapitalBean> list = capitalMapper.searchCapitalInfoBySchool(project, type, userId);
		return list;
	}

}
