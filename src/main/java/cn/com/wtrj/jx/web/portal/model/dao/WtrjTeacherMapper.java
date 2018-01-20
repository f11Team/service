package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjTeacherMapper {
    int countByExample(WtrjTeacherExample example);

    int deleteByExample(WtrjTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjTeacher record);

    int insertSelective(WtrjTeacher record);

    List<WtrjTeacher> selectByExample(WtrjTeacherExample example);

    WtrjTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjTeacher record, @Param("example") WtrjTeacherExample example);

    int updateByExample(@Param("record") WtrjTeacher record, @Param("example") WtrjTeacherExample example);

    int updateByPrimaryKeySelective(WtrjTeacher record);

    int updateByPrimaryKey(WtrjTeacher record);
    
    List<WtrjTeacher> selectTeacherByStudentId(@Param("studentId")Integer studentId);
}