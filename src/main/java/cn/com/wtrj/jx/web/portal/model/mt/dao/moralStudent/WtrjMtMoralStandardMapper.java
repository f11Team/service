package cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandard;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WtrjMtMoralStandardMapper {

    List<WtrjMoralStandard> selectStandardByPage(@Param("start") Integer start, @Param("end") Integer end);
}