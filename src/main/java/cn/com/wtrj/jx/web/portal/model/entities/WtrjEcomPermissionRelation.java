package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjEcomPermissionRelation {
    private String id;

    private Integer belongTeacherId;

    private String belongName;

    private String memberSchoolCode;

    private String memberSchoolName;

    private String memberStage;

    private Integer memberGrade;

    private Integer memberClassId;

    private String memberClassName;

    private String memberClassNo;

    private String memberCourseCode;

    private String memberType;

    private String memberCourseName;

    private String memberDeptId;

    private String memberNamePinyin;

    private String memberNameJianpin;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBelongTeacherId() {
        return belongTeacherId;
    }

    public void setBelongTeacherId(Integer belongTeacherId) {
        this.belongTeacherId = belongTeacherId;
    }

    public String getBelongName() {
        return belongName;
    }

    public void setBelongName(String belongName) {
        this.belongName = belongName;
    }

    public String getMemberSchoolCode() {
        return memberSchoolCode;
    }

    public void setMemberSchoolCode(String memberSchoolCode) {
        this.memberSchoolCode = memberSchoolCode;
    }

    public String getMemberSchoolName() {
        return memberSchoolName;
    }

    public void setMemberSchoolName(String memberSchoolName) {
        this.memberSchoolName = memberSchoolName;
    }

    public String getMemberStage() {
        return memberStage;
    }

    public void setMemberStage(String memberStage) {
        this.memberStage = memberStage;
    }

    public Integer getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(Integer memberGrade) {
        this.memberGrade = memberGrade;
    }

    public Integer getMemberClassId() {
        return memberClassId;
    }

    public void setMemberClassId(Integer memberClassId) {
        this.memberClassId = memberClassId;
    }

    public String getMemberClassName() {
        return memberClassName;
    }

    public void setMemberClassName(String memberClassName) {
        this.memberClassName = memberClassName;
    }

    public String getMemberClassNo() {
        return memberClassNo;
    }

    public void setMemberClassNo(String memberClassNo) {
        this.memberClassNo = memberClassNo;
    }

    public String getMemberCourseCode() {
        return memberCourseCode;
    }

    public void setMemberCourseCode(String memberCourseCode) {
        this.memberCourseCode = memberCourseCode;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberCourseName() {
        return memberCourseName;
    }

    public void setMemberCourseName(String memberCourseName) {
        this.memberCourseName = memberCourseName;
    }

    public String getMemberDeptId() {
        return memberDeptId;
    }

    public void setMemberDeptId(String memberDeptId) {
        this.memberDeptId = memberDeptId;
    }

    public String getMemberNamePinyin() {
        return memberNamePinyin;
    }

    public void setMemberNamePinyin(String memberNamePinyin) {
        this.memberNamePinyin = memberNamePinyin;
    }

    public String getMemberNameJianpin() {
        return memberNameJianpin;
    }

    public void setMemberNameJianpin(String memberNameJianpin) {
        this.memberNameJianpin = memberNameJianpin;
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
}