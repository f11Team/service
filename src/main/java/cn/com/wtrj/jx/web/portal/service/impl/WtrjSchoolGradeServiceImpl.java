package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolGradeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtSchoolGradeMapper;
import cn.com.wtrj.jx.web.portal.service.IWtrjSchoolGradeService;

@Service
public class WtrjSchoolGradeServiceImpl implements IWtrjSchoolGradeService {
	@Autowired
	private WtrjSchoolGradeMapper schoolGradeMapper;

	@Autowired
	private MtSchoolGradeMapper mtSchoolGradeMapper;

	@Override
	public List<Integer> searchStageBySchool(String schoolCode) {
		return mtSchoolGradeMapper.searchStageBySchool(schoolCode);
	}

	@Override
	public List<Integer> searchGradeBySchoolAndStage(String schoolCode, int stage) {
		// TODO Auto-generated method stub
		return mtSchoolGradeMapper.searchGradeBySchoolAndStage(schoolCode, stage);
	}

	@Override
	public List<Integer> searchStageBySchoolCode(List<Integer> schoolCodes) {
		return mtSchoolGradeMapper.searchStageBySchoolCode(schoolCodes);
	}

	@Override
	public List<Integer> searchGradeByStage(Integer stage, List<Integer> schoolCodes) {
		return mtSchoolGradeMapper.searchGradeByStage(stage, schoolCodes);
	}

	@Override
	public String findSchoolCodeBySchoolCodesAndStage(List<Integer> schoolCodes, Integer stage) {
		// TODO Auto-generated method stub
		return mtSchoolGradeMapper.findSchoolCodeBySchoolCodesAndStage(schoolCodes, stage);
	}
}
