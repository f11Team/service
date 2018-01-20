package cn.com.wtrj.jx.web.portal.service.research.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.research.StuResearchDao;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Student;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answer;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_answers;
import cn.com.wtrj.jx.web.portal.model.entities.stu.Wcs_quest_item;
import cn.com.wtrj.jx.web.portal.service.research.StuResearch;

@Service
public class StuResearchImpl implements StuResearch{
    
	@Autowired
	public StuResearchDao srd;
	
	@Override
	public Wcs_quest_answer searchOne(String id) {
		
		return this.srd.searchOne(id);
	}

	@Override
	public Wcs_quest_item searchQuestItem(String id) {
		return this.srd.searchQuestItem(id);
	}

	@Override
	public List<Wcs_quest_item> selectWcsQuestItem() {
		
		return this.srd.selectWcsQuestItem();
	}
	@Override
	public Wcs_quest_item searchStuAnswers(String clazzNo) {
		return this.srd.searchStuAnswers(clazzNo);
	}
	@Override
	public Student searchCurryStu(String idCard) {
		
		return this.srd.searchCurryStu(idCard);
	}
	@Override
	public void insertOneAnswer(Wcs_quest_answers wqAnwer) {
		
		this.srd.insertOneAnswer( wqAnwer);
	}

	/*@Override
	public void update(char num1, String idCard) {
		this.srd.update(num1, idCard);
		
	}
*/
	public void update(char num1,String idCard) {
		this.srd.update( num1, idCard) ;
		
	}
	@Override
	public Wcs_quest_answers selectOne(String param1,String idCard) {
		return this.srd.selectOne(param1,idCard);
	}
	/*@Override
	public List<Wcs_quest_answers>  selectOne1(String idCard) {
		// TODO Auto-generated method stub
		return this.srd.selectOne1(idCard);
	}*/

	@Override
	public int searchCount(String idCard) {
		// TODO Auto-generated method stub
		return this.srd.searchCount(idCard);
	}
	
}
