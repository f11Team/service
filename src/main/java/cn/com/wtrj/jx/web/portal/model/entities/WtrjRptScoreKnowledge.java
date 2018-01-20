package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjRptScoreKnowledge {
    private Integer id;

    private Integer examDetailId;

    private String segment;

    private String point;

    private Integer fullCredit;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(Integer examDetailId) {
        this.examDetailId = examDetailId;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Integer getFullCredit() {
        return fullCredit;
    }

    public void setFullCredit(Integer fullCredit) {
        this.fullCredit = fullCredit;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}