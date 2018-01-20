package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiInfoDetailMapper {
    int countByExample(WtrjKpiInfoDetailExample example);

    int deleteByExample(WtrjKpiInfoDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjKpiInfoDetail record);

    int insertSelective(WtrjKpiInfoDetail record);

    List<WtrjKpiInfoDetail> selectByExample(WtrjKpiInfoDetailExample example);

    WtrjKpiInfoDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjKpiInfoDetail record, @Param("example") WtrjKpiInfoDetailExample example);

    int updateByExample(@Param("record") WtrjKpiInfoDetail record, @Param("example") WtrjKpiInfoDetailExample example);

    int updateByPrimaryKeySelective(WtrjKpiInfoDetail record);

    int updateByPrimaryKey(WtrjKpiInfoDetail record);
}