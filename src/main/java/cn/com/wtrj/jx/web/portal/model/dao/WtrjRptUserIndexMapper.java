package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptUserIndex;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptUserIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptUserIndexMapper {
    int countByExample(WtrjRptUserIndexExample example);

    int deleteByExample(WtrjRptUserIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptUserIndex record);

    int insertSelective(WtrjRptUserIndex record);

    List<WtrjRptUserIndex> selectByExample(WtrjRptUserIndexExample example);

    WtrjRptUserIndex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptUserIndex record, @Param("example") WtrjRptUserIndexExample example);

    int updateByExample(@Param("record") WtrjRptUserIndex record, @Param("example") WtrjRptUserIndexExample example);

    int updateByPrimaryKeySelective(WtrjRptUserIndex record);

    int updateByPrimaryKey(WtrjRptUserIndex record);
}