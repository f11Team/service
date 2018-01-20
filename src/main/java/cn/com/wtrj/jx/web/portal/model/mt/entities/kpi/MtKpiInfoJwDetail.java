package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.io.Serializable;
import java.math.BigDecimal;

public class MtKpiInfoJwDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private String itemCode;

	private BigDecimal itemScore;

	private String itemTxt;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public BigDecimal getItemScore() {
		return itemScore;
	}

	public void setItemScore(BigDecimal itemScore) {
		this.itemScore = itemScore;
	}

	public String getItemTxt() {
		return itemTxt;
	}

	public void setItemTxt(String itemTxt) {
		this.itemTxt = itemTxt;
	}

}
