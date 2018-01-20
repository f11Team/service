package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptNcFeeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtFinancialMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.service.IWtrjFinancialExpenseService;

/**
 * 财务费用情况表业务实现类
 * 
 * @author zhangbin
 *
 */
@Service
public class WtrjFinancialExpenseServiceImpl implements IWtrjFinancialExpenseService {

	@Autowired
	WtrjRptNcFeeMapper wtrjFinancialExpenseMapper;

	@Autowired
	MtFinancialMapper mtFinancialMapper;

	@Override
	public List<MtIntegerAndBigDecimalBean> searchFinancialOneYear(Integer year, Integer userId) {
		return mtFinancialMapper.searchFinancialOneYear(year, userId);
	}

	@Override
	public List<Integer> searchYears() {

		return mtFinancialMapper.selectYears();
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchFinancialOneMonth(Integer year, Integer userId, String segementCode, String orgCode,
			String startDate, String endDate) {

		return mtFinancialMapper.searchFinancialOneMonth(year, userId, segementCode, orgCode, startDate, endDate);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchFinancialGroupByProject(Integer year, Integer userId) {

		return mtFinancialMapper.searchFinancialGroupByProject(year, userId);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchFinancialBySomeProject(Integer year, String project, Integer userId) {

		return mtFinancialMapper.searchFinancialBySomeProject(year, project, userId);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchFinancialByOrgNickName(Integer year, String orgNickName) {

		return mtFinancialMapper.searchFinancialByOrgNickName(year, orgNickName);
	}

}
