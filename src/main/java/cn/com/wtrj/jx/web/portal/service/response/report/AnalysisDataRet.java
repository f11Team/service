package cn.com.wtrj.jx.web.portal.service.response.report;

import java.util.List;

public class AnalysisDataRet {
	/**
	 * 公司编码
	 */
	private String orgCode;
	/**
	 * 公司名称
	 */
	private String orgName;
	/**
	 * 板块名称
	 */
	private String segmentName;
	/**
	 * 资产(万元)
	 */
	private Double asset;
	/**
	 * 负债(万元)
	 */
	private Double debt;
	/**
	 * 总收入(万元)
	 */
	private Double income;
	/**
	 * 总支出(万元)
	 */
	private Double expenditure;
	/**
	 * 期间费用(万元)
	 */
	private Double financial;
	/**
	 * 毛利润(万元)
	 */
	private Double grossProfit;
	/**
	 * 净利润(万元)
	 */
	private Double netProfit;
	/**
	 * 资金(万元)
	 */
	private Double capital;
	/**
	 * 人均净利润(万元)
	 */
	private String renjun;
	private Double renjunVal;
	/**
	 * 师均净利润(万元)
	 */
	private String shijun;
	private Double shijunVal;
	/**
	 * 学均净利润(万元)
	 */
	private String xuejun;
	private Double xuejunVal;
	/**
	 * 净利率(%)
	 */
	private String jinlilv;
	private Double jinlilvVal;
	/**
	 * 毛利率(%)
	 */
	private String maolilv;
	private Double maolilvVal;

	private List<AnalysisDataRet> children;
	/**
	 * 教师数
	 */
	private Integer teacher;
	/**
	 * 学生数
	 */
	private Integer student;
	/**公司总人数**/
	private Integer employeeNum;
	
	public Double getRenjunVal() {
		return renjunVal;
	}
	public void setRenjunVal(Double renjunVal) {
		this.renjunVal = renjunVal;
	}
	public Double getShijunVal() {
		return shijunVal;
	}
	public void setShijunVal(Double shijunVal) {
		this.shijunVal = shijunVal;
	}
	public Double getXuejunVal() {
		return xuejunVal;
	}
	public void setXuejunVal(Double xuejunVal) {
		this.xuejunVal = xuejunVal;
	}
	public Double getJinlilvVal() {
		return jinlilvVal;
	}
	public void setJinlilvVal(Double jinlilvVal) {
		this.jinlilvVal = jinlilvVal;
	}
	public Double getMaolilvVal() {
		return maolilvVal;
	}
	public void setMaolilvVal(Double maolilvVal) {
		this.maolilvVal = maolilvVal;
	}
	public Integer getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(Integer employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSegmentName() {
		return segmentName;
	}

	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}

	public Double getAsset() {
		return asset;
	}

	public void setAsset(Double asset) {
		this.asset = asset;
	}

	public Double getDebt() {
		return debt;
	}

	public void setDebt(Double debt) {
		this.debt = debt;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Double getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(Double expenditure) {
		this.expenditure = expenditure;
	}

	public Double getFinancial() {
		return financial;
	}

	public void setFinancial(Double financial) {
		this.financial = financial;
	}

	public Double getGrossProfit() {
		return grossProfit;
	}

	public void setGrossProfit(Double grossProfit) {
		this.grossProfit = grossProfit;
	}

	public Double getNetProfit() {
		return netProfit;
	}

	public void setNetProfit(Double netProfit) {
		this.netProfit = netProfit;
	}

	public Double getCapital() {
		return capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	public String getRenjun() {
		return renjun;
	}

	public void setRenjun(String renjun) {
		this.renjun = renjun;
	}

	public String getShijun() {
		return shijun;
	}

	public void setShijun(String shijun) {
		this.shijun = shijun;
	}

	public String getXuejun() {
		return xuejun;
	}

	public void setXuejun(String xuejun) {
		this.xuejun = xuejun;
	}

	public List<AnalysisDataRet> getChildren() {
		return children;
	}

	public void setChildren(List<AnalysisDataRet> children) {
		this.children = children;
	}

	public Integer getTeacher() {
		return teacher;
	}

	public void setTeacher(Integer teacher) {
		this.teacher = teacher;
	}

	public Integer getStudent() {
		return student;
	}

	public void setStudent(Integer student) {
		this.student = student;
	}

	public String getJinlilv() {
		return jinlilv;
	}

	public void setJinlilv(String jinlilv) {
		this.jinlilv = jinlilv;
	}

	public String getMaolilv() {
		return maolilv;
	}

	public void setMaolilv(String maolilv) {
		this.maolilv = maolilv;
	}

}
