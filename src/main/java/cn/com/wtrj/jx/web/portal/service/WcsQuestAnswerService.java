package cn.com.wtrj.jx.web.portal.service;

public interface WcsQuestAnswerService {
	Integer findAnswerCountByCodeAndWcsClassNo(String wcsClassNo,String code,Integer gradeNo);
	
	Integer findAnswerCountByItemIdAndClassNo(String classNo,String itemId,Integer gradeNo);
}
