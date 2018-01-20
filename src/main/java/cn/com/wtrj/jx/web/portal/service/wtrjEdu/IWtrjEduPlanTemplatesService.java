package cn.com.wtrj.jx.web.portal.service.wtrjEdu;

import cn.com.wtrj.jx.web.portal.model.entities.wtrjEdu.WtrjEduPlanTemplates;

import java.util.List;

public interface IWtrjEduPlanTemplatesService {

	int insert(WtrjEduPlanTemplates wtrjEduPlanTemplates);

	WtrjEduPlanTemplates get(Integer id);

	int update(WtrjEduPlanTemplates wtrjEduPlanTemplates);

	int delete(Integer id);

	List<WtrjEduPlanTemplates> getEduPlanTemplatesByPage(String type, Integer start, Integer end);

	int countGetEduPlanTemplatesByPage(String type);

	/**
	 * 逻辑删除
	 * 
	 * @param id
	 * @param delFalg
	 * @return
	 */
	int updateDelFlag(Integer id, String delFalg);
}
