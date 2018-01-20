package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiPlanJiaoyanzuMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiPlanNianjizuMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanJiaoyanzu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanNianjizu;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiPlanMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlan;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPlanRes;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiPlanService;

@Service
public class KpiPlanService implements IKpiPlanService {

	@Autowired
	WtrjKpiPlanJiaoyanzuMapper jyMapper;

	@Autowired
	WtrjKpiPlanNianjizuMapper njMapper;

	@Autowired
	MtKpiPlanMapper mtMapper;

	@Override
	public List<MtKpiPlan> selectKpiPlan(Integer kpiInsId) {
		return mtMapper.selectKpiPlan(kpiInsId);
	}

	@Override
	public void save(List<MtKpiPlan> params) {
		Mapper map = new DozerBeanMapper();
		for (MtKpiPlan param : params) {
			if (param.getId() == null || param.getId() == 0) {
				if (param.getGroupType() == 1) {
					WtrjKpiPlanJiaoyanzu record = map.map(param, WtrjKpiPlanJiaoyanzu.class);
					jyMapper.insertSelective(record);
				} else {
					WtrjKpiPlanNianjizu record = map.map(param, WtrjKpiPlanNianjizu.class);
					njMapper.insertSelective(record);
				}
			} else {
				if (param.getGroupType() == 1) {
					WtrjKpiPlanJiaoyanzu record = map.map(param, WtrjKpiPlanJiaoyanzu.class);
					jyMapper.updateByPrimaryKeySelective(record);
				} else {
					WtrjKpiPlanNianjizu record = map.map(param, WtrjKpiPlanNianjizu.class);
					njMapper.updateByPrimaryKeySelective(record);
				}
			}
		}
	}

	@Override
	public List<MtKpiPlanRes> selectKpiPlanJy(Integer kpiInsId, String code, Integer excludEmployeeId) {
		return mtMapper.selectKpiPlanJy(kpiInsId, code, excludEmployeeId);
	}

	@Override
	public List<MtKpiPlanRes> selectKpiPlanNj(Integer kpiInsId, String code, Integer excludEmployeeId) {
		return mtMapper.selectKpiPlanNj(kpiInsId, code, excludEmployeeId);
	}

}
