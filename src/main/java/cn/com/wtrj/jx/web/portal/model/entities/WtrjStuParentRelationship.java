package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjStuParentRelationship extends WtrjStuParentRelationshipKey {
    private String appellation;

    private String flag;

    private String blAttendanceSms;

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getBlAttendanceSms() {
        return blAttendanceSms;
    }

    public void setBlAttendanceSms(String blAttendanceSms) {
        this.blAttendanceSms = blAttendanceSms;
    }
}