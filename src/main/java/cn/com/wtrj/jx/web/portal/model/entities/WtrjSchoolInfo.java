package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.Date;

public class WtrjSchoolInfo  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -149963125912941588L;

	private String code;

    private String name;

    private String nickName;

    private String gradeStage;

    private Date createTime;

    private Date updateTiime;

    private Integer zsSchoolId;

    private String zsGrade;

    private String ncOrgCode;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGradeStage() {
        return gradeStage;
    }

    public void setGradeStage(String gradeStage) {
        this.gradeStage = gradeStage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTiime() {
        return updateTiime;
    }

    public void setUpdateTiime(Date updateTiime) {
        this.updateTiime = updateTiime;
    }

    public Integer getZsSchoolId() {
        return zsSchoolId;
    }

    public void setZsSchoolId(Integer zsSchoolId) {
        this.zsSchoolId = zsSchoolId;
    }

    public String getZsGrade() {
        return zsGrade;
    }

    public void setZsGrade(String zsGrade) {
        this.zsGrade = zsGrade;
    }

    public String getNcOrgCode() {
        return ncOrgCode;
    }

    public void setNcOrgCode(String ncOrgCode) {
        this.ncOrgCode = ncOrgCode;
    }
}