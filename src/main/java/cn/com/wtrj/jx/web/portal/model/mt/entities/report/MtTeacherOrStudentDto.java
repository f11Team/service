package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

public class MtTeacherOrStudentDto {
	// 学校编码
	private String schoolCode;
	// 学校名称
	private String schoolName;
	// 学届
	private Integer registYear;
	// 教师人数
	private Integer teacher;
	// 学生人数
	private Integer student;
	// 师生比
	private Double rate;

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

	public Integer getRegistYear() {
		return registYear;
	}

	public void setRegistYear(Integer registYear) {
		this.registYear = registYear;
	}

	public Integer getTeacher() {
		return teacher;
	}

	public void setTeacher(Integer teacher) {
		this.teacher = teacher;
	}

	public Integer getStudent() {
		return student;
	}

	public void setStudent(Integer student) {
		this.student = student;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
