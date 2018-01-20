package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjKpiInfoAttach {
    private Integer id;

    private Integer kpiIns;

    private Integer employeeId;

    private String attach;

    private String uploadTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKpiIns() {
        return kpiIns;
    }

    public void setKpiIns(Integer kpiIns) {
        this.kpiIns = kpiIns;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
}