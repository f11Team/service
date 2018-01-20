package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcBalanceSheet;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcBalanceSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcBalanceSheetMapper {
    int countByExample(WtrjRptNcBalanceSheetExample example);

    int deleteByExample(WtrjRptNcBalanceSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcBalanceSheet record);

    int insertSelective(WtrjRptNcBalanceSheet record);

    List<WtrjRptNcBalanceSheet> selectByExample(WtrjRptNcBalanceSheetExample example);

    WtrjRptNcBalanceSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcBalanceSheet record, @Param("example") WtrjRptNcBalanceSheetExample example);

    int updateByExample(@Param("record") WtrjRptNcBalanceSheet record, @Param("example") WtrjRptNcBalanceSheetExample example);

    int updateByPrimaryKeySelective(WtrjRptNcBalanceSheet record);

    int updateByPrimaryKey(WtrjRptNcBalanceSheet record);
}