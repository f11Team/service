package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 税务封装bean
 * 
 * @author jitao
 *
 */
public class TaxBean {
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
	 * 公司名&校区（图表用）
	 */
	private String school;

	/**
	 * 资产数（图表用）
	 */
	private BigDecimal tax;

	public TaxBean(Integer id, Integer year, Integer month, String project, String school, BigDecimal tax) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.project = project;
		this.school = school;
		this.tax = tax;
	}

	public TaxBean() {
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

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public String getYearMonth() {
		return this.year + "-" + StringUtils.right("0" + this.month, 2);
	}

	@Override
	public String toString() {
		return "TaxBean [id=" + id + ", year=" + year + ", month=" + month + ", project=" + project + ", school=" + school + ", tax=" + tax + "]";
	}

}
