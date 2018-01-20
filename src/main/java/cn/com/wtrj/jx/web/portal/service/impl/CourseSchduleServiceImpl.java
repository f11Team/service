package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.MtCourseScheduleMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseSchedule;
import cn.com.wtrj.jx.web.portal.service.ICourseScheduleSerivice;

@Service
public class CourseSchduleServiceImpl implements ICourseScheduleSerivice {
	@Autowired
	private MtCourseScheduleMapper mapper;

	@Override
	public List<MtCourseSchedule> searchByStudentAndWeek(int studentId, int odevity) {
		return mapper.searchByStudentAndWeek(studentId, odevity, Calendar.getInstance().getTime());
	}

	// 查询课程表
	@Override
	public List<MtCourseSchedule> searchCourseSchedule(int studentId) {
		return mapper.searchCourseSchedule(studentId, Calendar.getInstance().getTime());
	}

}
