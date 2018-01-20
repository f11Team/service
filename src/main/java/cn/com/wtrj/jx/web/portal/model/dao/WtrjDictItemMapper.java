package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjDictItem;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDictItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjDictItemMapper {
    int countByExample(WtrjDictItemExample example);

    int deleteByExample(WtrjDictItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjDictItem record);

    int insertSelective(WtrjDictItem record);

    List<WtrjDictItem> selectByExample(WtrjDictItemExample example);

    WtrjDictItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjDictItem record, @Param("example") WtrjDictItemExample example);

    int updateByExample(@Param("record") WtrjDictItem record, @Param("example") WtrjDictItemExample example);

    int updateByPrimaryKeySelective(WtrjDictItem record);

    int updateByPrimaryKey(WtrjDictItem record);
}