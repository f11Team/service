package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptRoleIndex;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptRoleIndexExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptRoleIndexKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptRoleIndexMapper {
    int countByExample(WtrjRptRoleIndexExample example);

    int deleteByExample(WtrjRptRoleIndexExample example);

    int deleteByPrimaryKey(WtrjRptRoleIndexKey key);

    int insert(WtrjRptRoleIndex record);

    int insertSelective(WtrjRptRoleIndex record);

    List<WtrjRptRoleIndex> selectByExample(WtrjRptRoleIndexExample example);

    WtrjRptRoleIndex selectByPrimaryKey(WtrjRptRoleIndexKey key);

    int updateByExampleSelective(@Param("record") WtrjRptRoleIndex record, @Param("example") WtrjRptRoleIndexExample example);

    int updateByExample(@Param("record") WtrjRptRoleIndex record, @Param("example") WtrjRptRoleIndexExample example);

    int updateByPrimaryKeySelective(WtrjRptRoleIndex record);

    int updateByPrimaryKey(WtrjRptRoleIndex record);
}