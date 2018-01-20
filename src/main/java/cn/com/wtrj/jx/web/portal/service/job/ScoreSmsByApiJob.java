package cn.com.wtrj.jx.web.portal.service.job;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.google.gson.JsonObject;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptMsg;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.service.ScoreNoticeService;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.SendScore;
import cn.com.wtrj.jx.web.portal.service.dto.Sms;
import cn.com.wtrj.jx.web.portal.service.dto.Student;
import cn.com.wtrj.jx.web.portal.service.impl.SmsService;
import cn.com.wtrj.jx.web.portal.util.HttpRequestUtils;

public class ScoreSmsByApiJob implements Runnable {

	private static Logger logger = Logger.getLogger(ScoreSmsByApiJob.class);

	private ScoreNoticeService scoreNoticeService;

	private SmsService smsService;

	private List<Score> scores;

	private Sms sms;

	private boolean single;

	private SendScore sendScore;

	private String sendShortMsgUrl;
	
	private String sendWxUrl;

	public ScoreSmsByApiJob(ScoreNoticeService scoreNoticeService, SmsService smsService, List<Score> scores,
			SendScore sendScore, boolean single, Sms sms, String sendShortMsgUrl, String sendWxUrl) {
		this.scoreNoticeService = scoreNoticeService;
		this.smsService = smsService;
		this.scores = scores;
		this.sms = sms;
		this.sendScore = sendScore;
		this.single = single;
		this.sendShortMsgUrl = sendShortMsgUrl;
		this.sendWxUrl = sendWxUrl;
	}

	@Override
	public void run() {

		try {
			// 是否启用短信发送
			// if (!sms.isSmsEnabled()) {
			// return;
			// }

			logger.info(" ----- sms 短信发送成绩  开始  ----- ");

			if (single) {
				sendSingle();
			} else {
				sendSum();
			}

			logger.info(" ----- sms 短信发送成绩  结束  ----- ");

		} catch (Exception e) {
			logger.error(" ----- sms 短信发送成绩  出错  信息", e);
		}

	}

	/*
	 * private void sendWx(List<Map<String, String>> list) {
	 * logger.info("start send wx message:sendAppId-" + sms.getSendAppid() +
	 * " sendSecret-" + sms.getSendSecret() + " agentId:" + sms.getAgentId());
	 * try{ WxCpService wxCpService =
	 * WeixinUtil.getWxCpService(sms.getSendAppid(),sms.getSendSecret());
	 * 
	 * logger.info("send wx--size:"+list.size()); for(Map<String, String> m :
	 * list) {
	 * 
	 * String content = m.get("content"); String phone = m.get("phone");
	 * logger.info("send wx--phone:"+phone+" content:"+content); try {
	 * WxCpMessage wxmessage =
	 * WxCpMessage.TEXT().agentId(sms.getAgentId()).toUser(phone).content(
	 * content).build(); WxCpMessageSendResult result =
	 * wxCpService.messageSend(wxmessage); logger.info(result.toString()); }
	 * catch (WxErrorException e) { logger.error("微信成绩发送异常。",e); } } } catch
	 * (Exception e){ logger.error("微信成绩发送异常。",e); }
	 * 
	 * 
	 * }
	 */
	// 发送合计总分
	private void sendSum() {

		if (scores != null && scores.size() > 0) {

			List<Map<String, String>> list = new ArrayList<>();

			boolean order = false;
			boolean avg = false;
			boolean top = false;
			boolean grade = false;
			boolean singleFull = false;
			boolean artsScore = false;
			boolean scienceScore = false;
			boolean singleOrder = false;
			boolean artsOrder = false;
			boolean scienceOrder = false;
			boolean singleGradeOrder = false;
			boolean artsGradeOrder = false;
			boolean scienceGradeOrder = false;
			boolean classRemark = false;
			int classNum = 0;
			int gradeNum = 0;

			/*if (StringUtils.isNotBlank(types)) {
				String[] ts = types.split(",");
				order = Boolean.valueOf(ts[0]);
				avg = Boolean.valueOf(ts[1]);
				top = Boolean.valueOf(ts[2]);
			}*/
			if(sendScore != null) {
				order = sendScore.isSendClassOrder();
				avg = sendScore.isSendAvgScore();
				top = sendScore.isSendTopScore();
				grade = sendScore.isSendGrdeOrder();
				classNum = sendScore.getSendClassOrderNum();
				gradeNum = sendScore.getSendGrdeOrderNum();
				singleFull = sendScore.isSendSingleFull();
				artsScore = sendScore.isSendArtsScore();
				scienceScore = sendScore.isSendScienceScore();
				singleOrder = sendScore.isSendSingleOrder();
				artsOrder = sendScore.isSendArtsOrder();
				scienceOrder = sendScore.isSendScienceOrder();
				singleGradeOrder = sendScore.isSendSingleGradeOrder();
				artsGradeOrder = sendScore.isSendArtsGradeOrder();
				scienceGradeOrder = sendScore.isSendScienceGradeOrder();
				classRemark = sendScore.isSendClassRemark();
			}

			for (Score s : scores) {
				Map<String, String> map = new HashMap<String, String>();

				List<Score> ssList = scoreNoticeService.findStudentDetailScore(s.getClassId(), s.getExamInsId(),
						s.getName());
				//查询成绩的总表
				List<WtrjRptScoreDetail> scoreDetails = scoreNoticeService.findScoreDetail(Integer.valueOf(s.getClassId()), Integer.valueOf(s.getExamInsId()));
				//查询单科目表
				List<WtrjRptScoreSingle> scoreSingles = scoreNoticeService.findScoreSingleByName(Integer.valueOf(s.getExamInsId()), Integer.valueOf(s.getClassId()), s.getName());
			
				StringBuilder sb = new StringBuilder();
				sb.append("【维睿教育社区】 ").append(s.getName()).append("在 [ ");
				sb.append(s.getExamInsName());
				//sb.append(s.getClassName()).append(" ").append(s.getTypeName());
				sb.append(" ] 考试中， 成绩总分：").append(doubleTrans(s.getSumNumber()));
				sb.append("，").append("考试满分为：").append(s.getFullScore());
				// 黄文静在【5月月考】成绩总分：435，语文：104，数学：134，英语：140，物理：57，班级最高分：435
				if (scoreDetails != null && scoreDetails.size() > 0) {
					for (WtrjRptScoreDetail w : scoreDetails) {
						
						if ("1".equals(w.getScoreMulti()) && s.getName().equals(w.getStudentName())) {
							sb.append("，");
							sb.append(w.getCourseName()).append("：").append(w.getScore()).append(",").append("A卷：").append(doubleTrans(w.getScoreA().doubleValue()))
							.append(",").append("B卷：").append(doubleTrans(w.getScoreB().doubleValue()));
						} 
						
						if ("0".equals(w.getScoreMulti()) && s.getName().equals(w.getStudentName())) {
							sb.append("，");
							sb.append(w.getCourseName()).append("：").append(doubleTrans(w.getScore().doubleValue()));
						}
						if(s.getName().equals(w.getStudentName())){
							if(scoreSingles != null) {
								for (WtrjRptScoreSingle single : scoreSingles) {
									if(single.getCourseName().equals(w.getCourseName())) {
										//单科满分
										if(singleFull) {
											sb.append("，");
											sb.append(single.getCourseName()).append("满分：").append(doubleTrans(single.getFullScore().doubleValue()));	
										}
										//单科排名
										if(singleOrder) {
											if(classNum > 0) {
												if(single.getOrderClassNumber() < classNum) {
													sb.append("，该科目班级排名：").append(single.getOrderClassNumber());
												}
											}else {
												sb.append("，该科目班级排名：").append(single.getOrderClassNumber());
											}
										}
										//单科年级排名
										if(singleGradeOrder) {
											if(gradeNum >0) {
												if(single.getOrderGradeNumber() < gradeNum) {
													sb.append("，该科目年级排名：").append(single.getOrderGradeNumber());
												}
											}else {
												sb.append("，该科目年级排名：").append(single.getOrderGradeNumber());
											}
										}
									}
								}
							}
							
						}
					}
				}
				
				
				
				for (Score ss : ssList) {
					
					if(StringUtils.isNotBlank(ss.getRemark())){
						sb.append(", 评语：").append(ss.getRemark());
					}
				}
				
				if (order) {
					if(classNum > 0) {
						if(s.getOrderNumber() <= classNum) {
							sb.append("，总分班级排名：").append(s.getOrderNumber());
						}
					}
					else {
						sb.append("，总分班级排名：").append(s.getOrderNumber());
					}
				}
				
				if (grade) {
					if(gradeNum > 0) {
						if(s.getGradeOrderNo() <= gradeNum) {
							sb.append("，总分年级排名：").append(s.getGradeOrderNo());
						}
						
					}
					else {
						sb.append("，总分年级排名：").append(s.getGradeOrderNo());
					}
				}

				if (avg) {
					sb.append("，班级平均分：").append(doubleTrans(s.getAverageNumber()));
				}

				if (top) {
					sb.append("，班级最高分：").append(doubleTrans(s.getClassTopScore()));
				}
				
				if(artsScore) {
					sb.append("，文综总分：").append(doubleTrans(s.getArtsScore()));
				}
				if(artsOrder) {
					sb.append("，文综班级排名：").append(s.getArtsOrdClassNum());
				}
				if(artsGradeOrder) {
					sb.append("，文综年级排名：").append(s.getArtsOrdGradeNum());
				}
				
				if(scienceScore) {
					sb.append("，理综总分：").append(doubleTrans(s.getScienceScore()));
				}
				if(scienceOrder) {
					sb.append("，理综班级排名：").append(s.getScienceOrdClassNum());
				}
				if(scienceGradeOrder) {
					sb.append("，理综年级排名：").append(s.getScienceOrdGradeNum());
				}
				
				if(classRemark) {
					sb.append("，班级总评语：").append(s.getClassRemark());
				}

				// sb.append("，班级最高分：").append(s.getClassTopScore());
				///System.out.println(sb);
				logger.info(s.getParentPhone() + " : " + sb.toString());
				// map.put("title", "考试成绩通知");
				map.put("content", sb.toString());
				map.put("phone", s.getParentPhone());

				list.add(map);
			}

			sendSms(list);

			sendWx(list);

			logger.info(
					"  -- sms --  综合成绩成绩[" + scores.get(0).getExamInsName() + "]发送通知,发送人: " + sms.getSendTeacherName());
		}
	}

	// 返送单科成绩
	private void sendSingle() {

		if (scores != null && scores.size() > 0) {

			List<Map<String, String>> list = new ArrayList<>();

			boolean order = false;
			boolean avg = false;
			boolean top = false;
			boolean grade = false;
			int classNum = 0;
			int gradeNum = 0;

			/*if (StringUtils.isNotBlank(types)) {
				String[] ts = types.split(",");
				order = Boolean.valueOf(ts[0]);
				avg = Boolean.valueOf(ts[1]);
				top = Boolean.valueOf(ts[2]);
			}*/
			if(sendScore != null) {
				order = sendScore.isSendClassOrder();
				avg = sendScore.isSendAvgScore();
				top = sendScore.isSendTopScore();
				grade = sendScore.isSendGrdeOrder();
				classNum = sendScore.getSendClassOrderNum();
				gradeNum = sendScore.getSendGrdeOrderNum();
			}
			
			for (Score s : scores) {

				List<String> phones = scoreNoticeService.findParentPhoneByStudentNameAndClassId(s.getStudentName(),
						s.getClassId());
				//查询成绩的总表
				List<WtrjRptScoreDetail> scoreDetails = scoreNoticeService.findScoreDetail(Integer.valueOf(s.getClassId()), Integer.valueOf(s.getExamInsId()));
				
				if (phones != null && phones.size() > 0) {

					for (String phone : phones) {
						Map<String, String> map = new HashMap<String, String>();

						StringBuilder sb = new StringBuilder();
						sb.append("【维睿教育社区】 ").append(s.getStudentName()).append("在 [ ");
						// sb.append(s.getExamInsName())
						sb.append(s.getClassName()).append(" ").append(s.getTypeName());
						sb.append(" ] 考试中，").append(s.getCourseName());
						
						if (scoreDetails != null && scoreDetails.size() > 0) {
							for (WtrjRptScoreDetail w : scoreDetails) {
								
								if ("1".equals(w.getScoreMulti()) && s.getName().equals(w.getStudentName())) {
									sb.append("，");
									sb.append(" 成绩为: ").append(w.getScore()).append(",").append("A卷：").append(w.getScoreA())
									.append(",").append("B卷：").append(w.getScoreB()).append(", 满分为: ").append(s.getFullScore());
								}
								if ("0".equals(w.getScoreMulti()) && s.getName().equals(w.getStudentName())) {
									sb.append("，");
									sb.append(" 成绩为: ").append(w.getScore()).append(", 满分为: ").append(s.getFullScore());
								}
							}
						}
						
					
						// 黄文静在【5月月考】成绩总分：435，语文：104，数学：134，英语：140，物理：57，班级最高分：435
						if (order) {
							if(classNum > 0) {
								if(s.getOrderNumber() <= classNum) {
									sb.append("，班级排名：").append(s.getOrderNumber());
								}
							}
							else {
								sb.append("，班级排名：").append(s.getOrderNumber());
							}
						}
						
						if (grade) {
							if(gradeNum > 0) {
								if(s.getGradeOrderNo() <= gradeNum) {
									sb.append("，年级排名：").append(s.getGradeOrderNo());
								}
								
							}
							else {
								sb.append("，年级排名：").append(s.getGradeOrderNo());
							}
						}

						if (avg) {
							sb.append("，班级平均分：").append(s.getAverageNumber());
						}

						if (top) {
							sb.append("，班级最高分：").append(s.getClassTopScore());
						}
						// sb.append("，班级最高分：").append(s.getClassTopScore());

						// map.put("title", "考试成绩通知");
						map.put("content", sb.toString());
						map.put("phone", phone);

						list.add(map);
					}

				}

			}

			sendSms(list);

			sendWx(list);

			logger.info("  -- sms --  单科成绩成绩[" + scores.get(0).getExamInsName() + "]发送通知,发送人: "
					+ scores.get(0).getTeacherName());

		}

	}

	private void sendSms(List<Map<String, String>> list) {

		for (Map<String, String> m : list) {
			// String title = m.get("title");
			String messageId = UUID.randomUUID().toString();
			
			String content = m.get("content");
			String phone = m.get("phone");

			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("content", content);
			jsonObject.addProperty("smsType", "0");
			jsonObject.addProperty("messageId", messageId);
			jsonObject.addProperty("mobile", phone);
			logger.info(jsonObject.toString());
			// 短信通知
			JsonObject result = HttpRequestUtils.httpPost(sendShortMsgUrl, jsonObject);

			WtrjRptMsg param = new WtrjRptMsg();
			param.setContent(content);
			param.setMsgCode(sms.getMsgCode());
			param.setType("3");
			param.setMsgType("2");
			param.setSendTime(Calendar.getInstance().getTime());
			param.setToUser(phone);
			if (result != null && result.get("errorcode") != null
					&& "0".equals(result.get("errorcode").getAsString())) {
				param.setSuccessFlag("2");

			} else {
				param.setSuccessFlag("1");

			}
			param.setId(messageId);
			smsService.saveSmsInfo(param);

		}

	}

	private void sendWx(List<Map<String, String>> list) {

		for (Map<String, String> m : list) {
			// String title = m.get("title");
			String messageId = UUID.randomUUID().toString();
			String content = m.get("content");
			String phone = m.get("phone");

			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("sendAppid", sms.getSendAppid());
			jsonObject.addProperty("agentId", sms.getAgentId());
			jsonObject.addProperty("messageId", messageId);
			jsonObject.addProperty("sendSecret", sms.getSendSecret());
			jsonObject.addProperty("content", content);
			jsonObject.addProperty("toUser", phone);

			// 发送微信
			JsonObject result = HttpRequestUtils.httpPost(sendWxUrl, jsonObject);

			WtrjRptMsg param = new WtrjRptMsg();
			param.setContent(content);
			param.setMsgCode(sms.getMsgCode());
			param.setType("3");
			param.setMsgType("1");
			param.setSendTime(Calendar.getInstance().getTime());
			param.setToUser(phone);
			if (result != null && result.get("errorcode") != null
					&& "0".equals(result.get("errorcode").getAsString())) {
				param.setSuccessFlag("2");

			} else {
				param.setSuccessFlag("3");

			}
			param.setId(messageId);
			smsService.saveSmsInfo(param);

		}

	}
	
	 public static String doubleTrans(double d){
		  if(Math.round(d)-d==0){
		   return String.valueOf((long)d);
		  }
		  d=Math.floor(d*10)/10;
		  return String.valueOf(d);
		 }

}
