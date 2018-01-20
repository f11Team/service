package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjOrgMapper {
    int countByExample(WtrjOrgExample example);

    int deleteByExample(WtrjOrgExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjOrg record);

    int insertSelective(WtrjOrg record);

    List<WtrjOrg> selectByExample(WtrjOrgExample example);

    WtrjOrg selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjOrg record, @Param("example") WtrjOrgExample example);

    int updateByExample(@Param("record") WtrjOrg record, @Param("example") WtrjOrgExample example);

    int updateByPrimaryKeySelective(WtrjOrg record);

    int updateByPrimaryKey(WtrjOrg record);
}