package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTag;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomTagMapper {
    int countByExample(WtrjEcomTagExample example);

    int deleteByExample(WtrjEcomTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomTag record);

    int insertSelective(WtrjEcomTag record);

    List<WtrjEcomTag> selectByExample(WtrjEcomTagExample example);

    WtrjEcomTag selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") WtrjEcomTag record, @Param("example") WtrjEcomTagExample example);

    int updateByExample(@Param("record") WtrjEcomTag record, @Param("example") WtrjEcomTagExample example);

    int updateByPrimaryKeySelective(WtrjEcomTag record);

    int updateByPrimaryKey(WtrjEcomTag record);
}