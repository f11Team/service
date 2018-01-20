package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomSwipeCardRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomSwipeCardRecMapper {
    int countByExample(WtrjEcomSwipeCardRecExample example);

    int deleteByExample(WtrjEcomSwipeCardRecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomSwipeCardRec record);

    int insertSelective(WtrjEcomSwipeCardRec record);

    List<WtrjEcomSwipeCardRec> selectByExample(WtrjEcomSwipeCardRecExample example);

    WtrjEcomSwipeCardRec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomSwipeCardRec record, @Param("example") WtrjEcomSwipeCardRecExample example);

    int updateByExample(@Param("record") WtrjEcomSwipeCardRec record, @Param("example") WtrjEcomSwipeCardRecExample example);

    int updateByPrimaryKeySelective(WtrjEcomSwipeCardRec record);

    int updateByPrimaryKey(WtrjEcomSwipeCardRec record);
}