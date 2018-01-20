package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcPay;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcPayMapper {
    int countByExample(WtrjRptNcPayExample example);

    int deleteByExample(WtrjRptNcPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcPay record);

    int insertSelective(WtrjRptNcPay record);

    List<WtrjRptNcPay> selectByExample(WtrjRptNcPayExample example);

    WtrjRptNcPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcPay record, @Param("example") WtrjRptNcPayExample example);

    int updateByExample(@Param("record") WtrjRptNcPay record, @Param("example") WtrjRptNcPayExample example);

    int updateByPrimaryKeySelective(WtrjRptNcPay record);

    int updateByPrimaryKey(WtrjRptNcPay record);
}