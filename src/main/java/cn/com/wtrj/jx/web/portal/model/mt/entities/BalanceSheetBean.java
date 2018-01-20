package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 资产负债表封装Bean
 * 
 * @author shenxiang001
 *
 */
public class BalanceSheetBean {
	/**
	 * 主键id
	 */
	private Integer id;
	/**
	 * 年份
	 */
	private Integer year;
	/**
	 * 月份
	 */
	private Integer month;
	/**
	 * 板块
	 */
	private String project;
	/**
	 * 校区
	 */
	private String school;
	/**
	 * 资产数
	 */
	private BigDecimal asset;
	/**
	 * 负债数
	 */
	private BigDecimal debt;

	public BalanceSheetBean(Integer id, Integer year, Integer month, String project, String school, BigDecimal asset, BigDecimal debt) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.project = project;
		this.school = school;
		this.asset = asset;
		this.debt = debt;
	}

	public BalanceSheetBean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public BigDecimal getAsset() {
		return asset;
	}

	public void setAsset(BigDecimal asset) {
		this.asset = asset;
	}

	public BigDecimal getDebt() {
		return debt;
	}

	public void setDebt(BigDecimal debt) {
		this.debt = debt;
	}

	public String getYearMonth() {
		return this.year + "-" + StringUtils.right("0" + this.month, 2);
	}

	@Override
	public String toString() {
		return "BalanceSheetBean [id=" + id + ", year=" + year + ", month=" + month + ", project=" + project + ", school=" + school + ", asset="
				+ asset + ", debt=" + debt + "]";
	}

}
