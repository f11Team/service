package cn.com.wtrj.jx.web.portal.service.setting.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRoleSchoolRelationshipMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleSchoolRelationshipExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleSchoolRelationshipKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtRoleSchoolMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleSchoolDto;
import cn.com.wtrj.jx.web.portal.service.setting.IRoleSchoolRelationshipService;

@Service
public class RoleSchoolRelationshipService implements IRoleSchoolRelationshipService {

	@Autowired
	private WtrjRoleSchoolRelationshipMapper roleSchoolMapper;
	
	@Autowired
	private MtRoleSchoolMapper mtMappper;
	
	@Override
	public List<MtRoleSchoolDto> searchSchoolByRoleId(String roleId) {
		return mtMappper.selectSchoolByRoleId(roleId);
	}

	@Override
	@Transactional
	public void updateRoleSchool(String roleId, List<String> schoolCodes) {
		WtrjRoleSchoolRelationshipExample example = new WtrjRoleSchoolRelationshipExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		
		roleSchoolMapper.deleteByExample(example);
		
		for (String schoolCode : schoolCodes) {
			WtrjRoleSchoolRelationshipKey record = new WtrjRoleSchoolRelationshipKey();
			record.setRoleId(roleId);
			record.setSchoolCode(schoolCode);
			
			roleSchoolMapper.insert(record );
		}
		
	}

	@Override
	public List<MtRoleSchoolDto> searchRoleSchoolInfoByUserId(Integer userId) {
		
		return mtMappper.selectSchoolByUserId(userId);
	}

}
