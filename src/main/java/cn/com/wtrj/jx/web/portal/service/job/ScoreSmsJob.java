package cn.com.wtrj.jx.web.portal.service.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import cn.com.wtrj.jx.web.portal.service.ScoreNoticeService;
import cn.com.wtrj.jx.web.portal.service.ScoreUploadService;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.Sms;
import cn.com.wtrj.jx.web.portal.util.WeixinUtil;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.bean.WxCpMessageSendResult;

public class ScoreSmsJob implements Runnable {

	private static Logger logger = Logger.getLogger(ScoreSmsJob.class);
	
	private ScoreNoticeService scoreNoticeService;
	
	private List<Score> scores;

	private Sms sms;
	
	private boolean single;
	
	private String types;
	
	public ScoreSmsJob(ScoreNoticeService scoreNoticeService, List<Score> scores, String types, boolean single, Sms sms) {
		this.scoreNoticeService = scoreNoticeService;
		this.scores = scores;
		this.sms = sms;
		this.types = types;
		this.single = single;
	}

	@Override
	public void run() {
		
		try {
			//是否启用短信发送
			if(!sms.isSmsEnabled()) {
				return;
			}
			
			logger.info(" ----- sms 短信发送成绩  开始  ----- ");
			
			if(single) {
				sendSingle();
			}
			else {
				sendSum();
			}
			
			logger.info(" ----- sms 短信发送成绩  结束  ----- ");
			
		}
		catch (Exception e) {
			logger.info(" ----- sms 短信发送成绩  出错  信息" + e.getMessage());
		}
		
		
	}
	
	/*private void sendWx(List<Map<String, String>> list) {
		logger.info("start send wx message:sendAppId-" + sms.getSendAppid() + " sendSecret-" + sms.getSendSecret() + " agentId:" + sms.getAgentId());
		try{
			WxCpService wxCpService = WeixinUtil.getWxCpService(sms.getSendAppid(),sms.getSendSecret());
			
			logger.info("send wx--size:"+list.size());
			for(Map<String, String> m : list) {
				
				String content = m.get("content");
				String phone = m.get("phone");
				logger.info("send wx--phone:"+phone+" content:"+content);
				try {
					WxCpMessage wxmessage = WxCpMessage.TEXT().agentId(sms.getAgentId()).toUser(phone).content(content).build();
					WxCpMessageSendResult result = wxCpService.messageSend(wxmessage);
					logger.info(result.toString());
				} catch (WxErrorException e) {
					logger.error("微信成绩发送异常。",e);
				}
			}
		} catch (Exception e){
			logger.error("微信成绩发送异常。",e);
		}
		
		
	}*/
	//发送合计总分
	private void sendSum() {

		if(scores != null && scores.size() >0) {
			
			List<Map<String, String>> list = new ArrayList<>();
			
			boolean order = false;
			boolean avg = false;
			boolean top = false;
			
			if(StringUtils.isNotBlank(types)) {
				String [] ts = types.split(",");
				order = Boolean.valueOf(ts[0]);
				avg = Boolean.valueOf(ts[1]);
				top = Boolean.valueOf(ts[2]);
			}
			
			for(Score s : scores) {
				Map<String, String> map = new HashMap<String, String>();
				
				List<Score> ssList = scoreNoticeService.findStudentDetailScore(s.getClassId(), s.getExamInsId(), s.getName());
				
				StringBuilder sb = new StringBuilder();
				sb.append("【维睿教育社区】 ").append(s.getName()).append("在 [ ");
				//sb.append(s.getExamInsName());
				sb.append(s.getClassName()).append(" ").append(s.getTypeName());
				sb.append(" ] 考试中， 成绩总分：").append(s.getSumNumber());
				sb.append("，").append("考试满分为：").append(s.getFullScore());
				//黄文静在【5月月考】成绩总分：435，语文：104，数学：134，英语：140，物理：57，班级最高分：435
				for(Score ss : ssList) {
					sb.append("，").append(ss.getCourseName()).append("：").append(ss.getScore());
				}
				
				if(order) {
					sb.append("，班级排名：").append(s.getOrderNumber());
				}
				
				if(avg) {
					sb.append("，班级平均分：").append(s.getAverageNumber());
				}
				
				if(top) {
					sb.append("，班级最高分：").append(s.getClassTopScore());
				}
				
				//sb.append("，班级最高分：").append(s.getClassTopScore());
				
				//map.put("title", "考试成绩通知");
				map.put("content", sb.toString());
				map.put("phone", s.getParentPhone());
				
				list.add(map);
			}
			
			sendSms(list);
			
			logger.info("  -- sms --  综合成绩成绩["+scores.get(0).getExamInsName()+"]发送通知,发送人: " + sms.getSendTeacherName());
		}
	}
	
	//返送单科成绩
	private void sendSingle() {

		if(scores != null && scores.size() >0) {
			
			List<Map<String, String>> list = new ArrayList<>();
			boolean order = false;
			boolean avg = false;
			boolean top = false;
			
			if(StringUtils.isNotBlank(types)) {
				String [] ts = types.split(",");
				order = Boolean.valueOf(ts[0]);
				avg = Boolean.valueOf(ts[1]);
				top = Boolean.valueOf(ts[2]);
			}
			for(Score s : scores) {
				
				List<String> phones = scoreNoticeService.findParentPhoneByStudentNameAndClassId(s.getStudentName(), s.getClassId());
				
				if(phones != null && phones.size() > 0) {
					
					for(String phone : phones) {
						Map<String, String> map =  new HashMap<String, String>();
						
						StringBuilder sb = new StringBuilder();
						sb.append("【维睿教育社区】 ").append(s.getStudentName()).append("在 [ ");
//						sb.append(s.getExamInsName())
						sb.append(s.getClassName()).append(" ").append(s.getTypeName());
						sb.append(" ] 考试中，").append(s.getCourseName());
						sb.append(" 成绩为: ").append(s.getScore()).append(", 满分为: ").append(s.getFullScore());
						//黄文静在【5月月考】成绩总分：435，语文：104，数学：134，英语：140，物理：57，班级最高分：435
						if(order) {
							sb.append("，班级排名：").append(s.getOrderNumber());
						}
						
						if(avg) {
							sb.append("，班级平均分：").append(s.getAverageNumber());
						}
						
						if(top) {
							sb.append("，班级最高分：").append(s.getClassTopScore());
						}
						//sb.append("，班级最高分：").append(s.getClassTopScore());
						
						//map.put("title", "考试成绩通知");
						map.put("content", sb.toString());
						map.put("phone", phone);
						
						list.add(map);
					}
					
				}
				
				
			}
			
			
			sendSms(list);

			logger.info("  -- sms --  单科成绩成绩["+scores.get(0).getExamInsName()+"]发送通知,发送人: " + scores.get(0).getTeacherName());
			
		}
		
	}
	
	private void sendSms(List<Map<String, String>> list) {
		
//		RestTemplate smsRestTemplate = new RestTemplate();
//
//		StringBuilder smsUrlBuilder = new StringBuilder(sms.getSmsUrl());
//		smsUrlBuilder.append(sms.getSmsClientId()).append("/sendsms");
//
//		Map<String, String> body = new HashMap<String, String>();
//		body.put("clientid", sms.getSmsClientId());
//		body.put("password", sms.getSmsPassword());
//		body.put("smstype", sms.getSmsType());
//		
//		HttpEntity<Map<String, String>> request = null;
//		
//		for(Map<String, String> m : list) {
//			//String title = m.get("title");
//			String content = m.get("content");
//			String phone = m.get("phone");
//			
//			body.put("content", content);
//			body.put("mobile", phone);
//			
//			request = new HttpEntity<Map<String, String>>(body);
//			String smsResult = smsRestTemplate.postForObject(smsUrlBuilder.toString(), request, String.class);
//			logger.info(" -- sms -- 短信发送保文报文：" + phone +" - " + content);
//			logger.info(" -- sms -- 短信发送返回报文：" + smsResult);
//		}
		
	}

}
