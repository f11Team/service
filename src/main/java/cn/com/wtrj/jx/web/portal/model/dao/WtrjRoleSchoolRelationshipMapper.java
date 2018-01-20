package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleSchoolRelationshipExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleSchoolRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRoleSchoolRelationshipMapper {
    int countByExample(WtrjRoleSchoolRelationshipExample example);

    int deleteByExample(WtrjRoleSchoolRelationshipExample example);

    int deleteByPrimaryKey(WtrjRoleSchoolRelationshipKey key);

    int insert(WtrjRoleSchoolRelationshipKey record);

    int insertSelective(WtrjRoleSchoolRelationshipKey record);

    List<WtrjRoleSchoolRelationshipKey> selectByExample(WtrjRoleSchoolRelationshipExample example);

    int updateByExampleSelective(@Param("record") WtrjRoleSchoolRelationshipKey record, @Param("example") WtrjRoleSchoolRelationshipExample example);

    int updateByExample(@Param("record") WtrjRoleSchoolRelationshipKey record, @Param("example") WtrjRoleSchoolRelationshipExample example);
}