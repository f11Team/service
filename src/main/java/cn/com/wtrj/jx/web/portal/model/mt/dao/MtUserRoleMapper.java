package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtUserRole;

public interface MtUserRoleMapper {
	List<MtUserRole> searchByUser(@Param(value = "userName") String userName, @Param(value = "pwd") String pwd);
}
