package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreSingleMapper {
    long countByExample(WtrjRptScoreSingleExample example);

    int deleteByExample(WtrjRptScoreSingleExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjRptScoreSingle record);

    int insertSelective(WtrjRptScoreSingle record);

    List<WtrjRptScoreSingle> selectByExample(WtrjRptScoreSingleExample example);

    WtrjRptScoreSingle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreSingle record, @Param("example") WtrjRptScoreSingleExample example);

    int updateByExample(@Param("record") WtrjRptScoreSingle record, @Param("example") WtrjRptScoreSingleExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreSingle record);

    int updateByPrimaryKey(WtrjRptScoreSingle record);
    
    int deleteScoreSingle(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
    
    int deleteAllScoreSingle(@Param("examInsId") int examInsId,  @Param("classId") int classId);
    
    List<WtrjRptScoreSingle> selectByInsIdAndClassIdAndCourseCode(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
    
    int findSingleClassAvgScore(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
    
    int findSingleClassMinScore(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
    
    WtrjRptScoreSingle findSingleClassAvgByScoreMulti(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);

    List<WtrjRptScoreSingle> findSingleByGradeIdAndInsIdAndCourseCode(@Param("examInsId") int examInsId,@Param("grade") int grade,@Param("courseCode") String courseCode);

    List<WtrjRptScoreSingle> findSingleScoreByName(@Param("examInsId") int examInsId,  @Param("classId") int classId,@Param("name") String name);
    
    double findSingleGradeAvgScore(@Param("examInsId") int examInsId,@Param("grade") int grade,@Param("courseCode") String courseCode);
    
    double findSingleGradeMinScore(@Param("examInsId") int examInsId,@Param("grade") int grade,@Param("courseCode") String courseCode);
    
    double findSingleGradeAvgScoreA(@Param("examInsId") int examInsId,@Param("grade") int grade,@Param("courseCode") String courseCode);
    
    double findSingleGradeAvgScoreB(@Param("examInsId") int examInsId,@Param("grade") int grade,@Param("courseCode") String courseCode);

    WtrjRptScoreSingle findSingleScoreByStudentNameAndExamInsId(@Param("examInsId")String examInsId,@Param("stuName")String stuName,@Param("courseCode")String courseCode);
    
    List<WtrjRptScoreSingle> findAllScoreByStudentNameAndExamInsId(@Param("examInsId")String examInsId,@Param("stuName")String stuName);
    
}