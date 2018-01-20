package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjEcomTeacherNoticeGroup {
    private String id;

    private String groupCode;

    private String groupName;

    private Integer belongTeacherId;

    private Integer memberTeacherId;

    private String memberName;

    private String memberMobile;

    private String flag;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getBelongTeacherId() {
        return belongTeacherId;
    }

    public void setBelongTeacherId(Integer belongTeacherId) {
        this.belongTeacherId = belongTeacherId;
    }

    public Integer getMemberTeacherId() {
        return memberTeacherId;
    }

    public void setMemberTeacherId(Integer memberTeacherId) {
        this.memberTeacherId = memberTeacherId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}