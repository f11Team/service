package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjRptAttendanceMonth {
    private Integer id;

    private String studentNo;

    private String studentName;

    private Integer year;

    private Integer month;

    private Integer lateNum;

    private Integer leaveEarlyNum;

    private Integer avgLeaveTimeHour;

    private Integer avgLeaveTimeMinute;

    private Integer earliestLeaveTimeHour;

    private Integer earliestLeaveTimeMinute;

    private Integer latestLeaveTimeHour;

    private Integer latestLeaveTimeMinute;

    private Integer leaveNum;

    private Integer noSwipeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getLateNum() {
        return lateNum;
    }

    public void setLateNum(Integer lateNum) {
        this.lateNum = lateNum;
    }

    public Integer getLeaveEarlyNum() {
        return leaveEarlyNum;
    }

    public void setLeaveEarlyNum(Integer leaveEarlyNum) {
        this.leaveEarlyNum = leaveEarlyNum;
    }

    public Integer getAvgLeaveTimeHour() {
        return avgLeaveTimeHour;
    }

    public void setAvgLeaveTimeHour(Integer avgLeaveTimeHour) {
        this.avgLeaveTimeHour = avgLeaveTimeHour;
    }

    public Integer getAvgLeaveTimeMinute() {
        return avgLeaveTimeMinute;
    }

    public void setAvgLeaveTimeMinute(Integer avgLeaveTimeMinute) {
        this.avgLeaveTimeMinute = avgLeaveTimeMinute;
    }

    public Integer getEarliestLeaveTimeHour() {
        return earliestLeaveTimeHour;
    }

    public void setEarliestLeaveTimeHour(Integer earliestLeaveTimeHour) {
        this.earliestLeaveTimeHour = earliestLeaveTimeHour;
    }

    public Integer getEarliestLeaveTimeMinute() {
        return earliestLeaveTimeMinute;
    }

    public void setEarliestLeaveTimeMinute(Integer earliestLeaveTimeMinute) {
        this.earliestLeaveTimeMinute = earliestLeaveTimeMinute;
    }

    public Integer getLatestLeaveTimeHour() {
        return latestLeaveTimeHour;
    }

    public void setLatestLeaveTimeHour(Integer latestLeaveTimeHour) {
        this.latestLeaveTimeHour = latestLeaveTimeHour;
    }

    public Integer getLatestLeaveTimeMinute() {
        return latestLeaveTimeMinute;
    }

    public void setLatestLeaveTimeMinute(Integer latestLeaveTimeMinute) {
        this.latestLeaveTimeMinute = latestLeaveTimeMinute;
    }

    public Integer getLeaveNum() {
        return leaveNum;
    }

    public void setLeaveNum(Integer leaveNum) {
        this.leaveNum = leaveNum;
    }

    public Integer getNoSwipeNum() {
        return noSwipeNum;
    }

    public void setNoSwipeNum(Integer noSwipeNum) {
        this.noSwipeNum = noSwipeNum;
    }
}