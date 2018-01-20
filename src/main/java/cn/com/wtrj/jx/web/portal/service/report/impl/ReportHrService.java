package cn.com.wtrj.jx.web.portal.service.report.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.report.MtReportHrMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtStudentKaoqinDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtTeacherOrStudentDto;
import cn.com.wtrj.jx.web.portal.service.report.IReportHrService;

@Service
public class ReportHrService implements IReportHrService {

	@Autowired
	MtReportHrMapper mtMapper;

	@Override
	public List<MtStudentKaoqinDto> searchKaoqinData(String startDate, String endDate, String schoolCode,Integer userId) {
		Integer startYear = null;
		Integer startMonth = null;
		Integer endYear = null;
		Integer endMonth = null;
		Date stDate = null;
		Date enDate = null;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (startDate != "") {
				stDate = sdf.parse(startDate);
				calendar.setTime(stDate);
				startYear = calendar.get(Calendar.YEAR);
				startMonth = calendar.get(Calendar.MONTH);
			}
			if (endDate != "") {
				enDate = sdf.parse(endDate);
				calendar.setTime(enDate);
				endYear = calendar.get(Calendar.YEAR);
				endMonth = calendar.get(Calendar.MONTH);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mtMapper.searchKaoqinData(startYear, startMonth, endYear, endMonth, schoolCode,userId);
	}
	
	@Override
	public List<MtTeacherOrStudentDto>searchShishengBidui(Integer userId,String schoolCode){
		return mtMapper.searchShishengBidui(userId, schoolCode);
	}
}
