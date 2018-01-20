package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtExpectedBean;

/**
 * 
 * @author VI
 *
 */
public interface ExpectedMapper {

	/**
	 * 查询预期目标分析数据
	 */
	public List<MtExpectedBean> searchExpectedGoal(@Param(value = "year") Integer year, @Param(value = "userId") Integer userId,
			@Param(value = "segementCode") String segementCode, @Param(value = "orgCode") String orgCode);

}
