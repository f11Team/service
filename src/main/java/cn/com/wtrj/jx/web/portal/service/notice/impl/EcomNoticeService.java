package cn.com.wtrj.jx.web.portal.service.notice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtNoticeSendStatus;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentNoticeSendStatus;
import cn.com.wtrj.jx.web.portal.service.notice.IEcomNoticeService;

@Service
public class EcomNoticeService implements IEcomNoticeService {

	@Autowired
	private WtrjEcomNoticeMapper mapper;
	
	@Autowired
	private MtNoticeMapper noticeMapper;
	
	@Override
	public void saveNotice(WtrjEcomNotice record) {
		mapper.insert(record);
	}

	@Override
	public WtrjEcomNotice searchNoticeDetailById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public WtrjEcomNotice searchNoticeDetailByNoticeNo(String noticeNo) {
		
		WtrjEcomNoticeExample example = new WtrjEcomNoticeExample();
		example.createCriteria().andNoticeNoEqualTo(noticeNo);
		List<WtrjEcomNotice> details = mapper.selectByExample(example);
		if (details != null && details.size() > 0) {
			return details.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjEcomNotice> searhNoticeByTeacherId(Integer userId) {
		WtrjEcomNoticeExample example = new WtrjEcomNoticeExample();
		example.createCriteria().andTeacherIdEqualTo(userId).andTypeEqualTo("01");
		example.setOrderByClause("PULISH_TIME DESC");
		return mapper.selectByExample(example);
	}

	@Override
	public List<WtrjEcomNotice> searhTeacherNoticeByTeacherId(Integer userId) {
		WtrjEcomNoticeExample example = new WtrjEcomNoticeExample();
		example.createCriteria().andTeacherIdEqualTo(userId).andTypeEqualTo("11");
		example.setOrderByClause("PULISH_TIME DESC");
		return mapper.selectByExample(example);
	}

	@Override
	public List<MtNoticeSendStatus> searchWxNoticeSendStatus(String msgCode) {
		return noticeMapper.selectWxNoticeSendStatus(msgCode);
	}

	@Override
	public List<MtNoticeSendStatus> searchShortMsgNoticeSendStatus(String msgCode) {
		return noticeMapper.selectShortMsgNoticeSendStatus(msgCode);
	}

	@Override
	public List<MtParentNoticeSendStatus> searchParentNoticeSendStatus(String msgCode) {
		return noticeMapper.selectParentNoticeSendStatus(msgCode);
	}

}
