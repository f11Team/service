package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjStudentMapper {
    int countByExample(WtrjStudentExample example);

    int deleteByExample(WtrjStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjStudent record);

    int insertSelective(WtrjStudent record);

    List<WtrjStudent> selectByExample(WtrjStudentExample example);

    WtrjStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjStudent record, @Param("example") WtrjStudentExample example);

    int updateByExample(@Param("record") WtrjStudent record, @Param("example") WtrjStudentExample example);

    int updateByPrimaryKeySelective(WtrjStudent record);

    int updateByPrimaryKey(WtrjStudent record);
    
    List<WtrjStudent> selectStudentsByTeacherId(@Param("teacherId")Integer teacherId);
    
    List<WtrjStudent> selectStudentsByClassId(@Param("classId")Integer classId);
}