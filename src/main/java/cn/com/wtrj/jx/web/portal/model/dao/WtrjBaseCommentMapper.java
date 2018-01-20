package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjBaseComment;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjBaseCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjBaseCommentMapper {
    int countByExample(WtrjBaseCommentExample example);

    int deleteByExample(WtrjBaseCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjBaseComment record);

    int insertSelective(WtrjBaseComment record);

    List<WtrjBaseComment> selectByExample(WtrjBaseCommentExample example);

    WtrjBaseComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjBaseComment record, @Param("example") WtrjBaseCommentExample example);

    int updateByExample(@Param("record") WtrjBaseComment record, @Param("example") WtrjBaseCommentExample example);

    int updateByPrimaryKeySelective(WtrjBaseComment record);

    int updateByPrimaryKey(WtrjBaseComment record);
}