package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleNcRelationshipExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleNcRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRoleNcRelationshipMapper {
    int countByExample(WtrjRoleNcRelationshipExample example);

    int deleteByExample(WtrjRoleNcRelationshipExample example);

    int deleteByPrimaryKey(WtrjRoleNcRelationshipKey key);

    int insert(WtrjRoleNcRelationshipKey record);

    int insertSelective(WtrjRoleNcRelationshipKey record);

    List<WtrjRoleNcRelationshipKey> selectByExample(WtrjRoleNcRelationshipExample example);

    int updateByExampleSelective(@Param("record") WtrjRoleNcRelationshipKey record, @Param("example") WtrjRoleNcRelationshipExample example);

    int updateByExample(@Param("record") WtrjRoleNcRelationshipKey record, @Param("example") WtrjRoleNcRelationshipExample example);
}