package cn.com.wtrj.jx.web.portal.service.impl;



import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjStuParentRelationshipMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjStudentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationship;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.mt.entities.LoginParentStudentInfoBean;
import cn.com.wtrj.jx.web.portal.service.ModifyInformationService;

@Service
public class ModifyInformationServiceImpl implements ModifyInformationService {
	//学生信息	
	@Autowired
	private WtrjStudentMapper wtrjStudentMapper;
	//家长信息
	@Autowired
	private WtrjParentMapper wtrjParentMapper;
	//称谓
	@Autowired
	private WtrjStuParentRelationshipMapper wtrjStuParentRelationshipMapper;
	/**
	 * 保存家长学生修改的信息
	 */
	@Override
	@Transactional
	public boolean studentParentUpdate(LoginParentStudentInfoBean loginParentStudentInfoBean) {
		//学生信息
		WtrjStudent wtrjStudent = new WtrjStudent();
		//家长信息
		WtrjParent wtrjParent = new WtrjParent();
		//称谓信息
		WtrjStuParentRelationship wspr = new WtrjStuParentRelationship();
		//保存学生信息
		wtrjStudent.setId(loginParentStudentInfoBean.getStuId());
		wtrjStudent.setName(loginParentStudentInfoBean.getStuName());
		/*wtrjStudent.setSex(loginParentStudentInfoBean.getStuSex());*/
		wtrjStudent.setGradeNo(loginParentStudentInfoBean.getStuGrade());
		
		
		//保存家长信息
		wtrjParent.setId(loginParentStudentInfoBean.getParentId());
		wtrjParent.setName(loginParentStudentInfoBean.getParentName());
		//保存称谓
		wspr.setParentId(loginParentStudentInfoBean.getParentId());
		wspr.setStudentId(loginParentStudentInfoBean.getStuId());
		wspr.setAppellation(loginParentStudentInfoBean.getAppellation());
		
		//修改学生信息
		wtrjStudentMapper.updateByPrimaryKeySelective(wtrjStudent);
		
		// 修改第二个学生信息
		if (StringUtils.isNotEmpty(loginParentStudentInfoBean.getStuIdCard1())) {
			WtrjStudent wtrjStudent1 = new WtrjStudent();
			
			wtrjStudent1.setId(loginParentStudentInfoBean.getStuId1());
			wtrjStudent1.setName(loginParentStudentInfoBean.getStuName1());
			/*wtrjStudent1.setSex(loginParentStudentInfoBean.getStuSex1());*/
			wtrjStudent1.setGradeNo(loginParentStudentInfoBean.getStuGrade1());
			
			wtrjStudentMapper.updateByPrimaryKeySelective(wtrjStudent1);
		}
		
		//修改家长信息
		wtrjParentMapper.updateByPrimaryKeySelective(wtrjParent);
		//修改称谓
		wtrjStuParentRelationshipMapper.updateByPrimaryKeySelective(wspr);

		return true;
	}

	@Override
	public int studentParentAdd() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 添加先查询学生是否存在
	 */
	@Override
	public Long stuParentAddSelect(WtrjStudent wsd) {
		WtrjStudentExample wtrjStudentExample = new WtrjStudentExample();
		Criteria criteria = wtrjStudentExample.createCriteria();
		criteria.andIdCardNumberEqualTo(wsd.getIdCardNumber());
		List<WtrjStudent>  wtrjStudent = wtrjStudentMapper.selectByExample(wtrjStudentExample);
		if(CollectionUtils.isEmpty(wtrjStudent)){
			return null;
		}
		return Long.valueOf(wtrjStudent.get(0).getId());
	}
}
