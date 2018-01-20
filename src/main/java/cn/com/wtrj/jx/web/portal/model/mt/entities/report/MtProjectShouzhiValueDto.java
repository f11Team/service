package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.math.BigDecimal;

/**
 * 板块收/支数据
 * @author wusm
 *
 */
public class MtProjectShouzhiValueDto {
	private BigDecimal value;
	
	private String projectName;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
