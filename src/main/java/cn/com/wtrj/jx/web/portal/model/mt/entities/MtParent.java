package cn.com.wtrj.jx.web.portal.model.mt.entities;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;

public class MtParent extends WtrjParent {

	
	//扩展部分
	//家长在企业通信录上账号和手机号都是手机号
    private String wxAccount;
    private String wxMobile;
	public String getWxAccount() {
		return wxAccount;
	}
	public void setWxAccount(String wxAccount) {
		this.wxAccount = wxAccount;
	}
	public String getWxMobile() {
		return wxMobile;
	}
	public void setWxMobile(String wxMobile) {
		this.wxMobile = wxMobile;
	}
    
    
    
}
