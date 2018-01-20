package cn.com.wtrj.jx.web.portal.model.mt.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtBusinessSegmentDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolDto;

public interface MtReportMapper {

	List<MtBusinessSegmentDto> searchRoleOrgByUser(@Param(value = "userId") Integer userId);

	List<MtSchoolDto> searchRoleSchoolByUser(@Param(value = "userId") Integer userId);

	List<WtrjRptScoreExamIns> searchRoleExamIns(@Param(value = "userId") Integer userId);
}
