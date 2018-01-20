package cn.com.wtrj.jx.web.portal.service.response.report;

import java.util.ArrayList;
import java.util.List;

/**
 * ECharts数据模型
 * 
 * @author VI
 *
 */
public class EChartsItem {

	/**
	 * x轴
	 */
	private String xAxis;

	/**
	 * y轴1
	 */
	private List<EChartsSeries> series = new ArrayList<EChartsSeries>();

	/**
	 * y轴2
	 */
	private List<EChartsSeries> seriesSec = new ArrayList<EChartsSeries>();

	public String getxAxis() {
		return xAxis;
	}

	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}

	public List<EChartsSeries> getSeries() {
		return series;
	}

	public void setSeries(List<EChartsSeries> series) {
		this.series = series;
	}

	public List<EChartsSeries> getSeriesSec() {
		return seriesSec;
	}

	public void setSeriesSec(List<EChartsSeries> seriesSec) {
		this.seriesSec = seriesSec;
	}

}
