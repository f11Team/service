package cn.com.wtrj.jx.web.portal.model.mt.dao.personalHomepage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivities;

public interface DailyActivitiesMapper {

	List<WtrjEcomDailyActivities> searchDailyActivities(String stuIdCard);

	void deleteActive(Integer id);

	void updatePhoto(@Param("id")Integer id, @Param("src")String src);

	
	

	

}
