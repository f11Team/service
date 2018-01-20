package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjBusinessSegment;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjBusinessSegmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjBusinessSegmentMapper {
    int countByExample(WtrjBusinessSegmentExample example);

    int deleteByExample(WtrjBusinessSegmentExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjBusinessSegment record);

    int insertSelective(WtrjBusinessSegment record);

    List<WtrjBusinessSegment> selectByExample(WtrjBusinessSegmentExample example);

    WtrjBusinessSegment selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjBusinessSegment record, @Param("example") WtrjBusinessSegmentExample example);

    int updateByExample(@Param("record") WtrjBusinessSegment record, @Param("example") WtrjBusinessSegmentExample example);

    int updateByPrimaryKeySelective(WtrjBusinessSegment record);

    int updateByPrimaryKey(WtrjBusinessSegment record);
}