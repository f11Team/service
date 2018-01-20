package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreDetailExpt;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreDetailExptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjScoreDetailExptMapper {
    int countByExample(WtrjScoreDetailExptExample example);

    int deleteByExample(WtrjScoreDetailExptExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjScoreDetailExpt record);

    int insertSelective(WtrjScoreDetailExpt record);

    List<WtrjScoreDetailExpt> selectByExample(WtrjScoreDetailExptExample example);

    WtrjScoreDetailExpt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjScoreDetailExpt record, @Param("example") WtrjScoreDetailExptExample example);

    int updateByExample(@Param("record") WtrjScoreDetailExpt record, @Param("example") WtrjScoreDetailExptExample example);

    int updateByPrimaryKeySelective(WtrjScoreDetailExpt record);

    int updateByPrimaryKey(WtrjScoreDetailExpt record);
}