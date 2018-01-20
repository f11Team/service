package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitor;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomVisitorMapper {
    int countByExample(WtrjEcomVisitorExample example);

    int deleteByExample(WtrjEcomVisitorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomVisitor record);

    int insertSelective(WtrjEcomVisitor record);

    List<WtrjEcomVisitor> selectByExample(WtrjEcomVisitorExample example);

    WtrjEcomVisitor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomVisitor record, @Param("example") WtrjEcomVisitorExample example);

    int updateByExample(@Param("record") WtrjEcomVisitor record, @Param("example") WtrjEcomVisitorExample example);

    int updateByPrimaryKeySelective(WtrjEcomVisitor record);

    int updateByPrimaryKey(WtrjEcomVisitor record);
}