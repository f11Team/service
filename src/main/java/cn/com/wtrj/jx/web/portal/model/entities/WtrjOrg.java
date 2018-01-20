package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjOrg {
    private String code;

    private String name;

    private String segementCode;

    private String nickName;

    private Integer employeeNum;

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

    public String getSegementCode() {
        return segementCode;
    }

    public void setSegementCode(String segementCode) {
        this.segementCode = segementCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
    }
}