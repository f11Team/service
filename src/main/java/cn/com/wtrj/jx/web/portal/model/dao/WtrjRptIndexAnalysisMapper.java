package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexAnalysis;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptIndexAnalysisMapper {
    int countByExample(WtrjRptIndexAnalysisExample example);

    int deleteByExample(WtrjRptIndexAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptIndexAnalysis record);

    int insertSelective(WtrjRptIndexAnalysis record);

    List<WtrjRptIndexAnalysis> selectByExample(WtrjRptIndexAnalysisExample example);

    WtrjRptIndexAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptIndexAnalysis record, @Param("example") WtrjRptIndexAnalysisExample example);

    int updateByExample(@Param("record") WtrjRptIndexAnalysis record, @Param("example") WtrjRptIndexAnalysisExample example);

    int updateByPrimaryKeySelective(WtrjRptIndexAnalysis record);

    int updateByPrimaryKey(WtrjRptIndexAnalysis record);
}