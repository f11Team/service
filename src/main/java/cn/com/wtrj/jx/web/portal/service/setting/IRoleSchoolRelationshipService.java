package cn.com.wtrj.jx.web.portal.service.setting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleSchoolDto;

public interface IRoleSchoolRelationshipService {

	List<MtRoleSchoolDto> searchSchoolByRoleId(String roleId);

	void updateRoleSchool(String roleId, List<String> schoolCodes);
	
	List<MtRoleSchoolDto> searchRoleSchoolInfoByUserId(Integer id);
	
}
