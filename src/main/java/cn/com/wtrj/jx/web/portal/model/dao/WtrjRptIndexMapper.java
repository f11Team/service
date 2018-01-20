package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndex;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptIndexMapper {
    int countByExample(WtrjRptIndexExample example);

    int deleteByExample(WtrjRptIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptIndex record);

    int insertSelective(WtrjRptIndex record);

    List<WtrjRptIndex> selectByExample(WtrjRptIndexExample example);

    WtrjRptIndex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptIndex record, @Param("example") WtrjRptIndexExample example);

    int updateByExample(@Param("record") WtrjRptIndex record, @Param("example") WtrjRptIndexExample example);

    int updateByPrimaryKeySelective(WtrjRptIndex record);

    int updateByPrimaryKey(WtrjRptIndex record);
}