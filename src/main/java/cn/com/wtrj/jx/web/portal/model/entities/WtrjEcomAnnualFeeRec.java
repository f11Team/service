package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.Date;

public class WtrjEcomAnnualFeeRec {
    private Integer id;

    private String parentType;

    private String outTradeNo;

    private String parentName;

    private String parentPhone;

    private Integer payItemId;

    private String payType;

    private BigDecimal payMoney;

    private Date payTime;

    private String payStatus;

    private Date createTime;

    private Date updateTime;

    private String schoolCode;

    private Integer stage;

    private Integer grade;

    private Integer classNo;

    private String idCardNo;

    private Integer parentId;

    private String studentName;

    private Integer classId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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

    public Integer getPayItemId() {
        return payItemId;
    }

    public void setPayItemId(Integer payItemId) {
        this.payItemId = payItemId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

	@Override
	public String toString() {
		return "WtrjEcomAnnualFeeRec [id=" + id + ", parentType=" + parentType + ", outTradeNo=" + outTradeNo
				+ ", parentName=" + parentName + ", parentPhone=" + parentPhone + ", payItemId=" + payItemId
				+ ", payType=" + payType + ", payMoney=" + payMoney + ", payTime=" + payTime + ", payStatus="
				+ payStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + ", schoolCode=" + schoolCode
				+ ", stage=" + stage + ", grade=" + grade + ", classNo=" + classNo + ", idCardNo=" + idCardNo
				+ ", parentId=" + parentId + ", studentName=" + studentName + ", classId=" + classId + "]";
	}
    
    
}