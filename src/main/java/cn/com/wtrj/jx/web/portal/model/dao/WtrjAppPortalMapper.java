package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjAppPortal;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjAppPortalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjAppPortalMapper {
    int countByExample(WtrjAppPortalExample example);

    int deleteByExample(WtrjAppPortalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjAppPortal record);

    int insertSelective(WtrjAppPortal record);

    List<WtrjAppPortal> selectByExample(WtrjAppPortalExample example);

    WtrjAppPortal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjAppPortal record, @Param("example") WtrjAppPortalExample example);

    int updateByExample(@Param("record") WtrjAppPortal record, @Param("example") WtrjAppPortalExample example);

    int updateByPrimaryKeySelective(WtrjAppPortal record);

    int updateByPrimaryKey(WtrjAppPortal record);
}