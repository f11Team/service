package cn.com.wtrj.jx.web.portal.service.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.service.common.IPermissionService;
import cn.com.wtrj.jx.web.portal.service.dto.UserPermission;

@Service
public class PermissionService implements IPermissionService {

	@Autowired
	private WtrjTeacherMapper teacherMapper;
	
	@Override
	public UserPermission searchUserPermission(Integer teacherId) {
		UserPermission up = new UserPermission();
		
		// 设置是否班主任
		WtrjTeacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
		if (teacher != null && teacher.getBlHeadTeacher() != null && "1".equals(teacher.getBlHeadTeacher())) {
			up.setIsHeadTeacher(true);
		}
		
		return up;
	}

}
