package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class NoticeTeacherPermisson  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5033714983500660988L;

	private List<String> ownedSchools;
	
	private Map<String,Boolean> schoolChecked;
	
	private List<NoticeGradeKey> ownedGrades;
	
	private Map<String, Boolean> gradeSelected;
	
	private List<NoticeClassKey> ownedClasses;
	
	private Map<String, Boolean> classSelected;
	
	private List<NoticeTeacherKey> ownedTeachers;
	
	private Map<String, Boolean> teacherSelected;
	
	public Map<String, Boolean> getSchoolChecked() {
		return schoolChecked;
	}

	public void setSchoolChecked(Map<String, Boolean> schoolChecked) {
		this.schoolChecked = schoolChecked;
	}

	public List<NoticeGradeKey> getOwnedGrades() {
		return ownedGrades;
	}

	public void setOwnedGrades(List<NoticeGradeKey> ownedGrades) {
		this.ownedGrades = ownedGrades;
	}

	public List<NoticeClassKey> getOwnedClasses() {
		return ownedClasses;
	}

	public void setOwnedClasses(List<NoticeClassKey> ownedClasses) {
		this.ownedClasses = ownedClasses;
	}

	public Map<String, Boolean> getGradeSelected() {
		return gradeSelected;
	}

	public void setGradeSelected(Map<String, Boolean> gradeSelected) {
		this.gradeSelected = gradeSelected;
	}

	public Map<String, Boolean> getClassSelected() {
		return classSelected;
	}

	public void setClassSelected(Map<String, Boolean> classSelected) {
		this.classSelected = classSelected;
	}

	public List<String> getOwnedSchools() {
		return ownedSchools;
	}

	public void setOwnedSchools(List<String> ownedSchools) {
		this.ownedSchools = ownedSchools;
	}

	public List<NoticeTeacherKey> getOwnedTeachers() {
		return ownedTeachers;
	}

	public void setOwnedTeachers(List<NoticeTeacherKey> ownedTeachers) {
		this.ownedTeachers = ownedTeachers;
	}


	public void setTeacherSelected(Map<String, Boolean> teacherSelected) {
		this.teacherSelected = teacherSelected;
	}

	public Map<String, Boolean> getTeacherSelected() {
		return teacherSelected;
	}
}
