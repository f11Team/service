package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptMsgMapper {
    int countByExample(WtrjRptMsgExample example);

    int deleteByExample(WtrjRptMsgExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjRptMsg record);

    int insertSelective(WtrjRptMsg record);

    List<WtrjRptMsg> selectByExample(WtrjRptMsgExample example);

    WtrjRptMsg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjRptMsg record, @Param("example") WtrjRptMsgExample example);

    int updateByExample(@Param("record") WtrjRptMsg record, @Param("example") WtrjRptMsgExample example);

    int updateByPrimaryKeySelective(WtrjRptMsg record);

    int updateByPrimaryKey(WtrjRptMsg record);
    
    List<WtrjRptMsg> selectMsgByMsgCode(@Param("msgCode")String msgCode,@Param("type")Integer type);
}