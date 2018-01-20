package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class SearchInput implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int examInsId;
	
	private int classId;
	
	private boolean findCourese;
	
	private String schoolYearCode;
	
	private String schoolTermCode;
	
	private String schoolCode;
	
	private int stage;
	
	private int grade;
	
	private String courseCode;
	
	private String examInsName;
	
	private int teacherId;
	
	private int start;
	
	private int end;
	
	private String sendState;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getExamInsId() {
		return examInsId;
	}

	public void setExamInsId(int examInsId) {
		this.examInsId = examInsId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public boolean isFindCourese() {
		return findCourese;
	}

	public void setFindCourese(boolean findCourese) {
		this.findCourese = findCourese;
	}

	public String getSchoolYearCode() {
		return schoolYearCode;
	}

	public void setSchoolYearCode(String schoolYearCode) {
		this.schoolYearCode = schoolYearCode;
	}

	public String getSchoolTermCode() {
		return schoolTermCode;
	}

	public void setSchoolTermCode(String schoolTermCode) {
		this.schoolTermCode = schoolTermCode;
	}

	public String getSendState() {
		return sendState;
	}

	public void setSendState(String sendState) {
		this.sendState = sendState;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getExamInsName() {
		return examInsName;
	}

	public void setExamInsName(String examInsName) {
		this.examInsName = examInsName;
	}
	
}
