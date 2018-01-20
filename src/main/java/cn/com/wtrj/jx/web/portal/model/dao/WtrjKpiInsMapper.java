package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiInsMapper {
    int countByExample(WtrjKpiInsExample example);

    int deleteByExample(WtrjKpiInsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiIns record);

    int insertSelective(WtrjKpiIns record);

    List<WtrjKpiIns> selectByExample(WtrjKpiInsExample example);

    WtrjKpiIns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiIns record, @Param("example") WtrjKpiInsExample example);

    int updateByExample(@Param("record") WtrjKpiIns record, @Param("example") WtrjKpiInsExample example);

    int updateByPrimaryKeySelective(WtrjKpiIns record);

    int updateByPrimaryKey(WtrjKpiIns record);
}