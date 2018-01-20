package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRangeRule;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRangeRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjScoreRangeRuleMapper {
    long countByExample(WtrjScoreRangeRuleExample example);

    int deleteByExample(WtrjScoreRangeRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjScoreRangeRule record);

    int insertSelective(WtrjScoreRangeRule record);

    List<WtrjScoreRangeRule> selectByExample(WtrjScoreRangeRuleExample example);

    WtrjScoreRangeRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WtrjScoreRangeRule record, @Param("example") WtrjScoreRangeRuleExample example);

    int updateByExample(@Param("record") WtrjScoreRangeRule record, @Param("example") WtrjScoreRangeRuleExample example);

    int updateByPrimaryKeySelective(WtrjScoreRangeRule record);

    int updateByPrimaryKey(WtrjScoreRangeRule record);
    
    List<WtrjScoreRangeRule> selectAll();
    
    List<WtrjScoreRangeRule> findScoreRangeRuleByName(@Param("name")String name);
    
    int deleteByName(@Param("name")String name);
}