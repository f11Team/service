package cn.com.wtrj.jx.web.portal.service.phoneNumList.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomParentsMeetingMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomPmtNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.phoneNumList.PhoneNumListMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.DormTeacherRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.HeadTeacherRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.phoneNumList.SubjectTeacherRespWithStudent;
import cn.com.wtrj.jx.web.portal.service.phoneNumList.IPhoneNumListService;
@Service
public class PhoneNumListServiceImpl implements IPhoneNumListService {

	@Autowired
	private PhoneNumListMapper phoneNumListMapper;
	


	@Override
	public List<HeadTeacherRespWithStudent> searchHeadTeacherPhoneByParentId(Integer userId) {
		// TODO Auto-generated method stub
		return phoneNumListMapper.searchHeadTeacherPhoneByParentId(userId);
	}



	@Override
	public List<DormTeacherRespWithStudent> searchDormTeacherPhoneByParentId(Integer userId) {
		// TODO Auto-generated method stub
		return phoneNumListMapper.searchDormTeacherPhoneByParentId(userId);
	}



	@Override
	public List<SubjectTeacherRespWithStudent> searchSubjectTeacherPhoneByParentId(Integer userId) {
		// TODO Auto-generated method stub
		return phoneNumListMapper.searchSubjectTeacherPhoneByParentId(userId);
	}
	

	
	
	
}
