package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptMsgMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsgExample;
import cn.com.wtrj.jx.web.portal.service.ISmsService;

@Service
public class SmsService implements ISmsService {

	@Autowired
	private WtrjRptMsgMapper mapper;
	
	@Override
	public void saveSmsInfo(WtrjRptMsg param) {
		mapper.insertSelective(param);
	}

	@Override
	public void updateSmsInfo(WtrjRptMsg param) {
		mapper.updateByPrimaryKeySelective(param);
	}


	@Override
	public List<WtrjRptMsg> selectMsgByMsgCode(String msgCode, Integer type) {
		return mapper.selectMsgByMsgCode(msgCode, type);
	}

}
