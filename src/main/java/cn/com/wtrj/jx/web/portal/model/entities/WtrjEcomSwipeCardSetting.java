package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjEcomSwipeCardSetting {
    private Integer id;

    private String ip;

    private String port;

    private String place;

    private String mark;

    private Date createTime;

    private Date updateTime;

    private String blSendParent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBlSendParent() {
        return blSendParent;
    }

    public void setBlSendParent(String blSendParent) {
        this.blSendParent = blSendParent;
    }
}