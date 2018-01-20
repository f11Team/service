package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherCourse;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjTeacherCourseMapper {
    int countByExample(WtrjTeacherCourseExample example);

    int deleteByExample(WtrjTeacherCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjTeacherCourse record);

    int insertSelective(WtrjTeacherCourse record);

    List<WtrjTeacherCourse> selectByExample(WtrjTeacherCourseExample example);

    WtrjTeacherCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjTeacherCourse record, @Param("example") WtrjTeacherCourseExample example);

    int updateByExample(@Param("record") WtrjTeacherCourse record, @Param("example") WtrjTeacherCourseExample example);

    int updateByPrimaryKeySelective(WtrjTeacherCourse record);

    int updateByPrimaryKey(WtrjTeacherCourse record);
}