package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;

/**
 * 考次持久层接口
 * 
 * @author admin
 *
 */
public interface MtRptScoreExamInsMapper {
	/**
	 * 查找指定ID的学生参加过的考次列表
	 * 
	 * @param studentNo
	 *            学号
	 * @return 考试列表
	 */
	List<WtrjRptScoreExamIns> searchByStudentNo(@Param(value="studentNo")String studentNo, @Param(value="classId")Integer classId);
	
	List<WtrjRptScoreExamIns> findByStudentNo(@Param(value="studentNo")String studentNo, @Param(value="classId")Integer classId);
	
	List<WtrjRptScoreExamIns> selectExamInsByPage(@Param(value="start") Integer start, @Param(value="end") Integer end,@Param(value="userId") Integer userId, @Param(value="search") String search);

	Integer countExamIns(@Param(value="userId") Integer userId,  @Param(value="search") String search);
	
	
	List<WtrjRptScoreExamIns> findExamIns(@Param(value="schoolYearCode") String schoolYearCode, @Param(value="schoolTermCode") String schoolTermCode, @Param(value="schoolCode") String schoolCode,
			@Param(value="grade") String grade,
			@Param(value="typeCode") String typeCode, @Param(value="classId") String classId, @Param(value="courseCode") String courseCode, @Param(value="createUserId") String createUserId,
			@Param(value="searchType") String searchType);
	
	List<WtrjRptScoreExamIns> findExamInses(@Param(value="schoolYearCode") String schoolYearCode, @Param(value="schoolTermCode") String schoolTermCode, @Param(value="schoolCode") String schoolCode,
			@Param(value="grade") String grade,
			@Param(value="typeCode") String typeCode, @Param(value="classId") String classId, @Param(value="courseCode") String courseCode,
			@Param(value="examSeqCode") String examSeqCode, @Param(value="createUserId") String createUserId,
			@Param(value="searchType") String searchType);
}
