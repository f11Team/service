package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeEmplExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeEmplKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiGradeEmplMapper {
    int countByExample(WtrjKpiGradeEmplExample example);

    int deleteByExample(WtrjKpiGradeEmplExample example);

    int deleteByPrimaryKey(WtrjKpiGradeEmplKey key);

    int insert(WtrjKpiGradeEmplKey record);

    int insertSelective(WtrjKpiGradeEmplKey record);

    List<WtrjKpiGradeEmplKey> selectByExample(WtrjKpiGradeEmplExample example);

    int updateByExampleSelective(@Param("record") WtrjKpiGradeEmplKey record, @Param("example") WtrjKpiGradeEmplExample example);

    int updateByExample(@Param("record") WtrjKpiGradeEmplKey record, @Param("example") WtrjKpiGradeEmplExample example);
}