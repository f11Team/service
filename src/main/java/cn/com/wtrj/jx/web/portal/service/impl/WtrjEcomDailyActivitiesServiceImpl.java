package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomDailyActivitiesMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjStudentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivities;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomDailyActivitiesExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.personalHomepage.DailyActivitiesMapper;
import cn.com.wtrj.jx.web.portal.service.IWtrjEcomDailyActivitiesService;

/**
 * 学生业务接口实现类
 * 
 * @author admin
 *
 */
@Service
public class WtrjEcomDailyActivitiesServiceImpl implements IWtrjEcomDailyActivitiesService {

	@Autowired
	private WtrjEcomDailyActivitiesMapper wtrjEcomDailyActivitiesMapper;
	@Autowired
	private WtrjStudentMapper wtrjStudentMapper;
	@Autowired
	private DailyActivitiesMapper dailyActivitiesMapper;

	@Override
	public List<WtrjEcomDailyActivities> searchDailyActivities(String stuIdCard) {
		/*WtrjEcomDailyActivitiesExample example = new WtrjEcomDailyActivitiesExample();
		example.createCriteria().andStudentNoEqualTo(stuIdCard.toLowerCase());
		List<WtrjEcomDailyActivities> wtrjEcomDailyActivitiesList=wtrjEcomDailyActivitiesMapper.selectByExample(example);
		if(wtrjEcomDailyActivitiesList!=null && wtrjEcomDailyActivitiesList.size()>0){
			return wtrjEcomDailyActivitiesList;
		}
		example.clear();
		example.createCriteria().andStudentNoEqualTo(stuIdCard.toUpperCase());
		wtrjEcomDailyActivitiesList = wtrjEcomDailyActivitiesMapper.selectByExample(example);
		if(wtrjEcomDailyActivitiesList!=null && wtrjEcomDailyActivitiesList.size()>0){
			return wtrjEcomDailyActivitiesList;
		}
		return null;*/
		
		List<WtrjEcomDailyActivities> list=dailyActivitiesMapper.searchDailyActivities(stuIdCard);
		if(list!=null && list.size()>0){
			return list;
		}else{
			return null;
		}
		
	}

	@Override
	 @Transactional
	public Boolean addDailyActivities(WtrjEcomDailyActivities wtrjEcomDailyActivities) {
		WtrjEcomDailyActivitiesExample example=new WtrjEcomDailyActivitiesExample();
		example.createCriteria().andContentEqualTo(wtrjEcomDailyActivities.getContent());
		List<WtrjEcomDailyActivities> list=wtrjEcomDailyActivitiesMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return false;
		}
		//保存
		wtrjEcomDailyActivitiesMapper.insertSelective(wtrjEcomDailyActivities);
		return true;
	}

	@Override
	public String searchStudentNameByStudentNo(String studentNo) {
		WtrjStudentExample example=new WtrjStudentExample();
		example.createCriteria().andStudentNoEqualTo(studentNo);
		List<WtrjStudent> list=wtrjStudentMapper.selectByExample(example);
		if(list!=null&& list.size()>0){
			return list.get(0).getName();
		}else{
			return null;
		}
	}

	

	@Override
	public void deleteActive(Integer id) {
		dailyActivitiesMapper.deleteActive(id);	
	}

	@Override
	public void updatePhoto(Integer id,String src) {
		dailyActivitiesMapper.updatePhoto(id,src);		
	}

	


}
