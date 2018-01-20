package cn.com.wtrj.jx.web.portal.model.mt.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtNcAnalysisDto;

public interface MtNcAnalysisMapper {

	List<MtNcAnalysisDto> selectNcAnalysisInfo(@Param(value = "userId") Integer userId, @Param(value = "year") Integer year,
			@Param(value = "month") Integer month,@Param(value = "startDate") String startDate,@Param(value = "endDate") String endDate);

}
