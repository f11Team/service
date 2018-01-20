package cn.com.wtrj.jx.web.portal.service.setting.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRoleNcRelationshipMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleNcRelationshipExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleNcRelationshipKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtRoleMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgNameDto;
import cn.com.wtrj.jx.web.portal.service.setting.IRoleNcOrgService;

@Service
public class RoleNcOrgService implements IRoleNcOrgService {
	
	@Autowired
	private WtrjRoleNcRelationshipMapper rnMapper;
	
	@Autowired
	private MtRoleMapper mtMappper;
	
	@Override
	public List<MtRoleNcOrgDto> searchRoleNcOrg(String roleId) {
		return mtMappper.selectNcOrgByRoleId(roleId);
	}

	@Override
	public void updateRoleNcOrg(String roleId, List<String> orgCodes) {
		WtrjRoleNcRelationshipExample example = new WtrjRoleNcRelationshipExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		
		rnMapper.deleteByExample(example );
		
		if(orgCodes != null){
			for (String orgCode : orgCodes) {
				WtrjRoleNcRelationshipKey record = new WtrjRoleNcRelationshipKey();
				record.setOrgCode(orgCode);
				record.setRoleId(roleId);
				
				rnMapper.insertSelective(record);
			}
		}
	}

	@Override
	public MtUserNcOrgDto searchUserNcOrgNumber(Integer userId) {
		return mtMappper.selectNcOrgNumByUserId(userId);
	}

	@Override
	public List<MtUserNcOrgNameDto> searchUserNcOrgInfoByUserId(Integer userId) {
		return mtMappper.selectNcOrgInfoByUserId(userId);
	}

}
