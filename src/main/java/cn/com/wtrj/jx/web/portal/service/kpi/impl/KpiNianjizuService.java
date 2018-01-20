package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiGradeEmplMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiGradeGroupMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeEmplExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeEmplKey;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroup;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroupExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiGroupMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiGradeGroup;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiNianjizuService;

/**
 * KPI年级组管理
 * 
 * @author VI
 *
 */
@Service
@Transactional
public class KpiNianjizuService implements IKpiNianjizuService {

	@Autowired
	WtrjKpiGradeGroupMapper mapper;

	@Autowired
	WtrjKpiGradeEmplMapper dsMapper;

	@Autowired
	MtKpiGroupMapper mtMapper;

	/**
	 * 取得最新编码
	 */
	private String getNewCode() {
		String code = "0";
		WtrjKpiGradeGroupExample ex = new WtrjKpiGradeGroupExample();
		ex.setOrderByClause(" code desc ");
		List<WtrjKpiGradeGroup> ds = mapper.selectByExample(ex);
		if (ds.size() > 0) {
			code = ds.get(0).getCode();
		}
		code = StringUtils.leftPad(String.valueOf(Integer.parseInt(code) + 1), 4, "0");
		return code;
	}

	@Override
	public void save(WtrjKpiGradeGroup pa, List<WtrjKpiGradeEmplKey> ds) {
		// 保存KPI年级组
		if (StringUtils.isEmpty(pa.getCode())) {
			// 新增
			pa.setCode(getNewCode());
			mapper.insertSelective(pa);
		} else {
			// 修改
			mapper.updateByPrimaryKeySelective(pa);
		}

		// 保存年级组成员对应关系（删除->插入）
		WtrjKpiGradeEmplExample ex = new WtrjKpiGradeEmplExample();
		ex.createCriteria().andGradeCodeEqualTo(pa.getCode());
		dsMapper.deleteByExample(ex);

		for (WtrjKpiGradeEmplKey d : ds) {
			d.setGradeCode(pa.getCode());
			dsMapper.insertSelective(d);
		}
	}

	@Override
	public void delete(String code) {
		// 删除年级组成员对应关系
		WtrjKpiGradeEmplExample ex = new WtrjKpiGradeEmplExample();
		ex.createCriteria().andGradeCodeEqualTo(code);
		dsMapper.deleteByExample(ex);
		// 删除KPI年级组
		mapper.deleteByPrimaryKey(code);
	}

	@Override
	public List<MtWtrjKpiGradeGroup> findAll(String schoolCode, String searchKey) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("searchKey", searchKey);
		params.put("schoolCode", schoolCode);
		return mtMapper.findGrade(params);
	}

	@Override
	public MtWtrjKpiGradeGroup findSingle(String code) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		List<MtWtrjKpiGradeGroup> ds = mtMapper.findGrade(params);
		if (ds.size() > 0) {
			return ds.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjKpiGradeGroup> findAll(Integer employeeId) {
		WtrjKpiGradeGroupExample ex = new WtrjKpiGradeGroupExample();
		ex.createCriteria().andEmployeeIdEqualTo(employeeId);
		return mapper.selectByExample(ex);
	}

	@Override
	public int countNianjizu(String search) {
		return mtMapper.selectNianjizuCount(search);
	}

	@Override
	public List<MtNianjizuDto> searchByPage(Integer start, Integer end, String search) {
		return mtMapper.selectNianjizuByPage(start, end, search);
	}

	@Override
	public boolean addNianjizu(String schoolCode, String nianjizuCode, String nianjizuName) {
		WtrjKpiGradeGroup nianjiazu = mapper.selectByPrimaryKey(nianjizuCode);
		if (nianjiazu != null) {
			return false;
		}

		WtrjKpiGradeGroup record = new WtrjKpiGradeGroup();
		record.setCode(nianjizuCode);
		record.setName(nianjizuName);
		record.setSchoolCode(schoolCode);
		mapper.insertSelective(record);

		return true;
	}

	@Override
	public void updBindNianjizuZhang(String nianjizuCode, Integer employeeId) {
		WtrjKpiGradeGroup record = new WtrjKpiGradeGroup();
		record.setCode(nianjizuCode);
		record.setEmployeeId(employeeId);

		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int countNianjizuMember(String schoolCode, String search) {
		return mtMapper.countNianjizuMembers(schoolCode, search);
	}

	@Override
	public List<MtNianjizuMemberDto> searchNianjizuMemberByPage(String schoolCode, int start, int end, String search) {
		return mtMapper.selectNianjizuMemberByPage(schoolCode, start, end, search);
	}

	@Override
	public void addBindNianjizuMember(String nianjizuCode, List<Integer> members) {
		for (Integer employeeId : members) {
			
			WtrjKpiGradeEmplKey key = new WtrjKpiGradeEmplKey();
			key.setEmployeeId(employeeId);
			key.setGradeCode(nianjizuCode);
			
			dsMapper.deleteByPrimaryKey(key);
			dsMapper.insert(key);
		}
	}

	@Override
	public void deleteBindNianjizuMember(String nianjizuCode, List<Integer> members) {
		for (Integer employeeId : members) {
			
			WtrjKpiGradeEmplKey key = new WtrjKpiGradeEmplKey();
			key.setEmployeeId(employeeId);
			key.setGradeCode(nianjizuCode);
			dsMapper.deleteByPrimaryKey(key);
		}
	}

	@Override
	public void deleteNianjizu(String nianjizuCode) {
		mapper.deleteByPrimaryKey(nianjizuCode);
		
		WtrjKpiGradeEmplExample example = new WtrjKpiGradeEmplExample();
		example.createCriteria().andGradeCodeEqualTo(nianjizuCode);
		dsMapper.deleteByExample(example);
	}

	@Override
	public void addNianjizu(String nianjizuCode, String nianjizuName) {
		WtrjKpiGradeGroup record = new WtrjKpiGradeGroup();
		record.setCode(nianjizuCode);
		record.setName(nianjizuName);
		mapper.updateByPrimaryKeySelective(record );
	}

}
