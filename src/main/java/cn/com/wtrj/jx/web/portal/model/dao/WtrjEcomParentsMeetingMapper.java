package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomParentsMeeting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomParentsMeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomParentsMeetingMapper {
    int countByExample(WtrjEcomParentsMeetingExample example);

    int deleteByExample(WtrjEcomParentsMeetingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomParentsMeeting record);

    int insertSelective(WtrjEcomParentsMeeting record);

    List<WtrjEcomParentsMeeting> selectByExample(WtrjEcomParentsMeetingExample example);

    WtrjEcomParentsMeeting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomParentsMeeting record, @Param("example") WtrjEcomParentsMeetingExample example);

    int updateByExample(@Param("record") WtrjEcomParentsMeeting record, @Param("example") WtrjEcomParentsMeetingExample example);

    int updateByPrimaryKeySelective(WtrjEcomParentsMeeting record);

    int updateByPrimaryKey(WtrjEcomParentsMeeting record);
}