package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 查询结果为Integer——BigDecimal的组合使用的返回值类型bean
 * 
 * @author zhangbin
 *
 */
public class MtIntegerAndBigDecimalBean {

	private Integer year;

	private Integer intName;

	private BigDecimal sumValue;

	private BigDecimal sumMaoli;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getSumMaoli() {
		return sumMaoli;
	}

	public void setSumMaoli(BigDecimal sumMaoli) {
		this.sumMaoli = sumMaoli;
	}

	public Integer getIntName() {
		return intName;
	}

	public void setIntName(Integer intName) {
		this.intName = intName;
	}

	public BigDecimal getSumValue() {
		return sumValue;
	}

	public void setSumValue(BigDecimal sumValue) {
		this.sumValue = sumValue;
	}

	public String getYearMonth() {
		return this.year + "-" + StringUtils.right("0" + this.intName, 2);
	}

}
