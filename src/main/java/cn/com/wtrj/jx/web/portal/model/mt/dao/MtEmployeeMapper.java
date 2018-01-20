package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEmployeeDto;

public interface MtEmployeeMapper {
	
	public List<MtEmployeeDto> selectEmployeeByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	public Integer countEmployee(@Param(value = "search")String search);

	public int countEmployeeBySchool(@Param(value = "schoolCode")String schoolCode, @Param(value = "search")String search);

	public List<MtEmployeeDto> selectSchoolEmployeeByPage(@Param(value = "schoolCode")String schoolCode, @Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);
}
