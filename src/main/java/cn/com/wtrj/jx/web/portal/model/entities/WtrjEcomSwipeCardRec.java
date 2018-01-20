package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjEcomSwipeCardRec {
    private Integer id;

    private String no;

    private String type;

    private Date swipeTime;

    private String ip;

    private String port;

    private Date createTime;

    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getSwipeTime() {
        return swipeTime;
    }

    public void setSwipeTime(Date swipeTime) {
        this.swipeTime = swipeTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}