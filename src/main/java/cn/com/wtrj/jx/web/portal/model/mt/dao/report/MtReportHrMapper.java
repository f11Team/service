package cn.com.wtrj.jx.web.portal.model.mt.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtStudentKaoqinDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtTeacherOrStudentDto;

public interface MtReportHrMapper {
	List<MtStudentKaoqinDto> searchKaoqinData(@Param(value = "startYear") Integer startYear,@Param(value = "startMonth") Integer startMonth,
			@Param(value = "endYear") Integer endYear,@Param(value = "endMonth") Integer endMonth,@Param(value = "schoolCode") String schoolCode,
			@Param(value = "userId") Integer userId);
	
	List<MtTeacherOrStudentDto>searchShishengBidui(@Param(value = "userId") Integer userId,@Param(value = "schoolCode") String schoolCode);
}
