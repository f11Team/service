package cn.com.wtrj.jx.web.portal.service.dto;

import java.util.List;

public class UserPermission {
	
	// 所属学校编码
	private String schoolCode;
	
	// 学部
	private Integer stage;
	
	// 是否班主任
	private Boolean isHeadTeacher;
	
	// 班主任关联班级ID
    private Integer headTeacherClass;
	
    // 是否任课老师
    private Boolean isCourseTeacher;
    
	// 任课老师科目
    private List<String> courseList;
    
	// 任课老师关联班级
    private List<CourseClassRelationship> courseClassList;
    
	// 是否生辅老师
    private Boolean isDormTeacher;
    
	// 生辅老师关联班级ID
    private List<Integer> dormClassId;
    
	// 是否德育老师
    private Boolean isMoralTeacher;
    
	// 德育老师对应学部
    private String moralSchool;

    // 是否有家长权限
	private Boolean isOwnParentPermission;
    
	private List<ParentClassRelationship> parentList;

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Boolean getIsHeadTeacher() {
		return isHeadTeacher;
	}

	public void setIsHeadTeacher(Boolean isHeadTeacher) {
		this.isHeadTeacher = isHeadTeacher;
	}

	public Integer getHeadTeacherClass() {
		return headTeacherClass;
	}

	public void setHeadTeacherClass(Integer headTeacherClass) {
		this.headTeacherClass = headTeacherClass;
	}

	public Boolean getIsCourseTeacher() {
		return isCourseTeacher;
	}

	public void setIsCourseTeacher(Boolean isCourseTeacher) {
		this.isCourseTeacher = isCourseTeacher;
	}

	public List<String> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<String> courseList) {
		this.courseList = courseList;
	}

	public List<CourseClassRelationship> getCourseClassList() {
		return courseClassList;
	}

	public void setCourseClassList(List<CourseClassRelationship> courseClassList) {
		this.courseClassList = courseClassList;
	}

	public Boolean getIsDormTeacher() {
		return isDormTeacher;
	}

	public void setIsDormTeacher(Boolean isDormTeacher) {
		this.isDormTeacher = isDormTeacher;
	}

	public List<Integer> getDormClassId() {
		return dormClassId;
	}

	public void setDormClassId(List<Integer> dormClassId) {
		this.dormClassId = dormClassId;
	}

	public Boolean getIsMoralTeacher() {
		return isMoralTeacher;
	}

	public void setIsMoralTeacher(Boolean isMoralTeacher) {
		this.isMoralTeacher = isMoralTeacher;
	}

	public String getMoralSchool() {
		return moralSchool;
	}

	public void setMoralSchool(String moralSchool) {
		this.moralSchool = moralSchool;
	}

	public Boolean getIsOwnParentPermission() {
		return isOwnParentPermission;
	}

	public void setIsOwnParentPermission(Boolean isOwnParentPermission) {
		this.isOwnParentPermission = isOwnParentPermission;
	}

	public List<ParentClassRelationship> getParentList() {
		return parentList;
	}

	public void setParentList(List<ParentClassRelationship> parentList) {
		this.parentList = parentList;
	}
}
