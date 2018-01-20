package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

import java.text.SimpleDateFormat;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexAnalysis;

public class MtRptIndexAnalysisDto extends WtrjRptIndexAnalysis {
	private String employeeName;

	public String getCreateTimeStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(getCreateTime());
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
