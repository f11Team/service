package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreKnowledge;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreKnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreKnowledgeMapper {
    int countByExample(WtrjRptScoreKnowledgeExample example);

    int deleteByExample(WtrjRptScoreKnowledgeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptScoreKnowledge record);

    int insertSelective(WtrjRptScoreKnowledge record);

    List<WtrjRptScoreKnowledge> selectByExample(WtrjRptScoreKnowledgeExample example);

    WtrjRptScoreKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreKnowledge record, @Param("example") WtrjRptScoreKnowledgeExample example);

    int updateByExample(@Param("record") WtrjRptScoreKnowledge record, @Param("example") WtrjRptScoreKnowledgeExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreKnowledge record);

    int updateByPrimaryKey(WtrjRptScoreKnowledge record);
}