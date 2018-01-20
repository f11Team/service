package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjStudent {
    private Integer id;

    private String schoolCode;

    private String name;
    
    private String code;
    
    private Integer sex;

    private String idCardNumber;

    private String studentNo;

    private String cureentSchoolCode;

    private String registerYear;

    private Integer gradeNo;

    private Integer classNo;

    private String entranceSerialNum;
    
    private String courseName;
    
    private String entranceScholarshipLevel;

    private String entranceSerialImg;

    private String ruxueFenban;

    private String baomingKahao;

    private Integer classId;

    private String cardColor;

    private String photo;

    private String flag;
    
    private String schoolName;
    
    private String className;
    
    private String studentCode;
    
    private String status;
    
    private double score;
    
    private double scoreA;
    
    private double scoreB;
    
    private String remark;
    
    private int rn;


	@Override
	public String toString() {
		return "WtrjStudent [name=" + name + ", studentNo=" + studentNo + ", courseName=" + courseName + ", score="
				+ score + ", scoreA=" + scoreA + ", scoreB=" + scoreB + ", remark=" + remark + "]";
	}


	public WtrjStudent() {
	}
    
    
    
    public WtrjStudent(Integer id, String name, String studentCode, double score, double scoreA, double scoreB,
			String remark) {
		this.id = id;
		this.name = name;
		this.studentCode = studentCode;
		this.score = score;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
		this.remark = remark;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public double getScoreA() {
		return scoreA;
	}

	public void setScoreA(double scoreA) {
		this.scoreA = scoreA;
	}

	public double getScoreB() {
		return scoreB;
	}

	public void setScoreB(double scoreB) {
		this.scoreB = scoreB;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getClassName() {
		return className;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getCureentSchoolCode() {
        return cureentSchoolCode;
    }

    public void setCureentSchoolCode(String cureentSchoolCode) {
        this.cureentSchoolCode = cureentSchoolCode;
    }

    public String getRegisterYear() {
        return registerYear;
    }

    public void setRegisterYear(String registerYear) {
        this.registerYear = registerYear;
    }

    public Integer getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(Integer gradeNo) {
        this.gradeNo = gradeNo;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getEntranceSerialNum() {
        return entranceSerialNum;
    }

    public void setEntranceSerialNum(String entranceSerialNum) {
        this.entranceSerialNum = entranceSerialNum;
    }

    public String getEntranceScholarshipLevel() {
        return entranceScholarshipLevel;
    }

    public void setEntranceScholarshipLevel(String entranceScholarshipLevel) {
        this.entranceScholarshipLevel = entranceScholarshipLevel;
    }

    public String getEntranceSerialImg() {
        return entranceSerialImg;
    }

    public void setEntranceSerialImg(String entranceSerialImg) {
        this.entranceSerialImg = entranceSerialImg;
    }

    public String getRuxueFenban() {
        return ruxueFenban;
    }

    public void setRuxueFenban(String ruxueFenban) {
        this.ruxueFenban = ruxueFenban;
    }

    public String getBaomingKahao() {
        return baomingKahao;
    }

    public void setBaomingKahao(String baomingKahao) {
        this.baomingKahao = baomingKahao;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}
}