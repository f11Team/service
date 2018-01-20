package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentCourse;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjStudentCourseMapper {
    int countByExample(WtrjStudentCourseExample example);

    int deleteByExample(WtrjStudentCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjStudentCourse record);

    int insertSelective(WtrjStudentCourse record);

    List<WtrjStudentCourse> selectByExample(WtrjStudentCourseExample example);

    WtrjStudentCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjStudentCourse record, @Param("example") WtrjStudentCourseExample example);

    int updateByExample(@Param("record") WtrjStudentCourse record, @Param("example") WtrjStudentCourseExample example);

    int updateByPrimaryKeySelective(WtrjStudentCourse record);

    int updateByPrimaryKey(WtrjStudentCourse record);
}