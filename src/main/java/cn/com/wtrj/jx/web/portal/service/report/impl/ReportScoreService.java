package cn.com.wtrj.jx.web.portal.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreDetailMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetailExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.report.MtScoreMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtClassJunfenDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptScoreAnalysisDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolJunfenDto;
import cn.com.wtrj.jx.web.portal.service.report.IReportScoreService;

@Service
public class ReportScoreService implements IReportScoreService {

	@Autowired
	private WtrjRptScoreDetailMapper scoreMapper;

	@Autowired
	private MtScoreMapper mtMapper;

	@Override
	public List<MtSchoolJunfenDto> searchSchoolJunfen(Integer examInsId, Integer userId) {
		return mtMapper.selectSchoolJunfenByUserId(examInsId, userId);
	}

	@Override
	public List<MtClassJunfenDto> searchClassJunfen(String schoolName, Integer examInsId) {
		return mtMapper.selectClassJunfen(schoolName, examInsId);
	}

	@Override
	public List<WtrjRptScoreDetail> searchStudentScores(String className, Integer examInsId) {
		WtrjRptScoreDetailExample example = new WtrjRptScoreDetailExample();
		example.createCriteria().andClassNameEqualTo(className).andExamInsIdEqualTo(examInsId);

		return scoreMapper.selectByExample(example);
	}

	@Override
	public List<MtRptScoreAnalysisDto> selectScoreAnalysisData(Integer userId, String schoolCode, Integer examInsId) {
		return mtMapper.selectScoreAnalysisData(userId, schoolCode, examInsId);
	}
}
