package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjKpiIns {
    private Integer id;

    private String name;

    private Integer year;

    private Integer seq;

    private Date startTime;

    private Date endTime;

    private String kpiSchool;

    private String zipingTmplCode;

    private String jiaoyanzuTmplCode;

    private String nianjizuTmplCode;

    private String jiaowuTmplCode;

    private Short zipingEnd;

    private Short jiaoyanzuPingjiaEnd;

    private Short nianjiazuPingjiaEnd;

    private Short jiaowuPingjiaEnd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getKpiSchool() {
        return kpiSchool;
    }

    public void setKpiSchool(String kpiSchool) {
        this.kpiSchool = kpiSchool;
    }

    public String getZipingTmplCode() {
        return zipingTmplCode;
    }

    public void setZipingTmplCode(String zipingTmplCode) {
        this.zipingTmplCode = zipingTmplCode;
    }

    public String getJiaoyanzuTmplCode() {
        return jiaoyanzuTmplCode;
    }

    public void setJiaoyanzuTmplCode(String jiaoyanzuTmplCode) {
        this.jiaoyanzuTmplCode = jiaoyanzuTmplCode;
    }

    public String getNianjizuTmplCode() {
        return nianjizuTmplCode;
    }

    public void setNianjizuTmplCode(String nianjizuTmplCode) {
        this.nianjizuTmplCode = nianjizuTmplCode;
    }

    public String getJiaowuTmplCode() {
        return jiaowuTmplCode;
    }

    public void setJiaowuTmplCode(String jiaowuTmplCode) {
        this.jiaowuTmplCode = jiaowuTmplCode;
    }

    public Short getZipingEnd() {
        return zipingEnd;
    }

    public void setZipingEnd(Short zipingEnd) {
        this.zipingEnd = zipingEnd;
    }

    public Short getJiaoyanzuPingjiaEnd() {
        return jiaoyanzuPingjiaEnd;
    }

    public void setJiaoyanzuPingjiaEnd(Short jiaoyanzuPingjiaEnd) {
        this.jiaoyanzuPingjiaEnd = jiaoyanzuPingjiaEnd;
    }

    public Short getNianjiazuPingjiaEnd() {
        return nianjiazuPingjiaEnd;
    }

    public void setNianjiazuPingjiaEnd(Short nianjiazuPingjiaEnd) {
        this.nianjiazuPingjiaEnd = nianjiazuPingjiaEnd;
    }

    public Short getJiaowuPingjiaEnd() {
        return jiaowuPingjiaEnd;
    }

    public void setJiaowuPingjiaEnd(Short jiaowuPingjiaEnd) {
        this.jiaowuPingjiaEnd = jiaowuPingjiaEnd;
    }
}