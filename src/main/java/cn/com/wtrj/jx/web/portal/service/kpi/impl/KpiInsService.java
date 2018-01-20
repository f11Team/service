package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInfoMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInsMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInsExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiInsMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiIns;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiInsService;

@Service
public class KpiInsService implements IKpiInsService {

	@Autowired
	private WtrjKpiInsMapper mapper;

	@Autowired
	private MtKpiInsMapper mtMapper;

	@Autowired
	private WtrjKpiInfoMapper infoMapper;

	@Override
	public List<WtrjKpiIns> searchList(String schoolCode) {
		WtrjKpiInsExample ex = new WtrjKpiInsExample();
		ex.createCriteria().andKpiSchoolEqualTo(schoolCode);
		return mapper.selectByExample(ex);
	}

	@Override
	public List<WtrjKpiIns> searchList(Integer employeeId) {
		return mtMapper.searchByUser(employeeId);
	}

	@Override
	public List<MtKpiIns> searchPage(String schoolCode) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("schoolCode", schoolCode);
		List<MtKpiIns> ds = mtMapper.searchPage(params);
		return ds;
	}

	@Override
	public WtrjKpiIns search(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(WtrjKpiIns pa) {
		if (pa.getId() == null || pa.getId() == 0) {
			pa.setSeq(getSeq(pa.getYear()));
			pa.setZipingEnd((short) 0);
			pa.setZipingEnd((short) 0);
			pa.setZipingEnd((short) 0);
			pa.setZipingEnd((short) 0);
			mapper.insertSelective(pa);
		} else {
			mapper.updateByPrimaryKeySelective(pa);
		}
	}

	@Override
	public boolean delete(Integer id) {
		WtrjKpiInfoExample ex = new WtrjKpiInfoExample();
		ex.createCriteria().andKpiInsEqualTo(id);
		List<WtrjKpiInfo> infos = infoMapper.selectByExample(ex);
		if (infos.size() > 0) {
			return false;
		} else {
			mapper.deleteByPrimaryKey(id);
			return true;
		}
	}

	/**
	 * 取得考核活动序号
	 */
	private Integer getSeq(Integer year) {
		Integer seq = 0;
		WtrjKpiInsExample ex = new WtrjKpiInsExample();
		ex.createCriteria().andYearEqualTo(year);
		ex.setOrderByClause(" seq desc ");
		List<WtrjKpiIns> ds = mapper.selectByExample(ex);
		if (ds.size() > 0) {
			seq = ds.get(0).getSeq();
		}
		return seq + 1;
	}

	@Override
	public String checkInExpiry(Integer id) {
		Date d = new Date();
		WtrjKpiIns p = mapper.selectByPrimaryKey(id);
		if (d.before(p.getStartTime())) {
			return "考核尚未开始。";
		} else if (d.after(p.getEndTime())) {
			return "考核已结束，感谢您的参与。";
		} else {
			return "";
		}
	}
}
