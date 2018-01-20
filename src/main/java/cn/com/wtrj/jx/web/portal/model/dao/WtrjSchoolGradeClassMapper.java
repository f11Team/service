package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeClassExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeClassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjSchoolGradeClassMapper {
    int countByExample(WtrjSchoolGradeClassExample example);

    int deleteByExample(WtrjSchoolGradeClassExample example);

    int deleteByPrimaryKey(WtrjSchoolGradeClassKey key);

    int insert(WtrjSchoolGradeClassKey record);

    int insertSelective(WtrjSchoolGradeClassKey record);

    List<WtrjSchoolGradeClassKey> selectByExample(WtrjSchoolGradeClassExample example);

    int updateByExampleSelective(@Param("record") WtrjSchoolGradeClassKey record, @Param("example") WtrjSchoolGradeClassExample example);

    int updateByExample(@Param("record") WtrjSchoolGradeClassKey record, @Param("example") WtrjSchoolGradeClassExample example);
}