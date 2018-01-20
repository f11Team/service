package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcProfit;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcProfitMapper {
    int countByExample(WtrjRptNcProfitExample example);

    int deleteByExample(WtrjRptNcProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcProfit record);

    int insertSelective(WtrjRptNcProfit record);

    List<WtrjRptNcProfit> selectByExample(WtrjRptNcProfitExample example);

    WtrjRptNcProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcProfit record, @Param("example") WtrjRptNcProfitExample example);

    int updateByExample(@Param("record") WtrjRptNcProfit record, @Param("example") WtrjRptNcProfitExample example);

    int updateByPrimaryKeySelective(WtrjRptNcProfit record);

    int updateByPrimaryKey(WtrjRptNcProfit record);
}