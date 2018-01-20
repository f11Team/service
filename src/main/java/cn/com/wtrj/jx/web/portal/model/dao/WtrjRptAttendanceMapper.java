package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendance;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptAttendanceMapper {
    int countByExample(WtrjRptAttendanceExample example);

    int deleteByExample(WtrjRptAttendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptAttendance record);

    int insertSelective(WtrjRptAttendance record);

    List<WtrjRptAttendance> selectByExample(WtrjRptAttendanceExample example);

    WtrjRptAttendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptAttendance record, @Param("example") WtrjRptAttendanceExample example);

    int updateByExample(@Param("record") WtrjRptAttendance record, @Param("example") WtrjRptAttendanceExample example);

    int updateByPrimaryKeySelective(WtrjRptAttendance record);

    int updateByPrimaryKey(WtrjRptAttendance record);
}