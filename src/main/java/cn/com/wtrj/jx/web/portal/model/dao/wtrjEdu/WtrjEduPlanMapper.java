package cn.com.wtrj.jx.web.portal.model.dao.wtrjEdu;

import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlan;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEduPlanMapper {
    int countByExample(WtrjEduPlanExample example);

    int deleteByExample(WtrjEduPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEduPlan record);

    int insertSelective(WtrjEduPlan record);

    List<WtrjEduPlan> selectByExample(WtrjEduPlanExample example);

    WtrjEduPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEduPlan record, @Param("example") WtrjEduPlanExample example);

    int updateByExample(@Param("record") WtrjEduPlan record, @Param("example") WtrjEduPlanExample example);

    int updateByPrimaryKeySelective(WtrjEduPlan record);

    int updateByPrimaryKey(WtrjEduPlan record);
}