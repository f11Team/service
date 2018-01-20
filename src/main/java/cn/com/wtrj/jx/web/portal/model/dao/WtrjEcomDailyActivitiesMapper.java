package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivities;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomDailyActivitiesMapper {
    int countByExample(WtrjEcomDailyActivitiesExample example);

    int deleteByExample(WtrjEcomDailyActivitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomDailyActivities record);

    int insertSelective(WtrjEcomDailyActivities record);

    List<WtrjEcomDailyActivities> selectByExample(WtrjEcomDailyActivitiesExample example);

    WtrjEcomDailyActivities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomDailyActivities record, @Param("example") WtrjEcomDailyActivitiesExample example);

    int updateByExample(@Param("record") WtrjEcomDailyActivities record, @Param("example") WtrjEcomDailyActivitiesExample example);

    int updateByPrimaryKeySelective(WtrjEcomDailyActivities record);

    int updateByPrimaryKey(WtrjEcomDailyActivities record);
}