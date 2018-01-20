package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 收支表传到前台的数据的封装Bean
 * 
 * @author shenxiang001
 *
 */
public class IncomeExpenditureBean {
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
	 * 学校
	 */
	private String school;
	/**
	 * 收入
	 */
	private BigDecimal income;
	/**
	 * 支出
	 */
	private BigDecimal expenditure;

	public IncomeExpenditureBean(Integer id, Integer year, Integer month, String project, String school, BigDecimal income, BigDecimal expenditure) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.project = project;
		this.school = school;
		this.income = income;
		this.expenditure = expenditure;
	}

	public IncomeExpenditureBean() {
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

	public String getproject() {
		return project;
	}

	public void setproject(String project) {
		this.project = project;
	}

	public String getschool() {
		return school;
	}

	public void setschool(String school) {
		this.school = school;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(BigDecimal expenditure) {
		this.expenditure = expenditure;
	}

	public String getYearMonth() {
		return this.year + "-" + StringUtils.right("0" + this.month, 2);
	}

	@Override
	public String toString() {
		return "Income_ExpenditureBean [id=" + id + ", year=" + year + ", month=" + month + ", project=" + project + ", school=" + school
				+ ", income=" + income + ", expenditure=" + expenditure + "]";
	}

}
