package cn.com.wtrj.jx.web.portal.service.report;

import java.util.List;

import cn.com.wtrj.jx.web.portal.service.response.report.AnalysisDataRet;

public interface IReportAnalysisService {

	public List<AnalysisDataRet> searchNcAnalysisInfo(Integer userId, Integer year, Integer month,String startDate,String endDate);

}
