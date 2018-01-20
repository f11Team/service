package cn.com.wtrj.jx.web.portal.model.mt.dao.attendance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.attendance.MtAttendance;

public interface MtAttendanceMapper {
	List<MtAttendance> searchAttByStNoAndAttTime(@Param(value="studentNo")String studentNo,@Param(value="attendanceTime")String attendanceTime);
}
