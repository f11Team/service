package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;

/**
 * 学校业务接口
 * 
 * @author VI
 *
 */
public interface IWtrjSchoolInfoService {
	/**
	 * 查询所有学校
	 * 
	 * @return
	 */
	List<WtrjSchoolInfo> searchAll();
	
	WtrjSchoolInfo searchSchoolBySchoolCode(String schoolCode);

	WtrjSchoolInfo searchSchoolByNickName(String schoolName);

	List<WtrjSchoolInfo> searchSchoolBySchoolCodes(List<String> schoolCodes);
}
