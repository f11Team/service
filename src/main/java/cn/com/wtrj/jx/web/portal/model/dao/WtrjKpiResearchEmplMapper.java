package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiResearchEmplExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiResearchEmplKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiResearchEmplMapper {
    int countByExample(WtrjKpiResearchEmplExample example);

    int deleteByExample(WtrjKpiResearchEmplExample example);

    int deleteByPrimaryKey(WtrjKpiResearchEmplKey key);

    int insert(WtrjKpiResearchEmplKey record);

    int insertSelective(WtrjKpiResearchEmplKey record);

    List<WtrjKpiResearchEmplKey> selectByExample(WtrjKpiResearchEmplExample example);

    int updateByExampleSelective(@Param("record") WtrjKpiResearchEmplKey record, @Param("example") WtrjKpiResearchEmplExample example);

    int updateByExample(@Param("record") WtrjKpiResearchEmplKey record, @Param("example") WtrjKpiResearchEmplExample example);
}