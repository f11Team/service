package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.List;
import java.util.Map;

public class RangeRuleInput {
	private List<WtrjScoreRangeRule> ranges;
	private String name;
	private String type;
	private Integer examInsId;
	private Integer classId;
	private List<Map<String, Object>> courses;
	private Integer arts;
	private Integer science;
	
	
	
	public List<Map<String, Object>> getCourses() {
		return courses;
	}
	public void setCourses(List<Map<String, Object>> courses) {
		this.courses = courses;
	}
	public Integer getArts() {
		return arts;
	}
	public void setArts(Integer arts) {
		this.arts = arts;
	}
	public Integer getScience() {
		return science;
	}
	public void setScience(Integer science) {
		this.science = science;
	}
	public Integer getExamInsId() {
		return examInsId;
	}
	public void setExamInsId(Integer examInsId) {
		this.examInsId = examInsId;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public List<WtrjScoreRangeRule> getRanges() {
		return ranges;
	}
	public void setRanges(List<WtrjScoreRangeRule> ranges) {
		this.ranges = ranges;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
