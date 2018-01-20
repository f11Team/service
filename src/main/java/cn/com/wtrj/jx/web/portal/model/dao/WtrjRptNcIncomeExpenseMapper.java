package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcIncomeExpense;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcIncomeExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcIncomeExpenseMapper {
    int countByExample(WtrjRptNcIncomeExpenseExample example);

    int deleteByExample(WtrjRptNcIncomeExpenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcIncomeExpense record);

    int insertSelective(WtrjRptNcIncomeExpense record);

    List<WtrjRptNcIncomeExpense> selectByExample(WtrjRptNcIncomeExpenseExample example);

    WtrjRptNcIncomeExpense selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcIncomeExpense record, @Param("example") WtrjRptNcIncomeExpenseExample example);

    int updateByExample(@Param("record") WtrjRptNcIncomeExpense record, @Param("example") WtrjRptNcIncomeExpenseExample example);

    int updateByPrimaryKeySelective(WtrjRptNcIncomeExpense record);

    int updateByPrimaryKey(WtrjRptNcIncomeExpense record);
}