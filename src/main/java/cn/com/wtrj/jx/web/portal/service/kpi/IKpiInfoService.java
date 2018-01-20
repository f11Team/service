package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoJw;

/**
 * 教师考核信息汇总
 *
 */
public interface IKpiInfoService {

	/**
	 * 分页检索教研组待评价教师
	 * 
	 * @param kpiInsId
	 *            绩效审核活动ID
	 * @param code
	 *            教研组编码
	 * @param start
	 *            开始条数
	 * @param end
	 *            结束条数
	 * @return
	 */
	public List<MtKpiInfoDto> searchKpiInfoJy(Integer kpiInsId, String code, Integer start, Integer end);

	public Integer countKpiInfoJy(Integer kpiInsId, String code);

	/**
	 * 分页检索年级组待评价教师
	 * 
	 * @param kpiInsId
	 *            绩效审核活动ID
	 * @param code
	 *            年级组编码
	 * @param start
	 *            开始条数
	 * @param end
	 *            结束条数
	 * @return
	 */
	public List<MtKpiInfoDto> searchKpiInfoNj(Integer kpiInsId, String code, Integer start, Integer end);

	public Integer countKpiInfoNj(Integer kpiInsId, String code);

	/**
	 * 分页检索教务处待评价教师
	 * 
	 * @param kpiInsId
	 *            绩效审核活动ID
	 * @param code
	 *            学校编码
	 * @param start
	 *            开始条数
	 * @param end
	 *            结束条数
	 * @return
	 */
	public List<MtKpiInfoDto> searchKpiInfoJw(Integer kpiInsId, String code, Integer start, Integer end);

	public Integer countKpiInfoJw(Integer kpiInsId, String code);

	public List<MtKpiInfoJw> searchKpiInfoJwEx(Integer kpiInsId, String code, Integer start, Integer end);
	
	/**
	 * 查询绩效考核汇总
	 * 
	 * @param kpiInsId
	 * @param code
	 * @param start
	 * @param end
	 * @return
	 */
	public List<MtKpiInfo> searchKpiInfo(Integer kpiInsId);
}
