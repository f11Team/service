package cn.com.wtrj.jx.web.portal.service.research;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.stu.Student;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answer;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answers;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_item;

public interface StuResearch {
	Wcs_quest_answer searchOne(String id);
	Wcs_quest_item  searchQuestItem(String id);
	List<Wcs_quest_item>  selectWcsQuestItem();
	void insertOneAnswer(Wcs_quest_answers wqAnwer);
	void update(@Param("name") char num1,@Param("idCard") String idCard);
	Wcs_quest_answers selectOne(@Param("param1")String param1, @Param("idCard")String idCard);
//	List<Wcs_quest_answers> selectOne1(String idCard);
	Wcs_quest_item searchStuAnswers(String clazzNo1);
	Student searchCurryStu(String idCard);
	int searchCount(String idCard);
}
