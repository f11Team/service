package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomAnnualFeeRecMapper {
    int countByExample(WtrjEcomAnnualFeeRecExample example);

    int deleteByExample(WtrjEcomAnnualFeeRecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomAnnualFeeRec record);

    int insertSelective(WtrjEcomAnnualFeeRec record);

    List<WtrjEcomAnnualFeeRec> selectByExample(WtrjEcomAnnualFeeRecExample example);

    WtrjEcomAnnualFeeRec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomAnnualFeeRec record, @Param("example") WtrjEcomAnnualFeeRecExample example);

    int updateByExample(@Param("record") WtrjEcomAnnualFeeRec record, @Param("example") WtrjEcomAnnualFeeRecExample example);

    int updateByPrimaryKeySelective(WtrjEcomAnnualFeeRec record);

    int updateByPrimaryKey(WtrjEcomAnnualFeeRec record);
}