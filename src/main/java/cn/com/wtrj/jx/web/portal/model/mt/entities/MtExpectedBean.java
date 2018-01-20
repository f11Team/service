package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.math.BigDecimal;

/**
 * 预期目标封装bean
 *
 */
public class MtExpectedBean {

	/**
	 * 机构
	 */
	private String names;
	/**
	 * 实际净利
	 */
	private BigDecimal shijiJingli;
	/**
	 * 实际毛利
	 */
	private BigDecimal shijiMaoli;
	/**
	 * 实际销售额
	 */
	private BigDecimal shijiXiaoshoue;
	/**
	 * 预期净利
	 */
	private BigDecimal yuqiJingli;
	/**
	 * 预期毛利
	 */
	private BigDecimal yuqiMaoli;
	/**
	 * 预期销售额
	 */
	private BigDecimal yuqiXiaoshoue;

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getShijiJingli() {
		return shijiJingli;
	}

	public void setShijiJingli(BigDecimal shijiJingli) {
		this.shijiJingli = shijiJingli;
	}

	public BigDecimal getShijiMaoli() {
		return shijiMaoli;
	}

	public void setShijiMaoli(BigDecimal shijiMaoli) {
		this.shijiMaoli = shijiMaoli;
	}

	public BigDecimal getShijiXiaoshoue() {
		return shijiXiaoshoue;
	}

	public void setShijiXiaoshoue(BigDecimal shijiXiaoshoue) {
		this.shijiXiaoshoue = shijiXiaoshoue;
	}

	public BigDecimal getYuqiJingli() {
		return yuqiJingli;
	}

	public void setYuqiJingli(BigDecimal yuqiJingli) {
		this.yuqiJingli = yuqiJingli;
	}

	public BigDecimal getYuqiMaoli() {
		return yuqiMaoli;
	}

	public void setYuqiMaoli(BigDecimal yuqiMaoli) {
		this.yuqiMaoli = yuqiMaoli;
	}

	public BigDecimal getYuqiXiaoshoue() {
		return yuqiXiaoshoue;
	}

	public void setYuqiXiaoshoue(BigDecimal yuqiXiaoshoue) {
		this.yuqiXiaoshoue = yuqiXiaoshoue;
	}

}
