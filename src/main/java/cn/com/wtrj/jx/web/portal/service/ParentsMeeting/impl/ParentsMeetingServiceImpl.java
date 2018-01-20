package cn.com.wtrj.jx.web.portal.service.ParentsMeeting.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomParentsMeetingMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomPmtNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomParentsMeeting;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPmtNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.dao.parent.MtWtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.parentsMeeting.ParentsMeetingMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.ParentsRespWithStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.PrentsMeetingRespDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentRespWithClass;
import cn.com.wtrj.jx.web.portal.service.ParentsMeeting.IParentsMeetingService;
import cn.com.wtrj.jx.web.portal.util.DateUtil;
import cn.com.wtrj.jx.web.portal.util.QRCodeUtil;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.WxCpMessage;

@Service
public class ParentsMeetingServiceImpl implements IParentsMeetingService {

	@Autowired
	private ParentsMeetingMapper parentsMeetingMapper;

	@Autowired
	private WtrjEcomParentsMeetingMapper weParentsMeetingMapper;
	@Autowired
	private WtrjEcomPmtNoticeMapper pmtNoticeMapper;
	@Autowired
	private MtWtrjParentMapper mtWtrjParentMapper;

	@Override
	public List<StudentRespWithClass> searchStudentsByTeacherId(Integer id) {
		return parentsMeetingMapper.searchStudentsByTeacherId(id);
	}

	@Override
	public List<PrentsMeetingRespDto> searchPrentsMeetingByTeacherId(Integer id) {

		return parentsMeetingMapper.searchPrentsMeetingByTeacherId(id);
	}

	@Override
	public Integer searchClassIdByTeacherId(Integer id) {
		return parentsMeetingMapper.searchClassIdByTeacherId(id);
	}

	@Override
	 @Transactional
	public void savePm(WtrjEcomParentsMeeting pmt) {
		weParentsMeetingMapper.insertSelective(pmt);
	}

	@Override
	public List<StudentRespWithClass> searchStudentByClassId(Integer id) {
		return parentsMeetingMapper.searchStudentByClassId(id);
	}

	@Override
	 @Transactional
	public void savePmtNotice(WtrjEcomPmtNotice pmtNotice) {
		pmtNoticeMapper.insertSelective(pmtNotice);
	}

	@Override
	public List<ParentsRespWithStudent> searchParentsPhoneByTeacherId(Integer id) {
		return parentsMeetingMapper.searchParentsPhoneByTeacherId(id);
	}

	@Override
	public String searchClassByTeacherId(Integer id) {
		return parentsMeetingMapper.searchClassByTeacherId(id);
	}

	@Override
	public WtrjStudent searchWtrjStudent(String studentNo) {
		return parentsMeetingMapper.searchWtrjStudent(studentNo);
	}

	@Override
	public List<WtrjEcomPmtNotice> searchParentsMeetingDetail(Integer id) {
		return parentsMeetingMapper.searchParentsMeetingDetail(id);
	}

	@Override
	public PrentsMeetingRespDto searchParentsMeetingById(Integer id) {
		return parentsMeetingMapper.searchParentsMeetingById(id);
	}

	@Override
	 @Transactional
	public void publishPt(WtrjEcomParentsMeeting pmt, String cardNo, String qtext, WxCpService wxCpService,
			String mediaId, String codeUrl, String appId, String seCret, String fileUrl, Integer agentid) {
		try {
			weParentsMeetingMapper.insertSelective(pmt);
			List<StudentRespWithClass> sList = parentsMeetingMapper.searchStudentByClassId(pmt.getClassId());
			if (sList != null && sList.size() > 0) {
				for (int i = 0; i < sList.size(); i++) {
					List<MtParentInfo> parentsList = mtWtrjParentMapper
							.findWtrjParentsByStudentNo(sList.get(i).getStudentNo());
					WtrjEcomPmtNotice pmtNotice = new WtrjEcomPmtNotice();
					pmtNotice.setCreateTime(new Date());
					pmtNotice.setMettingId(pmt.getId());
					pmtNotice.setStudentName(sList.get(i).getName());
					pmtNotice.setStudentNo(sList.get(i).getStudentNo());
					pmtNotice.setUpdateTime(new Date());
					if (parentsList != null && parentsList.size() > 0) {
						for (MtParentInfo parent : parentsList) {
							try {
								// 生成二维码并保存到指定盘符(以卡号命名)
								QRCodeUtil.encode(qtext, "", codeUrl + cardNo + ".jpg", true);
							} catch (Exception e) {
								e.printStackTrace();
							}
							// 将二维码发送给家长
							// WxCpService wxCpService =
							// WeixinUtil.getWxCpService(appId,seCret);
							// String mediaId =
							// WeixinUtil.uploadMedia(wxCpService.getAccessToken(),
							// "image", fileUrl);
							WxCpMessage wxTextMessage = WxCpMessage.TEXT().agentId(agentid).toUser(parent.getPhone())// parent.getPhone()
									.content("亲爱的家长：你好，我是你孩子的班主任。请准时参加于"
											+ DateUtil.dateTodateStr(pmt.getStartTime(), DateUtil.DATAFORMAT_FULL_STR)
											+ "举行的家长会，到校时请用下面的二维码在学校门口扫码进校。")
									.build(); // parent.getPhone()
							WxCpMessage wxImageMessage = WxCpMessage.IMAGE().agentId(agentid).toUser(parent.getPhone())
									.mediaId(mediaId).build();
							try {
								wxCpService.messageSend(wxTextMessage);
								wxCpService.messageSend(wxImageMessage);
							} catch (WxErrorException e) {
								e.printStackTrace();
							}

						}
						pmtNotice.setNoticeStatus("02");
						pmtNoticeMapper.insertSelective(pmtNotice);
					} else {
						pmtNotice.setNoticeStatus("01");
						pmtNoticeMapper.insertSelective(pmtNotice);
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
