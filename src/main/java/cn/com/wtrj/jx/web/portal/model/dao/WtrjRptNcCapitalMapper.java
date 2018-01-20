package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcCapital;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcCapitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcCapitalMapper {
    int countByExample(WtrjRptNcCapitalExample example);

    int deleteByExample(WtrjRptNcCapitalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcCapital record);

    int insertSelective(WtrjRptNcCapital record);

    List<WtrjRptNcCapital> selectByExample(WtrjRptNcCapitalExample example);

    WtrjRptNcCapital selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcCapital record, @Param("example") WtrjRptNcCapitalExample example);

    int updateByExample(@Param("record") WtrjRptNcCapital record, @Param("example") WtrjRptNcCapitalExample example);

    int updateByPrimaryKeySelective(WtrjRptNcCapital record);

    int updateByPrimaryKey(WtrjRptNcCapital record);
}