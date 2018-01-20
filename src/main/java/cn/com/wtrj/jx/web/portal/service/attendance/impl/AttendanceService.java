package cn.com.wtrj.jx.web.portal.service.attendance.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomSwipeCardRecMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptAttendanceMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRecExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptAttendance;
import cn.com.wtrj.jx.web.portal.model.mt.dao.attendance.MtAttendanceMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.attendance.MtAttendance;
import cn.com.wtrj.jx.web.portal.service.attendance.IAttendanceService;

@Service
public class AttendanceService implements IAttendanceService {
	@Autowired
	private MtAttendanceMapper mtAttendanceMapper;
	
	@Autowired
	private WtrjRptAttendanceMapper wtrjRptAttendanceMapper;
	
	@Autowired
	private WtrjEcomSwipeCardRecMapper swipeCardMapper;

	/**
	 * 根据学号和日期查询考勤详情
	 */
	@Override
	public List<MtAttendance> searchAttByStNoAndAttTime(String studentNo, String attendanceTime) {
		return mtAttendanceMapper.searchAttByStNoAndAttTime(studentNo, attendanceTime);
	}

	/**
	 * 存储考勤记录
	 */
	@Override
	public void saveAttendance(WtrjRptAttendance attendance) {
		wtrjRptAttendanceMapper.insert(attendance);
	}
	
	
	@Override
	public List<WtrjEcomSwipeCardRec> serachSwipeRecs(String studentNo, Date startDate, Date endDate) {
		
		WtrjEcomSwipeCardRecExample example = new WtrjEcomSwipeCardRecExample();
		example.createCriteria().andSwipeTimeBetween(startDate, endDate).andNoEqualTo(studentNo).andFlagEqualTo("0");
		example.setOrderByClause("swipe_time desc");
		
		return swipeCardMapper.selectByExample(example );
	}
}
