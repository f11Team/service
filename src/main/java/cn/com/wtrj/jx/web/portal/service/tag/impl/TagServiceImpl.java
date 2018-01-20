package cn.com.wtrj.jx.web.portal.service.tag.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.UserMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomTagMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserRoleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.User;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTag;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTagExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtUserMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.tag.MtTagMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserDto;
import cn.com.wtrj.jx.web.portal.service.UserService;
import cn.com.wtrj.jx.web.portal.service.tag.TagService;

@Service
public class TagServiceImpl implements TagService {
	@Autowired
	MtTagMapper mtTagMapper;
	@Autowired
	WtrjEcomTagMapper wtrjEcomTagMapper;
	
	
	@Override
	public List<WtrjEcomTag> searchTagByPage(Integer start, Integer end, String search) {
		return mtTagMapper.selectTagByPage(start, end, search);
	}

	@Override
	public int countTag(String search) {
		WtrjEcomTagExample example = new WtrjEcomTagExample();
		return wtrjEcomTagMapper.countByExample(example);
	}

	@Override
	public Boolean addTag(String tagName) {
		// 用户名重复性check
		WtrjEcomTagExample example = new WtrjEcomTagExample();
		example.createCriteria().andTagnameEqualTo(tagName);
		List<WtrjEcomTag> list = wtrjEcomTagMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return false;
		}

		// 保存
		WtrjEcomTag record = new WtrjEcomTag();
		record.setTagname(tagName);
		wtrjEcomTagMapper.insert(record);
		return true;
	}

	@Override
	public Boolean updateTag(WtrjEcomTag wtrjEcomTag) {
		WtrjEcomTagExample example = new WtrjEcomTagExample();
		example.createCriteria().andTagnameEqualTo(wtrjEcomTag.getTagname()).andIdNotEqualTo(wtrjEcomTag.getId());
		
		
		
		List<WtrjEcomTag> users = wtrjEcomTagMapper.selectByExample(example);

		if (users != null && users.size() > 0) {
			return false;
		}

		wtrjEcomTagMapper.updateByPrimaryKeySelective(wtrjEcomTag);

		return true;
	}

	@Override
	public void deleteTag(int id) {
		wtrjEcomTagMapper.deleteByPrimaryKey(id);
		
	}




}
