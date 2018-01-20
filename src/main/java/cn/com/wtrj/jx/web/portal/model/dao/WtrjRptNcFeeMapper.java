package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcFee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptNcFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptNcFeeMapper {
    int countByExample(WtrjRptNcFeeExample example);

    int deleteByExample(WtrjRptNcFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjRptNcFee record);

    int insertSelective(WtrjRptNcFee record);

    List<WtrjRptNcFee> selectByExample(WtrjRptNcFeeExample example);

    WtrjRptNcFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjRptNcFee record, @Param("example") WtrjRptNcFeeExample example);

    int updateByExample(@Param("record") WtrjRptNcFee record, @Param("example") WtrjRptNcFeeExample example);

    int updateByPrimaryKeySelective(WtrjRptNcFee record);

    int updateByPrimaryKey(WtrjRptNcFee record);
}