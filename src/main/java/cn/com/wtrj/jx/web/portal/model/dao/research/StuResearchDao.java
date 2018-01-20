package cn.com.wtrj.jx.web.portal.model.dao.research;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.stu.Student;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answer;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answers;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_item;


public interface StuResearchDao {
	Wcs_quest_answer searchOne(String id);
	
	Wcs_quest_item  searchQuestItem(String id);

	List<Wcs_quest_item> selectWcsQuestItem();

	Wcs_quest_item searchStuAnswers(String clazzNo);

	Student searchCurryStu(String idCard);

	void insertOneAnswer(Wcs_quest_answers wqAnwer);



	/*void update(char num1, String idCard);*/


	void update(char num1,String idCard);

	Wcs_quest_answers selectOne(String param1,String idCard);

	int searchCount(String idCard);

	/*List<Wcs_quest_answers>  selectOne1(@Param("param1")String idCard);*/
}
