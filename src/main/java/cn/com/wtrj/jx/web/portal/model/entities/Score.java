package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class Score implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String name;
	
	private String schoolCode;
	
	private String schoolName;
	
	private String grade;
	
	private String stage;
	
	private String examSeqCode;
	
	private String examSeqName;
	
	private String typeCode;
	
	private String typeName;
	
	private String schoolYearName;
	
	private String schoolYearCode;
	
	private String schoolTermName;
	
	private String schoolTermCode;
	
	private String examTime;
	
	private String createUserId;
	
	private String createUserName;
	
	private String createTime;
	
	private String courseName;
	
	private String courseCode;
	
	private String remark;
	
	private String examType;
	
	private String classId;
	
	private String className;
	
	private String uploadState;
	
	private String sendState;
	
	private String gradeOrder;
	
	private String msgCode;
	
	private String flag;
	
	public Score() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
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

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}

	public String getSchoolYearCode() {
		return schoolYearCode;
	}

	public void setSchoolYearCode(String schoolYearCode) {
		this.schoolYearCode = schoolYearCode;
	}

	public String getSchoolTermName() {
		return schoolTermName;
	}

	public void setSchoolTermName(String schoolTermName) {
		this.schoolTermName = schoolTermName;
	}

	public String getSchoolTermCode() {
		return schoolTermCode;
	}

	public void setSchoolTermCode(String schoolTermCode) {
		this.schoolTermCode = schoolTermCode;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", name=" + name + ", schoolCode=" + schoolCode + ", schoolName=" + schoolName
				+ ", grade=" + grade + ", stage=" + stage + ", examSeqCode=" + examSeqCode + ", examSeqName="
				+ examSeqName + ", typeCode=" + typeCode + ", typeName=" + typeName + ", schoolYearName="
				+ schoolYearName + ", schoolYearCode=" + schoolYearCode + ", schoolTermName=" + schoolTermName
				+ ", schoolTermCode=" + schoolTermCode + ", examTime=" + examTime + ", createUserId=" + createUserId
				+ ", createUserName=" + createUserName + ", createTime=" + createTime + ", courseName=" + courseName
				+ ", courseCode=" + courseCode + ", remark=" + remark + ", examType=" + examType + ", classId="
				+ classId + ", className=" + className + ", uploadState=" + uploadState + ", sendState=" + sendState
				+ ", gradeOrder=" + gradeOrder + ", msgCode=" + msgCode + ", flag=" + flag + "]";
	}

}
