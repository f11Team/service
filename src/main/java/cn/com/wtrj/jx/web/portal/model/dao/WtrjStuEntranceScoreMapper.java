package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuEntranceScore;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuEntranceScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjStuEntranceScoreMapper {
    int countByExample(WtrjStuEntranceScoreExample example);

    int deleteByExample(WtrjStuEntranceScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjStuEntranceScore record);

    int insertSelective(WtrjStuEntranceScore record);

    List<WtrjStuEntranceScore> selectByExample(WtrjStuEntranceScoreExample example);

    WtrjStuEntranceScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjStuEntranceScore record, @Param("example") WtrjStuEntranceScoreExample example);

    int updateByExample(@Param("record") WtrjStuEntranceScore record, @Param("example") WtrjStuEntranceScoreExample example);

    int updateByPrimaryKeySelective(WtrjStuEntranceScore record);

    int updateByPrimaryKey(WtrjStuEntranceScore record);
}