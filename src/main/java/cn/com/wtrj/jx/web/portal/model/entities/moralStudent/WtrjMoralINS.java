package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.Date;

public class WtrjMoralINS {
    private Integer id;

    private String recType;

    private Integer recUser;

    private Integer studentId;

    private Date recDate;

    private String stdCode;

    private String content;

    private String attachFile;

    private String blTeacherAuth;

    private Integer authTeacherId;
    
    private String authTeacherName;

    private String authResult;

    private Integer actScore;

    private Date authDate;

    private String authContent;

    private String alterContent;

    private String authAttachFile;

    private String bldDelFlg;

    private Date createTime;

    private Date updateTime;

    private  String stuName;

    private String stdName;
    
    private String schoolName;
    
    private String schoolCode;
    
    private Integer classId;
    
    private String className;
    
    private String teacherType;
    
    private String courseCode;
    
    private String courseName;
    
    private String recDateText;
    
    

    public String getAuthTeacherName() {
		return authTeacherName;
	}

	public void setAuthTeacherName(String authTeacherName) {
		this.authTeacherName = authTeacherName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseCode() {
		return courseCode;
	}

	public String getRecDateText() {
		return recDateText;
	}

	public void setRecDateText(String recDateText) {
		this.recDateText = recDateText;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
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

	public String getRecType() {
        return recType;
    }

    public String getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(String teacherType) {
		this.teacherType = teacherType;
	}

	public void setRecType(String recType) {
        this.recType = recType;
    }

    public Integer getRecUser() {
        return recUser;
    }

    public void setRecUser(Integer recUser) {
        this.recUser = recUser;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getStdCode() {
        return stdCode;
    }

    public void setStdCode(String stdCode) {
        this.stdCode = stdCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachFile() {
        return attachFile;
    }

    public void setAttachFile(String attachFile) {
        this.attachFile = attachFile;
    }

    public String getBlTeacherAuth() {
        return blTeacherAuth;
    }

    public void setBlTeacherAuth(String blTeacherAuth) {
        this.blTeacherAuth = blTeacherAuth;
    }

    public Integer getAuthTeacherId() {
        return authTeacherId;
    }

    public void setAuthTeacherId(Integer authTeacherId) {
        this.authTeacherId = authTeacherId;
    }

    public String getAuthResult() {
        return authResult;
    }

    public void setAuthResult(String authResult) {
        this.authResult = authResult;
    }

    public Integer getActScore() {
        return actScore;
    }

    public void setActScore(Integer actScore) {
        this.actScore = actScore;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public String getAuthContent() {
        return authContent;
    }

    public void setAuthContent(String authContent) {
        this.authContent = authContent;
    }

    public String getAlterContent() {
        return alterContent;
    }

    public void setAlterContent(String alterContent) {
        this.alterContent = alterContent;
    }

    public String getAuthAttachFile() {
        return authAttachFile;
    }

    public void setAuthAttachFile(String authAttachFile) {
        this.authAttachFile = authAttachFile;
    }

    public String getBldDelFlg() {
        return bldDelFlg;
    }

    public void setBldDelFlg(String bldDelFlg) {
        this.bldDelFlg = bldDelFlg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
}