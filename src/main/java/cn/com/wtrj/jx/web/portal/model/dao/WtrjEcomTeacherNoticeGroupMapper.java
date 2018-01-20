package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTeacherNoticeGroup;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTeacherNoticeGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomTeacherNoticeGroupMapper {
    int countByExample(WtrjEcomTeacherNoticeGroupExample example);

    int deleteByExample(WtrjEcomTeacherNoticeGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjEcomTeacherNoticeGroup record);

    int insertSelective(WtrjEcomTeacherNoticeGroup record);

    List<WtrjEcomTeacherNoticeGroup> selectByExample(WtrjEcomTeacherNoticeGroupExample example);

    WtrjEcomTeacherNoticeGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjEcomTeacherNoticeGroup record, @Param("example") WtrjEcomTeacherNoticeGroupExample example);

    int updateByExample(@Param("record") WtrjEcomTeacherNoticeGroup record, @Param("example") WtrjEcomTeacherNoticeGroupExample example);

    int updateByPrimaryKeySelective(WtrjEcomTeacherNoticeGroup record);

    int updateByPrimaryKey(WtrjEcomTeacherNoticeGroup record);

    void deleteGroupByGroupBode(WtrjEcomTeacherNoticeGroup record);

    void delMemberByGroupCode(WtrjEcomTeacherNoticeGroup record);
}