package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInfoMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiInfoMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiPingjiaMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoJw;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPingjiaDto;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiInfoService;

@Service
public class KpiInfoService implements IKpiInfoService {

	@Autowired
	WtrjKpiInfoMapper mapper;

	@Autowired
	MtKpiInfoMapper mtMapper;

	@Autowired
	MtKpiPingjiaMapper mtKpiMapper;

	@Override
	public List<MtKpiInfoDto> searchKpiInfoJy(Integer kpiInsId, String code, Integer start, Integer end) {
		return mtMapper.selectKpiInfoJy(kpiInsId, code, start, end);
	}

	@Override
	public Integer countKpiInfoJy(Integer kpiInsId, String code) {
		return mtMapper.countKpiInfoJy(kpiInsId, code);
	}

	@Override
	public List<MtKpiInfoDto> searchKpiInfoNj(Integer kpiInsId, String code, Integer start, Integer end) {
		return mtMapper.selectKpiInfoNj(kpiInsId, code, start, end);
	}

	@Override
	public Integer countKpiInfoNj(Integer kpiInsId, String code) {
		return mtMapper.countKpiInfoNj(kpiInsId, code);
	}

	@Override
	public List<MtKpiInfoDto> searchKpiInfoJw(Integer kpiInsId, String code, Integer start, Integer end) {
		return mtMapper.selectKpiInfoJw(kpiInsId, code, start, end);
	}

	@Override
	public List<MtKpiInfoJw> searchKpiInfoJwEx(Integer kpiInsId, String code, Integer start, Integer end) {
		List<MtKpiInfoJw> ps = new ArrayList<MtKpiInfoJw>();
		List<MtKpiInfoDto> ds = mtMapper.selectKpiInfoJw(kpiInsId, code, start, end);
		if (ds != null && ds.size() > 0) {
			for (MtKpiInfoDto d : ds) {
				MtKpiInfoJw p = new MtKpiInfoJw();
				List<MtKpiPingjiaDto> items = mtKpiMapper.selectPingjiaItemJw(d.getEmployeeId(), kpiInsId);
				p.setP(d);
				p.setItems(items);
				ps.add(p);
			}
		}
		return ps;
	}

	@Override
	public Integer countKpiInfoJw(Integer kpiInsId, String code) {
		return mtMapper.countKpiInfoJw(kpiInsId, code);
	}

	@Override
	public List<MtKpiInfo> searchKpiInfo(Integer kpiInsId) {
		return mtMapper.selectKpiInfo(kpiInsId);
	}

}
