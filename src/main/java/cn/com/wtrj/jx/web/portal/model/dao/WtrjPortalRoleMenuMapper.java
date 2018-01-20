package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalRoleMenuExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjPortalRoleMenuMapper {
    int countByExample(WtrjPortalRoleMenuExample example);

    int deleteByExample(WtrjPortalRoleMenuExample example);

    int deleteByPrimaryKey(WtrjPortalRoleMenuKey key);

    int insert(WtrjPortalRoleMenuKey record);

    int insertSelective(WtrjPortalRoleMenuKey record);

    List<WtrjPortalRoleMenuKey> selectByExample(WtrjPortalRoleMenuExample example);

    int updateByExampleSelective(@Param("record") WtrjPortalRoleMenuKey record, @Param("example") WtrjPortalRoleMenuExample example);

    int updateByExample(@Param("record") WtrjPortalRoleMenuKey record, @Param("example") WtrjPortalRoleMenuExample example);
}