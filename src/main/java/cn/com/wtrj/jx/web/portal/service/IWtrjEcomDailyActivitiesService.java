package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivities;


/**
 * 日常活动接口
 * 
 * @author admin
 *
 */
public interface IWtrjEcomDailyActivitiesService {
	/**
	 * 查询日常活动集合
	 * @param stuIdCard
	 * @return
	 */
	List<WtrjEcomDailyActivities> searchDailyActivities(String stuIdCard);

	Boolean addDailyActivities(WtrjEcomDailyActivities wtrjEcomDailyActivities);
	
	String searchStudentNameByStudentNo(String studentNo);


	void deleteActive(Integer id);

	void updatePhoto(Integer id, String src);
}
