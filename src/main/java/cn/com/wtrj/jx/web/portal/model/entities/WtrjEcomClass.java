package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjEcomClass {
    private Integer id;

    private Integer classNo;

    private String className;

    private String schoolCode;

    private Integer grade;

    private Integer registYear;

    private Integer graduateYear;

    private Integer studentNumber;

    private String createTime;

    private String updateTime;

    private Integer stage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getRegistYear() {
        return registYear;
    }

    public void setRegistYear(Integer registYear) {
        this.registYear = registYear;
    }

    public Integer getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(Integer graduateYear) {
        this.graduateYear = graduateYear;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

	@Override
	public String toString() {
		return "WtrjEcomClass [id=" + id + ", classNo=" + classNo + ", className=" + className + ", schoolCode="
				+ schoolCode + ", grade=" + grade + ", registYear=" + registYear + ", graduateYear=" + graduateYear
				+ ", studentNumber=" + studentNumber + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", stage=" + stage + "]";
	}
    
    
}