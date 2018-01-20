package cn.com.wtrj.jx.web.portal.model.mt.dao.parentsMeeting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.ParentsRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.PrentsMeetingRespDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentRespWithClass;

public interface ParentsMeetingMapper {

	List<StudentRespWithClass> searchStudentsByTeacherId(Integer id);

	List<PrentsMeetingRespDto> searchPrentsMeetingByTeacherId(Integer id);

	Integer searchClassIdByTeacherId(Integer id);

	List<StudentRespWithClass> searchStudentByClassId(Integer id);

	List<ParentsRespWithStudent> searchParentsPhoneByTeacherId(Integer id);

	String searchClassByTeacherId(Integer id);

	WtrjStudent searchWtrjStudent(String studentNo);

	List<WtrjEcomPmtNotice> searchParentsMeetingDetail(Integer id);

	PrentsMeetingRespDto searchParentsMeetingById(Integer id);

	

	

}
