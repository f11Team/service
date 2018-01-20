package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPayItem;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPayItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomPayItemMapper {
    int countByExample(WtrjEcomPayItemExample example);

    int deleteByExample(WtrjEcomPayItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomPayItem record);

    int insertSelective(WtrjEcomPayItem record);

    List<WtrjEcomPayItem> selectByExample(WtrjEcomPayItemExample example);

    WtrjEcomPayItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomPayItem record, @Param("example") WtrjEcomPayItemExample example);

    int updateByExample(@Param("record") WtrjEcomPayItem record, @Param("example") WtrjEcomPayItemExample example);

    int updateByPrimaryKeySelective(WtrjEcomPayItem record);

    int updateByPrimaryKey(WtrjEcomPayItem record);
}