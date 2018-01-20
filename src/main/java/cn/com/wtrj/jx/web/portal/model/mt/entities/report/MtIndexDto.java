package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import cn.com.wtrj.jx.web.portal.service.report.impl.ConstRpt.WarnLevel;

public class MtIndexDto {

	/**
	 * 用户定义指标ID
	 */
	private Integer userIndexId;
	/**
	 * 指标ID
	 */
	private Integer indexId;
	/**
	 * 时间跨度
	 */
	private Integer queryRange;
	/**
	 * 指标名称（首页显示）
	 */
	private String name;
	/**
	 * 指标说明
	 */
	private String note;
	/**
	 * 指标类型
	 */
	private Integer typeCode;
	/**
	 * 指标值集合
	 */
	private List<BigDecimal> values = new ArrayList<BigDecimal>();
	/**
	 * 指标说明（首页显示）
	 */
	private String txtTop;
	/**
	 * 指标计算公式（弹窗显示）
	 */
	private String calcPop;
	/**
	 * 指标说明（弹窗显示）
	 */
	private String txtPop;
	/**
	 * 指标分析权限
	 */
	private String blIndexAuth;

	/**
	 * 指标预警级别
	 * 
	 * 异常：-1 / 正常：0 / 优良：1
	 */
	private Integer warnLevel = WarnLevel.Normal;

	public Integer getUserIndexId() {
		return userIndexId;
	}

	public void setUserIndexId(Integer userIndexId) {
		this.userIndexId = userIndexId;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public Integer getQueryRange() {
		return queryRange;
	}

	public void setQueryRange(Integer queryRange) {
		this.queryRange = queryRange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

	public List<BigDecimal> getValues() {
		return values;
	}

	public void setValues(List<BigDecimal> values) {
		this.values = values;
	}

	public String getTxtTop() {
		return txtTop;
	}

	public void setTxtTop(String txtTop) {
		this.txtTop = txtTop;
	}

	public String getTxtPop() {
		return txtPop;
	}

	public void setTxtPop(String txtPop) {
		this.txtPop = txtPop;
	}

	public String getBlIndexAuth() {
		return blIndexAuth;
	}

	public void setBlIndexAuth(String blIndexAuth) {
		this.blIndexAuth = blIndexAuth;
	}

	public String getCalcPop() {
		return calcPop;
	}

	public void setCalcPop(String calcPop) {
		this.calcPop = calcPop;
	}

	public Integer getWarnLevel() {
		return warnLevel;
	}

	public void setWarnLevel(Integer warnLevel) {
		this.warnLevel = warnLevel;
	}

}
