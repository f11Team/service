package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSetting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomSwipeCardSettingMapper {
    int countByExample(WtrjEcomSwipeCardSettingExample example);

    int deleteByExample(WtrjEcomSwipeCardSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomSwipeCardSetting record);

    int insertSelective(WtrjEcomSwipeCardSetting record);

    List<WtrjEcomSwipeCardSetting> selectByExample(WtrjEcomSwipeCardSettingExample example);

    WtrjEcomSwipeCardSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomSwipeCardSetting record, @Param("example") WtrjEcomSwipeCardSettingExample example);

    int updateByExample(@Param("record") WtrjEcomSwipeCardSetting record, @Param("example") WtrjEcomSwipeCardSettingExample example);

    int updateByPrimaryKeySelective(WtrjEcomSwipeCardSetting record);

    int updateByPrimaryKey(WtrjEcomSwipeCardSetting record);
}