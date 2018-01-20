package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.Date;

public class WtrjRptScoreDetail {
    private Integer id;

    private Integer examInsId;

    private String examInsName;

    private String schoolCode;

    private String className;

    private String studentName;

    private String subject;

    private BigDecimal fullScore;

    private BigDecimal score;

    private String studentNo;
    
    private String studentCode;

    private BigDecimal subjectiveItemScore;

    private BigDecimal objectiveItemScore;

    private BigDecimal zScore;

    private BigDecimal tScore;

    private Integer classRank;

    private Integer gradeRank;

    private String examNo;

    private String courseCode;

    private String courseName;

    private String studentIdCardNo;

    private Integer classId;

    private String flag;

    private Integer createUserId;

    private String createUserName;

    private Date createTime;

    private String uploadType;

    private BigDecimal scoreA;

    private BigDecimal scoreAExt;

    private BigDecimal scoreB;

    private BigDecimal scoreBExt;

    private String scoreMulti;
    
    private String remark;

    public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public WtrjRptScoreDetail() {
	}
    
    public WtrjRptScoreDetail(Integer examInsId, String examInsName, String schoolCode, String className,
			String studentName, BigDecimal fullScore, BigDecimal score, String courseCode, String courseName,
			Integer classId, Integer createUserId, String createUserName, BigDecimal scoreA, BigDecimal scoreAExt,
			BigDecimal scoreB, BigDecimal scoreBExt, String scoreMulti, String studentCode, String remark) {
		this.examInsId = examInsId;
		this.examInsName = examInsName;
		this.schoolCode = schoolCode;
		this.className = className;
		this.studentName = studentName;
		this.fullScore = fullScore;
		this.score = score;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.classId = classId;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.scoreA = scoreA;
		this.scoreAExt = scoreAExt;
		this.scoreB = scoreB;
		this.scoreBExt = scoreBExt;
		this.scoreMulti = scoreMulti;
		this.studentCode = studentCode;
		this.remark = remark;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getExamInsId() {
        return examInsId;
    }

    public void setExamInsId(Integer examInsId) {
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

    public BigDecimal getFullScore() {
        return fullScore;
    }

    public void setFullScore(BigDecimal fullScore) {
        this.fullScore = fullScore;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
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

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
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

    public String getStudentIdCardNo() {
        return studentIdCardNo;
    }

    public void setStudentIdCardNo(String studentIdCardNo) {
        this.studentIdCardNo = studentIdCardNo;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
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

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public BigDecimal getScoreA() {
        return scoreA;
    }

    public void setScoreA(BigDecimal scoreA) {
        this.scoreA = scoreA;
    }

    public BigDecimal getScoreAExt() {
        return scoreAExt;
    }

    public void setScoreAExt(BigDecimal scoreAExt) {
        this.scoreAExt = scoreAExt;
    }

    public BigDecimal getScoreB() {
        return scoreB;
    }

    public void setScoreB(BigDecimal scoreB) {
        this.scoreB = scoreB;
    }

    public BigDecimal getScoreBExt() {
        return scoreBExt;
    }

    public void setScoreBExt(BigDecimal scoreBExt) {
        this.scoreBExt = scoreBExt;
    }

	public String getScoreMulti() {
		return scoreMulti;
	}

	public void setScoreMulti(String scoreMulti) {
		this.scoreMulti = scoreMulti;
	}

}