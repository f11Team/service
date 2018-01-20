package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.List;

import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;

public class TeacherPermission implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer teacherId;
	private String teacherName;
	private String schoolCode;
	private Integer grade;
	private Integer classId;
	private String courseCode;
	private String type;
	private String schoolName;
	private String className;
	private String stage;
	private String courseName;
	private String roleType;
	private String code;
	private boolean selected;
	
	private List<SchoolClass> classes;
	private List<Grade> grades;
	
	public TeacherPermission() {
	}
	
	public TeacherPermission(Integer teacherId, String schoolCode, Integer grade, Integer classId, String courseCode,
			String type, String schoolName, String className, String stage, String courseName) {
		this.teacherId = teacherId;
		this.schoolCode = schoolCode;
		this.grade = grade;
		this.classId = classId;
		this.courseCode = courseCode;
		this.type = type;
		this.schoolName = schoolName;
		this.className = className;
		this.stage = stage;
		this.courseName = courseName;
	}
	
	
	public TeacherPermission(Integer teacherId, String schoolCode, Integer grade, Integer classId, 
			String type, String schoolName, String className, String stage) {
		this.teacherId = teacherId;
		this.schoolCode = schoolCode;
		this.grade = grade;
		this.classId = classId;
		this.type = type;
		this.schoolName = schoolName;
		this.className = className;
		this.stage = stage;
	}
	
	public TeacherPermission(Integer teacherId, String schoolCode, Integer grade, String courseCode,
			String type, String schoolName, String stage, String courseName) {
		this.teacherId = teacherId;
		this.schoolCode = schoolCode;
		this.grade = grade;
		this.courseCode = courseCode;
		this.type = type;
		this.schoolName = schoolName;
		this.stage = stage;
		this.courseName = courseName;
	}
	
	public TeacherPermission(Integer teacherId, String schoolCode, Integer grade, 
			String type, String schoolName, String stage) {
		this.teacherId = teacherId;
		this.schoolCode = schoolCode;
		this.grade = grade;
		this.type = type;
		this.schoolName = schoolName;
		this.stage = stage;
	}

	public TeacherPermission(Integer teacherId, String schoolCode, 
			String type, String schoolName, String stage) {
		this.teacherId = teacherId;
		this.schoolCode = schoolCode;
		this.type = type;
		this.schoolName = schoolName;
		this.stage = stage;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
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
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public List<SchoolClass> getClasses() {
		return classes;
	}
	public void setClasses(List<SchoolClass> classes) {
		this.classes = classes;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

}
