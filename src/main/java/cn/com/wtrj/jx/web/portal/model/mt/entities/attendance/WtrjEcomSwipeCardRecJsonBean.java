package cn.com.wtrj.jx.web.portal.model.mt.entities.attendance;

public class WtrjEcomSwipeCardRecJsonBean {
	private String no;
	private String ip;
	private String port;
	private String type;
	private String time;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "WtrjEcomSwipeCardRecJsonBean [no=" + no + ", ip=" + ip + ", port=" + port + ", type=" + type + ", time="
				+ time + "]";
	}

}
