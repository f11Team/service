package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRecExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomLeaveRecMapper {
    int countByExample(WtrjEcomLeaveRecExample example);

    int deleteByExample(WtrjEcomLeaveRecExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjEcomLeaveRec record);

    int insertSelective(WtrjEcomLeaveRec record);

    List<WtrjEcomLeaveRec> selectByExample(@Param("teacherId")Integer teacherId);

    WtrjEcomLeaveRec selectByPrimaryKey(@Param("id")String id);

    int updateByExampleSelective(@Param("record") WtrjEcomLeaveRec record, @Param("example") WtrjEcomLeaveRecExample example);

    int updateByExample(@Param("record") WtrjEcomLeaveRec record, @Param("example") WtrjEcomLeaveRecExample example);

    int updateByPrimaryKeySelective(WtrjEcomLeaveRec record);

    int updateByPrimaryKey(WtrjEcomLeaveRec record);
    
    List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmTeahcerId(@Param("userId")Integer userId);
    
    List<WtrjEcomLeaveRec> findLeaveRecordsByStarterTeahcerId(@Param("userId")Integer userId);

    int deleteLeaveRecordsByStarterParentId(WtrjEcomLeaveRec record);

    int deleteLeaveRecordsByStarterTeacherId(WtrjEcomLeaveRec record);
}