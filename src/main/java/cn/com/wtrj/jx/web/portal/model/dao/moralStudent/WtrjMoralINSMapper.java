package cn.com.wtrj.jx.web.portal.model.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINS;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjMoralINSMapper {
    int countByExample(WtrjMoralINSExample example);

    int deleteByExample(WtrjMoralINSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjMoralINS record);

    int insertSelective(WtrjMoralINS record);

    List<WtrjMoralINS> selectByExample(WtrjMoralINSExample example);

    WtrjMoralINS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjMoralINS record, @Param("example") WtrjMoralINSExample example);

    int updateByExample(@Param("record") WtrjMoralINS record, @Param("example") WtrjMoralINSExample example);

    int updateByPrimaryKeySelective(WtrjMoralINS record);

    int updateByPrimaryKey(WtrjMoralINS record);
    
    WtrjStudent findStudentInfoById(String studentId);
    
    public int countIns(@Param("teacherId") Integer teacherId, @Param("schoolCode") String schoolCode, @Param("role") int role, @Param("classId") String classId);
    
    public List<WtrjMoralINS> pageIns(@Param("teacherId") Integer teacherId, @Param("schoolCode") String schoolCode, @Param("role") int role, @Param("classId") String classId, @Param("start")  Integer start,  @Param("end")  Integer end);
}