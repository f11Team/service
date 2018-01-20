package cn.com.wtrj.jx.web.portal.model.mt.entities.kpi;

import java.util.List;

public class MtKpiInfoJw {

	private MtKpiInfoDto p;

	private List<MtKpiPingjiaDto> items;

	public MtKpiInfoDto getP() {
		return p;
	}

	public void setP(MtKpiInfoDto p) {
		this.p = p;
	}

	public List<MtKpiPingjiaDto> getItems() {
		return items;
	}

	public void setItems(List<MtKpiPingjiaDto> items) {
		this.items = items;
	}

}
