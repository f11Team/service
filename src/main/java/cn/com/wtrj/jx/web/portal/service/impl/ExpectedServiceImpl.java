package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.ExpectedMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtExpectedBean;
import cn.com.wtrj.jx.web.portal.service.ExpectedService;

/**
 * 查询预期目标分析数据
 */
@Service
public class ExpectedServiceImpl implements ExpectedService {

	@Autowired
	ExpectedMapper expectedMapper;

	@Override
	public List<MtExpectedBean> searchExpectedGoal(Integer year, Integer userId, String segementCode, String orgCode) {
		return expectedMapper.searchExpectedGoal(year, userId, segementCode, orgCode);
	}
}
