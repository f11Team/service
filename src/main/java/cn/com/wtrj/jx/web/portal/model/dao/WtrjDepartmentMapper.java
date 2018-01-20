package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartment;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjDepartmentMapper {
    int countByExample(WtrjDepartmentExample example);

    int deleteByExample(WtrjDepartmentExample example);

    int deleteByPrimaryKey(String code);

    int insert(WtrjDepartment record);

    int insertSelective(WtrjDepartment record);

    List<WtrjDepartment> selectByExample(WtrjDepartmentExample example);

    WtrjDepartment selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") WtrjDepartment record, @Param("example") WtrjDepartmentExample example);

    int updateByExample(@Param("record") WtrjDepartment record, @Param("example") WtrjDepartmentExample example);

    int updateByPrimaryKeySelective(WtrjDepartment record);

    int updateByPrimaryKey(WtrjDepartment record);
}