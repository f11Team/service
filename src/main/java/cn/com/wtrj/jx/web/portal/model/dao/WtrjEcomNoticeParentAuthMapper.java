package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeParentAuth;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeParentAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomNoticeParentAuthMapper {
    int countByExample(WtrjEcomNoticeParentAuthExample example);

    int deleteByExample(WtrjEcomNoticeParentAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomNoticeParentAuth record);

    int insertSelective(WtrjEcomNoticeParentAuth record);

    List<WtrjEcomNoticeParentAuth> selectByExample(WtrjEcomNoticeParentAuthExample example);

    WtrjEcomNoticeParentAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomNoticeParentAuth record, @Param("example") WtrjEcomNoticeParentAuthExample example);

    int updateByExample(@Param("record") WtrjEcomNoticeParentAuth record, @Param("example") WtrjEcomNoticeParentAuthExample example);

    int updateByPrimaryKeySelective(WtrjEcomNoticeParentAuth record);

    int updateByPrimaryKey(WtrjEcomNoticeParentAuth record);
}