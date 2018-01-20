package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TeacherRole implements Serializable {

	private static final long serialVersionUID = 1L;

	private String schoolCode;
	
	private String schoolName;
	
	private int stage;
	
	private String type;
	
	private String typeName;
	
	private String stageName;
	
	private boolean isAllGrade;
	
	private boolean isAllClass;
	
	private boolean isAllCourse;
	
	private List<Integer> grades;
	
	private boolean selected;
	
	private Map<Integer, List<TeacherClass>> classes;
	
	private Map<String, List<TeacherCourse>> courses;

	public TeacherRole() {
	}
	
	
	
	public TeacherRole(String schoolCode, int stage, String type, String typeName,
			boolean isAllGrade, boolean isAllClass, boolean isAllCourse) {
		this.schoolCode = schoolCode;
		this.stage = stage;
		this.type = type;
		this.typeName = typeName;
		this.isAllGrade = isAllGrade;
		this.isAllClass = isAllClass;
		this.isAllCourse = isAllCourse;
	}

	public boolean isSelected() {
		return selected;
	}



	public void setSelected(boolean selected) {
		this.selected = selected;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public boolean isAllGrade() {
		return isAllGrade;
	}

	public void setAllGrade(boolean isAllGrade) {
		this.isAllGrade = isAllGrade;
	}

	public boolean isAllClass() {
		return isAllClass;
	}

	public void setAllClass(boolean isAllClass) {
		this.isAllClass = isAllClass;
	}

	public boolean isAllCourse() {
		return isAllCourse;
	}

	public void setAllCourse(boolean isAllCourse) {
		this.isAllCourse = isAllCourse;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public Map<Integer, List<TeacherClass>> getClasses() {
		return classes;
	}

	public void setClasses(Map<Integer, List<TeacherClass>> classes) {
		this.classes = classes;
	}

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

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}



	public Map<String, List<TeacherCourse>> getCourses() {
		return courses;
	}



	public void setCourses(Map<String, List<TeacherCourse>> courses) {
		this.courses = courses;
	}

}
