package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;
import java.util.Date;

public class MtStudentPayInfo {
	/**学生id*/
	private Integer studentId;
	/**学生姓名*/
	private String studentName;
	/**身份证号*/
	private String idCardNo;
	/**班级id*/
	private Integer classId;
	/**班级名称*/
	private String className;
	/**学部*/
	private Integer stage;
	/**年级*/
	private Integer grade;
	/**缴费项目*/
	private Integer payItemId;
	/**缴费状态*/
	private String payStatus;
	/**支付时间*/
	private Date payTime;
	/**订单号*/
	private String outTradeNo;
	/**支付金额*/
	private BigDecimal payMoney;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
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
	public Integer getStage() {
		return stage;
	}
	public void setStage(Integer stage) {
		this.stage = stage;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getPayItemId() {
		return payItemId;
	}
	public void setPayItemId(Integer payItemId) {
		this.payItemId = payItemId;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
	public MtStudentPayInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MtStudentPayInfo [studentId=" + studentId + ", studentName=" + studentName + ", idCardNo=" + idCardNo
				+ ", classId=" + classId + ", className=" + className + ", stage=" + stage + ", grade=" + grade
				+ ", payItemId=" + payItemId + ", payStatus=" + payStatus + ", payTime=" + payTime + ", outTradeNo="
				+ outTradeNo + ", payMoney=" + payMoney + "]";
	}
	
	
	
	
}
