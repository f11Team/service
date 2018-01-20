package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

public class MtStudentKaoqinDto {
	//迟到次数
	private Integer lateNum;
	//早退次数
	private Integer leaveEarlyNum;
	//请假次数
	private Integer leaveNum;
	//未打卡次数
	private Integer noSwipeNum;
	//学校编码
	private String schoolCode;
	//学校名称
	private String schoolName;
	//班级ID
	private Integer classId;
	//班级名称
	private String className;
	
	public Integer getLateNum() {
		return lateNum;
	}
	public void setLateNum(Integer lateNum) {
		this.lateNum = lateNum;
	}
	public Integer getLeaveEarlyNum() {
		return leaveEarlyNum;
	}
	public void setLeaveEarlyNum(Integer leaveEarlyNum) {
		this.leaveEarlyNum = leaveEarlyNum;
	}
	public Integer getLeaveNum() {
		return leaveNum;
	}
	public void setLeaveNum(Integer leaveNum) {
		this.leaveNum = leaveNum;
	}
	public Integer getNoSwipeNum() {
		return noSwipeNum;
	}
	public void setNoSwipeNum(Integer noSwipeNum) {
		this.noSwipeNum = noSwipeNum;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

}
