package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;
import java.util.Date;

public class Score implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String yearName;
	
	private String yearCode;
	
	private String termCode;
	
	private String termName;
	
	private String schoolCode;
	
	private String schoolName;
	
	private String grade;
	
	private String classId;
	
	private String className;
	
	private String courseCode;
	
	private String courseName;
	
	private String examInsId;
	
	private String examInsName;
	
	private String typeCode;
	
	private String typeName;
	
	private Date uploadTime;
	
	private Integer uploadUserId;
	
	private String uploadUserName;
	
	private String filePath;
	
	private String diskPath;
	
	private String score;
	
	private String idCardNumber;
	
	private String studentName;
	
	private Boolean over;

	private String uploadTimeStr;
	
	private double sumNumber;
	
	private double averageNumber;
	
	private double classTopScore;
	
	private int orderNumber;
	
	private String avgText;
	
	private String topText;
	
	private String parentName;
	
	private String parentPhone;
	
	private String name;
	
	private String fullScore;
	
	private String teacherId;
	
	private String teacherName;
	
	private String remark;
	
	private String flag;
	
	private String studentCode;
	
	private int gradeOrderNo;
	
	private double classBottomScore;
	
	private double gradeBottomScore;
	
	private double gradeTopScore;
	
	private double averageGradeScore;
	
	private double scienceScore;
	
	private double artsScore;
	
	private Integer scienceOrdClassNum;
	
	private Integer artsOrdClassNum;
	
	private Integer scienceOrdGradeNum;
	
	private Integer artsOrdGradeNum;
	
	private String classRemark;
	
	public String getClassRemark() {
		return classRemark;
	}

	public void setClassRemark(String classRemark) {
		this.classRemark = classRemark;
	}

	public double getGradeBottomScore() {
		return gradeBottomScore;
	}

	public void setGradeBottomScore(double gradeBottomScore) {
		this.gradeBottomScore = gradeBottomScore;
	}

	public double getGradeTopScore() {
		return gradeTopScore;
	}

	public void setGradeTopScore(double gradeTopScore) {
		this.gradeTopScore = gradeTopScore;
	}

	public double getAverageGradeScore() {
		return averageGradeScore;
	}

	public void setAverageGradeScore(double averageGradeScore) {
		this.averageGradeScore = averageGradeScore;
	}

	public Integer getScienceOrdGradeNum() {
		return scienceOrdGradeNum;
	}

	public void setScienceOrdGradeNum(Integer scienceOrdGradeNum) {
		this.scienceOrdGradeNum = scienceOrdGradeNum;
	}

	public Integer getArtsOrdGradeNum() {
		return artsOrdGradeNum;
	}

	public void setArtsOrdGradeNum(Integer artsOrdGradeNum) {
		this.artsOrdGradeNum = artsOrdGradeNum;
	}

	public Integer getScienceOrdClassNum() {
		return scienceOrdClassNum;
	}

	public void setScienceOrdClassNum(Integer scienceOrdClassNum) {
		this.scienceOrdClassNum = scienceOrdClassNum;
	}

	public Integer getArtsOrdClassNum() {
		return artsOrdClassNum;
	}

	public void setArtsOrdClassNum(Integer artsOrdClassNum) {
		this.artsOrdClassNum = artsOrdClassNum;
	}

	public double getScienceScore() {
		return scienceScore;
	}

	public void setScienceScore(double scienceScore) {
		this.scienceScore = scienceScore;
	}

	public double getArtsScore() {
		return artsScore;
	}

	public void setArtsScore(double artsScore) {
		this.artsScore = artsScore;
	}

	public double getClassBottomScore() {
		return classBottomScore;
	}

	public void setClassBottomScore(double classBottomScore) {
		this.classBottomScore = classBottomScore;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public int getGradeOrderNo() {
		return gradeOrderNo;
	}

	public void setGradeOrderNo(int gradeOrderNo) {
		this.gradeOrderNo = gradeOrderNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAvgText() {
		return avgText;
	}

	public void setAvgText(String avgText) {
		this.avgText = avgText;
	}

	public String getTopText() {
		return topText;
	}

	public void setTopText(String topText) {
		this.topText = topText;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public String getDiskPath() {
		return diskPath;
	}

	public void setDiskPath(String diskPath) {
		this.diskPath = diskPath;
	}

	public double getClassTopScore() {
		return classTopScore;
	}

	public void setClassTopScore(double classTopScore) {
		this.classTopScore = classTopScore;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYearName() {
		return yearName;
	}

	public void setYearName(String yearName) {
		this.yearName = yearName;
	}

	public String getYearCode() {
		return yearCode;
	}

	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}

	public String getTermCode() {
		return termCode;
	}

	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
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

	public String getExamInsId() {
		return examInsId;
	}

	public void setExamInsId(String examInsId) {
		this.examInsId = examInsId;
	}

	public String getExamInsName() {
		return examInsName;
	}

	public void setExamInsName(String examInsName) {
		this.examInsName = examInsName;
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

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Integer getUploadUserId() {
		return uploadUserId;
	}

	public void setUploadUserId(Integer uploadUserId) {
		this.uploadUserId = uploadUserId;
	}

	public String getUploadUserName() {
		return uploadUserName;
	}

	public void setUploadUserName(String uploadUserName) {
		this.uploadUserName = uploadUserName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Boolean getOver() {
		return over;
	}

	public void setOver(Boolean over) {
		this.over = over;
	}

	public String getUploadTimeStr() {
		return uploadTimeStr;
	}

	public void setUploadTimeStr(String uploadTimeStr) {
		this.uploadTimeStr = uploadTimeStr;
	}

	public double getSumNumber() {
		return sumNumber;
	}

	public void setSumNumber(double sumNumber) {
		this.sumNumber = sumNumber;
	}

	public double getAverageNumber() {
		return averageNumber;
	}

	public void setAverageNumber(double averageNumber) {
		this.averageNumber = averageNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", yearName=" + yearName + ", yearCode=" + yearCode + ", termCode=" + termCode
				+ ", termName=" + termName + ", schoolCode=" + schoolCode + ", schoolName=" + schoolName + ", grade="
				+ grade + ", classId=" + classId + ", className=" + className + ", courseCode=" + courseCode
				+ ", courseName=" + courseName + ", examInsId=" + examInsId + ", examInsName=" + examInsName
				+ ", typeCode=" + typeCode + ", typeName=" + typeName + ", uploadTime=" + uploadTime + ", uploadUserId="
				+ uploadUserId + ", uploadUserName=" + uploadUserName + ", filePath=" + filePath + ", diskPath="
				+ diskPath + ", score=" + score + ", idCardNumber=" + idCardNumber + ", studentName=" + studentName
				+ ", over=" + over + ", uploadTimeStr=" + uploadTimeStr + ", sumNumber=" + sumNumber
				+ ", averageNumber=" + averageNumber + ", classTopScore=" + classTopScore + ", orderNumber="
				+ orderNumber + ", avgText=" + avgText + ", topText=" + topText + ", parentName=" + parentName
				+ ", parentPhone=" + parentPhone + ", name=" + name + ", fullScore=" + fullScore + ", teacherId="
				+ teacherId + ", teacherName=" + teacherName + ", remark=" + remark + "]";
	}

}
