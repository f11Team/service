package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;

public interface ISmsService {
	public void saveSmsInfo(WtrjRptMsg param);
	
	public void updateSmsInfo(WtrjRptMsg param);
	
	public List<WtrjRptMsg> selectMsgByMsgCode(String msgCode,Integer type);
	
}
