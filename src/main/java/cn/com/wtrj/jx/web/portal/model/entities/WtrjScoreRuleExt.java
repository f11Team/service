package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;

public class WtrjScoreRuleExt {
    private String id;

    private BigDecimal scoreAFull;

    private BigDecimal scoreBFull;

    private BigDecimal scoreAStd;

    private BigDecimal scoreBStd;

    private BigDecimal scoreFull;

    private Integer examInsId;

    private Integer uploadId;

    private String courseCode;

    private String courseName;
    
    private String scoreMulti;
    
    private int classId;
    
    private String className;
    
    private String flag;

    public WtrjScoreRuleExt() {
	}
    
    public WtrjScoreRuleExt(BigDecimal scoreFull, Integer examInsId, String courseCode, String courseName,
			String scoreMulti, int classId, String className) {
		this.scoreFull = scoreFull;
		this.examInsId = examInsId;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.scoreMulti = scoreMulti;
		this.classId = classId;
		this.className = className;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigDecimal getScoreBStd() {
        return scoreBStd;
    }

    public void setScoreBStd(BigDecimal scoreBStd) {
        this.scoreBStd = scoreBStd;
    }

    public BigDecimal getScoreFull() {
        return scoreFull;
    }

    public void setScoreFull(BigDecimal scoreFull) {
        this.scoreFull = scoreFull;
    }

    public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getExamInsId() {
        return examInsId;
    }

    public void setExamInsId(Integer examInsId) {
        this.examInsId = examInsId;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
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

	public String getScoreMulti() {
		return scoreMulti;
	}

	public void setScoreMulti(String scoreMulti) {
		this.scoreMulti = scoreMulti;
	}

	
}