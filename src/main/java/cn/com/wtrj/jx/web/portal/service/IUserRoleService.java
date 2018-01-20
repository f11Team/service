package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtUserRole;

public interface IUserRoleService {
	List<MtUserRole> searchByUser(@Param(value = "userName") String userName, @Param(value = "pwd") String pwd);
}
