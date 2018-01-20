package cn.com.wtrj.jx.web.portal.model.mt.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtIndexDto;

public interface MtReportHomeMapper {

	List<MtIndexDto> searchRptIndex(@Param(value = "userId") Integer userId);
}
