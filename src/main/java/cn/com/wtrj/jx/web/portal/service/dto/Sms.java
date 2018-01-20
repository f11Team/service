package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;

public class Sms implements Serializable {

	private static final long serialVersionUID = 1L;


	private boolean smsEnabled;

	private String sendAppid;
	private String sendSecret;
	private Integer agentId;

	private String sendTeacherId;

	private String sendTeacherName;

	private String msgCode;
	
	private String smsType;

	public Sms(String smsType, String sendAppid, String sendSecret, Integer agentId,  String msgCode) {
		this.smsType = smsType;
		this.sendAppid = sendAppid;
		this.sendSecret = sendSecret;
		this.agentId = agentId;
		this.msgCode = msgCode;
	}

	public boolean isSmsEnabled() {
		return smsEnabled;
	}

	public void setSmsEnabled(boolean smsEnabled) {
		this.smsEnabled = smsEnabled;
	}

	public String getSendTeacherId() {
		return sendTeacherId;
	}

	public void setSendTeacherId(String sendTeacherId) {
		this.sendTeacherId = sendTeacherId;
	}

	public String getSendTeacherName() {
		return sendTeacherName;
	}

	public void setSendTeacherName(String sendTeacherName) {
		this.sendTeacherName = sendTeacherName;
	}

	public String getSendAppid() {
		return sendAppid;
	}

	public void setSendAppid(String sendAppid) {
		this.sendAppid = sendAppid;
	}

	public String getSendSecret() {
		return sendSecret;
	}

	public void setSendSecret(String sendSecret) {
		this.sendSecret = sendSecret;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getSmsType() {
		return smsType;
	}

	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}

}
