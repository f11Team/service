package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreDetailMapper {
    int countByExample(WtrjRptScoreDetailExample example);

    int deleteByExample(WtrjRptScoreDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptScoreDetail record);

    int insertSelective(WtrjRptScoreDetail record);

    List<WtrjRptScoreDetail> selectByExample(WtrjRptScoreDetailExample example);

    WtrjRptScoreDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreDetail record, @Param("example") WtrjRptScoreDetailExample example);

    int updateByExample(@Param("record") WtrjRptScoreDetail record, @Param("example") WtrjRptScoreDetailExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreDetail record);

    int updateByPrimaryKey(WtrjRptScoreDetail record);
}