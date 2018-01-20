package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomTeacherNoticeGroupMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTeacherNoticeGroup;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTeacherNoticeGroupExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtTeacherNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtTeacherNoticeGroup;
import cn.com.wtrj.jx.web.portal.service.ITeacherNoticeGroupService;

@Service
public class TeacherNoticeGroupService implements ITeacherNoticeGroupService {

	@Autowired
	private WtrjEcomTeacherNoticeGroupMapper mapper;

	@Autowired
	private MtTeacherNoticeMapper mtGroupMapper;

	@Override
	public void saveGroup(WtrjEcomTeacherNoticeGroup param) {
		mapper.insertSelective(param);
	}

	@Override
	@Transactional
	public void saveGroupList(List<WtrjEcomTeacherNoticeGroup> params) {
		for (WtrjEcomTeacherNoticeGroup param : params) {
			mapper.insertSelective(param);
		}
	}

	@Override
	public List<MtTeacherNoticeGroup> searchByTeacherId(int teacherId) {
		return mtGroupMapper.selectGroupByBelongTeacherId(teacherId);
	}

	@Override
	public List<WtrjEcomTeacherNoticeGroup> searchByGroupBode(String groupCode) {
		WtrjEcomTeacherNoticeGroupExample example = new WtrjEcomTeacherNoticeGroupExample();
		example.createCriteria().andGroupCodeEqualTo(groupCode).andFlagEqualTo("1");
		return mapper.selectByExample(example);
	}

	@Override
	public List<WtrjEcomTeacherNoticeGroup> searchByGroupBodes(List<String> codes) {
		WtrjEcomTeacherNoticeGroupExample example = new WtrjEcomTeacherNoticeGroupExample();
		example.createCriteria().andGroupCodeIn(codes);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteGroupByGroupBode(String groupCode) {
		WtrjEcomTeacherNoticeGroup group = new WtrjEcomTeacherNoticeGroup();
		group.setGroupCode(groupCode);
		mapper.deleteGroupByGroupBode(group);
	}

	@Override
	public void delMemberByGroupCode(String groupCode, int memberTeacherId) {
		WtrjEcomTeacherNoticeGroup group = new WtrjEcomTeacherNoticeGroup();
		group.setGroupCode(groupCode);
		group.setMemberTeacherId(memberTeacherId);
		mapper.delMemberByGroupCode(group);
	}

}
