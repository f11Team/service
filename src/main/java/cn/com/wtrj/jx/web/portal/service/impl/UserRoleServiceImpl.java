package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.MtUserRoleMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtUserRole;
import cn.com.wtrj.jx.web.portal.service.IUserRoleService;

@Service
public class UserRoleServiceImpl implements IUserRoleService {
	@Autowired
	private MtUserRoleMapper userRoleMapper;

	@Override
	public List<MtUserRole> searchByUser(String userName, String pwd) {
		return userRoleMapper.searchByUser(userName, pwd);
	}

}
