package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseSchedule;

public interface MtCourseScheduleMapper {
	List<MtCourseSchedule> searchByStudentAndWeek(@Param("studentId") int id, @Param("odevity") int odevity,
			@Param("courseTime") Date courseTime);

	List<MtCourseSchedule> searchCourseSchedule(@Param("studentId") int studentId,
			@Param("courseTime") Date courseTime);
}
