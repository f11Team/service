package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

/**
 * 查询结果为String——BigDecimal的组合使用的返回值类型bean
 * 
 * @author zhangbin
 *
 */
public class MtStringAndBigDecimalBean {

	// 查询结果
	String stringName;

	BigDecimal sumValue;

	public String getStringName() {
		return stringName;
	}

	public void setStringName(String stringName) {
		this.stringName = stringName;
	}

	public BigDecimal getSumValue() {
		return sumValue;
	}

	public void setSumValue(BigDecimal sumValue) {
		this.sumValue = sumValue;
	}

	

}
