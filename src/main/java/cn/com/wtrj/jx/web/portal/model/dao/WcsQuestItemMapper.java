package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestItem;
import cn.com.wtrj.jx.web.portal.model.entities.WcsQuestItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WcsQuestItemMapper {
    long countByExample(WcsQuestItemExample example);

    int deleteByExample(WcsQuestItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(WcsQuestItem record);

    int insertSelective(WcsQuestItem record);

    List<WcsQuestItem> selectByExample(WcsQuestItemExample example);

    WcsQuestItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WcsQuestItem record, @Param("example") WcsQuestItemExample example);

    int updateByExample(@Param("record") WcsQuestItem record, @Param("example") WcsQuestItemExample example);

    int updateByPrimaryKeySelective(WcsQuestItem record);

    int updateByPrimaryKey(WcsQuestItem record);
    
    List<WcsQuestItem> findAllItemCode();
    
    List<WcsQuestItem> findAllItem();
}