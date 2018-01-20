package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtExpectedBean;

public interface ExpectedService {

	public List<MtExpectedBean> searchExpectedGoal(Integer year, Integer userId, String segementCode, String orgCode);
}
