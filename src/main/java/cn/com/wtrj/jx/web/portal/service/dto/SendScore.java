package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;

public class SendScore implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int schoolCode;
	
	private String examInsId; 
	
	private String classId;
	
	private String stage;
	
	private boolean sendAvgScore;
	
	private boolean sendTopScore;
	
	private boolean sendClassOrder;
	
	private int sendClassOrderNum;
	
	private boolean sendGrdeOrder;
	
	private int sendGrdeOrderNum;
	
	private boolean sendSingleFull;
	
	private boolean sendArtsScore;
	
	private boolean sendScienceScore;
	
	private boolean sendSingleOrder;
	
	private boolean sendArtsOrder;
	
	private boolean sendScienceOrder;
	
	private boolean sendSingleGradeOrder;
	
	private boolean sendArtsGradeOrder;
	
	private boolean sendScienceGradeOrder;
	
	private boolean sendClassRemark;
	
	

	public boolean isSendClassRemark() {
		return sendClassRemark;
	}

	public void setSendClassRemark(boolean sendClassRemark) {
		this.sendClassRemark = sendClassRemark;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public boolean isSendSingleFull() {
		return sendSingleFull;
	}

	public void setSendSingleFull(boolean sendSingleFull) {
		this.sendSingleFull = sendSingleFull;
	}

	public boolean isSendArtsScore() {
		return sendArtsScore;
	}

	public void setSendArtsScore(boolean sendArtsScore) {
		this.sendArtsScore = sendArtsScore;
	}

	public boolean isSendScienceScore() {
		return sendScienceScore;
	}

	public void setSendScienceScore(boolean sendScienceScore) {
		this.sendScienceScore = sendScienceScore;
	}

	public boolean isSendSingleOrder() {
		return sendSingleOrder;
	}

	public void setSendSingleOrder(boolean sendSingleOrder) {
		this.sendSingleOrder = sendSingleOrder;
	}

	public boolean isSendArtsOrder() {
		return sendArtsOrder;
	}

	public void setSendArtsOrder(boolean sendArtsOrder) {
		this.sendArtsOrder = sendArtsOrder;
	}

	public boolean isSendScienceOrder() {
		return sendScienceOrder;
	}

	public void setSendScienceOrder(boolean sendScienceOrder) {
		this.sendScienceOrder = sendScienceOrder;
	}

	public boolean isSendSingleGradeOrder() {
		return sendSingleGradeOrder;
	}

	public void setSendSingleGradeOrder(boolean sendSingleGradeOrder) {
		this.sendSingleGradeOrder = sendSingleGradeOrder;
	}

	public boolean isSendArtsGradeOrder() {
		return sendArtsGradeOrder;
	}

	public void setSendArtsGradeOrder(boolean sendArtsGradeOrder) {
		this.sendArtsGradeOrder = sendArtsGradeOrder;
	}

	public boolean isSendScienceGradeOrder() {
		return sendScienceGradeOrder;
	}

	public void setSendScienceGradeOrder(boolean sendScienceGradeOrder) {
		this.sendScienceGradeOrder = sendScienceGradeOrder;
	}

	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getExamInsId() {
		return examInsId;
	}

	public void setExamInsId(String examInsId) {
		this.examInsId = examInsId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public boolean isSendAvgScore() {
		return sendAvgScore;
	}

	public void setSendAvgScore(boolean sendAvgScore) {
		this.sendAvgScore = sendAvgScore;
	}

	public boolean isSendTopScore() {
		return sendTopScore;
	}

	public void setSendTopScore(boolean sendTopScore) {
		this.sendTopScore = sendTopScore;
	}

	public boolean isSendClassOrder() {
		return sendClassOrder;
	}

	public void setSendClassOrder(boolean sendClassOrder) {
		this.sendClassOrder = sendClassOrder;
	}

	public int getSendClassOrderNum() {
		return sendClassOrderNum;
	}

	public void setSendClassOrderNum(int sendClassOrderNum) {
		this.sendClassOrderNum = sendClassOrderNum;
	}

	public boolean isSendGrdeOrder() {
		return sendGrdeOrder;
	}

	public void setSendGrdeOrder(boolean sendGrdeOrder) {
		this.sendGrdeOrder = sendGrdeOrder;
	}

	public int getSendGrdeOrderNum() {
		return sendGrdeOrderNum;
	}

	public void setSendGrdeOrderNum(int sendGrdeOrderNum) {
		this.sendGrdeOrderNum = sendGrdeOrderNum;
	}
	
}
