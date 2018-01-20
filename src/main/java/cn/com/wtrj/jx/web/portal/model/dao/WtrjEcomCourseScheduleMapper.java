package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomCourseSchedule;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomCourseScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomCourseScheduleMapper {
    int countByExample(WtrjEcomCourseScheduleExample example);

    int deleteByExample(WtrjEcomCourseScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomCourseSchedule record);

    int insertSelective(WtrjEcomCourseSchedule record);

    List<WtrjEcomCourseSchedule> selectByExample(WtrjEcomCourseScheduleExample example);

    WtrjEcomCourseSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomCourseSchedule record, @Param("example") WtrjEcomCourseScheduleExample example);

    int updateByExample(@Param("record") WtrjEcomCourseSchedule record, @Param("example") WtrjEcomCourseScheduleExample example);

    int updateByPrimaryKeySelective(WtrjEcomCourseSchedule record);

    int updateByPrimaryKey(WtrjEcomCourseSchedule record);
}