package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

public class CapitalBean {
	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 板块
	 */
	private String project;

	/**
	 * 公司名&校区（图表用）
	 */
	private String school;

	/**
	 * 资金种类（图表用）
	 */
	private String type;

	/**
	 * 资金（图表用）
	 */
	private BigDecimal money;

	public CapitalBean(Integer id, String project, String school, String type, BigDecimal money) {
		super();
		this.id = id;
		this.project = project;
		this.school = school;
		this.type = type;
		this.money = money;
	}

	public CapitalBean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "CapitalBean [id=" + id + ", project=" + project + ", school=" + school + ", type=" + type + ", money=" + money + "]";
	}

}
