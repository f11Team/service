package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjEcomSchoolAppid extends WtrjEcomSchoolAppidKey {
    private String corpId;

    private String appSecret;
    
    private String agentId;
    
    

    public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}