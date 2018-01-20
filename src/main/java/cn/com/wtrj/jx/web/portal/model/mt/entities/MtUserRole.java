package cn.com.wtrj.jx.web.portal.model.mt.entities;

public class MtUserRole {
	private String userName;
	private String pwd;
	private String roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public MtUserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MtUserRole [userName=" + userName + ", pwd=" + pwd + ", roleId=" + roleId + "]";
	}

}
