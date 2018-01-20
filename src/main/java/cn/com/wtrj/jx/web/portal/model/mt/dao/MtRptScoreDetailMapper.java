package cn.com.wtrj.jx.web.portal.model.mt.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetailExample;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtRptScoreDetail;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtRptScoreDetailMapper {
    
    List<MtRptScoreDetail> searchScoreInfoByStudentAndExam(@Param(value="examId")int examId,@Param(value="studentNo")String studenNo);
    
    /**
     * 按考次、科目和学生查询班级平均分
     * @param score
     * @return
     */
    Double selectAverageScore(MtRptScoreDetail score);
    
    /**
	 * 按科目查询指定学号的学生在最近6次考试中指定科目的成绩信息
	 * @param studentNo 学号
	 * @param subject 科目名称
	 * @return
	 */
	List<MtRptScoreDetail>searchByStudentAndSubject(@Param(value="studentNo")String studentNo,@Param(value="subject")String subject);

	List<Integer> findExamInsIdByTypeCode(@Param("typeCode")String typeCode,@Param("classId")String classId);
	
}