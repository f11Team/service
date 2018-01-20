package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanJiaoyanzu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiPlanJiaoyanzuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiPlanJiaoyanzuMapper {
    int countByExample(WtrjKpiPlanJiaoyanzuExample example);

    int deleteByExample(WtrjKpiPlanJiaoyanzuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiPlanJiaoyanzu record);

    int insertSelective(WtrjKpiPlanJiaoyanzu record);

    List<WtrjKpiPlanJiaoyanzu> selectByExample(WtrjKpiPlanJiaoyanzuExample example);

    WtrjKpiPlanJiaoyanzu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiPlanJiaoyanzu record, @Param("example") WtrjKpiPlanJiaoyanzuExample example);

    int updateByExample(@Param("record") WtrjKpiPlanJiaoyanzu record, @Param("example") WtrjKpiPlanJiaoyanzuExample example);

    int updateByPrimaryKeySelective(WtrjKpiPlanJiaoyanzu record);

    int updateByPrimaryKey(WtrjKpiPlanJiaoyanzu record);
}