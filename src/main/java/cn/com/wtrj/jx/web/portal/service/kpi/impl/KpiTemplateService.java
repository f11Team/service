package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInsMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiTemplateMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplate;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplateExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiTemplateMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiTemplate;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiTemplateService;

@Service
public class KpiTemplateService implements IKpiTemplateService {

	@Autowired
	WtrjKpiTemplateMapper mapper;

	@Autowired
	MtKpiTemplateMapper mtMapper;

	@Autowired
	WtrjKpiInsMapper insMapper;

	@Override
	public List<MtKpiTemplate> find(String schoolCode, String tmplType) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("schoolCode", schoolCode);
		param.put("tmplType", tmplType);
		return mtMapper.findByType(param);
	}

	@Override
	public List<WtrjKpiTemplate> find(Integer kpiInsId, String tmplType) {
		WtrjKpiIns p = insMapper.selectByPrimaryKey(kpiInsId);
		if (tmplType.equals("1")) {
			return find(p.getZipingTmplCode());
		} else if (tmplType.equals("2")) {
			return find(p.getJiaoyanzuTmplCode());
		} else if (tmplType.equals("3")) {
			return find(p.getNianjizuTmplCode());
		} else if (tmplType.equals("4")) {
			return find(p.getJiaowuTmplCode());
		}
		return null;
	}

	@Override
	public List<WtrjKpiTemplate> find(String tmplCode) {
		WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
		ex.createCriteria().andTmplCodeEqualTo(tmplCode);
		ex.setOrderByClause("item_code asc");
		return mapper.selectByExample(ex);
	}

	@Override
	public WtrjKpiTemplate findByPkey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean deleteTmpl(String tmplCode) {
		WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
		ex.createCriteria().andTmplCodeEqualTo(tmplCode);
		mapper.deleteByExample(ex);
		return true;
	}

	@Override
	public void save(List<WtrjKpiTemplate> params) {
		Date cTime = Calendar.getInstance().getTime();
		String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
		Integer seq = 0;
		String tmplCode = params.get(0).getTmplCode();
		if (StringUtils.isEmpty(tmplCode)) {
			// 新增
			Map<String, Object> mp = new HashMap<String, Object>();
			mp.put("year", year);
			seq = mtMapper.findMaxSeq(mp);
			if (seq == null) {
				seq = 1;
			} else {
				seq = seq + 1;
			}
			tmplCode = year + StringUtils.leftPad(seq.toString(), 3, "0");
			for (WtrjKpiTemplate param : params) {
				// 判断是否末级
				Integer idx = params.indexOf(param);
				if (idx + 1 == params.size()
						|| param.getItemCode().length() >= params.get(idx + 1).getItemCode().length()) {
					param.setBlLeaf("1");
				} else {
					param.setBlLeaf("0");
				}
				param.setItemType(StringUtils.isEmpty(param.getItemType()) ? "1" : param.getItemType());
				param.setTmplCode(tmplCode);
				param.setTmplYear(year);
				param.setTmplSeq(seq);
				param.setCreateTime(cTime);
				param.setUpdateTime(cTime);
				mapper.insertSelective(param);
			}
		} else {
			// 修改
			year = StringUtils.left(tmplCode, 4);
			seq = Integer.parseInt(StringUtils.right(tmplCode, 3));
			for (WtrjKpiTemplate param : params) {
				WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
				ex.createCriteria().andTmplCodeEqualTo(tmplCode).andItemCodeEqualTo(param.getItemCode());
				List<WtrjKpiTemplate> rs = mapper.selectByExample(ex);
				if (rs.size() > 0) {
					param.setId(rs.get(0).getId());
					param.setUpdateTime(cTime);
					mapper.updateByPrimaryKeySelective(param);
				} else {
					// 判断是否末级
					Integer idx = params.indexOf(param);
					if (idx + 1 == params.size()
							|| param.getItemCode().length() >= params.get(idx + 1).getItemCode().length()) {
						param.setBlLeaf("1");
					} else {
						param.setBlLeaf("0");
					}
					param.setItemType(StringUtils.isEmpty(param.getItemType()) ? "1" : param.getItemType());
					param.setTmplCode(tmplCode);
					param.setTmplYear(year);
					param.setTmplSeq(seq);
					param.setCreateTime(cTime);
					param.setUpdateTime(cTime);
					mapper.insertSelective(param);
				}
			}
		}
	}

	@Override
	public void updateTmpl(MtKpiTemplate param) {
		WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
		ex.createCriteria().andTmplCodeEqualTo(param.getTmplCode());

		WtrjKpiTemplate rec = new WtrjKpiTemplate();
		rec.setTmplName(param.getTmplName());
		rec.setTmplType(param.getTmplType());
		mapper.updateByExampleSelective(rec, ex);
	}

	@Override
	public void deleteItems(Integer id) {
		WtrjKpiTemplate tmp = mapper.selectByPrimaryKey(id);
		// 删除
		if (tmp.getBlLeaf().equals("1")) {
			mapper.deleteByPrimaryKey(id);
		} else {
			WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
			ex.createCriteria().andTmplCodeEqualTo(tmp.getTmplCode()).andItemCodeLike(tmp.getItemCode() + "%");
			mapper.deleteByExample(ex);
		}
		// 判断上级是否变为末级
		Integer idx = tmp.getItemCode().lastIndexOf("-");
		if (idx > 0) {
			String pcode = StringUtils.left(tmp.getItemCode(), idx);
			WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
			ex.createCriteria().andTmplCodeEqualTo(tmp.getTmplCode()).andItemCodeLike(pcode + "%");
			ex.setOrderByClause("item_code asc");
			List<WtrjKpiTemplate> rs = mapper.selectByExample(ex);
			if (rs.size() == 1) {
				WtrjKpiTemplate r = rs.get(0);
				r.setBlLeaf("1");
				mapper.updateByPrimaryKeySelective(r);
			}
		}
	}
}
