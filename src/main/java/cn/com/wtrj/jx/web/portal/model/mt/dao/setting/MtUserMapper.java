package cn.com.wtrj.jx.web.portal.model.mt.dao.setting;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserDto;

public interface MtUserMapper {
	public List<MtUserDto> selectUserByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "search") String search);

	public int countUsers(@Param(value = "search")String search);
	
	public void deleteBindEmployee(@Param(value = "userId")Integer userId);
}
