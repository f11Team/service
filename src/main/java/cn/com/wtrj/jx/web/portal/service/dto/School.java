package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class School implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String name;
	
	private Set<Integer> grades;
	
	private String stage;
	
	private Boolean checked;
	
	private Map<String, String> courses;

	private List<Grade> gs;
	
	public School() {
	}

	public School(String code, String name, String stage) {
		super();
		this.code = code;
		this.name = name;
		this.stage = stage;
	}

	public List<Grade> getGs() {
		return gs;
	}

	public void setGs(List<Grade> gs) {
		this.gs = gs;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Integer> getGrades() {
		return grades;
	}

	public void setGrades(Set<Integer> grades) {
		this.grades = grades;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	
	
}
