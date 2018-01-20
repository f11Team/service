package cn.com.wtrj.jx.web.portal.service.report;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtStudentKaoqinDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtTeacherOrStudentDto;

public interface IReportHrService {

	List<MtStudentKaoqinDto> searchKaoqinData(String startDate, String endDate,	String schoolCode,Integer userId);
	
	List<MtTeacherOrStudentDto> searchShishengBidui(Integer userId,String schoolCode);

}
