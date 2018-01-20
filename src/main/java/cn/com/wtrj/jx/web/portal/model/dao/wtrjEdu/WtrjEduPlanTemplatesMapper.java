package cn.com.wtrj.jx.web.portal.model.dao.wtrjEdu;

import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanTemplates;
import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanTemplatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEduPlanTemplatesMapper {
    int countByExample(WtrjEduPlanTemplatesExample example);

    int deleteByExample(WtrjEduPlanTemplatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEduPlanTemplates record);

    int insertSelective(WtrjEduPlanTemplates record);

    List<WtrjEduPlanTemplates> selectByExample(WtrjEduPlanTemplatesExample example);

    WtrjEduPlanTemplates selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEduPlanTemplates record, @Param("example") WtrjEduPlanTemplatesExample example);

    int updateByExample(@Param("record") WtrjEduPlanTemplates record, @Param("example") WtrjEduPlanTemplatesExample example);

    int updateByPrimaryKeySelective(WtrjEduPlanTemplates record);

    int updateByPrimaryKey(WtrjEduPlanTemplates record);
}