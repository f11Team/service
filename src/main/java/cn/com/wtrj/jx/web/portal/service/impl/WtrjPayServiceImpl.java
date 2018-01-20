package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptNcPayMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtPayMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.service.IWtrjPayService;

@Service
public class WtrjPayServiceImpl implements IWtrjPayService {

	@Autowired
	WtrjRptNcPayMapper wtrjPayExpenseMapper;

	@Autowired
	MtPayMapper mtPayMapper;

	@Override
	public List<MtIntegerAndBigDecimalBean> searchPayOneYear(Integer year, Integer userId) {

		return mtPayMapper.searchPayOneYear(year, userId);
	}

	@Override
	public List<Integer> searchYears() {

		return mtPayMapper.selectYears();
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchPayOneMonth(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate) {

		return mtPayMapper.searchPayOneMonth(year, userId, segementCode, orgCode, startDate, endDate);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchPayGroupByProject(Integer year, Integer userId) {

		return mtPayMapper.searchPayGroupByProject(year, userId);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchPayBySomeProject(Integer year, String project, Integer userId) {

		return mtPayMapper.searchPayBySomeProject(year, project, userId);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchPayBySomeOrgName(Integer year, String orgNickName, Integer userId) {

		return mtPayMapper.searchPayBySomeOrgName(year, orgNickName, userId);
	}

}
