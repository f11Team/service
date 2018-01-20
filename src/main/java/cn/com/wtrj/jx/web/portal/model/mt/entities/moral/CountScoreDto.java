package cn.com.wtrj.jx.web.portal.model.mt.entities.moral;


import java.util.Date;

public class CountScoreDto {
    private Integer actScore;
    private  String countName;
    private Date cycleStart;
    private  Date cycleEnd;

    public Integer getActScore() {
        return actScore;
    }

    public void setActScore(Integer actScore) {
        this.actScore = actScore;
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
}
