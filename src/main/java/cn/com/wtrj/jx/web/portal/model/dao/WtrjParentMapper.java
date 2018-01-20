package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjParentMapper {
    int countByExample(WtrjParentExample example);

    int deleteByExample(WtrjParentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjParent record);

    int insertSelective(WtrjParent record);

    List<WtrjParent> selectByExample(WtrjParentExample example);

    WtrjParent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjParent record, @Param("example") WtrjParentExample example);

    int updateByExample(@Param("record") WtrjParent record, @Param("example") WtrjParentExample example);

    int updateByPrimaryKeySelective(WtrjParent record);

    int updateByPrimaryKey(WtrjParent record);
}