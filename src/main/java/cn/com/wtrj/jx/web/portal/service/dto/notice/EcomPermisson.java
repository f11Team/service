package cn.com.wtrj.jx.web.portal.service.dto.notice;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;

/**
 * 通知发送权限信息
 * 
 * @author wusm
 *
 */
public class EcomPermisson implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 权限内学校
	 */
	private List<String> ownedSchools;
	
	private Map<String,Boolean> schoolChecked;
	
	private List<NoticeGradeKey> ownedGrades;
	
	private Map<String, Boolean> gradeSelected;
	
	private List<NoticeClassKey> ownedClasses;
	
	private Map<String, Boolean> classSelected;
	
	private Map<Integer, TeacherBaseInfo> ownedTeachersBaseInfo;
	
	/**
	 * 权限内教师
	 */
	private List<NoticeTeacherKey> ownedTeachers;
	
	private List<AdminTeacher> ownedAdminTeachers;
	
	/**
	 * 教师选中状态 key:教师ID value：是否选中
	 */
	private Map<Integer, Boolean> teacherSelectedMap;
	
	/**
	 * 教师选中状态  key：NoticeTeacherKey.getTeacherKeyNo()  value：是否选中
	 */
	private Map<String, Boolean> teacherSelected;

	private List<NoticeParentKey> ownedParents;
	
	private Map<String, Boolean> parentSelected;
	
	private List<WtrjSchoolInfo> ownedSchoolInfos;
	
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

	public List<NoticeParentKey> getOwnedParents() {
		return ownedParents;
	}

	public void setOwnedParents(List<NoticeParentKey> ownedParents) {
		this.ownedParents = ownedParents;
	}

	public Map<String, Boolean> getParentSelected() {
		return parentSelected;
	}

	public void setParentSelected(Map<String, Boolean> parentSelected) {
		this.parentSelected = parentSelected;
	}

	public List<WtrjSchoolInfo> getOwnedSchoolInfos() {
		return ownedSchoolInfos;
	}

	public void setOwnedSchoolInfos(List<WtrjSchoolInfo> ownedSchoolInfos) {
		this.ownedSchoolInfos = ownedSchoolInfos;
	}

	public Map<Integer, Boolean> getTeacherSelectedMap() {
		return teacherSelectedMap;
	}

	public void setTeacherSelectedMap(Map<Integer, Boolean> teacherSelectedMap) {
		this.teacherSelectedMap = teacherSelectedMap;
	}

	public List<AdminTeacher> getOwnedAdminTeachers() {
		return ownedAdminTeachers;
	}

	public void setOwnedAdminTeachers(List<AdminTeacher> ownedAdminTeachers) {
		this.ownedAdminTeachers = ownedAdminTeachers;
	}

	public Map<Integer, TeacherBaseInfo> getOwnedTeachersBaseInfo() {
		return ownedTeachersBaseInfo;
	}

	public void setOwnedTeachersBaseInfo(Map<Integer, TeacherBaseInfo> ownedTeachersBaseInfo) {
		this.ownedTeachersBaseInfo = ownedTeachersBaseInfo;
	}
}
