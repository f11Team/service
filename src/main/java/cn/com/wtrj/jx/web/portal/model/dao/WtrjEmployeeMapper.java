package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEmployeeMapper {
    int countByExample(WtrjEmployeeExample example);

    int deleteByExample(WtrjEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEmployee record);

    int insertSelective(WtrjEmployee record);

    List<WtrjEmployee> selectByExample(WtrjEmployeeExample example);

    WtrjEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEmployee record, @Param("example") WtrjEmployeeExample example);

    int updateByExample(@Param("record") WtrjEmployee record, @Param("example") WtrjEmployeeExample example);

    int updateByPrimaryKeySelective(WtrjEmployee record);

    int updateByPrimaryKey(WtrjEmployee record);
}