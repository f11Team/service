package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiJiaoYanZu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiJiaoYanZuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjKpiJiaoYanZuMapper {
    int countByExample(WtrjKpiJiaoYanZuExample example);

    int deleteByExample(WtrjKpiJiaoYanZuExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjKpiJiaoYanZu record);

    int insertSelective(WtrjKpiJiaoYanZu record);

    List<WtrjKpiJiaoYanZu> selectByExample(WtrjKpiJiaoYanZuExample example);

    WtrjKpiJiaoYanZu selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjKpiJiaoYanZu record, @Param("example") WtrjKpiJiaoYanZuExample example);

    int updateByExample(@Param("record") WtrjKpiJiaoYanZu record, @Param("example") WtrjKpiJiaoYanZuExample example);

    int updateByPrimaryKeySelective(WtrjKpiJiaoYanZu record);

    int updateByPrimaryKey(WtrjKpiJiaoYanZu record);
}