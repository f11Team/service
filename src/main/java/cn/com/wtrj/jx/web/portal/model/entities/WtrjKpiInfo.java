package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.Date;

public class WtrjKpiInfo {
    private Integer id;

    private Integer kpiIns;

    private Integer employeeId;

    private String remark;

    private BigDecimal jiaowuScorePlan;

    private BigDecimal jiaoyanzuPingjiaScorePlan;

    private BigDecimal nianjiPingjiaScorePlan;

    private BigDecimal jiaowuScoreAct;

    private BigDecimal jiaoyanzuPingjiaScoreAct;

    private BigDecimal nianjiPingjiaScoreAct;

    private BigDecimal zipingScore;

    private BigDecimal kpiScore;

    private BigDecimal kpiScoreAct;

    private Date zipingTime;

    private Date jiaoyanzuPingjiaTime;

    private Date nianjizuPingjiaTime;

    private Date jiaowuPingjiaTime;

    private BigDecimal jiaoxueScore;

    private BigDecimal stuPingjiaScore;

    private BigDecimal stuPingjiaScoreAct;

    private BigDecimal totalScore;

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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getJiaowuScorePlan() {
        return jiaowuScorePlan;
    }

    public void setJiaowuScorePlan(BigDecimal jiaowuScorePlan) {
        this.jiaowuScorePlan = jiaowuScorePlan;
    }

    public BigDecimal getJiaoyanzuPingjiaScorePlan() {
        return jiaoyanzuPingjiaScorePlan;
    }

    public void setJiaoyanzuPingjiaScorePlan(BigDecimal jiaoyanzuPingjiaScorePlan) {
        this.jiaoyanzuPingjiaScorePlan = jiaoyanzuPingjiaScorePlan;
    }

    public BigDecimal getNianjiPingjiaScorePlan() {
        return nianjiPingjiaScorePlan;
    }

    public void setNianjiPingjiaScorePlan(BigDecimal nianjiPingjiaScorePlan) {
        this.nianjiPingjiaScorePlan = nianjiPingjiaScorePlan;
    }

    public BigDecimal getJiaowuScoreAct() {
        return jiaowuScoreAct;
    }

    public void setJiaowuScoreAct(BigDecimal jiaowuScoreAct) {
        this.jiaowuScoreAct = jiaowuScoreAct;
    }

    public BigDecimal getJiaoyanzuPingjiaScoreAct() {
        return jiaoyanzuPingjiaScoreAct;
    }

    public void setJiaoyanzuPingjiaScoreAct(BigDecimal jiaoyanzuPingjiaScoreAct) {
        this.jiaoyanzuPingjiaScoreAct = jiaoyanzuPingjiaScoreAct;
    }

    public BigDecimal getNianjiPingjiaScoreAct() {
        return nianjiPingjiaScoreAct;
    }

    public void setNianjiPingjiaScoreAct(BigDecimal nianjiPingjiaScoreAct) {
        this.nianjiPingjiaScoreAct = nianjiPingjiaScoreAct;
    }

    public BigDecimal getZipingScore() {
        return zipingScore;
    }

    public void setZipingScore(BigDecimal zipingScore) {
        this.zipingScore = zipingScore;
    }

    public BigDecimal getKpiScore() {
        return kpiScore;
    }

    public void setKpiScore(BigDecimal kpiScore) {
        this.kpiScore = kpiScore;
    }

    public BigDecimal getKpiScoreAct() {
        return kpiScoreAct;
    }

    public void setKpiScoreAct(BigDecimal kpiScoreAct) {
        this.kpiScoreAct = kpiScoreAct;
    }

    public Date getZipingTime() {
        return zipingTime;
    }

    public void setZipingTime(Date zipingTime) {
        this.zipingTime = zipingTime;
    }

    public Date getJiaoyanzuPingjiaTime() {
        return jiaoyanzuPingjiaTime;
    }

    public void setJiaoyanzuPingjiaTime(Date jiaoyanzuPingjiaTime) {
        this.jiaoyanzuPingjiaTime = jiaoyanzuPingjiaTime;
    }

    public Date getNianjizuPingjiaTime() {
        return nianjizuPingjiaTime;
    }

    public void setNianjizuPingjiaTime(Date nianjizuPingjiaTime) {
        this.nianjizuPingjiaTime = nianjizuPingjiaTime;
    }

    public Date getJiaowuPingjiaTime() {
        return jiaowuPingjiaTime;
    }

    public void setJiaowuPingjiaTime(Date jiaowuPingjiaTime) {
        this.jiaowuPingjiaTime = jiaowuPingjiaTime;
    }

    public BigDecimal getJiaoxueScore() {
        return jiaoxueScore;
    }

    public void setJiaoxueScore(BigDecimal jiaoxueScore) {
        this.jiaoxueScore = jiaoxueScore;
    }

    public BigDecimal getStuPingjiaScore() {
        return stuPingjiaScore;
    }

    public void setStuPingjiaScore(BigDecimal stuPingjiaScore) {
        this.stuPingjiaScore = stuPingjiaScore;
    }

    public BigDecimal getStuPingjiaScoreAct() {
        return stuPingjiaScoreAct;
    }

    public void setStuPingjiaScoreAct(BigDecimal stuPingjiaScoreAct) {
        this.stuPingjiaScoreAct = stuPingjiaScoreAct;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }
}