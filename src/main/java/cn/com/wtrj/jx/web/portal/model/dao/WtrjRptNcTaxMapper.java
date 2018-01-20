package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcTax;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcTaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcTaxMapper {
    int countByExample(WtrjRptNcTaxExample example);

    int deleteByExample(WtrjRptNcTaxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcTax record);

    int insertSelective(WtrjRptNcTax record);

    List<WtrjRptNcTax> selectByExample(WtrjRptNcTaxExample example);

    WtrjRptNcTax selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcTax record, @Param("example") WtrjRptNcTaxExample example);

    int updateByExample(@Param("record") WtrjRptNcTax record, @Param("example") WtrjRptNcTaxExample example);

    int updateByPrimaryKeySelective(WtrjRptNcTax record);

    int updateByPrimaryKey(WtrjRptNcTax record);
}