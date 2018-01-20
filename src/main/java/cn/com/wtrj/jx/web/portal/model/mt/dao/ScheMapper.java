package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.ScheDto;

public interface ScheMapper {
	List<ScheDto> searchScheDate(@Param(value = "defaultStartDate")String defaultStartDate, @Param(value = "defaultEndDate")String defaultEndDate);
}
