package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WtrjRptScoreExamClass implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private Integer examInsId;

	private String examInsName;

    private Date startDate;

    private Date endDate;

    private String schoolCode;

    private String stage;

    private String grade;

    private String examSeqCode;

    private String examSeqName;

    private String typeCode;

    private String typeName;

    private String schoolYearCode;

    private String schoolYearName;

    private String schoolTermCode;

    private String schoolTermName;

    private Integer examTime;

    private String createUserId;

    private String createUserName;

    private Date createTime;

    private String courseCode;

    private String courseName;

    private String remark;

    private String examType;

    private Integer classId;

    private String className;

    private String uploadState;

    private String sendState;
    
    private String dataState;

    private String flag;

    private String gradeOrder;

    private String msgCode;

    private String schoolName;
    
    private String scoreMulti;
    
    private BigDecimal scoreFull;
    
    private String uploadId;
    
    private String state;
    
    private String successFlag;
    
    private String visibleState;
    
    public WtrjRptScoreExamClass() {
	}
    
	public WtrjRptScoreExamClass(String id, int examInsId, String examInsName, int classId, String className, String createUserId, String createUserName, Date createTime,
			String courseCode, String courseName, String dataState, String uploadId, String sendState) {
		this.examInsId = examInsId;
		this.id = id;
		this.examInsName = examInsName;
		this.classId = classId;
		this.className = className;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.dataState = dataState;
		this.uploadId = uploadId;
		this.sendState = sendState;
	}

	public String getSuccessFlag() {
		return successFlag;
	}

	public void setSuccessFlag(String successFlag) {
		this.successFlag = successFlag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getExamInsId() {
		return examInsId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setExamInsId(Integer examInsId) {
		this.examInsId = examInsId;
	}

	public String getExamInsName() {
		return examInsName;
	}

	public String getUploadId() {
		return uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	public void setExamInsName(String examInsName) {
		this.examInsName = examInsName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getExamSeqCode() {
		return examSeqCode;
	}

	public void setExamSeqCode(String examSeqCode) {
		this.examSeqCode = examSeqCode;
	}

	public String getExamSeqName() {
		return examSeqName;
	}

	public void setExamSeqName(String examSeqName) {
		this.examSeqName = examSeqName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getSchoolYearCode() {
		return schoolYearCode;
	}

	public void setSchoolYearCode(String schoolYearCode) {
		this.schoolYearCode = schoolYearCode;
	}

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}

	public String getSchoolTermCode() {
		return schoolTermCode;
	}

	public void setSchoolTermCode(String schoolTermCode) {
		this.schoolTermCode = schoolTermCode;
	}

	public String getSchoolTermName() {
		return schoolTermName;
	}

	public void setSchoolTermName(String schoolTermName) {
		this.schoolTermName = schoolTermName;
	}

	public Integer getExamTime() {
		return examTime;
	}

	public void setExamTime(Integer examTime) {
		this.examTime = examTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getUploadState() {
		return uploadState;
	}

	public void setUploadState(String uploadState) {
		this.uploadState = uploadState;
	}

	public String getSendState() {
		return sendState;
	}

	public void setSendState(String sendState) {
		this.sendState = sendState;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getGradeOrder() {
		return gradeOrder;
	}

	public void setGradeOrder(String gradeOrder) {
		this.gradeOrder = gradeOrder;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getScoreMulti() {
		return scoreMulti;
	}

	public void setScoreMulti(String scoreMulti) {
		this.scoreMulti = scoreMulti;
	}

	public BigDecimal getScoreFull() {
		return scoreFull;
	}

	public void setScoreFull(BigDecimal scoreFull) {
		this.scoreFull = scoreFull;
	}

	public String getDataState() {
		return dataState;
	}

	public void setDataState(String dataState) {
		this.dataState = dataState;
	}

	public String getVisibleState() {
		return visibleState;
	}

	public void setVisibleState(String visibleState) {
		this.visibleState = visibleState;
	}

}