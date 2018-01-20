package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoAttach;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiInfoAttachMapper {
    int countByExample(WtrjKpiInfoAttachExample example);

    int deleteByExample(WtrjKpiInfoAttachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiInfoAttach record);

    int insertSelective(WtrjKpiInfoAttach record);

    List<WtrjKpiInfoAttach> selectByExample(WtrjKpiInfoAttachExample example);

    WtrjKpiInfoAttach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiInfoAttach record, @Param("example") WtrjKpiInfoAttachExample example);

    int updateByExample(@Param("record") WtrjKpiInfoAttach record, @Param("example") WtrjKpiInfoAttachExample example);

    int updateByPrimaryKeySelective(WtrjKpiInfoAttach record);

    int updateByPrimaryKey(WtrjKpiInfoAttach record);
}