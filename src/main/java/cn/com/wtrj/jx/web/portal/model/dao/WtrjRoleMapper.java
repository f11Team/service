package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRole;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRoleMapper {
    int countByExample(WtrjRoleExample example);

    int deleteByExample(WtrjRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjRole record);

    int insertSelective(WtrjRole record);

    List<WtrjRole> selectByExample(WtrjRoleExample example);

    WtrjRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjRole record, @Param("example") WtrjRoleExample example);

    int updateByExample(@Param("record") WtrjRole record, @Param("example") WtrjRoleExample example);

    int updateByPrimaryKeySelective(WtrjRole record);

    int updateByPrimaryKey(WtrjRole record);
}