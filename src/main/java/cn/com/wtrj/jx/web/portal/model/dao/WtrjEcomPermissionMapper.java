package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomPermissionMapper {
    int countByExample(WtrjEcomPermissionExample example);

    int deleteByExample(WtrjEcomPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomPermission record);

    int insertSelective(WtrjEcomPermission record);

    List<WtrjEcomPermission> selectByExample(WtrjEcomPermissionExample example);

    WtrjEcomPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomPermission record, @Param("example") WtrjEcomPermissionExample example);

    int updateByExample(@Param("record") WtrjEcomPermission record, @Param("example") WtrjEcomPermissionExample example);

    int updateByPrimaryKeySelective(WtrjEcomPermission record);

    int updateByPrimaryKey(WtrjEcomPermission record);
}