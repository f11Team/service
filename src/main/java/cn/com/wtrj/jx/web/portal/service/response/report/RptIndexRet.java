package cn.com.wtrj.jx.web.portal.service.response.report;

import java.util.ArrayList;
import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtIndexDto;

public class RptIndexRet {
	/**
	 * 财务指标
	 */
	private List<MtIndexDto> nc = new ArrayList<MtIndexDto>();

	/**
	 * 招生指标
	 */
	private List<MtIndexDto> zs = new ArrayList<MtIndexDto>();

	/**
	 * 成绩指标
	 */
	private List<MtIndexDto> score = new ArrayList<MtIndexDto>();

	/**
	 * 人员指标
	 */
	private List<MtIndexDto> edu = new ArrayList<MtIndexDto>();

	/**
	 * 管理指标
	 */
	private List<MtIndexDto> man = new ArrayList<MtIndexDto>();

	public List<MtIndexDto> getNc() {
		return nc;
	}

	public void setNc(List<MtIndexDto> nc) {
		this.nc = nc;
	}

	public List<MtIndexDto> getZs() {
		return zs;
	}

	public void setZs(List<MtIndexDto> zs) {
		this.zs = zs;
	}

	public List<MtIndexDto> getScore() {
		return score;
	}

	public void setScore(List<MtIndexDto> score) {
		this.score = score;
	}

	public List<MtIndexDto> getEdu() {
		return edu;
	}

	public void setEdu(List<MtIndexDto> edu) {
		this.edu = edu;
	}

	public List<MtIndexDto> getMan() {
		return man;
	}

	public void setMan(List<MtIndexDto> man) {
		this.man = man;
	}
}
