package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplate;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiTemplate;

/**
 * WtrjKpiTemplate类业务操作接口层
 *
 */
public interface IKpiTemplateService {

	/**
	 * 查询指定条件模板
	 * 
	 * @param schoolCode
	 *            学校编码（可选）
	 * @param tmplType
	 *            模板类型（可选） 1：自评 2：教研组评 3：年级组评 4：教务处评
	 * @return
	 */
	List<MtKpiTemplate> find(String schoolCode, String tmplType);

	/**
	 * 通过模板编码查询对应模板信息
	 * 
	 * @param kpiInsId
	 *            考核活动ID（必须）
	 * @param tmplType
	 *            模板类型（可选） 1：自评 2：教研组评 3：年级组评 4：教务处评
	 * @return
	 */
	List<WtrjKpiTemplate> find(Integer kpiInsId, String tmplType);

	/**
	 * 通过模板编码查询对应模板信息
	 * 
	 * @param tmplCode
	 *            模板编码
	 * @return
	 */
	List<WtrjKpiTemplate> find(String tmplCode);

	/**
	 * 查找模板项目
	 * 
	 * @param id
	 * @return
	 */
	WtrjKpiTemplate findByPkey(Integer id);

	/**
	 * 模板删除
	 * 
	 * @param tmplCode
	 */
	boolean deleteTmpl(String tmplCode);

	/**
	 * 修改模板(模板名、类型)
	 * 
	 * @param param
	 */
	void updateTmpl(MtKpiTemplate param);

	/**
	 * 模板保存
	 * 
	 * @param params
	 */
	void save(List<WtrjKpiTemplate> params);

	/**
	 * 删除模板项目
	 * 
	 * @param id
	 */
	void deleteItems(Integer id);
}
