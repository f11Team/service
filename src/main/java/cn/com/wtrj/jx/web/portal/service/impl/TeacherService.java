package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.teacher.MtTeacherMapper;
import cn.com.wtrj.jx.web.portal.service.ITeacherService;

@Service
public class TeacherService implements ITeacherService {
	
	@Autowired
	private WtrjTeacherMapper teacherMapper;

	@Autowired
	private MtTeacherMapper mtTeacherMapper;
	
	@Override
	public WtrjTeacher searchTeacherByPhone(String phone) {
		WtrjTeacherExample example = new WtrjTeacherExample();
		example.createCriteria().andPhoneEqualTo(phone);
		List<WtrjTeacher> teachers = teacherMapper.selectByExample(example);
		
		if (teachers != null && teachers.size() > 0) {
			return teachers.get(0);
		}
		
		return null;
	}

	/**
	 * 查询指定学生对应的班主任信息
	 */
	@Override
	public List<WtrjTeacher> selectTeacherByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return teacherMapper.selectTeacherByStudentId(studentId);
	}
	
	
	
	@Override
	public WtrjTeacher findHeadTeacherByStudentId(Integer studentId, String teacherType) {
		return mtTeacherMapper.findHeadTeacherByStudentId(studentId,teacherType);
	}

	@Override
	public WtrjTeacher findTeacherById(Integer id) {
		return mtTeacherMapper.findTeacherById(id);
	}

	@Override
	public Set<String> findTeacherEduPlanPemission(String phone) {
		
		//查询教师信息，判断是否为任课教师、备课组长或教研组长
		
		WtrjTeacher t = mtTeacherMapper.findTeacherByPhone(phone);
		
		Set<String> set = null;
		
		if(t != null) {
			set = new HashSet<String>();
			
			if("01".equals(t.getType())) {
				set.add("isRk");
			}
			
			if("1".equals(t.getBlCourseLeader())) {
				set.add("isBk");
			}
			
			if("1".equals(t.getBlResearchLeader())) {
				set.add("isJy");
			}
			
		}
		
		return set;
	}

	@Override
	public List<String> findTeacherInfoByPhones(List<String> phones) {
		List<String> jobNos = new ArrayList<String>();
		
		WtrjTeacherExample example = new WtrjTeacherExample();
		example.createCriteria().andPhoneIn(phones);
		List<WtrjTeacher> teachers = teacherMapper.selectByExample(example);
		if (teachers != null) {
			for (WtrjTeacher record : teachers) {
				jobNos.add(record.getJobNumber());
			}
		}
		
		return jobNos;
	}

	

}
