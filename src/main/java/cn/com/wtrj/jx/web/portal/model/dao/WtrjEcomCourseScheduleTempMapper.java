package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomCourseScheduleTemp;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomCourseScheduleTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomCourseScheduleTempMapper {
    int countByExample(WtrjEcomCourseScheduleTempExample example);

    int deleteByExample(WtrjEcomCourseScheduleTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomCourseScheduleTemp record);

    int insertSelective(WtrjEcomCourseScheduleTemp record);

    List<WtrjEcomCourseScheduleTemp> selectByExample(WtrjEcomCourseScheduleTempExample example);

    WtrjEcomCourseScheduleTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomCourseScheduleTemp record, @Param("example") WtrjEcomCourseScheduleTempExample example);

    int updateByExample(@Param("record") WtrjEcomCourseScheduleTemp record, @Param("example") WtrjEcomCourseScheduleTempExample example);

    int updateByPrimaryKeySelective(WtrjEcomCourseScheduleTemp record);

    int updateByPrimaryKey(WtrjEcomCourseScheduleTemp record);
}