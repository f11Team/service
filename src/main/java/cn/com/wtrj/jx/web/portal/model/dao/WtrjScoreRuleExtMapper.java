package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRuleExt;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRuleExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjScoreRuleExtMapper {
    int countByExample(WtrjScoreRuleExtExample example);

    int deleteByExample(WtrjScoreRuleExtExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjScoreRuleExt record);

    int insertSelective(WtrjScoreRuleExt record);

    List<WtrjScoreRuleExt> selectByExample(WtrjScoreRuleExtExample example);

    WtrjScoreRuleExt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjScoreRuleExt record, @Param("example") WtrjScoreRuleExtExample example);

    int updateByExample(@Param("record") WtrjScoreRuleExt record, @Param("example") WtrjScoreRuleExtExample example);

    int updateByPrimaryKeySelective(WtrjScoreRuleExt record);

    int updateByPrimaryKey(WtrjScoreRuleExt record);
}