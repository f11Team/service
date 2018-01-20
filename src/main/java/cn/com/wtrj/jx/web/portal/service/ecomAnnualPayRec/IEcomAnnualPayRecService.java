package cn.com.wtrj.jx.web.portal.service.ecomAnnualPayRec;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomAnnualFeeRecExample;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayStatusInfo;


public interface IEcomAnnualPayRecService {
	
	/**
	 * 查询家长关联的所有孩子在指定收费项目的缴费记录（实际是订单记录，一个孩子可能存在多条，包括未支付的）
	 * @param parentId 家长id
	 * @param payItem 缴费项目id
	 * @return
	 */
	List<MtEcomAnnualFeeRec>searchByParentAndPayItem(int parentId,int payItem);
	
	/**
	 * 增加一条缴费记录
	 * @param wtrjEcomAnnualFeeRec 缴费记录
	 */
	void addOrder(WtrjEcomAnnualFeeRec wtrjEcomAnnualFeeRec);
	
	/**
	 * 查询指定学生的指定收费项目的下单记录(由于取消下单等情况存在，一个学生的一个项目可能存在多条下单记录)
	 * @param idCardNo 学生身份证号
	 * @param payItemId 缴费项目id
	 * @return 缴费记录(包含成功和不成功的)
	 */
	List<WtrjEcomAnnualFeeRec>searchByStudentIdCardNoAndPayItem(String idCardNo, int payItemId) ;
	
	
	/**
	 * 按订单号查询缴费记录
	 * @param outTradeNo 订单号
	 * @return 订单集合（一个订单可能给多个学生缴费，即同一个订单号可能存在多次缴费记录）
	 */
	List<WtrjEcomAnnualFeeRec> searchByOutTradeNo(String outTradeNo);
	
	/**
	 * 按条件更新记录
	 * @param record
	 * @param example
	 */
	void updateExampleSelective(WtrjEcomAnnualFeeRec record,WtrjEcomAnnualFeeRecExample example);
	
	/**
	 * 检查指定身份证号的学生在指定项目是否已缴费，true 已缴纳，false 未缴纳
	 * @param idCardNo 学生身份证号
	 * @param payItemId 缴费项目id
	 * @return 检查结果 true 已缴纳，false 未缴纳
	 */
	boolean checkWhetherAlreadyPay(String idCardNo, int payItemId);
	
	/**
	 * 批量增加缴费记录
	 * @param records 缴费记录集合
	 */
	void addOrders(List<WtrjEcomAnnualFeeRec>records);
	
	/**
	 * 按缴费状态和班主任查询其对应班级的学生的指定收费项目的缴费情况
	 * @param teacherId 班主任id
	 * @param payItemId 缴费项目
	 * @param payStatus 缴费状态(分状态，全部/已缴/未缴)，状态汉字必须对应！与需要传入SQL
	 * @return 学生基本信息及缴费信息
	 */
	List<MtStudentPayInfo>searchStudentsPayInfoByHearTeacher(Integer teacherId,Integer payItemId,String payStatus);
	
	
	/**
	 * 查询无关联孩子的家长在指定收费项目的缴费记录（只包含支付成功的）
	 * @param parentId 家长id
	 * @param payItem 缴费项目id
	 * @return
	 */
	List<WtrjEcomAnnualFeeRec>searchByParentNoBindedAndPayItem(int parentId,int payItemId);
	
	/**
	 * 有关联孩子的家长，查询每个孩子在指定缴费项目的缴费情况
	 * @param parentId 家长id
	 * @param payItem 缴费项目id
	 * @return
	 */
	List<MtStudentPayInfo>searchByParentBindedAndPayItem(int parentId,int payItemId);

	List<MtStudentPayStatusInfo> searchStudentsPayStatusInfoByHearTeacher(int teacherId,String payStatus);
}
