package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.SendScore;
import cn.com.wtrj.jx.web.portal.service.dto.Sms;

public interface ScoreNoticeService {
	
	public List<TeacherPermission> findTeacherClasses(Integer teacherId);
	
	public List<TeacherPermission> findRkTeacherClasses(Integer teacherId);
	
	public void sendScoreSumSmsByClassAndExamIns(Sms sms, String classId, String examInsId, String types);
	
	/**
	 * 调用接口服务发送短信通知
	 * 
	 * @param sms
	 * @param classId
	 * @param examInsId
	 * @param types
	 * @param notifyUrl
	 */
	public void sendScoreNoticeByApi(Sms sms, SendScore sendScore, String sendShortMsgUrl, String sendWxUrl);

	public void sendScoreSingle(Sms sms, Score score,String types);
	
	public List<Score> findStudentDetailScore(String classId, String examInsId, String studentName);
	
	public String searchSchoolCodeByExamInsId(Integer insId);
	
	public List<WtrjRptScoreSum> findScoreSum(String classId, String examInsId);
	
	public void updateScoreSum(WtrjRptScoreSum sum);
	
	public List<WtrjRptScoreDetail> findScoreDetail(Integer classId, Integer examInsId);

	List<Score> findScoreSumByClassAndExamIns(String classId, String examInsId);
	
	List<String> findParentPhoneByStudentNameAndClassId(String studentName , String classId);
	
	public List<Score> findSingleCourse(Score score);
	
	public List<Score> findSingleDetails(Score score);
	
	public List<WtrjRptMsg> selectMsgByMsgCode(String msgCode,Integer type);
	
	public List<WtrjRptScoreSingle> findScoreSingleByName(Integer examInsId,Integer classId,String name);
	
	public Integer findsumScoreRangeCount(Integer examInsId,Integer classId,Double startScore,Double endScore);
	
	public Integer findScienceScoreRangeCount(Integer examInsId,Integer classId,Double startScore,Double endScore);
	
	public Integer findArtsScoreRangeCount(Integer examInsId,Integer classId,Double startScore,Double endScore);

	public Integer findCourseScoreRangeCount(String examInsId,String classId,Double startScore,Double endScore,String courseCode);
	
	
}
