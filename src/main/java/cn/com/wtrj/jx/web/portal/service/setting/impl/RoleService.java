package cn.com.wtrj.jx.web.portal.service.setting.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjPortalRoleMenuMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRoleMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserRoleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalRoleMenuExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalRoleMenuKey;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRole;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtRoleMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleMenusDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserMenuDto;
import cn.com.wtrj.jx.web.portal.service.setting.IRoleService;

@Service
public class RoleService implements IRoleService {

	@Autowired
	MtRoleMapper roleMapper;

	@Autowired
	WtrjPortalRoleMenuMapper roleMenuMapper;
	
	@Autowired
	WtrjUserRoleMapper userRoleMapper;
	
	@Autowired
	WtrjRoleMapper wtrjRoleMapper;
	
	@Override
	public int countRoles(String search) {
		return roleMapper.countRoles(search);
	}

	@Override
	public List<WtrjRole> searchRolesByPage(Integer start, Integer end, String search) {
		return roleMapper.selectRoleByPage(start, end, search);
	}

	@Override
	public List<MtRoleDto> searchUserRolesByPage(Integer userId, Integer start, int end, String search) {
		return roleMapper.selectUserRoleByPage(userId, start, end, search);
	}

	@Override
	public List<MtRoleMenusDto> searchMenusByRole(String roleId) {
		return roleMapper.selectRoleMenus(roleId);
	}

	@Override
	public void updateRoleMenus(String roleId, List<String> menus) {
		WtrjPortalRoleMenuExample example = new WtrjPortalRoleMenuExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		roleMenuMapper.deleteByExample(example );
		
		if (menus != null) {
			for (String menu : menus) {
				WtrjPortalRoleMenuKey record = new WtrjPortalRoleMenuKey();
				record.setMenuCode(menu);
				record.setRoleId(roleId);

				roleMenuMapper.insert(record);
			}
		}
	}

	@Override
	public List<MtUserMenuDto> searchMenusByUserId(Integer userId) {
		return roleMapper.selectMenusByUserId(userId);
	}

	@Override
	public List<WtrjUserRoleKey> searchRolesByUserId(Integer id) {
		WtrjUserRoleExample example = new WtrjUserRoleExample();
		example.createCriteria().andUserIdEqualTo(id);
		
		return userRoleMapper.selectByExample(example );
	}

	@Override
	public Boolean addRole(String roleId, String roleName) {
		WtrjRole role = wtrjRoleMapper.selectByPrimaryKey(roleId);
		if (role != null) {
			return false;
		}
		WtrjRole record = new WtrjRole();
		record.setId(roleId);
		record.setName(roleName);
		
		wtrjRoleMapper.insert(record );
		
		return true;
	}

	@Override
	public void deleteRole(String roleId) {
		WtrjUserRoleExample example = new WtrjUserRoleExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		userRoleMapper.deleteByExample(example);
		
		WtrjRoleExample roleExample = new WtrjRoleExample();
		roleExample.createCriteria().andIdEqualTo(roleId);
		wtrjRoleMapper.deleteByExample(roleExample);
	}

	@Override
	public String selectUserRoleByRoleId(Integer userId, String roleId) {
		return roleMapper.selectUserRoleByRoleId(userId, roleId);
	}

}
