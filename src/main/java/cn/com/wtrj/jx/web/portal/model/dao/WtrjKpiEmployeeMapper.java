package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployeeExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiEmployeeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiEmployeeMapper {
    int countByExample(WtrjKpiEmployeeExample example);

    int deleteByExample(WtrjKpiEmployeeExample example);

    int deleteByPrimaryKey(WtrjKpiEmployeeKey key);

    int insert(WtrjKpiEmployee record);

    int insertSelective(WtrjKpiEmployee record);

    List<WtrjKpiEmployee> selectByExample(WtrjKpiEmployeeExample example);

    WtrjKpiEmployee selectByPrimaryKey(WtrjKpiEmployeeKey key);

    int updateByExampleSelective(@Param("record") WtrjKpiEmployee record, @Param("example") WtrjKpiEmployeeExample example);

    int updateByExample(@Param("record") WtrjKpiEmployee record, @Param("example") WtrjKpiEmployeeExample example);

    int updateByPrimaryKeySelective(WtrjKpiEmployee record);

    int updateByPrimaryKey(WtrjKpiEmployee record);
}