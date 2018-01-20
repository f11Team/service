package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoDto;

public interface MtKpiInfoMapper {
	// 教研组
	public Integer countKpiInfoJy(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "jiaoyanzuCode") String jiaoyanzuCode);

	public List<MtKpiInfoDto> selectKpiInfoJy(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "jiaoyanzuCode") String jiaoyanzuCode, @Param(value = "start") Integer start,
			@Param(value = "end") Integer end);

	// 年级组
	public Integer countKpiInfoNj(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "nianjizuCode") String nianjizuCode);

	public List<MtKpiInfoDto> selectKpiInfoNj(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "nianjizuCode") String nianjizuCode, @Param(value = "start") Integer start,
			@Param(value = "end") Integer end);

	// 教务处
	public Integer countKpiInfoJw(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "schoolCode") String schoolCode);

	public List<MtKpiInfoDto> selectKpiInfoJw(@Param(value = "kpiInsId") Integer kpiInsId,
			@Param(value = "schoolCode") String schoolCode, @Param(value = "start") Integer start,
			@Param(value = "end") Integer end);

	public List<MtKpiInfo> selectKpiInfo(@Param(value = "kpiInsId") Integer kpiInsId);
}
