package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseSchedule;

/**
 * 课程表业务接口
 * @author admin
 *
 */
public interface ICourseScheduleSerivice {
	
	List<MtCourseSchedule>searchByStudentAndWeek(int studentId,int odevity);

	List<MtCourseSchedule> searchCourseSchedule(int studentId);
}
