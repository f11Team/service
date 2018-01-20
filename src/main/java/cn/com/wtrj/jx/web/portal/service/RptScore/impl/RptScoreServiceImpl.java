package cn.com.wtrj.jx.web.portal.service.RptScore.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSingleMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSumMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtRptScoreDetailMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtRptScoreDetail;
import cn.com.wtrj.jx.web.portal.service.RptScore.IRptScoreService;

@Service
public class RptScoreServiceImpl implements IRptScoreService {
	
	@Autowired
	private MtRptScoreDetailMapper scoreDetailMapper;
	@Autowired
	private WtrjRptScoreSingleMapper scoreSingleMapper;
	@Autowired
	private WtrjRptScoreSumMapper scoreSumMapper;
	
	@Override
	public List<MtRptScoreDetail> searchScoreInfoByStudentAndExam(int examId, String studentNo) {
		List<MtRptScoreDetail> list = scoreDetailMapper.searchScoreInfoByStudentAndExam(examId, studentNo);
		for (MtRptScoreDetail score : list) {
			// 查询设置优秀分
			score.setClassAverageScore(scoreDetailMapper.selectAverageScore(score));
		}
		return list;
	}
	

	@Override
	public List<MtRptScoreDetail> searchByStudentAndSubject(String studentNo, String subject) {
		return scoreDetailMapper.searchByStudentAndSubject(studentNo, subject);
	}

	/**
	 * 查询考次
	 */
	@Override
	public List<Integer> findExamInsIdByTypeCode(String typeCode,String classId) {
		return scoreDetailMapper.findExamInsIdByTypeCode(typeCode,classId);
	}


	@Override
	public WtrjRptScoreSingle findSingleScoreByStudentNameAndExamInsId(String examInsId, String stuName,String courseCode) {
		return scoreSingleMapper.findSingleScoreByStudentNameAndExamInsId(examInsId, stuName,courseCode);
	}


	@Override
	public List<WtrjRptScoreSingle> findAllScoreByStudentNameAndExamInsId(String examInsId, String stuName) {
		return scoreSingleMapper.findAllScoreByStudentNameAndExamInsId(examInsId, stuName);
	}


	@Override
	public Integer findSumClassOrderByInsIdAndStuName(String stuName, String examInsId) {
		return scoreSumMapper.findSumClassOrderByInsIdAndStuName(stuName, examInsId);
	}
	
}