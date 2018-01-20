package cn.com.wtrj.jx.web.portal.model.mt.entities.setting;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndex;

public class MtRoleRptIndexDto extends WtrjRptIndex {

	/**
	 * 用户定义指标ID
	 */
	private Integer userIndexId;

	/**
	 * 权限ID
	 */
	private String roleId;

	/**
	 * 指标修改权限
	 */
	private String blIndexAuth;

	/**
	 * 是否可见权
	 */
	private boolean own;

	public String getFullName() {
		return "（" + this.getTypeName() + "）" + this.getName();
	}

	public Integer getUserIndexId() {
		return userIndexId;
	}

	public void setUserIndexId(Integer userIndexId) {
		this.userIndexId = userIndexId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getBlIndexAuth() {
		return blIndexAuth;
	}

	public void setBlIndexAuth(String blIndexAuth) {
		this.blIndexAuth = blIndexAuth;
	}

	public boolean isOwn() {
		return own;
	}

	public void setOwn(boolean own) {
		this.own = own;
	}
}
