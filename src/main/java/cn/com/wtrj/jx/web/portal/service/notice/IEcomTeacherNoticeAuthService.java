package cn.com.wtrj.jx.web.portal.service.notice;

import cn.com.wtrj.jx.web.portal.service.dto.notice.EcomPermisson;

public interface IEcomTeacherNoticeAuthService {
	
	/**
	 * 获取给家长/教师发送通知公告的权限
	 * 
	 * @param teacherId
	 * @return
	 */
	public EcomPermisson searchTeacherPermisson(Integer teacherId);
	
}
