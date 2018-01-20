package cn.com.wtrj.jx.web.portal.service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationship;

public interface IStuParentService {
	public void updSmsFlg(Integer studentId, Integer parentId, boolean flg);
	
	public WtrjStuParentRelationship searchRelationShipInfo(Integer studentId, Integer parentId);
}
