package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.math.BigDecimal;

import org.springframework.validation.BindingErrorProcessor;

public class MtProjectMothShouzhiDto {
	private BigDecimal shouru;
	
	private BigDecimal zhichu;
	
	private String projectName;
	
	private String projectCode;
	
	private Integer month;
	
	public BigDecimal getShouru() {
		return shouru;
	}
	public void setShouru(BigDecimal shouru) {
		this.shouru = shouru;
	}
	public BigDecimal getZhichu() {
		return zhichu;
	}
	public void setZhichu(BigDecimal zhichu) {
		this.zhichu = zhichu;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	
}
