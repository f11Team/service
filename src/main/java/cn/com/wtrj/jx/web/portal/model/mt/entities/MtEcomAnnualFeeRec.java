package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;
import java.util.Date;

public class MtEcomAnnualFeeRec {
    private Integer id;
    private Integer parentId;
    private String outTradeNo;
    private Integer payItemId;
    private String payItemName;
    private Integer studentId;
    private String studentName;
    private String payType;
    //缴费记录表中的金额
    private BigDecimal payMoney;
    private Date payTime;
    private String payStatus;
    private Date createTime;
    private Date updateTime;
    //缴费项目表中的价格
    private BigDecimal price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public Integer getPayItemId() {
		return payItemId;
	}
	public void setPayItemId(Integer payItemId) {
		this.payItemId = payItemId;
	}
	public String getPayItemName() {
		return payItemName;
	}
	public void setPayItemName(String payItemName) {
		this.payItemName = payItemName;
	}
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public MtEcomAnnualFeeRec() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MtEcomAnnualFeeRec [id=" + id + ", parentId=" + parentId + ", outTradeNo=" + outTradeNo + ", payItemId="
				+ payItemId + ", payItemName=" + payItemName + ", studentId=" + studentId + ", studentName="
				+ studentName + ", payType=" + payType + ", payMoney=" + payMoney + ", payTime=" + payTime
				+ ", payStatus=" + payStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + ", price="
				+ price + "]";
	}
    
   
}