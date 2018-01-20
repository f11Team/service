package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjJob;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjJobMapper {
    int countByExample(WtrjJobExample example);

    int deleteByExample(WtrjJobExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjJob record);

    int insertSelective(WtrjJob record);

    List<WtrjJob> selectByExample(WtrjJobExample example);

    WtrjJob selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjJob record, @Param("example") WtrjJobExample example);

    int updateByExample(@Param("record") WtrjJob record, @Param("example") WtrjJobExample example);

    int updateByPrimaryKeySelective(WtrjJob record);

    int updateByPrimaryKey(WtrjJob record);
}