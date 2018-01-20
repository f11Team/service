package cn.com.wtrj.jx.web.portal.util;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单确认页面实体
 * @author admin
 *
 */
public class OrderPreviewBean {
	/**页面显示总金额，计算得出*/
	private BigDecimal totalMoney;
	private List<StudentOrderInfo>stuOrderRecords;
	public BigDecimal getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}
	public List<StudentOrderInfo> getAnnualFeeRecords() {
		return stuOrderRecords;
	}
	public void setAnnualFeeRecords(List<StudentOrderInfo> stuOrderRecords) {
		this.stuOrderRecords = stuOrderRecords;
	}
	@Override
	public String toString() {
		return "OrderPreviewBean [totalMoney=" + totalMoney + ", stuOrderRecords=" + stuOrderRecords + "]";
	}
	
}
