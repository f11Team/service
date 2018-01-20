package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.Date;

public class WtrjStuEntranceScore {
	private Integer id;

	private Integer studentId;

	private String examSubjectName;

	private BigDecimal examSubjectScore;

	private String remark;

	private Date createTime;

	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getExamSubjectName() {
		return examSubjectName;
	}

	public void setExamSubjectName(String examSubjectName) {
		this.examSubjectName = examSubjectName;
	}

	public BigDecimal getExamSubjectScore() {
		return examSubjectScore;
	}

	public void setExamSubjectScore(BigDecimal examSubjectScore) {
		this.examSubjectScore = examSubjectScore;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Override
	public String toString() {
		return "WtrjStuEntranceScore [id=" + id + ", studentId=" + studentId + ", examSubjectName=" + examSubjectName
				+ ", examSubjectScore=" + examSubjectScore + ", remark=" + remark + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}