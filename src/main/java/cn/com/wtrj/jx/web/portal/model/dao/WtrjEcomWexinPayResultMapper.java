package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomWexinPayResult;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomWexinPayResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomWexinPayResultMapper {
    int countByExample(WtrjEcomWexinPayResultExample example);

    int deleteByExample(WtrjEcomWexinPayResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomWexinPayResult record);

    int insertSelective(WtrjEcomWexinPayResult record);

    List<WtrjEcomWexinPayResult> selectByExample(WtrjEcomWexinPayResultExample example);

    WtrjEcomWexinPayResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomWexinPayResult record, @Param("example") WtrjEcomWexinPayResultExample example);

    int updateByExample(@Param("record") WtrjEcomWexinPayResult record, @Param("example") WtrjEcomWexinPayResultExample example);

    int updateByPrimaryKeySelective(WtrjEcomWexinPayResult record);

    int updateByPrimaryKey(WtrjEcomWexinPayResult record);
}