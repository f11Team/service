package cn.com.wtrj.jx.web.portal.service.report;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtClassJunfenDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptScoreAnalysisDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolJunfenDto;

public interface IReportScoreService {

	List<MtSchoolJunfenDto> searchSchoolJunfen(Integer examInsId, Integer userId);

	List<MtClassJunfenDto> searchClassJunfen(String schoolCode, Integer examInsId);

	List<WtrjRptScoreDetail> searchStudentScores(String className, Integer examInsId);

	List<MtRptScoreAnalysisDto> selectScoreAnalysisData(Integer userId, String schoolCode, Integer examInsId);

}
