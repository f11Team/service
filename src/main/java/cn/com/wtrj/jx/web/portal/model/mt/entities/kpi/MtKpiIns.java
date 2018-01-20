package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.text.SimpleDateFormat;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;

public class MtKpiIns extends WtrjKpiIns {

	private String schoolName;

	private String zipingTmplName;

	private String jiaoyanzuTmplName;

	private String nianjizuTmplName;

	private String jiaowuTmplName;

	public String getStartTimeStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(getStartTime());
	}

	public String getEndTimeStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(getEndTime());
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getZipingTmplName() {
		return zipingTmplName;
	}

	public void setZipingTmplName(String zipingTmplName) {
		this.zipingTmplName = zipingTmplName;
	}

	public String getJiaoyanzuTmplName() {
		return jiaoyanzuTmplName;
	}

	public void setJiaoyanzuTmplName(String jiaoyanzuTmplName) {
		this.jiaoyanzuTmplName = jiaoyanzuTmplName;
	}

	public String getNianjizuTmplName() {
		return nianjizuTmplName;
	}

	public void setNianjizuTmplName(String nianjizuTmplName) {
		this.nianjizuTmplName = nianjizuTmplName;
	}

	public String getJiaowuTmplName() {
		return jiaowuTmplName;
	}

	public void setJiaowuTmplName(String jiaowuTmplName) {
		this.jiaowuTmplName = jiaowuTmplName;
	}

}