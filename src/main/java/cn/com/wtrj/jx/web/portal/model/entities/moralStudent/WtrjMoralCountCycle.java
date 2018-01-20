package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.Date;

public class WtrjMoralCountCycle {
    private Integer id;

    private String schoolCode;

    private Integer stage;

    private Integer grade;

    private String countName;

    private Date cycleStart;

    private Date cycleEnd;

    private Date createTime;

    private Date updateTime;

    private String blDelFlg;
    
    private String name;
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public Date getCycleStart() {
        return cycleStart;
    }

    public void setCycleStart(Date cycleStart) {
        this.cycleStart = cycleStart;
    }

    public Date getCycleEnd() {
        return cycleEnd;
    }

    public void setCycleEnd(Date cycleEnd) {
        this.cycleEnd = cycleEnd;
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

    public String getBlDelFlg() {
        return blDelFlg;
    }

    public void setBlDelFlg(String blDelFlg) {
        this.blDelFlg = blDelFlg;
    }
}