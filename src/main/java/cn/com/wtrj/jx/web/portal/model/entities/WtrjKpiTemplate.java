package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.Date;

public class WtrjKpiTemplate {
    private Integer id;

    private String schoolCode;

    private String tmplCode;

    private String tmplName;

    private String itemCode;

    private String itemName;

    private String blLeaf;

    private BigDecimal itemScoreMax;

    private BigDecimal itemScoreMin;

    private String itemStandard;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String itemType;

    private String tmplYear;

    private Integer tmplSeq;

    private String tmplType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
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

    public String getBlLeaf() {
        return blLeaf;
    }

    public void setBlLeaf(String blLeaf) {
        this.blLeaf = blLeaf;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTmplYear() {
        return tmplYear;
    }

    public void setTmplYear(String tmplYear) {
        this.tmplYear = tmplYear;
    }

    public Integer getTmplSeq() {
        return tmplSeq;
    }

    public void setTmplSeq(Integer tmplSeq) {
        this.tmplSeq = tmplSeq;
    }

    public String getTmplType() {
        return tmplType;
    }

    public void setTmplType(String tmplType) {
        this.tmplType = tmplType;
    }
}