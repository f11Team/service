package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;

public class WtrjKpiInfoDetail {
    private Integer id;

    private Integer kpiIns;

    private Integer employeeId;

    private String kpiItemCode;

    private String kpiTmplCode;

    private BigDecimal kpiItemScore;

    private String kpiItemTxt;

    private BigDecimal kpiTemplScore;

    private BigDecimal kpiScore;

    private String remark;

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

    public String getKpiItemCode() {
        return kpiItemCode;
    }

    public void setKpiItemCode(String kpiItemCode) {
        this.kpiItemCode = kpiItemCode;
    }

    public String getKpiTmplCode() {
        return kpiTmplCode;
    }

    public void setKpiTmplCode(String kpiTmplCode) {
        this.kpiTmplCode = kpiTmplCode;
    }

    public BigDecimal getKpiItemScore() {
        return kpiItemScore;
    }

    public void setKpiItemScore(BigDecimal kpiItemScore) {
        this.kpiItemScore = kpiItemScore;
    }

    public String getKpiItemTxt() {
        return kpiItemTxt;
    }

    public void setKpiItemTxt(String kpiItemTxt) {
        this.kpiItemTxt = kpiItemTxt;
    }

    public BigDecimal getKpiTemplScore() {
        return kpiTemplScore;
    }

    public void setKpiTemplScore(BigDecimal kpiTemplScore) {
        this.kpiTemplScore = kpiTemplScore;
    }

    public BigDecimal getKpiScore() {
        return kpiScore;
    }

    public void setKpiScore(BigDecimal kpiScore) {
        this.kpiScore = kpiScore;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}