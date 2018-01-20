package cn.com.wtrj.jx.web.portal.model.mt.dao.setting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleSchoolDto;

public interface MtRoleSchoolMapper {

	List<MtRoleSchoolDto> selectSchoolByRoleId(String roleId);

	List<MtRoleSchoolDto> selectSchoolByUserId(Integer userId);

}
