package cn.com.wtrj.jx.web.portal.service.rptScoreExamIns;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.service.dto.ScoreExamInsDto;

/**
 * 考次业务接口
 * 
 * @author admin
 *
 */
public interface IRptScoreExamInsService {
	/**
	 * 查找指定ID的学生参加过的考次列表
	 * 
	 * @param studentId
	 *            学生ID
	 * @return 考试列表
	 */
	List<WtrjRptScoreExamIns> searchByStudentNo(String studentNo, Integer classId);
	
	/**
	 * 查找指定ID的学生参加的考次类型列表
	 * @param studentNo
	 * @param classId
	 * @return
	 */
	List<WtrjRptScoreExamIns> findByStudentNo(String studentNo, Integer classId);

	/**
	 * 按条件查询考次列表(没有的参数可用null占位)
	 * 
	 * @param schoolYearCode
	 *            学年code
	 * @param schoolTermCode
	 *            学期code
	 * @param schoolCode
	 *            学校code
	 * @param grade
	 *            年级
	 * @param typeCode
	 *            考试类别
	 * @param sequence
	 *            第几次考试
	 * @return 考次集合(仅包含id和名称)
	 */
	List<WtrjRptScoreExamIns> searchByItems(String schoolYearCode, String schoolTermCode, String schoolCode, String grade,
			String typeCode, String classId, String courseCode, String createUserId, String searchType);

	List<WtrjRptScoreExamIns> searchInsByItems(String schoolYearCode, String schoolTermCode, String schoolCode, String grade,
			String typeCode, String classId, String courseCode, String examSeqCode,String createUserId, String searchType);

	
	/**
	 * 新增考次
	 * 
	 * @param record
	 */
	void add(WtrjRptScoreExamIns record);

	/**
	 * 删除指定id的考次
	 * 
	 * @param id
	 */
	void deleteById(int id);
	
	WtrjRptScoreExamIns findById(int id);
	
	/**
	 * 考次分页检索
	 * 
	 * @param start
	 * @param limit
	 * @param search
	 * @return
	 */
	List<WtrjRptScoreExamIns> searchExamInsByPage(Integer start, Integer end, Integer userId, String search);
	
	Integer countExamIns(Integer userId, String search);

}
