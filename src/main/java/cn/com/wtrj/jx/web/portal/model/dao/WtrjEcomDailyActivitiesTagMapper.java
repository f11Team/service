package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTag;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomDailyActivitiesTagMapper {
    int countByExample(WtrjEcomDailyActivitiesTagExample example);

    int deleteByExample(WtrjEcomDailyActivitiesTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomDailyActivitiesTag record);

    int insertSelective(WtrjEcomDailyActivitiesTag record);

    List<WtrjEcomDailyActivitiesTag> selectByExample(WtrjEcomDailyActivitiesTagExample example);

    WtrjEcomDailyActivitiesTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomDailyActivitiesTag record, @Param("example") WtrjEcomDailyActivitiesTagExample example);

    int updateByExample(@Param("record") WtrjEcomDailyActivitiesTag record, @Param("example") WtrjEcomDailyActivitiesTagExample example);

    int updateByPrimaryKeySelective(WtrjEcomDailyActivitiesTag record);

    int updateByPrimaryKey(WtrjEcomDailyActivitiesTag record);
}