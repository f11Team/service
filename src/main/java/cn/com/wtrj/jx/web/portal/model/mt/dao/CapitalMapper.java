package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.CapitalBean;

/**
 * 资金报表Mapper
 * 
 * @author jitao
 *
 */
public interface CapitalMapper {
	/**
	 * 根据种类查询资金表的信息
	 * 
	 * @return 资金表的信息
	 */
	public List<CapitalBean> searchCapitalInfoByType(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode,
			@Param(value = "startDate") String startDate, @Param(value = "endDate") String endDate);

	/**
	 * 根据板块查询资金表的信息
	 * 
	 * @param type
	 *            资金表的种类
	 * @return 板块资金表信息
	 */
	public List<CapitalBean> searchCapitalInfoByProject(@Param(value = "type") String type, @Param(value = "userId") Integer userId);

	/**
	 * 根据校区查询资金表的信息
	 * 
	 * @param project
	 *            板块
	 * @param type
	 *            种类
	 * @return 校区资金表信息
	 */
	public List<CapitalBean> searchCapitalInfoBySchool(@Param(value = "project") String project, @Param(value = "type") String type,
			@Param(value = "userId") Integer userId);
}
