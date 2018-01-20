package cn.com.wtrj.jx.web.portal.service.report;

import java.util.List;
import java.util.Map;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjOrg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtBusinessSegmentDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtSchoolDto;

public interface IReportService {

	/**
	 * 查询业务板块(财务)
	 * 
	 * @param userId
	 * @return
	 */
	List<MtBusinessSegmentDto> searchRoleOrgByUser(Integer userId);

	/**
	 * 查询学校(成绩)
	 * 
	 * @param userId
	 * @return
	 */
	List<MtSchoolDto> searchRoleSchoolByUser(Integer userId);

	/**
	 * 查询考试
	 * 
	 * @param cUserId
	 * @return
	 */
	List<WtrjRptScoreExamIns> searchRoleExamIns(Integer userId);

	/**
	 * 获取公司Map
	 * 
	 * @return
	 */
	Map<String, WtrjOrg> getOrgMap();

	/**
	 * 获取学校Map
	 * 
	 * @return
	 */
	Map<String, WtrjSchoolInfo> getSchoolMap();
}
