package cn.com.wtrj.jx.web.portal.model.mt.dao.setting;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleRptIndexDto;

public interface MtRoleRptIndexMapper {
	public List<MtRoleRptIndexDto> searchRoleRptIndex(@Param(value = "roleId") String roleId);
}
