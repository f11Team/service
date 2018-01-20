package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreSumMapper {
    int countByExample(WtrjRptScoreSumExample example);

    int deleteByExample(WtrjRptScoreSumExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjRptScoreSum record);

    int insertSelective(WtrjRptScoreSum record);

    List<WtrjRptScoreSum> selectByExample(WtrjRptScoreSumExample example);

    WtrjRptScoreSum selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreSum record, @Param("example") WtrjRptScoreSumExample example);

    int updateByExample(@Param("record") WtrjRptScoreSum record, @Param("example") WtrjRptScoreSumExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreSum record);

    int updateByPrimaryKey(WtrjRptScoreSum record);
    
    List<String> findParentPhoneByStudentNameAndClassId( @Param("studentName") String studentName ,@Param("classId") String classId);

    Integer findSumClassOrderByInsIdAndStuName(@Param("stuName")String stuName,@Param("examInsId")String examInsId);

}