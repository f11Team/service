package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplate;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiTemplateMapper {
    int countByExample(WtrjKpiTemplateExample example);

    int deleteByExample(WtrjKpiTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiTemplate record);

    int insertSelective(WtrjKpiTemplate record);

    List<WtrjKpiTemplate> selectByExample(WtrjKpiTemplateExample example);

    WtrjKpiTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiTemplate record, @Param("example") WtrjKpiTemplateExample example);

    int updateByExample(@Param("record") WtrjKpiTemplate record, @Param("example") WtrjKpiTemplateExample example);

    int updateByPrimaryKeySelective(WtrjKpiTemplate record);

    int updateByPrimaryKey(WtrjKpiTemplate record);
}