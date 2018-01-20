package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjVisitItem {
    private Integer id;

    private String visitorName;

    private String visitorPhone;

    private String visitorIdCard;

    private String toVisitorName;

    private String toVisitorPhone;

    private String carNum;

    private String remark;

    private Date visitTime;

    private Date leaveTime;

    private Integer visitType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone;
    }

    public String getVisitorIdCard() {
        return visitorIdCard;
    }

    public void setVisitorIdCard(String visitorIdCard) {
        this.visitorIdCard = visitorIdCard;
    }

    public String getToVisitorName() {
        return toVisitorName;
    }

    public void setToVisitorName(String toVisitorName) {
        this.toVisitorName = toVisitorName;
    }

    public String getToVisitorPhone() {
        return toVisitorPhone;
    }

    public void setToVisitorPhone(String toVisitorPhone) {
        this.toVisitorPhone = toVisitorPhone;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }
}