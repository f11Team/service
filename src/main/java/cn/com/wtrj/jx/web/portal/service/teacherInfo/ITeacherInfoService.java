package cn.com.wtrj.jx.web.portal.service.teacherInfo;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;

public interface ITeacherInfoService {
	
	List<WtrjTeacher> serachAll();

	WtrjTeacher searchParentsMeetingById(Integer id);

	void updateTeacherInfo(WtrjTeacher wtrjTeacher);

	
	
}
