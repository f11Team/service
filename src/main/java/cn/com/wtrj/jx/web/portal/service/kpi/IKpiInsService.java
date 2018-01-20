package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiIns;

public interface IKpiInsService {

	/**
	 * 查询指定学校考核活动
	 * 
	 * @param schoolCode
	 * @return
	 */
	List<WtrjKpiIns> searchList(String schoolCode);

	/**
	 * 查询参与的考核活动
	 * 
	 * @param employeeId
	 * @return
	 */
	List<WtrjKpiIns> searchList(Integer employeeId);

	/**
	 * 分页查询指定学校考核活动
	 * 
	 * @param schoolCode
	 * @return
	 */
	List<MtKpiIns> searchPage(String schoolCode);

	/**
	 * 查询考核活动
	 * 
	 * @param id
	 *            考核活动ID
	 * @return
	 */
	WtrjKpiIns search(Integer id);

	/**
	 * 保存
	 * 
	 * @param pa
	 */
	void save(WtrjKpiIns pa);

	/**
	 * 删除
	 * 
	 * @param id
	 *            考核活动ID
	 */
	boolean delete(Integer id);

	/**
	 * 判断考核活动是否在有效期
	 * 
	 * @param id
	 *            考核活动ID
	 * @return 错误信息
	 */
	String checkInExpiry(Integer id);

}
