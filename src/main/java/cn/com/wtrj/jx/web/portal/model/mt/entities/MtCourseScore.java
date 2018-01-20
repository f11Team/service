package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;

public class MtCourseScore {
	private List<String> courseName;
	private List<String> courseCode;
	private List<WtrjRptScoreSingle> singles;
	private Integer classNumber;
	
	
	public List<String> getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(List<String> courseCode) {
		this.courseCode = courseCode;
	}
	public Integer getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(Integer classNumber) {
		this.classNumber = classNumber;
	}
	public List<String> getCourseName() {
		return courseName;
	}
	public void setCourseName(List<String> courseName) {
		this.courseName = courseName;
	}
	public List<WtrjRptScoreSingle> getSingles() {
		return singles;
	}
	public void setSingles(List<WtrjRptScoreSingle> singles) {
		this.singles = singles;
	}
	
	
	
}
