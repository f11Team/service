package cn.com.wtrj.jx.web.portal.model.mt.dao.kpi;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiGradeGroup;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiJiaoYanZu;

public interface MtKpiGroupMapper {

	List<MtWtrjKpiGradeGroup> findGrade(Map<String, Object> param);
	
	List<MtWtrjKpiJiaoYanZu> findJiaoyan(Map<String, Object> param);
	
	Integer selectNianjizuCount(@Param(value="search")String search);
	
	List<MtNianjizuDto> selectNianjizuByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	int countNianjizuMembers(@Param(value = "nianjizuCode") String nianjizuCode, @Param(value = "search") String search);

	List<MtNianjizuMemberDto> selectNianjizuMemberByPage(@Param(value = "nianjizuCode") String nianjizuCode, @Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	int countJiaoyanzu(String search);
	
	List<MtJiaoyanzuDto> selectJiaoyanzuByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	int countJiaoyanzuMembers(@Param(value = "jiaoyanzuCode") String jiaoyanzuCode, @Param(value = "search") String search);

	List<MtJiaoyanzuMemberDto> selectJiaoyanzuMemberByPage(@Param(value = "jiaoyanzuCode") String jiaoyanzuCode, @Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);
}
