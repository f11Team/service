package cn.com.wtrj.jx.web.portal.model.mt.entities;

public class MtStage {
	private String code;

	private String name;

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

	@Override
	public String toString() {
		return "MtStage [code=" + code + ", name=" + name + "]";
	}
	
	
}
