package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrg;

public class MtBusinessSegmentDto {

	private String code;

	private String name;

	private List<WtrjOrg> orgs;

	/**
	 * @return 业务板块编码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            业务板块编码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return 业务板块名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            业务板块名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return 板块公司列表
	 */
	public List<WtrjOrg> getOrgs() {
		return orgs;
	}

	/**
	 * @param orgs
	 *            板块公司列表
	 */
	public void setOrgs(List<WtrjOrg> orgs) {
		this.orgs = orgs;
	}

}
