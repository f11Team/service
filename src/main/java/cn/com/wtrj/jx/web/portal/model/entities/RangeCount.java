package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.List;

public class RangeCount {
	private String ranges;
	private Integer sumCount;
	private Integer artsCount;
	private Integer scienceCount;
	private List<DictItem> courseCount;
	
	
	public List<DictItem> getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(List<DictItem> courseCount) {
		this.courseCount = courseCount;
	}
	public String getRanges() {
		return ranges;
	}
	public void setRanges(String ranges) {
		this.ranges = ranges;
	}
	public Integer getSumCount() {
		return sumCount;
	}
	public void setSumCount(Integer sumCount) {
		this.sumCount = sumCount;
	}
	public Integer getArtsCount() {
		return artsCount;
	}
	public void setArtsCount(Integer artsCount) {
		this.artsCount = artsCount;
	}
	public Integer getScienceCount() {
		return scienceCount;
	}
	public void setScienceCount(Integer scienceCount) {
		this.scienceCount = scienceCount;
	}
	
	
}
