package cn.com.wtrj.jx.web.portal.service.leave;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitor;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;

public interface IWtrjEcomLeaveRecService {

	void saveLeaveRec(WtrjEcomLeaveRec leaveRec);

	List<WtrjEcomLeaveRec> findLeaveRecordsByTeacherId(Integer teacherId);

	WtrjEcomLeaveRec findLeaveRecById(String id);

	List<WtrjEcomLeaveRec> findLeaveRecordsByParentId(Integer parentId);
	
	/**
	 * 根据教师id查询发起的请假记录
	 * @param userId
	 * @return
	 */
	List<WtrjEcomLeaveRec> findLeaveRecordsByStarterTeahcerId(Integer userId);
	/**
	 * 根据教师id查询确认的请假记录
	 * @param userId
	 * @return
	 */
	List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmTeahcerId(Integer userId);
	
	/**
	 * 根据家长id查询发起的请假记录
	 * @param userId
	 * @return
	 */
	List<WtrjEcomLeaveRec> findLeaveRecordsByStarterParentId(Integer userId);
	/**
	 * 根据家长id查询确认的请假记录
	 * @param userId
	 * @return
	 */
	List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmParentId(Integer userId);
	/**
	 * 家长确认请假
	 * @param rec
	 */
	int updateConfirmParentStatus(WtrjEcomLeaveRec rec);
	/**
	 * 教师确认请假
	 * @param rec
	 */
	int updateConfirmTeacherStatus(WtrjEcomLeaveRec rec);
	
	/**
	 * 家长删除自己发起未确认的请假记录
	 * @param rec
	 * @return
	 */
	int deleteLeaveRecordsByStarterParentId(WtrjEcomLeaveRec rec);
	/**
	 * 教师删除自己发起未确认的请假记录
	 * @param rec
	 * @return
	 */
	int deleteLeaveRecordsByStarterTeacherId(WtrjEcomLeaveRec rec);
}
