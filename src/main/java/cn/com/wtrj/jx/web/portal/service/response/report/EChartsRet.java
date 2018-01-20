package cn.com.wtrj.jx.web.portal.service.response.report;

import java.util.ArrayList;
import java.util.List;

/**
 * ECharts数据模型
 * 
 * @author VI
 *
 */
public class EChartsRet {

	/**
	 * 标题
	 */
	private String title;

	/**
	 * x轴名称
	 */
	private String xAxisName;

	/**
	 * y轴名称(第一个轴)
	 */
	private String seriesName;

	/**
	 * y轴名称(第二个轴)
	 */
	private String seriesSecName;

	/**
	 * 数据集合
	 */
	private List<EChartsItem> items = new ArrayList<EChartsItem>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getxAxisName() {
		return xAxisName;
	}

	public void setxAxisName(String xAxisName) {
		this.xAxisName = xAxisName;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public List<EChartsItem> getItems() {
		return items;
	}

	public void setItems(List<EChartsItem> items) {
		this.items = items;
	}

	public String getSeriesSecName() {
		return seriesSecName;
	}

	public void setSeriesSecName(String seriesSecName) {
		this.seriesSecName = seriesSecName;
	}
}
