package cn.com.wtrj.jx.web.portal.service.ecomAnnualPayRec.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomAnnualFeeRecMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRecExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtEcomAnnualFeeRecMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayStatusInfo;
import cn.com.wtrj.jx.web.portal.service.ecomAnnualPayRec.IEcomAnnualPayRecService;


@Service
public class EcomAnnualPayRecImpl implements IEcomAnnualPayRecService {
	@Autowired
	private MtEcomAnnualFeeRecMapper ecomAnnualPayRecMapper;
	@Autowired
	private WtrjEcomAnnualFeeRecMapper ecomAnnualFeeRecMapper;
	
	@Override
	public List<MtEcomAnnualFeeRec> searchByParentAndPayItem(int parentId, int payItemId) {
		return ecomAnnualPayRecMapper.searByParentAndPayItem(parentId, payItemId);
	}
	
	@Override
	@Transactional
	public void addOrder(WtrjEcomAnnualFeeRec wtrjEcomAnnualFeeRec) {
		ecomAnnualFeeRecMapper.insertSelective(wtrjEcomAnnualFeeRec);
	}

	@Override
	public List<WtrjEcomAnnualFeeRec> searchByStudentIdCardNoAndPayItem(String idCardNo, int payItemId) {
		WtrjEcomAnnualFeeRecExample example=new WtrjEcomAnnualFeeRecExample();
		example.createCriteria().andPayItemIdEqualTo(payItemId).andIdCardNoEqualTo(idCardNo);
		return ecomAnnualFeeRecMapper.selectByExample(example);
	}

	@Override
	public List<WtrjEcomAnnualFeeRec> searchByOutTradeNo(String outTradeNo) {
		WtrjEcomAnnualFeeRecExample example=new WtrjEcomAnnualFeeRecExample();
		example.createCriteria().andOutTradeNoEqualTo(outTradeNo);
		return ecomAnnualFeeRecMapper.selectByExample(example);
	}

	@Override
	@Transactional
	public void updateExampleSelective(WtrjEcomAnnualFeeRec record, WtrjEcomAnnualFeeRecExample example) {
		ecomAnnualFeeRecMapper.updateByExampleSelective(record, example);
	}

	@Override
	public boolean checkWhetherAlreadyPay(String idCardNo, int payItemId) {
		WtrjEcomAnnualFeeRecExample example=new WtrjEcomAnnualFeeRecExample();
		//01表示支付成功
		example.createCriteria().andIdCardNoEqualTo(idCardNo).andPayItemIdEqualTo(payItemId).andPayStatusEqualTo("01");
		List<WtrjEcomAnnualFeeRec> records = ecomAnnualFeeRecMapper.selectByExample(example);
		if(records!=null&&records.size()>0){
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void addOrders(List<WtrjEcomAnnualFeeRec> records) {
		for (WtrjEcomAnnualFeeRec record : records) {
			ecomAnnualFeeRecMapper.insertSelective(record);
		}
	}

	@Override
	public List<MtStudentPayInfo> searchStudentsPayInfoByHearTeacher(Integer teacherId, Integer payItemId,
			String payStatus) {
		return ecomAnnualPayRecMapper.searchStudentsPayInfoByHearTeacher(teacherId, payItemId, payStatus);
	}
	

	@Override
	public List<MtStudentPayStatusInfo> searchStudentsPayStatusInfoByHearTeacher(int teacherId,String payStatus) {
		return ecomAnnualPayRecMapper.searchStudentsPayStatusInfoByHearTeacher(teacherId,payStatus);
	}

	@Override
	public List<WtrjEcomAnnualFeeRec> searchByParentNoBindedAndPayItem(int parentId, int payItemId) {
		WtrjEcomAnnualFeeRecExample example=new WtrjEcomAnnualFeeRecExample();
		example.setOrderByClause("PAY_TIME desc");
		example.createCriteria().andParentIdEqualTo(parentId).andPayItemIdEqualTo(payItemId)
		.andPayStatusEqualTo("01");
		return ecomAnnualFeeRecMapper.selectByExample(example);
	}

	@Override
	public List<MtStudentPayInfo> searchByParentBindedAndPayItem(int parentId, int payItemId) {
		return ecomAnnualPayRecMapper.searchByParentBindedAndPayItem(parentId, payItemId);
	}


	
	
}
