package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamInsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreExamInsMapper {
    int countByExample(WtrjRptScoreExamInsExample example);

    int deleteByExample(WtrjRptScoreExamInsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptScoreExamIns record);

    int insertSelective(WtrjRptScoreExamIns record);

    List<WtrjRptScoreExamIns> selectByExample(WtrjRptScoreExamInsExample example);

    WtrjRptScoreExamIns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreExamIns record, @Param("example") WtrjRptScoreExamInsExample example);

    int updateByExample(@Param("record") WtrjRptScoreExamIns record, @Param("example") WtrjRptScoreExamInsExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreExamIns record);

    int updateByPrimaryKey(WtrjRptScoreExamIns record);
}