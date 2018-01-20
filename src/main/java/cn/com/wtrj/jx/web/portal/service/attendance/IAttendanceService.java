package cn.com.wtrj.jx.web.portal.service.attendance;

import java.util.Date;
import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendance;
import cn.com.wtrj.jx.web.portal.model.mt.entities.attendance.MtAttendance;

public interface IAttendanceService {
	public List<MtAttendance> searchAttByStNoAndAttTime(String studentNo,String attendanceTime);

	public void saveAttendance(WtrjRptAttendance attendance);

	List<WtrjEcomSwipeCardRec> serachSwipeRecs(String studentNo, Date startDate, Date endDate);
}
