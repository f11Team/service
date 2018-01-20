package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendanceMonth;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendanceMonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptAttendanceMonthMapper {
    int countByExample(WtrjRptAttendanceMonthExample example);

    int deleteByExample(WtrjRptAttendanceMonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptAttendanceMonth record);

    int insertSelective(WtrjRptAttendanceMonth record);

    List<WtrjRptAttendanceMonth> selectByExample(WtrjRptAttendanceMonthExample example);

    WtrjRptAttendanceMonth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptAttendanceMonth record, @Param("example") WtrjRptAttendanceMonthExample example);

    int updateByExample(@Param("record") WtrjRptAttendanceMonth record, @Param("example") WtrjRptAttendanceMonthExample example);

    int updateByPrimaryKeySelective(WtrjRptAttendanceMonth record);

    int updateByPrimaryKey(WtrjRptAttendanceMonth record);
}