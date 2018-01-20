package cn.com.wtrj.jx.web.portal.service.classCircle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomClassCircleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircleExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.mt.dao.classCircle.MtClassCircleMapper;
import cn.com.wtrj.jx.web.portal.service.classCircle.IClassCircleService;

@Service
public class ClassCircleService implements IClassCircleService {

	@Autowired
	private WtrjEcomClassCircleMapper wtrjEcomClassCircleMapper;

	@Autowired
	private MtClassCircleMapper mtClassCircleMapper;

	@Override
	public List<WtrjEcomClass> selectUserClass(Integer userId) {
		// TODO Auto-generated method stub
		return mtClassCircleMapper.selectUserClass(userId);
	}

	@Override
	public int insertWtrjEcomClassCircle(WtrjEcomClassCircle cc) {
		// TODO Auto-generated method stub
		return wtrjEcomClassCircleMapper.insert(cc);
	}

	@Override
	public List<WtrjEcomClassCircle> selectWtrjEcomClassCircle(Integer userId, Integer classId, String type) {

		WtrjEcomClassCircleExample example = new WtrjEcomClassCircleExample();
		Criteria criteria = example.createCriteria();

		if (StringUtils.isEmpty(type)) {
			criteria.andPublishUserIdEqualTo(userId);
			if (null != classId) {
				criteria.andClassIdEqualTo(classId);
			}
		} else {
			criteria.andTypeEqualTo(type);
			if (type.equals("01")) {
				criteria.andPublishUserIdEqualTo(userId);
				if (null != classId) {
					criteria.andClassIdEqualTo(classId);
				}
			}
		}
		List<WtrjEcomClassCircle> ccList = wtrjEcomClassCircleMapper.selectByExample(example);
		return ccList;
	}

	@Override
	public List<WtrjEcomClassCircle> selectClassCircle(Integer studentId, String type) {
		// TODO Auto-generated method stub
		return mtClassCircleMapper.selectClassCircle(studentId, type);
	}
	
}
