package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomAnnualFeeRec;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentPayStatusInfo;



public interface MtEcomAnnualFeeRecMapper {
	/**查询家长对每个孩子在指定收费项目的缴纳情况*/
	List<MtEcomAnnualFeeRec>searByParentAndPayItem(@Param(value="parentId")int parentId,@Param(value="payItemId")int payItem);
	
	/**
	 * 按缴费状态和班主任查询其对应班级的学生的指定收费项目的缴费情况
	 * @param teacherId 班主任id
	 * @param payItemId 缴费项目
	 * @param payStatus 缴费状态(分状态，全部/已缴/未缴)，状态汉字必须对应！与需要传入SQL
	 * @return 学生基本信息及缴费信息
	 */
	List<MtStudentPayInfo>searchStudentsPayInfoByHearTeacher(@Param(value="teacherId")Integer teacherId,@Param(value="payItemId")Integer payItemId,@Param(value="payStatus")String payStatus);
	/**
	 * 在学生表中查询学生支付状态
	 * @param teacherId
	 * @return
	 */
	List<MtStudentPayStatusInfo> searchStudentsPayStatusInfoByHearTeacher(@Param(value="teacherId")int teacherId,@Param(value="payStatus")String payStatus);

	/**
	 * 有关联孩子的家长，查询每个孩子在指定缴费项目的缴费情况
	 * @param parentId 家长id
	 * @param payItem 缴费项目id
	 * @return
	 */
	List<MtStudentPayInfo>searchByParentBindedAndPayItem(@Param(value="parentId")Integer parentId,@Param(value="payItemId")Integer payItemId);

}
