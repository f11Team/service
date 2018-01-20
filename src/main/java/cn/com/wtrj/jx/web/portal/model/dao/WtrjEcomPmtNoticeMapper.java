package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomPmtNoticeMapper {
    int countByExample(WtrjEcomPmtNoticeExample example);

    int deleteByExample(WtrjEcomPmtNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomPmtNotice record);

    int insertSelective(WtrjEcomPmtNotice record);

    List<WtrjEcomPmtNotice> selectByExample(WtrjEcomPmtNoticeExample example);

    WtrjEcomPmtNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomPmtNotice record, @Param("example") WtrjEcomPmtNoticeExample example);

    int updateByExample(@Param("record") WtrjEcomPmtNotice record, @Param("example") WtrjEcomPmtNoticeExample example);

    int updateByPrimaryKeySelective(WtrjEcomPmtNotice record);

    int updateByPrimaryKey(WtrjEcomPmtNotice record);
}