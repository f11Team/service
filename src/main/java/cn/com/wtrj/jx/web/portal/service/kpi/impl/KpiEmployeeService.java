package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployeeKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiEmployee;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiEmployeeService;

@Service
public class KpiEmployeeService implements IKpiEmployeeService {

	@Autowired
	WtrjKpiEmployeeMapper mapper;

	@Autowired
	MtKpiEmployeeMapper mtMapper;

	@Override
	public List<MtKpiEmployee> searchForAdd(Integer kpiInsId) {
		return mtMapper.searchForAdd(kpiInsId);
	}

	@Override
	public List<MtKpiEmployee> search(Integer kpiInsId) {
		return mtMapper.search(kpiInsId);
	}

	@Override
	public void save(List<WtrjKpiEmployee> params) {
		for (WtrjKpiEmployee param : params) {
			if (mapper.selectByPrimaryKey(param) == null) {
				mapper.insertSelective(param);
			} else {
				mapper.updateByPrimaryKeySelective(param);
			}
		}
	}

	@Override
	public void delete(WtrjKpiEmployeeKey key) {
		mapper.deleteByPrimaryKey(key);
	}

}
