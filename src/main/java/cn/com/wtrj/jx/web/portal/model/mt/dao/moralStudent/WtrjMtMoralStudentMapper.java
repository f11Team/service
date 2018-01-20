package cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WtrjMtMoralStudentMapper {


    List<WtrjMoralStudent> selectByPage(@Param("start") Integer start, @Param("end") Integer end);
}