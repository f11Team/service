package cn.com.wtrj.jx.web.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjStuParentRelationshipMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationship;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationshipKey;
import cn.com.wtrj.jx.web.portal.service.IStuParentService;

@Service
public class StuParentService implements IStuParentService {

	@Autowired
	private WtrjStuParentRelationshipMapper stuparentMapper;
	
	@Override
	public void updSmsFlg(Integer studentId, Integer parentId, boolean flg) {
		WtrjStuParentRelationship record = new WtrjStuParentRelationship();
		record.setParentId(parentId);
		record.setStudentId(studentId);
		record.setBlAttendanceSms(flg?"1":"0");
		
		stuparentMapper.updateByPrimaryKey(record);
	}

	@Override
	public WtrjStuParentRelationship searchRelationShipInfo(Integer studentId, Integer parentId) {
		WtrjStuParentRelationshipKey key = new WtrjStuParentRelationshipKey();
		key.setParentId(parentId);
		key.setStudentId(studentId);
		
		return stuparentMapper.selectByPrimaryKey(key);
	}

}
