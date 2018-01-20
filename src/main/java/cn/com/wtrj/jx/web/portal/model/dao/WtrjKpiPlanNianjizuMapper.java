package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanNianjizu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanNianjizuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiPlanNianjizuMapper {
    int countByExample(WtrjKpiPlanNianjizuExample example);

    int deleteByExample(WtrjKpiPlanNianjizuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiPlanNianjizu record);

    int insertSelective(WtrjKpiPlanNianjizu record);

    List<WtrjKpiPlanNianjizu> selectByExample(WtrjKpiPlanNianjizuExample example);

    WtrjKpiPlanNianjizu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiPlanNianjizu record, @Param("example") WtrjKpiPlanNianjizuExample example);

    int updateByExample(@Param("record") WtrjKpiPlanNianjizu record, @Param("example") WtrjKpiPlanNianjizuExample example);

    int updateByPrimaryKeySelective(WtrjKpiPlanNianjizu record);

    int updateByPrimaryKey(WtrjKpiPlanNianjizu record);
}