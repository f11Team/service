package cn.com.wtrj.jx.web.portal.service.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomLeaveRecMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRecExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRecExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.dao.leave.MtEcomLeaveRecMapper;
import cn.com.wtrj.jx.web.portal.service.leave.IWtrjEcomLeaveRecService;

@Service
public class WtrjEcomLeaveRecServiceImpl implements IWtrjEcomLeaveRecService {
	@Autowired
	private WtrjEcomLeaveRecMapper wtrjEcomLeaveRecMapper;
	
	@Autowired
	private MtEcomLeaveRecMapper mtEcomLeaveRecMapper;

	@Override
	public void saveLeaveRec(WtrjEcomLeaveRec leaveRec) {
		wtrjEcomLeaveRecMapper.insertSelective(leaveRec);
	}
	

	/**
	 * 查询指定教师名下的所有请假记录
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByTeacherId(Integer teacherId) {
		/*WtrjEcomLeaveRecExample example = new WtrjEcomLeaveRecExample();
		example.setOrderByClause("CONFIRM_PARENT_TIME desc");
		Criteria criteria = example.createCriteria();*/
//		criteria.andTeacherIdEqualTo(teacherId);
		return wtrjEcomLeaveRecMapper.selectByExample(teacherId);
	}
	
	/**
	 * 
	 */
	
	/**
	 * 查询请假记录详情
	 */
	@Override
	public WtrjEcomLeaveRec findLeaveRecById(String id) {
		return wtrjEcomLeaveRecMapper.selectByPrimaryKey(String.valueOf(id));
	}

	/**
	 * 查询指定家长名下的所有小孩的请假详情
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByParentId(Integer parentId) {
		return mtEcomLeaveRecMapper.findLeaveRecordsByParentId(parentId);
	}

	/**
	 * 查询指定教师名下发起的请假记录
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByStarterTeahcerId(Integer userId) {
		return wtrjEcomLeaveRecMapper.findLeaveRecordsByStarterTeahcerId(userId);
	}

	/**
	 * 查询指定教师名下确认的请假记录
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmTeahcerId(Integer userId) {
		return wtrjEcomLeaveRecMapper.findLeaveRecordsByConfirmTeahcerId(userId);
	}

	/**
	 * 查询指定家长名下发起的请假记录
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByStarterParentId(Integer userId) {
		// TODO Auto-generated method stub
		return mtEcomLeaveRecMapper.findLeaveRecordsByStarterParentId(userId);
	}

	/**
	 * 查询指定家长名下确认的请假记录
	 */
	@Override
	public List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmParentId(Integer userId) {
		// TODO Auto-generated method stub
		return mtEcomLeaveRecMapper.findLeaveRecordsByConfirmParentId(userId);
	}

	/**
	 * 家长确认请假
	 */
	@Override
	public int updateConfirmParentStatus(WtrjEcomLeaveRec rec) {
		return wtrjEcomLeaveRecMapper.updateByPrimaryKeySelective(rec);
	}
	
	/**
	 * 老师确认请假
	 */
	@Override
	public int updateConfirmTeacherStatus(WtrjEcomLeaveRec rec) {
		return wtrjEcomLeaveRecMapper.updateByPrimaryKeySelective(rec);
	}
	
	/**
	 * 家长删除自己发起未确认的请假记录
	 */
	@Override
	public int deleteLeaveRecordsByStarterParentId(WtrjEcomLeaveRec rec) {
		return wtrjEcomLeaveRecMapper.deleteLeaveRecordsByStarterParentId(rec);
	}
	
	/**
	 * 老师删除自己发起未确认的请假记录
	 */
	@Override
	public int deleteLeaveRecordsByStarterTeacherId(WtrjEcomLeaveRec rec) {
		return wtrjEcomLeaveRecMapper.deleteLeaveRecordsByStarterTeacherId(rec);
	}
}
