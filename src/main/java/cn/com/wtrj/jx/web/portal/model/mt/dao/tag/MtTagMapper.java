package cn.com.wtrj.jx.web.portal.model.mt.dao.tag;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTag;

public interface MtTagMapper {
	public List<WtrjEcomTag> selectTagByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	public int countTag(@Param(value = "search")String search);
	
	
}
