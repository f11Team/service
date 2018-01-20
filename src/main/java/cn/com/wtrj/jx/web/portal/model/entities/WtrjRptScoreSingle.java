package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;

public class WtrjRptScoreSingle {
	
	private String id;

    private String examInsId;

    private String examInsName;

    private String schoolCode;

    private String schoolName;

    private String grade;

    private String classId;

    private String className;

    private String courseCode;

    private String courseName;

    private String name;

    private String studentCode;

    private BigDecimal score;

    private BigDecimal averageScore;

    private BigDecimal classTopScore;

    private BigDecimal classBottomScore;

    private Integer orderClassNumber;

    private BigDecimal averageGradeScore;

    private BigDecimal gradeTopScore;

    private BigDecimal gradeBottomScore;

    private Integer orderGradeNumber;

    private String scoreMulti;

    private BigDecimal scoreA;

    private BigDecimal scoreB;

    private BigDecimal classAverageA;

    private BigDecimal classAverageB;

    private BigDecimal gradeAverageA;

    private BigDecimal gradeAverageB;

    private BigDecimal fullScore;

    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(BigDecimal averageScore) {
        this.averageScore = averageScore;
    }

    public BigDecimal getClassTopScore() {
        return classTopScore;
    }

    public void setClassTopScore(BigDecimal classTopScore) {
        this.classTopScore = classTopScore;
    }

    public BigDecimal getClassBottomScore() {
        return classBottomScore;
    }

    public void setClassBottomScore(BigDecimal classBottomScore) {
        this.classBottomScore = classBottomScore;
    }

    public Integer getOrderClassNumber() {
        return orderClassNumber;
    }

    public void setOrderClassNumber(Integer orderClassNumber) {
        this.orderClassNumber = orderClassNumber;
    }

    public BigDecimal getAverageGradeScore() {
        return averageGradeScore;
    }

    public void setAverageGradeScore(BigDecimal averageGradeScore) {
        this.averageGradeScore = averageGradeScore;
    }

    public BigDecimal getGradeTopScore() {
        return gradeTopScore;
    }

    public void setGradeTopScore(BigDecimal gradeTopScore) {
        this.gradeTopScore = gradeTopScore;
    }

    public BigDecimal getGradeBottomScore() {
        return gradeBottomScore;
    }

    public void setGradeBottomScore(BigDecimal gradeBottomScore) {
        this.gradeBottomScore = gradeBottomScore;
    }

    public Integer getOrderGradeNumber() {
        return orderGradeNumber;
    }

    public void setOrderGradeNumber(Integer orderGradeNumber) {
        this.orderGradeNumber = orderGradeNumber;
    }

    public String getScoreMulti() {
        return scoreMulti;
    }

    public void setScoreMulti(String scoreMulti) {
        this.scoreMulti = scoreMulti;
    }

    public BigDecimal getScoreA() {
        return scoreA;
    }

    public void setScoreA(BigDecimal scoreA) {
        this.scoreA = scoreA;
    }

    public BigDecimal getScoreB() {
        return scoreB;
    }

    public void setScoreB(BigDecimal scoreB) {
        this.scoreB = scoreB;
    }

    public BigDecimal getClassAverageA() {
        return classAverageA;
    }

    public void setClassAverageA(BigDecimal classAverageA) {
        this.classAverageA = classAverageA;
    }

    public BigDecimal getClassAverageB() {
        return classAverageB;
    }

    public void setClassAverageB(BigDecimal classAverageB) {
        this.classAverageB = classAverageB;
    }

    public BigDecimal getGradeAverageA() {
        return gradeAverageA;
    }

    public void setGradeAverageA(BigDecimal gradeAverageA) {
        this.gradeAverageA = gradeAverageA;
    }

    public BigDecimal getGradeAverageB() {
        return gradeAverageB;
    }

    public void setGradeAverageB(BigDecimal gradeAverageB) {
        this.gradeAverageB = gradeAverageB;
    }

    public BigDecimal getFullScore() {
        return fullScore;
    }

    public void setFullScore(BigDecimal fullScore) {
        this.fullScore = fullScore;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    public WtrjRptScoreSingle(String id, String examInsId, String examInsName, String schoolCode, String schoolName,
			String grade, String classId, String className, String courseCode, String courseName, String name,
			String studentCode, BigDecimal score, BigDecimal averageScore, BigDecimal classTopScore,
			BigDecimal classBottomScore, Integer orderClassNumber, BigDecimal averageGradeScore,
			BigDecimal gradeTopScore, BigDecimal gradeBottomScore, Integer orderGradeNumber, String scoreMulti,
			BigDecimal scoreA, BigDecimal scoreB, BigDecimal classAverageA, BigDecimal classAverageB,
			BigDecimal gradeAverageA, BigDecimal gradeAverageB, BigDecimal fullScore, String flag) {
		this.id = id;
		this.examInsId = examInsId;
		this.examInsName = examInsName;
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
		this.grade = grade;
		this.classId = classId;
		this.className = className;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.name = name;
		this.studentCode = studentCode;
		this.score = score;
		this.averageScore = averageScore;
		this.classTopScore = classTopScore;
		this.classBottomScore = classBottomScore;
		this.orderClassNumber = orderClassNumber;
		this.averageGradeScore = averageGradeScore;
		this.gradeTopScore = gradeTopScore;
		this.gradeBottomScore = gradeBottomScore;
		this.orderGradeNumber = orderGradeNumber;
		this.scoreMulti = scoreMulti;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
		this.classAverageA = classAverageA;
		this.classAverageB = classAverageB;
		this.gradeAverageA = gradeAverageA;
		this.gradeAverageB = gradeAverageB;
		this.fullScore = fullScore;
		this.flag = flag;
	}

	public WtrjRptScoreSingle() {
		
	}
    
}