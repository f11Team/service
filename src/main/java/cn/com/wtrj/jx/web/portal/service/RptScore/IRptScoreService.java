package cn.com.wtrj.jx.web.portal.service.RptScore;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtRptScoreDetail;


/**
 * 成绩业务接口
 * @author admin
 *
 */
public interface IRptScoreService {
	/**
	 * 按考次ID和学号查询学生各科成绩及班级成绩统计信息
	 * @param examId 考次ID
	 * @param studentNo 学号
	 * @return
	 */
	List<MtRptScoreDetail>searchScoreInfoByStudentAndExam(int examId,String studentNo);
	
	/**
	 * 按科目查询指定学号的学生近6次考试的成绩信息
	 * @param studentNo 学号
	 * @param subject 科目名称
	 * @return
	 */
	List<MtRptScoreDetail>searchByStudentAndSubject(String studentNo,String subject);

	List<Integer> findExamInsIdByTypeCode(String typeCode,String classId);

	WtrjRptScoreSingle findSingleScoreByStudentNameAndExamInsId(String examInsId,String stuName,String courseCode);
	
	List<WtrjRptScoreSingle> findAllScoreByStudentNameAndExamInsId(String examInsId,String stuName);
	
	Integer findSumClassOrderByInsIdAndStuName(String stuName,String examInsId);
}