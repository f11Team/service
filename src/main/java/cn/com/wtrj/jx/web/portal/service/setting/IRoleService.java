package cn.com.wtrj.jx.web.portal.service.setting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRole;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleKey;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleMenusDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserMenuDto;

public interface IRoleService {

	public int countRoles(String search);

	public List<WtrjRole> searchRolesByPage(Integer offset, Integer end, String search);

	public List<MtRoleDto> searchUserRolesByPage(Integer userId, Integer offset, int end, String search);
	
	public List<MtRoleMenusDto> searchMenusByRole(String roleId);

	public void updateRoleMenus(String roleId, List<String> menus);

	public List<MtUserMenuDto> searchMenusByUserId(Integer id);

	public List<WtrjUserRoleKey> searchRolesByUserId(Integer id);

	public Boolean addRole(String roleId, String roleName);

	public void deleteRole(String roleId);
	
	public String selectUserRoleByRoleId(Integer userId, String roleId);
	
}
