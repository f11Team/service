package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.math.BigDecimal;

public class MtKpiPingjiaDto {
	// <-- 教师绩效考核成绩明细
	private Integer id;

	private Integer kpiInsId;

	private Integer employeeId;

	private String itemCode;

	private String tmplCode;

	private BigDecimal itemScore;

	private String itemTxt;

	private BigDecimal kpiScore;

	private String remark;
	// --->
	private Integer itemId;

	private String itemName;

	private String tmplName;

	private BigDecimal itemScoreMax;

	private BigDecimal itemScoreMin;

	private String itemStandard;

	private String itemType;

	private boolean blLeaf;

	// --->
	private String jiaoyanzuCode;

	private String nianjizuCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getKpiInsId() {
		return kpiInsId;
	}

	public void setKpiInsId(Integer kpiInsId) {
		this.kpiInsId = kpiInsId;
	}

	public String getTmplCode() {
		return tmplCode;
	}

	public void setTmplCode(String tmplCode) {
		this.tmplCode = tmplCode;
	}

	public String getTmplName() {
		return tmplName;
	}

	public void setTmplName(String tmplName) {
		this.tmplName = tmplName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemScoreMax() {
		return itemScoreMax;
	}

	public void setItemScoreMax(BigDecimal itemScoreMax) {
		this.itemScoreMax = itemScoreMax;
	}

	public BigDecimal getItemScoreMin() {
		return itemScoreMin;
	}

	public void setItemScoreMin(BigDecimal itemScoreMin) {
		this.itemScoreMin = itemScoreMin;
	}

	public String getItemStandard() {
		return itemStandard;
	}

	public void setItemStandard(String itemStandard) {
		this.itemStandard = itemStandard;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public boolean isBlLeaf() {
		return blLeaf;
	}

	public void setBlLeaf(boolean blLeaf) {
		this.blLeaf = blLeaf;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getKpiScore() {
		return kpiScore;
	}

	public void setKpiScore(BigDecimal kpiScore) {
		this.kpiScore = kpiScore;
	}

	public String getJiaoyanzuCode() {
		return jiaoyanzuCode;
	}

	public void setJiaoyanzuCode(String jiaoyanzuCode) {
		this.jiaoyanzuCode = jiaoyanzuCode;
	}

	public String getNianjizuCode() {
		return nianjizuCode;
	}

	public void setNianjizuCode(String nianjizuCode) {
		this.nianjizuCode = nianjizuCode;
	}

}
