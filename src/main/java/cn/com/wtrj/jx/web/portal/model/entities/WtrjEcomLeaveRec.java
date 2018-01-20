package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjEcomLeaveRec {
    private String id;

    private Integer studentId;

    private String studentName;

    private String schoolCode;

    private String schoolName;

    private Integer stage;

    private Integer grade;

    private Integer classNo;

    private Integer classId;

    private String staterType;

    private String type;

    private Date startTime;

    private Date endTime;
    
    private String startTimeStr;
    
    private String endTimeStr;

    private String reason;

    private Integer starterParentId;

    private String starterParentMobile;

    private String starterParentName;

    private Integer starterTeacherId;

    private String starterTeacherName;

    private String starterTeacherMobile;

    private String starterTeacherJobno;

    private Integer confirmTeacherId;

    private String confirmTeacherName;

    private String confirmTeacherMobile;

    private String confirmTeacherJobno;

    private String confirmTeacherStatus;

    private Date confirmTeacherTime;

    private Integer confirmParentId;

    private String confirmParentName;

    private String confirmParentMobile;

    private String confirmParentStatus;

    private String confirmParentTime;

    private String msgCode;

    private Date createTime;

    private Date updateTime;

    private String flag;
    
    
    

    public String getStartTimeStr() {
		return startTimeStr;
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public String getEndTimeStr() {
		return endTimeStr;
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStaterType() {
        return staterType;
    }

    public void setStaterType(String staterType) {
        this.staterType = staterType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStarterParentId() {
        return starterParentId;
    }

    public void setStarterParentId(Integer starterParentId) {
        this.starterParentId = starterParentId;
    }

    public String getStarterParentMobile() {
        return starterParentMobile;
    }

    public void setStarterParentMobile(String starterParentMobile) {
        this.starterParentMobile = starterParentMobile;
    }

    public String getStarterParentName() {
        return starterParentName;
    }

    public void setStarterParentName(String starterParentName) {
        this.starterParentName = starterParentName;
    }

    public Integer getStarterTeacherId() {
        return starterTeacherId;
    }

    public void setStarterTeacherId(Integer starterTeacherId) {
        this.starterTeacherId = starterTeacherId;
    }

    public String getStarterTeacherName() {
        return starterTeacherName;
    }

    public void setStarterTeacherName(String starterTeacherName) {
        this.starterTeacherName = starterTeacherName;
    }

    public String getStarterTeacherMobile() {
        return starterTeacherMobile;
    }

    public void setStarterTeacherMobile(String starterTeacherMobile) {
        this.starterTeacherMobile = starterTeacherMobile;
    }

    public String getStarterTeacherJobno() {
        return starterTeacherJobno;
    }

    public void setStarterTeacherJobno(String starterTeacherJobno) {
        this.starterTeacherJobno = starterTeacherJobno;
    }

    public Integer getConfirmTeacherId() {
        return confirmTeacherId;
    }

    public void setConfirmTeacherId(Integer confirmTeacherId) {
        this.confirmTeacherId = confirmTeacherId;
    }

    public String getConfirmTeacherName() {
        return confirmTeacherName;
    }

    public void setConfirmTeacherName(String confirmTeacherName) {
        this.confirmTeacherName = confirmTeacherName;
    }

    public String getConfirmTeacherMobile() {
        return confirmTeacherMobile;
    }

    public void setConfirmTeacherMobile(String confirmTeacherMobile) {
        this.confirmTeacherMobile = confirmTeacherMobile;
    }

    public String getConfirmTeacherJobno() {
        return confirmTeacherJobno;
    }

    public void setConfirmTeacherJobno(String confirmTeacherJobno) {
        this.confirmTeacherJobno = confirmTeacherJobno;
    }

    public String getConfirmTeacherStatus() {
        return confirmTeacherStatus;
    }

    public void setConfirmTeacherStatus(String confirmTeacherStatus) {
        this.confirmTeacherStatus = confirmTeacherStatus;
    }

    public Date getConfirmTeacherTime() {
        return confirmTeacherTime;
    }

    public void setConfirmTeacherTime(Date confirmTeacherTime) {
        this.confirmTeacherTime = confirmTeacherTime;
    }

    public Integer getConfirmParentId() {
        return confirmParentId;
    }

    public void setConfirmParentId(Integer confirmParentId) {
        this.confirmParentId = confirmParentId;
    }

    public String getConfirmParentName() {
        return confirmParentName;
    }

    public void setConfirmParentName(String confirmParentName) {
        this.confirmParentName = confirmParentName;
    }

    public String getConfirmParentMobile() {
        return confirmParentMobile;
    }

    public void setConfirmParentMobile(String confirmParentMobile) {
        this.confirmParentMobile = confirmParentMobile;
    }

    public String getConfirmParentStatus() {
        return confirmParentStatus;
    }

    public void setConfirmParentStatus(String confirmParentStatus) {
        this.confirmParentStatus = confirmParentStatus;
    }

    public String getConfirmParentTime() {
        return confirmParentTime;
    }

    public void setConfirmParentTime(String confirmParentTime) {
        this.confirmParentTime = confirmParentTime;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}