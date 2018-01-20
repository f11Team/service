package cn.com.wtrj.jx.web.portal.service.notice;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNotice;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtNoticeSendStatus;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentNoticeSendStatus;

public interface IEcomNoticeService {
	void saveNotice(WtrjEcomNotice record);
	
	WtrjEcomNotice searchNoticeDetailById(Integer id);

	WtrjEcomNotice searchNoticeDetailByNoticeNo(String noticeNo);

	List<WtrjEcomNotice> searhNoticeByTeacherId(Integer userId);

	List<WtrjEcomNotice> searhTeacherNoticeByTeacherId(Integer userId);
	
	List<MtNoticeSendStatus> searchWxNoticeSendStatus(String noticeNo);
	
	List<MtNoticeSendStatus> searchShortMsgNoticeSendStatus(String msgCode);
	
	List<MtParentNoticeSendStatus> searchParentNoticeSendStatus(String msgCode);
}
