package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRangeRule;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;

public class ScoreInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer examInsId;
	
	private List<WtrjStudent> students;
	
	private List<WtrjScoreRangeRule> ranges;
	
	private String scoreMulti;
	
	private String scoreSection;
	
	private BigDecimal scoreAFull;

    private BigDecimal scoreBFull;

    private BigDecimal scoreAStd;

    private BigDecimal scoreBStd;
    
    private String courseCode;
    
    private String courseName;
    
    private int classId;
    
    private String schoolCode;
    
    private int stage;
    
    private int grade;
    
    private double fullScore;
    
    private String examType;
    
    private String className;
    
    private String dataState;
    
    private String visibleState;
    
    private String singleClassRemark;
    

	public String getSingleClassRemark() {
		return singleClassRemark;
	}

	public void setSingleClassRemark(String singleClassRemark) {
		this.singleClassRemark = singleClassRemark;
	}

	public List<WtrjScoreRangeRule> getRanges() {
		return ranges;
	}

	public void setRanges(List<WtrjScoreRangeRule> ranges) {
		this.ranges = ranges;
	}

	public String getDataState() {
		return dataState;
	}

	public void setDataState(String dataState) {
		this.dataState = dataState;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Integer getExamInsId() {
		return examInsId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setExamInsId(Integer examInsId) {
		this.examInsId = examInsId;
	}

	public List<WtrjStudent> getStudents() {
		return students;
	}

	public void setStudents(List<WtrjStudent> students) {
		this.students = students;
	}

	public String getScoreMulti() {
		return scoreMulti;
	}

	public void setScoreMulti(String scoreMulti) {
		this.scoreMulti = scoreMulti;
	}

	public BigDecimal getScoreAFull() {
		return scoreAFull;
	}

	public void setScoreAFull(BigDecimal scoreAFull) {
		this.scoreAFull = scoreAFull;
	}

	public BigDecimal getScoreBFull() {
		return scoreBFull;
	}

	public void setScoreBFull(BigDecimal scoreBFull) {
		this.scoreBFull = scoreBFull;
	}

	public BigDecimal getScoreAStd() {
		return scoreAStd;
	}

	public void setScoreAStd(BigDecimal scoreAStd) {
		this.scoreAStd = scoreAStd;
	}

	public String getVisibleState() {
		return visibleState;
	}

	public void setVisibleState(String visibleState) {
		this.visibleState = visibleState;
	}

	public BigDecimal getScoreBStd() {
		return scoreBStd;
	}

	public void setScoreBStd(BigDecimal scoreBStd) {
		this.scoreBStd = scoreBStd;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getFullScore() {
		return fullScore;
	}

	public void setFullScore(double fullScore) {
		this.fullScore = fullScore;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getScoreSection() {
		return scoreSection;
	}

	public void setScoreSection(String scoreSection) {
		this.scoreSection = scoreSection;
	}
	
}
