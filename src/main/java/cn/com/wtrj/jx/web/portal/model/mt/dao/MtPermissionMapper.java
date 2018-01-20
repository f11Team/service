package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseTeacher;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtHeaderTeacher;

public interface MtPermissionMapper {
	
	public List<MtCourseTeacher> selectCourseTeacherByStudentId(Integer studentId);

	public List<MtHeaderTeacher> selectHeaderTeacherByStudentId(Integer studentId);
}
 