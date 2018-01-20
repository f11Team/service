package cn.com.wtrj.jx.web.portal.service.report.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjOrgMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolInfoMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrgExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfoExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.report.MtReportMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtBusinessSegmentDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolDto;
import cn.com.wtrj.jx.web.portal.service.report.IReportService;

@Service
public class ReportService implements IReportService {

	@Autowired
	private MtReportMapper mtMapper;

	@Autowired
	private WtrjOrgMapper orgMapper;

	@Autowired
	private WtrjSchoolInfoMapper scMapper;

	@Override
	public List<MtBusinessSegmentDto> searchRoleOrgByUser(Integer userId) {
		return mtMapper.searchRoleOrgByUser(userId);
	}

	@Override
	public List<MtSchoolDto> searchRoleSchoolByUser(Integer userId) {
		return mtMapper.searchRoleSchoolByUser(userId);
	}

	@Override
	public List<WtrjRptScoreExamIns> searchRoleExamIns(Integer userId) {
		return mtMapper.searchRoleExamIns(userId);
	}

	@Override
	public Map<String, WtrjOrg> getOrgMap() {
		Map<String, WtrjOrg> mp = new HashMap<String, WtrjOrg>();
		WtrjOrgExample ex = new WtrjOrgExample();
		List<WtrjOrg> ds = orgMapper.selectByExample(ex);
		for (WtrjOrg d : ds) {
			mp.put(d.getCode(), d);
		}
		return mp;
	}

	@Override
	public Map<String, WtrjSchoolInfo> getSchoolMap() {
		Map<String, WtrjSchoolInfo> mp = new HashMap<String, WtrjSchoolInfo>();
		WtrjSchoolInfoExample ex = new WtrjSchoolInfoExample();
		List<WtrjSchoolInfo> ds = scMapper.selectByExample(ex);
		for (WtrjSchoolInfo d : ds) {
			mp.put(d.getCode(), d);
		}
		return mp;
	}
}
