package cn.com.wtrj.jx.web.portal.service.teacherInfo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherExample;
import cn.com.wtrj.jx.web.portal.service.teacherInfo.ITeacherInfoService;

@Service
public class TeacherInfoServiceImpl implements ITeacherInfoService{
	@Autowired
	private WtrjTeacherMapper wtrjTeacherMapper;
	@Override
	public WtrjTeacher searchParentsMeetingById(Integer id) {
		WtrjTeacher wtrjTeacher= wtrjTeacherMapper.selectByPrimaryKey(id);
		 if(wtrjTeacher!=null){
			 return wtrjTeacher;
		 }
		 return null;
	}
	@Override
	 @Transactional
	public void updateTeacherInfo(WtrjTeacher wtrjTeacher) {
		wtrjTeacherMapper.updateByPrimaryKeySelective(wtrjTeacher);
	}
	
	
	@Override
	public List<WtrjTeacher> serachAll() {
		WtrjTeacherExample example = new WtrjTeacherExample();
		return wtrjTeacherMapper.selectByExample(example );
	}
	

	
}