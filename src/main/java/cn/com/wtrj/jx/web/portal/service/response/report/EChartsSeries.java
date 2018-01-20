package cn.com.wtrj.jx.web.portal.service.response.report;

/**
 * ECharts数据模型
 * 
 * @author VI
 *
 */
public class EChartsSeries {

	/**
	 * 项目说明
	 */
	private String name;

	/**
	 * 项目值
	 */
	private Object value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
