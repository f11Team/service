package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjSchoolGradeMapper {
    int countByExample(WtrjSchoolGradeExample example);

    int deleteByExample(WtrjSchoolGradeExample example);

    int deleteByPrimaryKey(WtrjSchoolGradeKey key);

    int insert(WtrjSchoolGradeKey record);

    int insertSelective(WtrjSchoolGradeKey record);

    List<WtrjSchoolGradeKey> selectByExample(WtrjSchoolGradeExample example);

    int updateByExampleSelective(@Param("record") WtrjSchoolGradeKey record, @Param("example") WtrjSchoolGradeExample example);

    int updateByExample(@Param("record") WtrjSchoolGradeKey record, @Param("example") WtrjSchoolGradeExample example);
}