package cn.com.wtrj.jx.web.portal.service.notice;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassParentDto;
import cn.com.wtrj.jx.web.portal.service.dto.NoticeClassDto;
import cn.com.wtrj.jx.web.portal.service.dto.NoticeGradeDto;
import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeParentPermisson;

public interface IEcomParentNoticeAuthService {
	
	public List<NoticeGradeDto> searchNoticeAuthGradeInfo(Integer teacherId);
	
	public List<NoticeClassDto> searchParentClassInfo(Integer teacherId); 
	
	public List<MtClassParentDto> searchParentInfo(String schoolCode, Integer stage, Integer grade, Integer classNo);
	
	/**
	 * 获取给家长发送通知公告的权限
	 * 
	 * @param teacherId
	 * @return
	 */
	public NoticeParentPermisson searchParentPermisson(Integer teacherId);
	
}
