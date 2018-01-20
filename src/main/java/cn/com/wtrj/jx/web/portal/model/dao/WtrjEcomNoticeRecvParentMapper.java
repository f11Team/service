package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeRecvParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeRecvParentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomNoticeRecvParentMapper {
    int countByExample(WtrjEcomNoticeRecvParentExample example);

    int deleteByExample(WtrjEcomNoticeRecvParentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomNoticeRecvParent record);

    int insertSelective(WtrjEcomNoticeRecvParent record);

    List<WtrjEcomNoticeRecvParent> selectByExample(WtrjEcomNoticeRecvParentExample example);

    WtrjEcomNoticeRecvParent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomNoticeRecvParent record, @Param("example") WtrjEcomNoticeRecvParentExample example);

    int updateByExample(@Param("record") WtrjEcomNoticeRecvParent record, @Param("example") WtrjEcomNoticeRecvParentExample example);

    int updateByPrimaryKeySelective(WtrjEcomNoticeRecvParent record);

    int updateByPrimaryKey(WtrjEcomNoticeRecvParent record);
}