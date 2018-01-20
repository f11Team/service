package cn.com.wtrj.jx.web.portal.service.parent.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParentExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParentExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.mt.dao.parent.MtWtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentInfo;
import cn.com.wtrj.jx.web.portal.service.parent.IWtrjEcomParentService;

@Service
public class WtrjEcomParentServiceImpl implements IWtrjEcomParentService{
	@Autowired
	private MtWtrjParentMapper mtWtrjParentMapper;
	
	@Autowired
	private WtrjParentMapper wtrjParentMapper;
	
	@Override
	public List<MtParentInfo> findWtrjParentsByStudentNo(String studentNo) {
		return mtWtrjParentMapper.findWtrjParentsByStudentNo(studentNo);
	}

	@Override
	public List<WtrjParent> findParentsByStudentName(String studentName) {
		return mtWtrjParentMapper.findParentsByStudentName(studentName);
	}

	/**
	 * 根据家长姓名查询家长信息
	 */
	@Override
	public WtrjParent findParentInfoByName(String parent) {
		WtrjParentExample example = new WtrjParentExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(parent);
		return wtrjParentMapper.selectByExample(example).get(0);
	}

	/**
	 * 根据学生id查询家长信息
	 */
	@Override
	public List<WtrjParent> findParentsByStudentId(Integer studentId) {
		return mtWtrjParentMapper.findParentsByStudentId(studentId);
	}
}
