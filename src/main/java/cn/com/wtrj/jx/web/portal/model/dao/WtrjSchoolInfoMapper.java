package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjSchoolInfoMapper {
    int countByExample(WtrjSchoolInfoExample example);

    int deleteByExample(WtrjSchoolInfoExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjSchoolInfo record);

    int insertSelective(WtrjSchoolInfo record);

    List<WtrjSchoolInfo> selectByExample(WtrjSchoolInfoExample example);

    WtrjSchoolInfo selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjSchoolInfo record, @Param("example") WtrjSchoolInfoExample example);

    int updateByExample(@Param("record") WtrjSchoolInfo record, @Param("example") WtrjSchoolInfoExample example);

    int updateByPrimaryKeySelective(WtrjSchoolInfo record);

    int updateByPrimaryKey(WtrjSchoolInfo record);
}