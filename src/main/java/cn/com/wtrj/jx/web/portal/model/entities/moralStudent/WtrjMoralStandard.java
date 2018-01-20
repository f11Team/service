package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.Date;

public class WtrjMoralStandard {
    private String code;

    private String name;

    private Integer baseScore;

    private String blLeaf;

    private String type;

    private Integer insNum;

    private Integer insScoreMin;

    private Integer insScoreMax;

    private String authRole;

    private String reportCycle;

    private Date actStart;

    private Date actEnd;

    private String blDelFlg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    public String getBlLeaf() {
        return blLeaf;
    }

    public void setBlLeaf(String blLeaf) {
        this.blLeaf = blLeaf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInsNum() {
        return insNum;
    }

    public void setInsNum(Integer insNum) {
        this.insNum = insNum;
    }

    public Integer getInsScoreMin() {
        return insScoreMin;
    }

    public void setInsScoreMin(Integer insScoreMin) {
        this.insScoreMin = insScoreMin;
    }

    public Integer getInsScoreMax() {
        return insScoreMax;
    }

    public void setInsScoreMax(Integer insScoreMax) {
        this.insScoreMax = insScoreMax;
    }

    public String getAuthRole() {
        return authRole;
    }

    public void setAuthRole(String authRole) {
        this.authRole = authRole;
    }

    public String getReportCycle() {
        return reportCycle;
    }

    public void setReportCycle(String reportCycle) {
        this.reportCycle = reportCycle;
    }

    public Date getActStart() {
        return actStart;
    }

    public void setActStart(Date actStart) {
        this.actStart = actStart;
    }

    public Date getActEnd() {
        return actEnd;
    }

    public void setActEnd(Date actEnd) {
        this.actEnd = actEnd;
    }

    public String getBlDelFlg() {
        return blDelFlg;
    }

    public void setBlDelFlg(String blDelFlg) {
        this.blDelFlg = blDelFlg;
    }
}