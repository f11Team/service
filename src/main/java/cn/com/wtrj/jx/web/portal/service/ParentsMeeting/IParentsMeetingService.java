package cn.com.wtrj.jx.web.portal.service.ParentsMeeting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomParentsMeeting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.ParentsRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.PrentsMeetingRespDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentRespWithClass;
import me.chanjar.weixin.cp.api.WxCpService;

public interface IParentsMeetingService {

	List<StudentRespWithClass> searchStudentsByTeacherId(Integer id);

	List<PrentsMeetingRespDto> searchPrentsMeetingByTeacherId(Integer id);

	Integer searchClassIdByTeacherId(Integer id);

	void savePm(WtrjEcomParentsMeeting pmt);
	
	List<StudentRespWithClass> searchStudentByClassId(Integer id);

	void savePmtNotice(WtrjEcomPmtNotice pmtNotice);

	List<ParentsRespWithStudent> searchParentsPhoneByTeacherId(Integer id);

	String searchClassByTeacherId(Integer id);

	WtrjStudent searchWtrjStudent(String studentNo);

	List<WtrjEcomPmtNotice> searchParentsMeetingDetail(Integer id);

	PrentsMeetingRespDto searchParentsMeetingById(Integer id);

	void publishPt(WtrjEcomParentsMeeting pmt, String cardNo, String qtext, WxCpService wxCpService, String mediaId, String codeUrl, String appId,
			String seCret,String fileUrl, Integer agentid);

	



}
