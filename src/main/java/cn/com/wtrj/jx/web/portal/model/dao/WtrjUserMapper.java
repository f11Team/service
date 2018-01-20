package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjUserMapper {
    int countByExample(WtrjUserExample example);

    int deleteByExample(WtrjUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtrjUser record);

    int insertSelective(WtrjUser record);

    List<WtrjUser> selectByExample(WtrjUserExample example);

    WtrjUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtrjUser record, @Param("example") WtrjUserExample example);

    int updateByExample(@Param("record") WtrjUser record, @Param("example") WtrjUserExample example);

    int updateByPrimaryKeySelective(WtrjUser record);

    int updateByPrimaryKey(WtrjUser record);
    
    WtrjUser findUserByPhone(String tel);
    
    WtrjUser findUserByJobNumber(String jobNumber);
    
    List<WtrjUser> findUserForTeacher(@Param("tel") String tel, @Param("name") String name);
}