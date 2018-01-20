package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.math.BigDecimal;

public class MtKpiPlan {
	/** 同数据模型 */
	private Integer id;

	private Integer kpiIns;

	private String code;

	private Integer kpiPlanYou;

	private BigDecimal kpiPlanYouUb;

	private BigDecimal kpiPlanYouLb;

	private Integer kpiPlanLiang;

	private BigDecimal kpiPlanLiangUb;

	private BigDecimal kpiPlanLiangLb;

	private Integer kpiPlanZhong;

	private BigDecimal kpiPlanZhongUb;

	private BigDecimal kpiPlanZhongLb;

	private Integer kpiPlanCha;

	private BigDecimal kpiPlanChaUb;

	private BigDecimal kpiPlanChaLb;

	private String remark;

	/** 自定义 */
	// 考核活动名称
	private String kpiInsName;

	// 组内人数
	private Integer groupPersons;

	// 组类型-> 1:教研组 & 2:年级组
	private Integer groupType;

	// 组名称
	private String groupName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKpiIns() {
		return kpiIns;
	}

	public void setKpiIns(Integer kpiIns) {
		this.kpiIns = kpiIns;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getKpiPlanYou() {
		return kpiPlanYou;
	}

	public void setKpiPlanYou(Integer kpiPlanYou) {
		this.kpiPlanYou = kpiPlanYou;
	}

	public BigDecimal getKpiPlanYouUb() {
		return kpiPlanYouUb;
	}

	public void setKpiPlanYouUb(BigDecimal kpiPlanYouUb) {
		this.kpiPlanYouUb = kpiPlanYouUb;
	}

	public BigDecimal getKpiPlanYouLb() {
		return kpiPlanYouLb;
	}

	public void setKpiPlanYouLb(BigDecimal kpiPlanYouLb) {
		this.kpiPlanYouLb = kpiPlanYouLb;
	}

	public Integer getKpiPlanLiang() {
		return kpiPlanLiang;
	}

	public void setKpiPlanLiang(Integer kpiPlanLiang) {
		this.kpiPlanLiang = kpiPlanLiang;
	}

	public BigDecimal getKpiPlanLiangUb() {
		return kpiPlanLiangUb;
	}

	public void setKpiPlanLiangUb(BigDecimal kpiPlanLiangUb) {
		this.kpiPlanLiangUb = kpiPlanLiangUb;
	}

	public BigDecimal getKpiPlanLiangLb() {
		return kpiPlanLiangLb;
	}

	public void setKpiPlanLiangLb(BigDecimal kpiPlanLiangLb) {
		this.kpiPlanLiangLb = kpiPlanLiangLb;
	}

	public Integer getKpiPlanZhong() {
		return kpiPlanZhong;
	}

	public void setKpiPlanZhong(Integer kpiPlanZhong) {
		this.kpiPlanZhong = kpiPlanZhong;
	}

	public BigDecimal getKpiPlanZhongUb() {
		return kpiPlanZhongUb;
	}

	public void setKpiPlanZhongUb(BigDecimal kpiPlanZhongUb) {
		this.kpiPlanZhongUb = kpiPlanZhongUb;
	}

	public BigDecimal getKpiPlanZhongLb() {
		return kpiPlanZhongLb;
	}

	public void setKpiPlanZhongLb(BigDecimal kpiPlanZhongLb) {
		this.kpiPlanZhongLb = kpiPlanZhongLb;
	}

	public Integer getKpiPlanCha() {
		return kpiPlanCha;
	}

	public void setKpiPlanCha(Integer kpiPlanCha) {
		this.kpiPlanCha = kpiPlanCha;
	}

	public BigDecimal getKpiPlanChaUb() {
		return kpiPlanChaUb;
	}

	public void setKpiPlanChaUb(BigDecimal kpiPlanChaUb) {
		this.kpiPlanChaUb = kpiPlanChaUb;
	}

	public BigDecimal getKpiPlanChaLb() {
		return kpiPlanChaLb;
	}

	public void setKpiPlanChaLb(BigDecimal kpiPlanChaLb) {
		this.kpiPlanChaLb = kpiPlanChaLb;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getKpiInsName() {
		return kpiInsName;
	}

	public void setKpiInsName(String kpiInsName) {
		this.kpiInsName = kpiInsName;
	}

	public Integer getGroupPersons() {
		return groupPersons;
	}

	public void setGroupPersons(Integer groupPersons) {
		this.groupPersons = groupPersons;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public String getGroupTypeName() {
		if (groupType == 1) {
			return "教研组";
		} else {
			return "年级组";
		}
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}