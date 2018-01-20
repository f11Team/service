package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationship;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationshipExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjStuParentRelationshipMapper {
    Integer countByExample(WtrjStuParentRelationshipExample example);

    Integer deleteByExample(WtrjStuParentRelationshipExample example);

    Integer deleteByPrimaryKey(WtrjStuParentRelationshipKey key);

    Integer insert(WtrjStuParentRelationship record);

    Integer insertSelective(WtrjStuParentRelationship record);

    List<WtrjStuParentRelationship> selectByExample(WtrjStuParentRelationshipExample example);

    WtrjStuParentRelationship selectByPrimaryKey(WtrjStuParentRelationshipKey key);

    Integer updateByExampleSelective(@Param("record") WtrjStuParentRelationship record, @Param("example") WtrjStuParentRelationshipExample example);

    Integer updateByExample(@Param("record") WtrjStuParentRelationship record, @Param("example") WtrjStuParentRelationshipExample example);

    Integer updateByPrimaryKeySelective(WtrjStuParentRelationship record);

    Integer updateByPrimaryKey(WtrjStuParentRelationship record);
}