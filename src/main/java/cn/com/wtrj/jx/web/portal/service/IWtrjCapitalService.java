package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.CapitalBean;

/**
 * 资金报表业务逻辑接口层
 * 
 * @author jitao
 *
 */
public interface IWtrjCapitalService {

	/**
	 * 根据种类查询资金表的信息
	 * 
	 * @return 资金表的信息
	 */
	public List<CapitalBean> searchCapitalInfoByType(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate);

	/**
	 * 根据板块查询资金表的信息
	 * 
	 * @param type
	 *            资金表的种类
	 * @return 板块资金表信息
	 */
	public List<CapitalBean> searchCapitalInfoByProject(String type, int userId);

	/**
	 * 根据校区查询资金表的信息
	 * 
	 * @param project
	 *            板块
	 * @param type
	 *            种类
	 * @return 校区资金表信息
	 */
	public List<CapitalBean> searchCapitalInfoBySchool(String project, String type, int userId);
}
