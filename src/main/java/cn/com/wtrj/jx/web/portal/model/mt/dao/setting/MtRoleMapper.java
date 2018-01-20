package cn.com.wtrj.jx.web.portal.model.mt.dao.setting;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRole;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleMenusDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserMenuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserNcOrgNameDto;

public interface MtRoleMapper {
	public List<WtrjRole> selectRoleByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	public int countRoles(@Param(value = "search")String search);

	public List<MtRoleDto> selectUserRoleByPage(@Param(value = "userId")Integer userId, @Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	public List<MtRoleMenusDto> selectRoleMenus(@Param(value = "roleId")String roleId);

	public List<MtUserMenuDto> selectMenusByUserId(@Param(value = "userId")Integer userId);

	public List<MtRoleNcOrgDto> selectNcOrgByRoleId(@Param(value = "roleId")String roleId);

	public MtUserNcOrgDto selectNcOrgNumByUserId(@Param(value = "userId")Integer userId);
	
	public List<MtUserNcOrgNameDto> selectNcOrgInfoByUserId(@Param(value = "userId")Integer userId);
	
	public String selectUserRoleByRoleId(@Param(value = "userId") Integer userId, @Param(value = "roleId") String roleId);
}
