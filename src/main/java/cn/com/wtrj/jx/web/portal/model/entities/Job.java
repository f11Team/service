package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class Job implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String notifyUrl;
	
	private String params;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "Job [name=" + name + ", notifyUrl=" + notifyUrl + ", params=" + params + "]";
	}

	public Job(String name, String notifyUrl, String params) {
		this.name = name;
		this.notifyUrl = notifyUrl;
		this.params = params;
	}

	public Job() {
	}
	
}
