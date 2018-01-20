package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.Date;
import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.ClassSchoolDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomClassMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomDailyActivitiesTagMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTag;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTagExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtEcomClassMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtDormBackDelay;
import cn.com.wtrj.jx.web.portal.service.IWtrjEcomClassService;
import cn.com.wtrj.jx.web.portal.service.IWtrjTaxService;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class WtrjClassServiceImpl implements IWtrjEcomClassService {
	@Autowired
	MtEcomClassMapper ecomClassMapper;
	@Autowired
	WtrjEcomClassMapper classMapper;
	
	@Override
	public List<WtrjEcomClass> searchClassByTeacherId(Integer teacherId) {
		return ecomClassMapper.searchClassByTeacherId(teacherId);
	}
	@Override
	public List<MtDormBackDelay> searchDormBackDelayById(Integer classId) {
		
		return ecomClassMapper.searchDormBackDelayById(classId);
	}
	@Override
	public void informationToHeadTeacher(int parseInt) {
		ecomClassMapper.informationToHeadTeacher(parseInt);
		
	}
	@Override
	public List<MtDormBackDelay> headTeacherSearchDormBackDelay(Integer teacherId) {
		return ecomClassMapper.headTeacherSearchDormBackDelay(teacherId);
	}
	@Override
	public String selectStudentNoById(int id) {
		return ecomClassMapper.selectStudentNoById(id);
	}
	@Override
	public MtDormBackDelay searchMtDormBackDelayByStudentNo(String studentNo) {
		return ecomClassMapper.searchMtDormBackDelayByStudentNo(studentNo);
	}
	@Override
	public List<WtrjEcomClass> searchClassBySchoolAndStageAndGrade(List<Integer> schoolCodes, int stage, int grade) {
		 List<WtrjEcomClass> records = ecomClassMapper.searchBySchoolCodesAndStageAndGrade(schoolCodes, stage, grade);
		 for (WtrjEcomClass record : records) {
			 record.setClassName(record.getClassNo()+"班");
		}
		return records;
	}
	
	@Override
	public WtrjEcomClass searchById(int id) {
		return classMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ClassSchoolDto> getEcomClassBySchoolCode(String schoolCode) {
		return ecomClassMapper.getEcomClassBySchoolCode(schoolCode);
	}
	@Override
	public void informationToHouseholder(String studentNoStr) {
		ecomClassMapper.informationToHouseholder(studentNoStr);		
	}

}
