package cn.com.wtrj.jx.web.portal.service.wtrjEdu.impl;

import cn.com.wtrj.jx.web.portal.model.dao.wtrjEdu.WtrjEduPlanTemplatesMapper;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlan;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanTemplates;
import cn.com.wtrj.jx.web.portal.model.mt.dao.wtrjEdu.WtrjMtEduPlanTemplatesMapper;
import cn.com.wtrj.jx.web.portal.service.wtrjEdu.IWtrjEduPlanTemplatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WtrjEduPlanTemplatesService implements IWtrjEduPlanTemplatesService {

	@Autowired
	private WtrjEduPlanTemplatesMapper wtrjEduPlanTemplatesMapper;

	@Autowired
	private WtrjMtEduPlanTemplatesMapper wtrjMtEduPlanTemplatesMapper;

	@Override
	public int insert(WtrjEduPlanTemplates wtrjEduPlanTemplates) {
		return wtrjEduPlanTemplatesMapper.insert(wtrjEduPlanTemplates);
	}

	@Override
	public WtrjEduPlanTemplates get(Integer id) {
		return wtrjEduPlanTemplatesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(WtrjEduPlanTemplates wtrjEduPlanTemplates) {
		return wtrjEduPlanTemplatesMapper.updateByPrimaryKey(wtrjEduPlanTemplates);
	}

	@Override
	public int delete(Integer id) {
		return wtrjEduPlanTemplatesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<WtrjEduPlanTemplates> getEduPlanTemplatesByPage(String type, Integer start, Integer end) {
		return wtrjMtEduPlanTemplatesMapper.getEduPlanTemplatesByPage(type, start, end);
	}

	@Override
	public int countGetEduPlanTemplatesByPage(String type) {
		return wtrjMtEduPlanTemplatesMapper.countGetEduPlanTemplatesByPage(type);
	}

	@Override
	public int updateDelFlag(Integer id, String delFalg) {
		WtrjEduPlanTemplates wtrjEduPlan = new WtrjEduPlanTemplates();
		wtrjEduPlan.setId(id);
		wtrjEduPlan.setDelFlag(delFalg);

		return wtrjEduPlanTemplatesMapper.updateByPrimaryKeySelective(wtrjEduPlan);
	}
}
