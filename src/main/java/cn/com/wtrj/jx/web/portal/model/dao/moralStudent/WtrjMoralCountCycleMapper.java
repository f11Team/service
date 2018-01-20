package cn.com.wtrj.jx.web.portal.model.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycle;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjMoralCountCycleMapper {
    int countByExample(WtrjMoralCountCycleExample example);

    int deleteByExample(WtrjMoralCountCycleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjMoralCountCycle record);

    int insertSelective(WtrjMoralCountCycle record);

    List<WtrjMoralCountCycle> selectByExample(WtrjMoralCountCycleExample example);

    WtrjMoralCountCycle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjMoralCountCycle record, @Param("example") WtrjMoralCountCycleExample example);

    int updateByExample(@Param("record") WtrjMoralCountCycle record, @Param("example") WtrjMoralCountCycleExample example);

    int updateByPrimaryKeySelective(WtrjMoralCountCycle record);

    int updateByPrimaryKey(WtrjMoralCountCycle record);
}