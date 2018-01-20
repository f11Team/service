package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeTeacherAuth;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeTeacherAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjEcomNoticeTeacherAuthMapper {
    int countByExample(WtrjEcomNoticeTeacherAuthExample example);

    int deleteByExample(WtrjEcomNoticeTeacherAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjEcomNoticeTeacherAuth record);

    int insertSelective(WtrjEcomNoticeTeacherAuth record);

    List<WtrjEcomNoticeTeacherAuth> selectByExample(WtrjEcomNoticeTeacherAuthExample example);

    WtrjEcomNoticeTeacherAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjEcomNoticeTeacherAuth record, @Param("example") WtrjEcomNoticeTeacherAuthExample example);

    int updateByExample(@Param("record") WtrjEcomNoticeTeacherAuth record, @Param("example") WtrjEcomNoticeTeacherAuthExample example);

    int updateByPrimaryKeySelective(WtrjEcomNoticeTeacherAuth record);

    int updateByPrimaryKey(WtrjEcomNoticeTeacherAuth record);
}