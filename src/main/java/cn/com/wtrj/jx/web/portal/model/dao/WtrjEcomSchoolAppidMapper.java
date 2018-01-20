package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppid;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppidExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSchoolAppidKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomSchoolAppidMapper {
    int countByExample(WtrjEcomSchoolAppidExample example);

    int deleteByExample(WtrjEcomSchoolAppidExample example);

    int deleteByPrimaryKey(WtrjEcomSchoolAppidKey key);

    int insert(WtrjEcomSchoolAppid record);

    int insertSelective(WtrjEcomSchoolAppid record);

    List<WtrjEcomSchoolAppid> selectByExample(WtrjEcomSchoolAppidExample example);

    WtrjEcomSchoolAppid selectByPrimaryKey(WtrjEcomSchoolAppidKey key);

    int updateByExampleSelective(@Param("record") WtrjEcomSchoolAppid record, @Param("example") WtrjEcomSchoolAppidExample example);

    int updateByExample(@Param("record") WtrjEcomSchoolAppid record, @Param("example") WtrjEcomSchoolAppidExample example);

    int updateByPrimaryKeySelective(WtrjEcomSchoolAppid record);

    int updateByPrimaryKey(WtrjEcomSchoolAppid record);
}