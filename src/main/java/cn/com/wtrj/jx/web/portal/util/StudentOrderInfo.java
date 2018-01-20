package cn.com.wtrj.jx.web.portal.util;

import java.math.BigDecimal;

/**
 * 填写订单、预览订单、查询缴费记录，单个学生订单信息实体类
 * @author admin
 *
 */
public class StudentOrderInfo {
	/**学生id*/
	private Integer studentId;
	/**学生姓名*/
	private String studentName;
	/**身份证号*/
	private String idCardNo;
	/**学部(1-小学 2-初中 3-高中)*/
	private Integer stageNo;
	/**年级*/
	private Integer gradeNo;
	/**班级号*/
	private Integer classId;
	/**班级名称*/
	private String className;
	/**价格*/
	private BigDecimal payMoney;
	/**支付时间*/
	private String payTime;
	/**订单号*/
	private String outTradeNo;
	/**支付状态*/
	private String payStatus;
	/**家长姓名*/
	private String parentName;
	/**家长电话*/
	private String parentPhone;
	

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
	public Integer getStageNo() {
		return stageNo;
	}
	public void setStageNo(Integer stageNo) {
		this.stageNo = stageNo;
	}
	public Integer getGradeNo() {
		return gradeNo;
	}
	public void setGradeNo(Integer gradeNo) {
		this.gradeNo = gradeNo;
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
	
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}

	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStaus) {
		this.payStatus = payStaus;
	}
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	public StudentOrderInfo(String studentName, String idCardNo, Integer stageNo, Integer gradeNo, Integer classId) {
		super();
		this.studentName = studentName;
		this.idCardNo = idCardNo;
		this.stageNo = stageNo;
		this.gradeNo = gradeNo;
		this.classId = classId;
	}
	public StudentOrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentOrderInfo [studentId=" + studentId + ", studentName=" + studentName + ", idCardNo=" + idCardNo
				+ ", stageNo=" + stageNo + ", gradeNo=" + gradeNo + ", classId=" + classId + ", className=" + className
				+ ", payMoney=" + payMoney + ", payTime=" + payTime + ", outTradeNo=" + outTradeNo + ", payStatus="
				+ payStatus + ", parentName=" + parentName + ", parentPhone=" + parentPhone + "]";
	}
	
	
	
}
