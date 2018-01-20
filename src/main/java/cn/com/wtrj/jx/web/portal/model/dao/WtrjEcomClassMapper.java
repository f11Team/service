package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomClassMapper {
    int countByExample(WtrjEcomClassExample example);

    int deleteByExample(WtrjEcomClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomClass record);

    int insertSelective(WtrjEcomClass record);

    List<WtrjEcomClass> selectByExample(WtrjEcomClassExample example);

    WtrjEcomClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomClass record, @Param("example") WtrjEcomClassExample example);

    int updateByExample(@Param("record") WtrjEcomClass record, @Param("example") WtrjEcomClassExample example);

    int updateByPrimaryKeySelective(WtrjEcomClass record);

    int updateByPrimaryKey(WtrjEcomClass record);
}