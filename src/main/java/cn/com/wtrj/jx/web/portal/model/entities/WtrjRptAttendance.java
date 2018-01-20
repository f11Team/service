package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.Date;

public class WtrjRptAttendance {
    private Integer id;

    private String studentNo;

    private String studentName;

    private Date attendanceTime;

    private String attendancePlace;

    private String attendanceKind;

    private String attendanceStatus;

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

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public String getAttendancePlace() {
        return attendancePlace;
    }

    public void setAttendancePlace(String attendancePlace) {
        this.attendancePlace = attendancePlace;
    }

    public String getAttendanceKind() {
        return attendanceKind;
    }

    public void setAttendanceKind(String attendanceKind) {
        this.attendanceKind = attendanceKind;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}