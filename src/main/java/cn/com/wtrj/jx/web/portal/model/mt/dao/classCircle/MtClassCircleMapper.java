package cn.com.wtrj.jx.web.portal.model.mt.dao.classCircle;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircle;

public interface MtClassCircleMapper {
	List<WtrjEcomClass> selectUserClass(Integer userId);
	
	List<WtrjEcomClassCircle> selectClassCircle(@Param("studentId")Integer studentId,@Param("type")String type);

}
