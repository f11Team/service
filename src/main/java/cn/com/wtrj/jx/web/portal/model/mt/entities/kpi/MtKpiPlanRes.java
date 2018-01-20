package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.math.BigDecimal;

public class MtKpiPlanRes {

	private Integer no;

	private BigDecimal lb;

	private BigDecimal ub;

	private Integer psns;

	private Integer actPsns;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getType() {
		if (no == 1) {
			return "优";
		} else if (no == 2) {
			return "良";
		} else if (no == 3) {

			return "中";
		} else {
			return "差";
		}
	}

	public Integer getPsns() {
		return psns;
	}

	public void setPsns(Integer psns) {
		this.psns = psns;
	}

	public BigDecimal getLb() {
		return lb;
	}

	public void setLb(BigDecimal lb) {
		this.lb = lb;
	}

	public BigDecimal getUb() {
		return ub;
	}

	public void setUb(BigDecimal ub) {
		this.ub = ub;
	}

	public String getRange() {
		if (lb == null)
			lb = BigDecimal.ZERO;
		if (ub == null)
			ub = BigDecimal.ZERO;
		return lb.toString() + "~" + ub.toString();
	}

	public Integer getActPsns() {
		return actPsns;
	}

	public void setActPsns(Integer actPsns) {
		this.actPsns = actPsns;
	}

}
