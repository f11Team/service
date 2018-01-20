package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class Header implements Serializable{

	private static final long serialVersionUID = 1L;

	private String titleName;
	
	private String code;
	
	private String studentName;
	
	private String studentCode;
	
	private String courseName;
	
	private String scoreTitle;
	
	private String scoreTitleA;
	
	private String scoreTitleB;

	private String isMulti;

	private int fromIndex;
	
	private int endIndex;
	
	private int count;

	@Override
	public String toString() {
		return "Header [name=" + titleName + ", code=" + code + ", studentName=" + studentName + ", studentCode="
				+ studentCode + ", courseName=" + courseName + ", scoreTitle=" + scoreTitle + ", scoreTitleA="
				+ scoreTitleA + ", scoreTitleB=" + scoreTitleB +  ", isMulti=" + isMulti + ", fromIndex=" + fromIndex + ", endIndex=" + endIndex + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getIsMulti() {
		return isMulti;
	}

	public void setIsMulti(String isMulti) {
		this.isMulti = isMulti;
	}

	public int getFromIndex() {
		return fromIndex;
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = fromIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getScoreTitle() {
		return scoreTitle;
	}


	public void setScoreTitle(String scoreTitle) {
		this.scoreTitle = scoreTitle;
	}


	public String getScoreTitleA() {
		return scoreTitleA;
	}


	public void setScoreTitleA(String scoreTitleA) {
		this.scoreTitleA = scoreTitleA;
	}


	public String getScoreTitleB() {
		return scoreTitleB;
	}


	public void setScoreTitleB(String scoreTitleB) {
		this.scoreTitleB = scoreTitleB;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	
}
