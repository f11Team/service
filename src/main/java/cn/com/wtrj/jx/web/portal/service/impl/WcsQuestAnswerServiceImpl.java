package cn.com.wtrj.jx.web.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WcsQuestAnswerMapper;
import cn.com.wtrj.jx.web.portal.service.WcsQuestAnswerService;

@Service
public class WcsQuestAnswerServiceImpl implements WcsQuestAnswerService {

	@Autowired
	public WcsQuestAnswerMapper wcsAnswerMpper;
	
	@Override
	public Integer findAnswerCountByCodeAndWcsClassNo(String wcsClassNo,String code,Integer gradeNo) {
		return wcsAnswerMpper.findAnswerCountByCodeAndWcsClassNo(wcsClassNo, code,gradeNo);
	}

	@Override
	public Integer findAnswerCountByItemIdAndClassNo(String classNo, String itemId,Integer gradeNo) {
		return wcsAnswerMpper.findAnswerCountByItemIdAndClassNo(classNo, itemId,gradeNo);
	}

}
