package cn.com.wtrj.jx.web.portal.model.mt.dao.phoneNumList;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomParentsMeeting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.ParentsRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.PrentsMeetingRespDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentRespWithClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.DormTeacherRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.HeadTeacherRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.SubjectTeacherRespWithStudent;

public interface PhoneNumListMapper {


	List<HeadTeacherRespWithStudent> searchHeadTeacherPhoneByParentId(Integer userId);

	List<DormTeacherRespWithStudent> searchDormTeacherPhoneByParentId(Integer userId);

	List<SubjectTeacherRespWithStudent> searchSubjectTeacherPhoneByParentId(Integer userId);

	


}
