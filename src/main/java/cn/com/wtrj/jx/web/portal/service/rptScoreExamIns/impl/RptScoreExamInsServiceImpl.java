package cn.com.wtrj.jx.web.portal.service.rptScoreExamIns.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreExamInsMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtRptScoreExamInsMapper;
import cn.com.wtrj.jx.web.portal.service.rptScoreExamIns.IRptScoreExamInsService;

@Service
public class RptScoreExamInsServiceImpl implements IRptScoreExamInsService {
	@Autowired
	private MtRptScoreExamInsMapper examMapper;
	@Autowired
	private WtrjRptScoreExamInsMapper examInsMapper;

	@Override
	public List<WtrjRptScoreExamIns> searchByStudentNo(String studentNo, Integer classId) {

		return examMapper.searchByStudentNo(studentNo, classId);
	}

	@Override
	public List<WtrjRptScoreExamIns> searchByItems(String schoolYearCode, String schoolTermCode, String schoolCode,
			String grade, String typeCode, String classId, String courseCode, String createUserId, String searchType) {
		
		List<WtrjRptScoreExamIns> rptExamList = examMapper.findExamIns(schoolYearCode, schoolTermCode, schoolCode, grade, typeCode, classId, courseCode, createUserId, searchType);
		return rptExamList;
	}

	@Override
	@Transactional
	public void add(WtrjRptScoreExamIns record) {
		examInsMapper.insertSelective(record);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		examInsMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<WtrjRptScoreExamIns> searchExamInsByPage(Integer start, Integer end, Integer userId, String search) {
		return examMapper.selectExamInsByPage(start, end, userId, search);
	}

	@Override
	public Integer countExamIns(Integer userId, String search) {
		
		return examMapper.countExamIns(userId,search);
	}

	@Override
	public List<WtrjRptScoreExamIns> searchInsByItems(String schoolYearCode, String schoolTermCode, String schoolCode,
			String grade, String typeCode, String classId, String courseCode, String examSeqCode, String createUserId,
			String searchType) {
		return examMapper.findExamInses(schoolYearCode, schoolTermCode, schoolCode, grade, typeCode, classId, courseCode,examSeqCode, createUserId, searchType);
	}

	@Override
	public WtrjRptScoreExamIns findById(int id) {
		return examInsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<WtrjRptScoreExamIns> findByStudentNo(String studentNo, Integer classId) {
		return examMapper.findByStudentNo(studentNo, classId);
	}
}
