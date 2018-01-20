package cn.com.wtrj.jx.web.portal.model.mt.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtClassJunfenDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptScoreAnalysisDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolJunfenDto;

public interface MtScoreMapper {

	public List<MtSchoolJunfenDto> selectSchoolJunfenByUserId(@Param(value = "examInsId") Integer examInsId, @Param(value = "userId") Integer userId);

	public List<MtClassJunfenDto> selectClassJunfen(@Param(value = "schoolCode") String schoolCode, @Param(value = "examInsId") Integer examInsId);

	public List<MtRptScoreAnalysisDto> selectScoreAnalysisData(@Param(value = "userId") Integer userId,
			@Param(value = "schoolCode") String schoolCode, @Param(value = "examInsId") Integer examInsId);
}
