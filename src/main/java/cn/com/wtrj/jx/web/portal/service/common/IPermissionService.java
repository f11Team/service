package cn.com.wtrj.jx.web.portal.service.common;

import cn.com.wtrj.jx.web.portal.service.dto.UserPermission;

public interface IPermissionService {
	
	public UserPermission searchUserPermission(Integer teacherId);
	
}
