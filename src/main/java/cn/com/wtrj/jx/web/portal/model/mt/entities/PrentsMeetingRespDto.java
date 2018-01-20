package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.util.Date;

public class PrentsMeetingRespDto {
	    private Integer id;

	    private Integer teacherId;

	    private Integer classId;

	    private Date mettingDate;

	    private String place;
	    
	    private String theme;

	    private Date startTime;

	    private Date endTime;

	    private Date createTime;

	    private Date updateTime;
	    
	    private Integer classNo; 

	    private String className;
	    
	    private String teacherName; 
	    
	    private String teacherPhone;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getTeacherId() {
			return teacherId;
		}

		public void setTeacherId(Integer teacherId) {
			this.teacherId = teacherId;
		}

		public Integer getClassId() {
			return classId;
		}

		public void setClassId(Integer classId) {
			this.classId = classId;
		}

		public Date getMettingDate() {
			return mettingDate;
		}

		public void setMettingDate(Date mettingDate) {
			this.mettingDate = mettingDate;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public Date getStartTime() {
			return startTime;
		}

		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}

		public Date getEndTime() {
			return endTime;
		}

		public void setEndTime(Date endTime) {
			this.endTime = endTime;
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

		public Integer getClassNo() {
			return classNo;
		}

		public void setClassNo(Integer classNo) {
			this.classNo = classNo;
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getTeacherPhone() {
			return teacherPhone;
		}

		public void setTeacherPhone(String teacherPhone) {
			this.teacherPhone = teacherPhone;
		}

		public String getTheme() {
			return theme;
		}

		public void setTheme(String theme) {
			this.theme = theme;
		} 
	    
	    
	
	
}
