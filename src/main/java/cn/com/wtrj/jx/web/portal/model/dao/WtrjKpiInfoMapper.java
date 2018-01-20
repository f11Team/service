package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiInfoMapper {
    int countByExample(WtrjKpiInfoExample example);

    int deleteByExample(WtrjKpiInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiInfo record);

    int insertSelective(WtrjKpiInfo record);

    List<WtrjKpiInfo> selectByExample(WtrjKpiInfoExample example);

    WtrjKpiInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiInfo record, @Param("example") WtrjKpiInfoExample example);

    int updateByExample(@Param("record") WtrjKpiInfo record, @Param("example") WtrjKpiInfoExample example);

    int updateByPrimaryKeySelective(WtrjKpiInfo record);

    int updateByPrimaryKey(WtrjKpiInfo record);
}