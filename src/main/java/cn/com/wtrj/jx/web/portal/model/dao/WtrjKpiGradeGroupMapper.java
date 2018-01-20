package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroup;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiGradeGroupMapper {
    int countByExample(WtrjKpiGradeGroupExample example);

    int deleteByExample(WtrjKpiGradeGroupExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjKpiGradeGroup record);

    int insertSelective(WtrjKpiGradeGroup record);

    List<WtrjKpiGradeGroup> selectByExample(WtrjKpiGradeGroupExample example);

    WtrjKpiGradeGroup selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjKpiGradeGroup record, @Param("example") WtrjKpiGradeGroupExample example);

    int updateByExample(@Param("record") WtrjKpiGradeGroup record, @Param("example") WtrjKpiGradeGroupExample example);

    int updateByPrimaryKeySelective(WtrjKpiGradeGroup record);

    int updateByPrimaryKey(WtrjKpiGradeGroup record);
}