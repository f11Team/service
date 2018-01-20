package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

public class MtRptScoreDetail {
    private Integer id;

    private Integer examInsId;

    private String schoolCode;

    private String className;

    private String studentName;

    private String subject;

    private Integer score;

    private String examNo;

    private BigDecimal subjectiveItemScore;

    private BigDecimal objectiveItemScore;

    private BigDecimal zScore;

    private BigDecimal tScore;

    private Integer classRank;

    private Integer gradeRank;

    private String studentNo;
    
    private String courseCode;
    
    private String courseName;
    
    private String classId;
    
    /**考次名称，用于页面显示*/
    private String examName;
    
    /**班级平均分*/
    private Double classAverageScore;
    /**及格分*/
    private Double passingScore;
    /**优秀分*/
    private Double excellenceScore;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public Integer getExamInsId() {
		return examInsId;
	}
	public void setExamInsId(Integer examInsId) {
		this.examInsId = examInsId;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getExamNo() {
		return examNo;
	}
	public void setExamNo(String examNo) {
		this.examNo = examNo;
	}
	public BigDecimal getSubjectiveItemScore() {
		return subjectiveItemScore;
	}
	public void setSubjectiveItemScore(BigDecimal subjectiveItemScore) {
		this.subjectiveItemScore = subjectiveItemScore;
	}
	public BigDecimal getObjectiveItemScore() {
		return objectiveItemScore;
	}
	public void setObjectiveItemScore(BigDecimal objectiveItemScore) {
		this.objectiveItemScore = objectiveItemScore;
	}
	public BigDecimal getzScore() {
		return zScore;
	}
	public void setzScore(BigDecimal zScore) {
		this.zScore = zScore;
	}
	public BigDecimal gettScore() {
		return tScore;
	}
	public void settScore(BigDecimal tScore) {
		this.tScore = tScore;
	}
	public Integer getClassRank() {
		return classRank;
	}
	public void setClassRank(Integer classRank) {
		this.classRank = classRank;
	}
	public Integer getGradeRank() {
		return gradeRank;
	}
	public void setGradeRank(Integer gradeRank) {
		this.gradeRank = gradeRank;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public Double getClassAverageScore() {
		return classAverageScore;
	}
	public void setClassAverageScore(Double classAverageScore) {
		//平均分保留两位小数
		this.classAverageScore = new BigDecimal(classAverageScore).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public Double getPassingScore() {
		return passingScore;
	}
	public void setPassingScore(Double passingScore) {
		this.passingScore = passingScore;
	}
	public Double getExcellenceScore() {
		return excellenceScore;
	}
	public void setExcellenceScore(Double excellenceScore) {
		this.excellenceScore = excellenceScore;
	}
	public MtRptScoreDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MtRptScoreDetail [id=" + id + ", examInsId=" + examInsId + ", schoolCode=" + schoolCode + ", className="
				+ className + ", studentName=" + studentName + ", subject=" + subject + ", score=" + score + ", examNo="
				+ examNo + ", subjectiveItemScore=" + subjectiveItemScore + ", objectiveItemScore=" + objectiveItemScore
				+ ", zScore=" + zScore + ", tScore=" + tScore + ", classRank=" + classRank + ", gradeRank=" + gradeRank
				+ ", studentNo=" + studentNo + ", examName=" + examName + ", classAverageScore=" + classAverageScore
				+ ", passingScore=" + passingScore + ", excellenceScore=" + excellenceScore + "]";
	}
	
    
}