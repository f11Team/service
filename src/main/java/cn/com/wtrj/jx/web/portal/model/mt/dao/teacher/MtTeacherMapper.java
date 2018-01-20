package cn.com.wtrj.jx.web.portal.model.mt.dao.teacher;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;

public interface MtTeacherMapper {
	WtrjTeacher findHeadTeacherByStudentId(@Param("studentId")Integer studentId, @Param("teacherType")String teacherType);

	WtrjTeacher findTeacherById(@Param("id") Integer id);

	WtrjTeacher findTeacherByPhone(@Param("phone") String phone);
	
}
