package cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent;


import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycle;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.CountScoreDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WtrjMtMoralCountCycleMapper {


    List<WtrjMoralCountCycle> selectCountCycleByPage(@Param("start") Integer start, @Param("end") Integer end);
    List<CountScoreDto>getstudentScoreCountById(@Param("stuId") Integer stuId);
}
