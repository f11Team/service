package cn.com.wtrj.jx.web.portal.model.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandard;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjMoralStandardMapper {
    int countByExample(WtrjMoralStandardExample example);

    int deleteByExample(WtrjMoralStandardExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjMoralStandard record);

    int insertSelective(WtrjMoralStandard record);

    List<WtrjMoralStandard> selectByExample(WtrjMoralStandardExample example);

    WtrjMoralStandard selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjMoralStandard record, @Param("example") WtrjMoralStandardExample example);

    int updateByExample(@Param("record") WtrjMoralStandard record, @Param("example") WtrjMoralStandardExample example);

    int updateByPrimaryKeySelective(WtrjMoralStandard record);

    int updateByPrimaryKey(WtrjMoralStandard record);

}