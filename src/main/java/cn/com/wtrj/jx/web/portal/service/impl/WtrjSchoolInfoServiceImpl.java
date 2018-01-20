package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolInfoMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolInfoExample;
import cn.com.wtrj.jx.web.portal.service.IWtrjSchoolInfoService;

/**
 * 学校业务接口
 * 
 * @author VI
 *
 */
@Service
public class WtrjSchoolInfoServiceImpl implements IWtrjSchoolInfoService {

	@Autowired
	private WtrjSchoolInfoMapper mapper;

	@Override
	public List<WtrjSchoolInfo> searchAll() {
		WtrjSchoolInfoExample ex = new WtrjSchoolInfoExample();
		return mapper.selectByExample(ex);
	}

	@Override
	public WtrjSchoolInfo searchSchoolBySchoolCode(String schoolCode) {
		return mapper.selectByPrimaryKey(schoolCode);
	}

	@Override
	public WtrjSchoolInfo searchSchoolByNickName(String schoolName) {
		WtrjSchoolInfoExample example = new WtrjSchoolInfoExample();
		example.createCriteria().andNickNameEqualTo(schoolName);
		
		List<WtrjSchoolInfo> infos = mapper.selectByExample(example);
		if (infos != null && infos.size() == 1) {
			return infos.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjSchoolInfo> searchSchoolBySchoolCodes(List<String> schoolCodes) {
		WtrjSchoolInfoExample example = new WtrjSchoolInfoExample();
		example.createCriteria().andCodeIn(schoolCodes);
		return mapper.selectByExample(example);
	}

}
