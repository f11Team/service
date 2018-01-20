package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionRelation;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomPermissionRelationMapper {
    int countByExample(WtrjEcomPermissionRelationExample example);

    int deleteByExample(WtrjEcomPermissionRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjEcomPermissionRelation record);

    int insertSelective(WtrjEcomPermissionRelation record);

    List<WtrjEcomPermissionRelation> selectByExample(WtrjEcomPermissionRelationExample example);

    WtrjEcomPermissionRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjEcomPermissionRelation record, @Param("example") WtrjEcomPermissionRelationExample example);

    int updateByExample(@Param("record") WtrjEcomPermissionRelation record, @Param("example") WtrjEcomPermissionRelationExample example);

    int updateByPrimaryKeySelective(WtrjEcomPermissionRelation record);

    int updateByPrimaryKey(WtrjEcomPermissionRelation record);
}