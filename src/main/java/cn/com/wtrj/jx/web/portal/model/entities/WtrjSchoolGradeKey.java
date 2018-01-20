package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjSchoolGradeKey {
    private Integer grade;

    private String schoolCode;

    private Integer stage;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

	@Override
	public String toString() {
		return "WtrjSchoolGradeKey [grade=" + grade + ", schoolCode=" + schoolCode + ", stage=" + stage + "]";
	}
    
    
}