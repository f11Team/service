package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtTeacherNoticeGroup;

public interface MtTeacherNoticeMapper {
	public List<MtTeacherNoticeGroup> selectGroupByBelongTeacherId(int teacherId);
}
