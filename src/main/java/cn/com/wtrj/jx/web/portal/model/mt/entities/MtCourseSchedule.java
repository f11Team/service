package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.util.Date;

public class MtCourseSchedule {
	  	private Integer id;

	    private String courseScheduleNo;

	    private String courseScheduleName;

	    private Integer year;

	    private Integer month;

	    private Integer seq;

	    private Integer classId;

	    private String schoolCode;

	    private String schoolName;

	    private Integer grade;

	    private String kind;

	    private Integer registYear;

	    private Integer weekDay;

	    private String course;

	    private Integer courseSeq;

	    private String className;

	    private Date startDate;

	    private Date endDate;

	    private Integer employeeId;

	    private Date scheduleStartDate;

	    private Date scheduleEndDate;

	    private Integer version;

	    private Date createTime;

	    private Date updateTime;

	    private Short odevity;

	    private String specialTeacherName;

	    private String place;

	    private String mark;
	
	    private String employeeName;
	    
	    private String showTeacherName;

		private String teacherName;
		

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCourseScheduleNo() {
			return courseScheduleNo;
		}

		public void setCourseScheduleNo(String courseScheduleNo) {
			this.courseScheduleNo = courseScheduleNo;
		}

		public String getCourseScheduleName() {
			return courseScheduleName;
		}

		public void setCourseScheduleName(String courseScheduleName) {
			this.courseScheduleName = courseScheduleName;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Integer getMonth() {
			return month;
		}

		public void setMonth(Integer month) {
			this.month = month;
		}

		public Integer getSeq() {
			return seq;
		}

		public void setSeq(Integer seq) {
			this.seq = seq;
		}

		public Integer getClassId() {
			return classId;
		}

		public void setClassId(Integer classId) {
			this.classId = classId;
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


		public Integer getGrade() {
			return grade;
		}


		public void setGrade(Integer grade) {
			this.grade = grade;
		}


		public String getKind() {
			return kind;
		}


		public void setKind(String kind) {
			this.kind = kind;
		}


		public Integer getRegistYear() {
			return registYear;
		}


		public void setRegistYear(Integer registYear) {
			this.registYear = registYear;
		}


		public Integer getWeekDay() {
			return weekDay;
		}


		public void setWeekDay(Integer weekDay) {
			this.weekDay = weekDay;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public Integer getCourseSeq() {
			return courseSeq;
		}

		public void setCourseSeq(Integer courseSeq) {
			this.courseSeq = courseSeq;
		}


		public String getClassName() {
			return className;
		}


		public void setClassName(String className) {
			this.className = className;
		}


		public Date getStartDate() {
			return startDate;
		}


		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}


		public Date getEndDate() {
			return endDate;
		}


		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}


		public Date getScheduleStartDate() {
			return scheduleStartDate;
		}


		public void setScheduleStartDate(Date scheduleStartDate) {
			this.scheduleStartDate = scheduleStartDate;
		}


		public Date getScheduleEndDate() {
			return scheduleEndDate;
		}


		public void setScheduleEndDate(Date scheduleEndDate) {
			this.scheduleEndDate = scheduleEndDate;
		}


		public Integer getVersion() {
			return version;
		}


		public void setVersion(Integer version) {
			this.version = version;
		}


		public Date getCreateTime() {
			return createTime;
		}


		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}


		public Date getUpdateTime() {
			return updateTime;
		}


		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}


		public Short getOdevity() {
			return odevity;
		}

		public void setOdevity(Short odevity) {
			this.odevity = odevity;
		}


		public String getSpecialTeacherName() {
			return specialTeacherName;
		}


		public void setSpecialTeacherName(String specialTeacherName) {
			this.specialTeacherName = specialTeacherName;
		}


		public String getPlace() {
			return place;
		}


		public void setPlace(String place) {
			this.place = place;
		}


		public String getMark() {
			return mark;
		}


		public void setMark(String mark) {
			this.mark = mark;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public String getShowTeacherName() {
			return showTeacherName;
		}
	
		// 设置页面展示名称，如果是教职工，则为教职工姓名，特殊老师则为specialName
		public void setShowTeacherName() {
			if (this.employeeName != null && !"".equals(this.employeeName)) {
				this.showTeacherName = employeeName;
			} else {
				this.showTeacherName = this.specialTeacherName;
			}
		}

		public MtCourseSchedule() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "MtCourseSchedule [id=" + id + ", courseScheduleNo=" + courseScheduleNo + ", courseScheduleName="
					+ courseScheduleName + ", year=" + year + ", month=" + month + ", seq=" + seq + ", classId="
					+ classId + ", schoolCode=" + schoolCode + ", schoolName=" + schoolName + ", grade=" + grade
					+ ", kind=" + kind + ", registYear=" + registYear + ", weekDay=" + weekDay + ", course=" + course
					+ ", courseSeq=" + courseSeq + ", className=" + className + ", startDate=" + startDate
					+ ", endDate=" + endDate + ", employeeId=" + employeeId + ", scheduleStartDate=" + scheduleStartDate
					+ ", scheduleEndDate=" + scheduleEndDate + ", version=" + version + ", createTime=" + createTime
					+ ", updateTime=" + updateTime + ", odevity=" + odevity + ", specialTeacherName="
					+ specialTeacherName + ", place=" + place + ", mark=" + mark + ", employeeName=" + employeeName
					+ ", showTeacherName=" + showTeacherName + "]";
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public void setShowTeacherName(String showTeacherName) {
			this.showTeacherName = showTeacherName;
		}
		
		
	
}
