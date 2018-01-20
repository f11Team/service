package cn.com.wtrj.jx.web.portal.service.response.report;

/**
 * 录取情况明细表封装实体bean
 * 
 * @author wuxudong
 *
 */
public class EnrollDetailRecord {
	/** 校区 */
	private String schoolName;

	/** 学校ID */
	private int schoolId;

	/** 招生计划名称 */
	private String scheduleName;

	/** 招生计划ID */
	private int scheduleId;

	/** 报名人数 */
	private int baomingNum;

	/** 通过审核人数 */
	private int auditNum;

	/** 参测人数 */
	private int ceshiNum;

	/** 缴费人数 */
	private int payNum;

	/** 录取人数 */
	private int luquNum;

	/** 招生类别 */
	private String zsGrade;

	private String zsGrage;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public int getBaomingNum() {
		return baomingNum;
	}

	public void setBaomingNum(int baomingNum) {
		this.baomingNum = baomingNum;
	}

	public int getAuditNum() {
		return auditNum;
	}

	public void setAuditNum(int auditNum) {
		this.auditNum = auditNum;
	}

	public int getCeshiNum() {
		return ceshiNum;
	}

	public void setCeshiNum(int ceshiNum) {
		this.ceshiNum = ceshiNum;
	}

	public int getPayNum() {
		return payNum;
	}

	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}

	public int getLuquNum() {
		return luquNum;
	}

	public void setLuquNum(int luquNum) {
		this.luquNum = luquNum;
	}

	public String getZsGrade() {
		return zsGrade;
	}

	public void setZsGrade(String zsGrade) {
		this.zsGrade = zsGrade;
	}

	@Override
	public String toString() {
		return "EnrollDetailRecord [schoolName=" + schoolName + ", schoolId=" + schoolId + ", scheduleName=" + scheduleName + ", scheduleId="
				+ scheduleId + ", baomingNum=" + baomingNum + ", auditNum=" + auditNum + ", ceshiNum=" + ceshiNum + ", payNum=" + payNum
				+ ", luquNum=" + luquNum + ", zsGrade=" + zsGrade + "]";
	}

	public String getZsGrage() {
		return zsGrage;
	}

	public void setZsGrage(String zsGrage) {
		this.zsGrage = zsGrage;
	}

}
