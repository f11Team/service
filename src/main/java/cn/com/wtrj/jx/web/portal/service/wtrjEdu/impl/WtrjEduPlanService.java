package cn.com.wtrj.jx.web.portal.service.wtrjEdu.impl;

import cn.com.wtrj.jx.web.portal.model.dao.wtrjEdu.WtrjEduPlanMapper;
import cn.com.wtrj.jx.web.portal.model.dao.wtrjEdu.WtrjEduPlanTemplatesMapper;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlan;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.wtrjEdu.WtrjMtEduPlanMapper;
import cn.com.wtrj.jx.web.portal.service.wtrjEdu.IWtrjEduPlanService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WtrjEduPlanService implements IWtrjEduPlanService {

	@Autowired
	private WtrjEduPlanMapper wtrjEduPlanMapper;

	@Autowired
	private WtrjMtEduPlanMapper wtrjMtEduPlanMapper;

	@Override
	public int insert(WtrjEduPlan wtrjEduPlan) {
		return wtrjEduPlanMapper.insert(wtrjEduPlan);
	}

	@Override
	public int update(WtrjEduPlan wtrjEduPlan) {
		return wtrjEduPlanMapper.updateByPrimaryKey(wtrjEduPlan);
	}

	@Override
	public WtrjEduPlan get(Integer id) {
		return wtrjEduPlanMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateDelFlag(Integer id, String delFalg) {

		WtrjEduPlan wtrjEduPlan = new WtrjEduPlan();
		wtrjEduPlan.setId(id);
		wtrjEduPlan.setDelFlag(delFalg);
		return wtrjEduPlanMapper.updateByPrimaryKeySelective(wtrjEduPlan);
	}

	@Override
	public int updateStatus(Integer id, String status,String score) {

		WtrjEduPlan wtrjEduPlan = new WtrjEduPlan();
		wtrjEduPlan.setId(id);
		wtrjEduPlan.setStatus(status);
		wtrjEduPlan.setSocre(score);
		return wtrjEduPlanMapper.updateByPrimaryKeySelective(wtrjEduPlan);
	}

	@Override
	public List<WtrjEduPlan> getTeacherEduPlanByPage(Integer teacherId, Integer start, Integer end) {
		// TODO Auto-generated method stub
		return wtrjMtEduPlanMapper.getTeacherEduPlanByPage(teacherId, start, end);
	}

	@Override
	public int countTeacherEduPlanByPage(Integer teacherId) {
		// TODO Auto-generated method stub
		return wtrjMtEduPlanMapper.countTeacherEduPlanByPage(teacherId);
	}

	@Override
	public List<WtrjEduPlan> getVerifyEduPlanByPage(
			String type,
			String schoolCode,
			String schoolYear,
			String schoolTerm,
			String course,
			String grade,
			String status,
			String teacherName,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return wtrjMtEduPlanMapper.getVerifyEduPlanByPage(type,
				schoolCode,
				schoolYear,
				schoolTerm,
				course,
				grade,
				status,
				teacherName, start, end);
	}

	@Override
	public int countVerifyEduPlanByPage(String type,
			String schoolCode,
			String schoolYear,
			String schoolTerm,
			String course,
			String grade,
			String status,
			String teacherName) {
		// TODO Auto-generated method stub
		return wtrjMtEduPlanMapper.countVerifyEduPlanByPage(type,
				schoolCode,
				schoolYear,
				schoolTerm,
				course,
				grade,
				status,
				teacherName);
	}

	@Override
	public int updateVerify(Integer id, String status,String score) {
		// TODO Auto-generated method stub
		WtrjEduPlan wep = new WtrjEduPlan();
		wep.setId(id);
		wep.setStatus(status);
		wep.setSocre(score);
		return wtrjEduPlanMapper.updateByPrimaryKeySelective(wep);
	}
}
