package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;
import java.util.Map;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiTemplate;

public interface MtKpiTemplateMapper {

	public List<MtKpiTemplate> findByType(Map<String, Object> param);

	public Integer findMaxSeq(Map<String, Object> param);
}
