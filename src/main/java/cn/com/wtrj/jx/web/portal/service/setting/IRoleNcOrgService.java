package cn.com.wtrj.jx.web.portal.service.setting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgNameDto;

public interface IRoleNcOrgService {

	List<MtRoleNcOrgDto> searchRoleNcOrg(String roleId);

	void updateRoleNcOrg(String roleId, List<String> orgCode);
	
	MtUserNcOrgDto searchUserNcOrgNumber(Integer userId);

	List<MtUserNcOrgNameDto> searchUserNcOrgInfoByUserId(Integer id);

}
