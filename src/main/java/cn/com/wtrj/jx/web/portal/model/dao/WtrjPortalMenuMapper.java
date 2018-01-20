package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalMenu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjPortalMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjPortalMenuMapper {
    int countByExample(WtrjPortalMenuExample example);

    int deleteByExample(WtrjPortalMenuExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjPortalMenu record);

    int insertSelective(WtrjPortalMenu record);

    List<WtrjPortalMenu> selectByExample(WtrjPortalMenuExample example);

    WtrjPortalMenu selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjPortalMenu record, @Param("example") WtrjPortalMenuExample example);

    int updateByExample(@Param("record") WtrjPortalMenu record, @Param("example") WtrjPortalMenuExample example);

    int updateByPrimaryKeySelective(WtrjPortalMenu record);

    int updateByPrimaryKey(WtrjPortalMenu record);
}