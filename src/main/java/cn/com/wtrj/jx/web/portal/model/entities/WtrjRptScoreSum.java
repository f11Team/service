package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;

public class WtrjRptScoreSum {
    private String id;

    private String examInsId;

    private String schoolCode;

    private String grade;

    private String classId;

    private String idCard;

    private String name;

    private BigDecimal sumNumber;

    private BigDecimal averageNumber;

    private Integer orderNumber;

    private BigDecimal classTopScore;

    private String examInsName;
    
    private String studentCode;
    
    private Integer gradeOrderNo;
    
    private BigDecimal classBottomScore;
    
    private BigDecimal gradeBottomScore;
    
    private BigDecimal gradeTopScore;
    
    private BigDecimal averageGradeScore;
    
    private Integer artsOrderGradeNum;
    
    private Integer scienceOrderGradeNum;
    
    private BigDecimal scienceScore;
    
    private BigDecimal artsScore;
    
    private String classRemark;
    
    
    
    

	public String getClassRemark() {
		return classRemark;
	}

	public void setClassRemark(String classRemark) {
		this.classRemark = classRemark;
	}

	public BigDecimal getScienceScore() {
		return scienceScore;
	}

	public void setScienceScore(BigDecimal scienceScore) {
		this.scienceScore = scienceScore;
	}

	public BigDecimal getArtsScore() {
		return artsScore;
	}

	public void setArtsScore(BigDecimal artsScore) {
		this.artsScore = artsScore;
	}

	public Integer getArtsOrderGradeNum() {
		return artsOrderGradeNum;
	}

	public void setArtsOrderGradeNum(Integer artsOrderGradeNum) {
		this.artsOrderGradeNum = artsOrderGradeNum;
	}

	public BigDecimal getGradeBottomScore() {
		return gradeBottomScore;
	}

	public void setGradeBottomScore(BigDecimal gradeBottomScore) {
		this.gradeBottomScore = gradeBottomScore;
	}

	public BigDecimal getGradeTopScore() {
		return gradeTopScore;
	}

	public void setGradeTopScore(BigDecimal gradeTopScore) {
		this.gradeTopScore = gradeTopScore;
	}

	public BigDecimal getAverageGradeScore() {
		return averageGradeScore;
	}

	public void setAverageGradeScore(BigDecimal averageGradeScore) {
		this.averageGradeScore = averageGradeScore;
	}

	public Integer getScienceOrderGradeNum() {
		return scienceOrderGradeNum;
	}

	public void setScienceOrderGradeNum(Integer scienceOrderGradeNum) {
		this.scienceOrderGradeNum = scienceOrderGradeNum;
	}

	public BigDecimal getClassBottomScore() {
		return classBottomScore;
	}

	public void setClassBottomScore(BigDecimal classBottomScore) {
		this.classBottomScore = classBottomScore;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getExamInsId() {
        return examInsId;
    }

    public void setExamInsId(String examInsId) {
        this.examInsId = examInsId;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSumNumber() {
        return sumNumber;
    }

    public void setSumNumber(BigDecimal sumNumber) {
        this.sumNumber = sumNumber;
    }

    public BigDecimal getAverageNumber() {
        return averageNumber;
    }

    public void setAverageNumber(BigDecimal averageNumber) {
        this.averageNumber = averageNumber;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getClassTopScore() {
        return classTopScore;
    }

    public void setClassTopScore(BigDecimal classTopScore) {
        this.classTopScore = classTopScore;
    }

    public String getExamInsName() {
        return examInsName;
    }

    public void setExamInsName(String examInsName) {
        this.examInsName = examInsName;
    }

	public Integer getGradeOrderNo() {
		return gradeOrderNo;
	}

	public void setGradeOrderNo(Integer gradeOrderNo) {
		this.gradeOrderNo = gradeOrderNo;
	}
}