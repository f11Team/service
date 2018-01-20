package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomNoticeMapper {
    int countByExample(WtrjEcomNoticeExample example);

    int deleteByExample(WtrjEcomNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomNotice record);

    int insertSelective(WtrjEcomNotice record);

    List<WtrjEcomNotice> selectByExample(WtrjEcomNoticeExample example);

    WtrjEcomNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomNotice record, @Param("example") WtrjEcomNoticeExample example);

    int updateByExample(@Param("record") WtrjEcomNotice record, @Param("example") WtrjEcomNoticeExample example);

    int updateByPrimaryKeySelective(WtrjEcomNotice record);

    int updateByPrimaryKey(WtrjEcomNotice record);
}