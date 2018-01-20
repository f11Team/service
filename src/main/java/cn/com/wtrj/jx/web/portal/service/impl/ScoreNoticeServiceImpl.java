package cn.com.wtrj.jx.web.portal.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.ScoreNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.ScoreUploadMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreDetailMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreExamInsMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSingleMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSumMapper;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetailExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSumExample;
import cn.com.wtrj.jx.web.portal.service.ScoreNoticeService;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.SendScore;
import cn.com.wtrj.jx.web.portal.service.dto.Sms;
import cn.com.wtrj.jx.web.portal.service.job.ScoreSmsByApiJob;
import cn.com.wtrj.jx.web.portal.service.job.ScoreSmsJob;

@Service
public class ScoreNoticeServiceImpl implements ScoreNoticeService {

	private final static ScheduledExecutorService msScheduler = Executors.newSingleThreadScheduledExecutor();
	
	@Autowired
	private ScoreNoticeMapper scoreNoticeMapper;
	
	@Autowired
	private WtrjRptScoreExamInsMapper examMapper;
	
	@Autowired
	private WtrjRptScoreSumMapper scoreMapper;
	
	@Autowired
	private WtrjRptScoreDetailMapper detailMapper;
	
	@Autowired
	private ScoreUploadMapper scoreUploadMapper;
	
	@Autowired
	private SmsService smsService;
	
	@Autowired
	private WtrjRptScoreSingleMapper singleMapper;
	
	
	
	@Override
	public List<TeacherPermission> findTeacherClasses(Integer teacherId) {
		return scoreNoticeMapper.findTeacherClasses(teacherId);
	}

	@Override
	public void sendScoreSumSmsByClassAndExamIns(Sms sms, String classId, String examInsId, String types) {
		List<Score> ss = scoreNoticeMapper.findScoreSumByClassAndExamIns(classId, examInsId);
		msScheduler.schedule(new ScoreSmsJob(this, ss, types, false, sms), 10, TimeUnit.SECONDS);
	}
	
	@Override
	public void sendScoreNoticeByApi(Sms sms, SendScore sendScore,
			String sendShortMsgUrl, String sendWxUrl) {
		List<Score> ss = scoreNoticeMapper.findScoreSumByClassAndExamIns(sendScore.getClassId(), sendScore.getExamInsId());
		msScheduler.schedule(new ScoreSmsByApiJob(this, smsService, ss, sendScore, false, sms, sendShortMsgUrl, sendWxUrl), 10, TimeUnit.SECONDS);
	}
	
	@Override
	public void sendScoreSingle(Sms sms, Score score,String types) {
		List<Score> ss = scoreUploadMapper.findSingleCourse(score);
		//为每个学生添加最高分和平均分
		if(ss != null && ss.size() > 0) {
			for(int i = 0; i < ss.size(); i++) {
				ss.get(i).setAverageNumber(score.getAverageNumber());
				ss.get(i).setClassTopScore(score.getClassTopScore());
			}
		}
		msScheduler.schedule(new ScoreSmsJob(this, ss, types, true, sms), 10, TimeUnit.SECONDS);
	}
	
	@Override
	public List<Score> findScoreSumByClassAndExamIns(String classId, String examInsId) {
		List<Score> ss = scoreNoticeMapper.findScoreSumByClassAndExamIns(classId, examInsId);
		return ss;
	}

	@Override
	public List<Score> findStudentDetailScore(String classId, String examInsId, String studentName) {
		return scoreNoticeMapper.findStudentDetailScore(classId, examInsId, studentName);
	}

	@Override
	public String searchSchoolCodeByExamInsId(Integer insId) {
		WtrjRptScoreExamIns ins = examMapper.selectByPrimaryKey(insId);
		if (ins != null) {
			return ins.getSchoolCode();
		}
		
		return null;
	}

	@Override
	public List<WtrjRptScoreSum> findScoreSum(String classId, String examInsId) {
		WtrjRptScoreSumExample example = new WtrjRptScoreSumExample();
		example.createCriteria().andClassIdEqualTo(classId).andExamInsIdEqualTo(examInsId);
		example.setOrderByClause("order_number asc");
		
		return scoreMapper.selectByExample(example);
	}
	
	@Override
	public void updateScoreSum(WtrjRptScoreSum sum) {
		scoreMapper.updateByPrimaryKey(sum);
	}

	@Override
	public List<WtrjRptScoreDetail> findScoreDetail(Integer classId, Integer examInsId) {
		WtrjRptScoreDetailExample example = new WtrjRptScoreDetailExample();
		example.createCriteria().andClassIdEqualTo(classId).andExamInsIdEqualTo(examInsId).andFlagEqualTo("1");
		
		return detailMapper.selectByExample(example);
	}

	@Override
	public List<String> findParentPhoneByStudentNameAndClassId(String studentName , String classId) {
		return scoreMapper.findParentPhoneByStudentNameAndClassId(studentName, classId);
	}

	@Override
	public List<TeacherPermission> findRkTeacherClasses(Integer teacherId) {
		return scoreNoticeMapper.findRkTeacherClasses(teacherId);
	}

	@Override
	public List<Score> findSingleCourse(Score score) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findSingleDetails(Score score) {
		List<Score> ss = scoreUploadMapper.findSingleCourse(score);
		return ss;
	}


	@Override
	public List<WtrjRptMsg> selectMsgByMsgCode(String msgCode, Integer type) {
		return smsService.selectMsgByMsgCode(msgCode, type);
	}

	@Override
	public List<WtrjRptScoreSingle> findScoreSingleByName(Integer examInsId, Integer classId, String name) {
		return singleMapper.findSingleScoreByName(examInsId, classId, name);
		
	}

	@Override
	public Integer findsumScoreRangeCount(Integer examInsId, Integer classId, Double startScore, Double endScore) {
		return scoreUploadMapper.findsumScoreRangeCount(String.valueOf(examInsId), String.valueOf(classId), startScore, endScore);
	}

	@Override
	public Integer findScienceScoreRangeCount(Integer examInsId, Integer classId, Double startScore, Double endScore) {
		return scoreUploadMapper.findScienceScoreRangeCount(String.valueOf(examInsId), String.valueOf(classId), startScore, endScore);
	}

	@Override
	public Integer findArtsScoreRangeCount(Integer examInsId, Integer classId, Double startScore, Double endScore) {
		return scoreUploadMapper.findArtsScoreRangeCount(String.valueOf(examInsId), String.valueOf(classId), startScore, endScore);
	}

	@Override
	public Integer findCourseScoreRangeCount(String examInsId, String classId, Double startScore, Double endScore,
			String courseCode) {
		return scoreUploadMapper.findCourseScoreRangeCount(examInsId, classId, startScore, endScore, courseCode);
	}

	
	
	
	
}
