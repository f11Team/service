package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjVisitItem;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjVisitItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjVisitItemMapper {
    int countByExample(WtrjVisitItemExample example);

    int deleteByExample(WtrjVisitItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjVisitItem record);

    int insertSelective(WtrjVisitItem record);

    List<WtrjVisitItem> selectByExample(WtrjVisitItemExample example);

    WtrjVisitItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjVisitItem record, @Param("example") WtrjVisitItemExample example);

    int updateByExample(@Param("record") WtrjVisitItem record, @Param("example") WtrjVisitItemExample example);

    int updateByPrimaryKeySelective(WtrjVisitItem record);

    int updateByPrimaryKey(WtrjVisitItem record);
}