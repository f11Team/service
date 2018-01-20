package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiJiaoYanZuMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiResearchEmplMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiJiaoYanZu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiJiaoYanZuExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiResearchEmplExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiResearchEmplKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiGroupMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiJiaoYanZu;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiJiaoyanzuService;

/**
 * KPI教研组管理
 * 
 * @author VI
 *
 */
@Service
@Transactional
public class KpiJiaoyanzuService implements IKpiJiaoyanzuService {

	@Autowired
	WtrjKpiJiaoYanZuMapper mapper;

	@Autowired
	WtrjKpiResearchEmplMapper dsMapper;

	@Autowired
	MtKpiGroupMapper mtMapper;

	/**
	 * 取得最新编码
	 */
	private String getNewCode() {
		String code = "0";
		WtrjKpiJiaoYanZuExample ex = new WtrjKpiJiaoYanZuExample();
		ex.setOrderByClause(" code desc ");
		List<WtrjKpiJiaoYanZu> ds = mapper.selectByExample(ex);
		if (ds.size() > 0) {
			code = ds.get(0).getCode();
		}
		code = StringUtils.leftPad(String.valueOf(Integer.parseInt(code) + 1), 4, "0");
		return code;
	}

	@Override
	public void save(WtrjKpiJiaoYanZu pa, List<WtrjKpiResearchEmplKey> ds) {
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
		WtrjKpiResearchEmplExample ex = new WtrjKpiResearchEmplExample();
		ex.createCriteria().andResearchCodeEqualTo(pa.getCode());
		dsMapper.deleteByExample(ex);

		for (WtrjKpiResearchEmplKey d : ds) {
			d.setResearchCode(pa.getCode());
			dsMapper.insertSelective(d);
		}
	}

	@Override
	public void delete(String code) {
		// 删除年级组成员对应关系
		WtrjKpiResearchEmplExample ex = new WtrjKpiResearchEmplExample();
		ex.createCriteria().andResearchCodeEqualTo(code);
		dsMapper.deleteByExample(ex);
		// 删除KPI年级组
		mapper.deleteByPrimaryKey(code);
	}

	@Override
	public List<MtWtrjKpiJiaoYanZu> findAll(String schoolCode, String searchKey) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("searchKey", searchKey);
		params.put("schoolCode", schoolCode);
		return mtMapper.findJiaoyan(params);
	}

	@Override
	public MtWtrjKpiJiaoYanZu findSingle(String code) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		List<MtWtrjKpiJiaoYanZu> ds = mtMapper.findJiaoyan(params);
		if (ds.size() > 0) {
			return ds.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjKpiJiaoYanZu> findAll(Integer employeeId) {
		WtrjKpiJiaoYanZuExample ex = new WtrjKpiJiaoYanZuExample();
		ex.createCriteria().andEmployeeIdEqualTo(employeeId);
		return mapper.selectByExample(ex);
	}

	@Override
	public int countJiaoyanzu(String search) {
		return mtMapper.countJiaoyanzu(search);
	}

	@Override
	public List<MtJiaoyanzuDto> searchByPage(Integer start, Integer end, String search) {
		return mtMapper.selectJiaoyanzuByPage(start, end, search);
	}

	@Override
	public boolean addJiaoyanzu(String schoolCode, String jiaozyanzuCode, String jiaozyanzuName) {
		
		WtrjKpiJiaoYanZu rst = mapper.selectByPrimaryKey(jiaozyanzuCode);
		if (rst != null) {
			return false;
		}
		
		WtrjKpiJiaoYanZu record = new WtrjKpiJiaoYanZu();
		record.setCode(jiaozyanzuCode);
		record.setName(jiaozyanzuName);
		record.setSchoolCode(schoolCode);
		
		mapper.insertSelective(record);
		return true;
	}

	@Override
	public void updJiaoyanzu(String jiaoyanzuCode, String jiaoyanzuName) {
		WtrjKpiJiaoYanZu record = new WtrjKpiJiaoYanZu();
		record.setCode(jiaoyanzuCode);
		record.setName(jiaoyanzuName);
		
		mapper.updateByPrimaryKeySelective(record );
	}

	@Override
	public void updJiaoyanzuzhang(String jiaoyanzuCode, Integer employeeId) {
		WtrjKpiJiaoYanZu record = new WtrjKpiJiaoYanZu();
		record.setCode(jiaoyanzuCode);
		record.setEmployeeId(employeeId);
		
		mapper.updateByPrimaryKeySelective(record );
	}

	@Override
	public void deleteJiaoyanzuMember(String jiaoyanzuCode, List<Integer> members) {
		for (Integer employeeId : members) {
			WtrjKpiResearchEmplKey key = new WtrjKpiResearchEmplKey();
			key.setEmployeeId(employeeId);
			key.setResearchCode(jiaoyanzuCode);
			
			dsMapper.deleteByPrimaryKey(key );
		}
	}

	@Override
	public int countJiaoyanzuMember(String jiaoyanzuCode, String search) {
		return mtMapper.countJiaoyanzuMembers(jiaoyanzuCode, search);
	}

	@Override
	public List<MtJiaoyanzuMemberDto> searchJiaoyanzuMemberByPage(String jiaoyanzuCode, Integer start, Integer end, String search) {
		return mtMapper.selectJiaoyanzuMemberByPage(jiaoyanzuCode, start, end, search);
	}

	@Override
	public void addBindJiaoyanzuMember(String jiaoyanzuCode, List<Integer> members) {
		for (Integer employeeId : members) {
			WtrjKpiResearchEmplKey key = new WtrjKpiResearchEmplKey();
			key.setEmployeeId(employeeId);
			key.setResearchCode(jiaoyanzuCode);
			
			dsMapper.deleteByPrimaryKey(key);
			
			dsMapper.insertSelective(key);
		}
	}

}
