package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestAnswer;
import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WcsQuestAnswerMapper {
    long countByExample(WcsQuestAnswerExample example);

    int deleteByExample(WcsQuestAnswerExample example);

    int deleteByPrimaryKey(String id);

    int insert(WcsQuestAnswer record);

    int insertSelective(WcsQuestAnswer record);

    List<WcsQuestAnswer> selectByExample(WcsQuestAnswerExample example);

    WcsQuestAnswer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WcsQuestAnswer record, @Param("example") WcsQuestAnswerExample example);

    int updateByExample(@Param("record") WcsQuestAnswer record, @Param("example") WcsQuestAnswerExample example);

    int updateByPrimaryKeySelective(WcsQuestAnswer record);

    int updateByPrimaryKey(WcsQuestAnswer record);
    
    Integer findAnswerCountByCodeAndWcsClassNo(@Param("wcsClassNo")String wcsClassNo,@Param("code")String code,@Param("gradeNo")Integer gradeNo);
    
    Integer findAnswerCountByItemIdAndClassNo(@Param("classNo")String classNo,@Param("itemId")String itemId,@Param("gradeNo")Integer gradeNo);
}