package cn.com.wtrj.jx.web.portal.model.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjMoralStudentMapper {
    int countByExample(WtrjMoralStudentExample example);

    int deleteByExample(WtrjMoralStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjMoralStudent record);

    int insertSelective(WtrjMoralStudent record);

    List<WtrjMoralStudent> selectByExample(WtrjMoralStudentExample example);

    WtrjMoralStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjMoralStudent record, @Param("example") WtrjMoralStudentExample example);

    int updateByExample(@Param("record") WtrjMoralStudent record, @Param("example") WtrjMoralStudentExample example);

    int updateByPrimaryKeySelective(WtrjMoralStudent record);

    int updateByPrimaryKey(WtrjMoralStudent record);

}