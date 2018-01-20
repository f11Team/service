package cn.com.wtrj.jx.web.portal.service.visitor.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomVisitorMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitor;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitorExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitorExample.Criteria;
import cn.com.wtrj.jx.web.portal.service.visitor.IVisitorService;

@Service
public class VisitorServiceImpl implements IVisitorService{
	@Autowired
	private WtrjEcomVisitorMapper wtrjEcomVisitorMapper;

	@Override
	public void saveVisitItem(WtrjEcomVisitor visitItem) {
		wtrjEcomVisitorMapper.insert(visitItem);
	}

	@Override
	public List<WtrjEcomVisitor> findVisitorsByTeacherId(Integer userId) {
		WtrjEcomVisitorExample example = new WtrjEcomVisitorExample();
		example.setOrderByClause("CREATE_TIME desc");
		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(userId);
		return wtrjEcomVisitorMapper.selectByExample(example);
	}

	@Override
	public WtrjEcomVisitor findVisitorById(Integer id) {
		return wtrjEcomVisitorMapper.selectByPrimaryKey(id);
	}
}