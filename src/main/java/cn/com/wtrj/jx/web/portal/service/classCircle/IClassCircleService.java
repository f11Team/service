package cn.com.wtrj.jx.web.portal.service.classCircle;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClassCircle;

public interface IClassCircleService {
	List<WtrjEcomClass> selectUserClass(Integer userId);
	
	int insertWtrjEcomClassCircle(WtrjEcomClassCircle cc);
	
	List<WtrjEcomClassCircle> selectWtrjEcomClassCircle(Integer userId,Integer classId,String type);
	
	List<WtrjEcomClassCircle> selectClassCircle(Integer studentId,String type);

}
