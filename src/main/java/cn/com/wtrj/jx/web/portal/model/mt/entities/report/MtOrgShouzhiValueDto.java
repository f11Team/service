package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.math.BigDecimal;

/**
 * 板块收/支数据
 * @author wusm
 *
 */
public class MtOrgShouzhiValueDto {
	private BigDecimal value;
	
	private String orgName;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
