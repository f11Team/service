package cn.com.wtrj.jx.web.portal.service.report;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptIndexAnalysisDto;
import cn.com.wtrj.jx.web.portal.service.response.report.RptIndexRet;

public interface IReportHomeService {

	/**
	 * 检索用户可见指标
	 * 
	 * @param userId
	 * @return
	 */
	RptIndexRet searchRptIndex(Integer userId);

	/**
	 * 保存用户分析结果
	 */
	void saveRptIndexAnalysis(MtRptIndexAnalysisDto param);

	/**
	 * 检索用户最新分析结果
	 */
	MtRptIndexAnalysisDto searchRptIndexAnalysisOnLast(Integer userIndexId);
}
