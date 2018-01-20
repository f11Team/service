package cn.com.wtrj.jx.web.portal.service.dto;

import java.util.List;

public class Role {
	
	private String id;
	
	private String Name;
	
	private String content;
	
	private List<String> classes;
	
	private List<String> classNames;
	
	private List<String> courses;
	
	private List<String> courseNames;
	
	private List<String> stage;
	
	private List<String> grades;
	
	public Role() {
	}
	
	public Role(String id, String name, String content) {
		this.id = id;
		Name = name;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getClasses() {
		return classes;
	}

	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public List<String> getStage() {
		return stage;
	}

	public List<String> getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}

	public void setStage(List<String> stage) {
		this.stage = stage;
	}

	public List<String> getGrades() {
		return grades;
	}

	public void setGrades(List<String> grades) {
		this.grades = grades;
	}

	public List<String> getClassNames() {
		return classNames;
	}

	public void setClassNames(List<String> classNames) {
		this.classNames = classNames;
	}
	
}
