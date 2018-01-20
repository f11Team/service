package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomClassCircleMapper {
    int countByExample(WtrjEcomClassCircleExample example);

    int deleteByExample(WtrjEcomClassCircleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomClassCircle record);

    int insertSelective(WtrjEcomClassCircle record);

    List<WtrjEcomClassCircle> selectByExample(WtrjEcomClassCircleExample example);

    WtrjEcomClassCircle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomClassCircle record, @Param("example") WtrjEcomClassCircleExample example);

    int updateByExample(@Param("record") WtrjEcomClassCircle record, @Param("example") WtrjEcomClassCircleExample example);

    int updateByPrimaryKeySelective(WtrjEcomClassCircle record);

    int updateByPrimaryKey(WtrjEcomClassCircle record);

}