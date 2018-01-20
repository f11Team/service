package cn.com.wtrj.jx.web.portal.model.mt.dao.wtrjEdu;


import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanTemplates;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WtrjMtEduPlanTemplatesMapper {

    List<WtrjEduPlanTemplates> getEduPlanTemplatesByPage(@Param("type") String type, @Param("start") Integer start,@Param("end") Integer end);


    int countGetEduPlanTemplatesByPage(@Param("type") String type);
}
