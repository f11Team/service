package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

public interface WtrjUserRoleMapper {
    int countByExample(WtrjUserRoleExample example);

    int deleteByExample(WtrjUserRoleExample example);

    int deleteByPrimaryKey(WtrjUserRoleKey key);

    int insert(WtrjUserRoleKey record);

    int insertSelective(WtrjUserRoleKey record);

    List<WtrjUserRoleKey> selectByExample(WtrjUserRoleExample example);

    int updateByExampleSelective(@Param("record") WtrjUserRoleKey record, @Param("example") WtrjUserRoleExample example);

    int updateByExample(@Param("record") WtrjUserRoleKey record, @Param("example") WtrjUserRoleExample example);
    
    String selectRoleByUserId(Integer id);
    
    
}