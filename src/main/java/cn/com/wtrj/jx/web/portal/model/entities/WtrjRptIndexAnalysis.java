package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjRptIndexAnalysis {
    private Integer id;

    private Integer userIndexId;

    private String reason;

    private String result;

    private Integer userId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserIndexId() {
        return userIndexId;
    }

    public void setUserIndexId(Integer userIndexId) {
        this.userIndexId = userIndexId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}