package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjKpiEmployee extends WtrjKpiEmployeeKey {
    private String belongJiaoyanzuCode;

    private String belongNianjizuCode;

    public String getBelongJiaoyanzuCode() {
        return belongJiaoyanzuCode;
    }

    public void setBelongJiaoyanzuCode(String belongJiaoyanzuCode) {
        this.belongJiaoyanzuCode = belongJiaoyanzuCode;
    }

    public String getBelongNianjizuCode() {
        return belongNianjizuCode;
    }

    public void setBelongNianjizuCode(String belongNianjizuCode) {
        this.belongNianjizuCode = belongNianjizuCode;
    }
}