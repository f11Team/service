package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentIncludesClassInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentDto;

/**
 * 学生业务接口
 * 
 * @author admin
 *
 */
public interface IWtrjStudentService {
	/**
	 * 按照姓名和身份证号查找学生信息
	 * 
	 * @param stuName
	 *            学生姓名
	 * @param stuIdCard
	 *            学生身份证号
	 * @return 学生实体
	 */
	List<WtrjStudent> searchStudentByNameAndIdCard(String stuName, String stuIdCard);

	WtrjStudent searchStudentByIdCard(String userName);
	
	/**
	 * 按ID修改学生信息
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(WtrjStudent record);

	/**
	 * 按ID查找学生信息，包含成绩
	 * 
	 * @param id
	 *            学生ID
	 * @return 学生对象
	 */
	MtStudent selectById(int id);

	/**
	 * 按学校查询学生信息(管理员权限)
	 * 
	 * @param schoolCode
	 *            学校code
	 * @return
	 */
	List<WtrjStudent> searchBySchool(String schoolCode);

	/**
	 * 按姓名和身份证模糊查询当前页要显示的数据
	 * 
	 * @param name
	 *            学生姓名
	 * @param idCardNumber
	 *            身份证号
	 * @param startRow
	 *            起始记录数
	 * @param schoolCode
	 *            对应学校
	 * @param endRow
	 *            结束记录数
	 * @return 学生信息集合
	 */
	List<WtrjStudent> searchByItem(String name, String idCardNumber, int startRow, int endRow, String schoolCode);

	/**
	 * 按姓名和身份证号及学校模糊查询符合条件的学生总记录数量
	 * 
	 * @param name
	 *            学生姓名
	 * @param idCardNumber
	 *            学生身份证号
	 * @return 符合条件的学生数量
	 */
	int selectCountByItem(String name, String idCardNumber, String schoolCode);
	
	
	/**
	 * 查询指定手机号的家长所对应的学生列表
	 * 
	 * @param phone 家长手机号码
	 * 
	 * @return 学生集合
	 */
	List<StudentDto>searchByParent(String phone);
	
	
	WtrjStudent selectByPrimaryKey(Integer id);
	
	/**
	 * 查找与指定教师关联的学生列表
	 * @param param 
	 * @param userId
	 * @return
	 */
	List<WtrjStudent> findStudentsByTeacherIdAndParam(Integer teacherId, String param);

	WtrjStudent searchStudentInfoByStudentNo(String no);

	/**
	 * 根据教师id查询学生信息
	 * @param userId
	 * @return
	 */
	List<WtrjStudent> findStudentsByTeacherId(Integer userId);
	
	List<WtrjStudent> selectStudentsByTeacherId(Integer teacherId);
	
	List<WtrjStudent> searchStudentsByTeacherId(Integer teacherId);
	/**
	 * 根据家长id查询学生信息
	 * @param userId
	 * @return
	 */
	List<WtrjStudent> findStudentsByParentId(Integer userId);
	
	/**
	 * 根据班主任老师ID查找对应班级的学生列表
	 * @param headTeacherId 班主任id
	 * @return 学生列表
	 */
	List<WtrjStudent>findStudentsByHeadTeacher(Integer headTeacherId);
	
	/**
	 * 按学生id查询学生基本信息和学生相关的学部、年级、班级id等信息
	 * @param studentId
	 * @return
	 */
	MtStudentIncludesClassInfo findStudentAndClassInfoById(Integer studentId);
	
	
	/**
	 * 按家长电话和学校codes查询孩子家长列表
	 * @param phone 家长电话
	 * @param codes 学校对应code集合
	 * @return
	 */
	List<StudentDto> searchByParentAndSchoolCodes(String phone,List<Integer>codes);

	String searchStudentUrl(Integer id);
	
	List<StudentDto> searchStudentsByName(String name, String schoolCode,String classId);
	
	WtrjStudent searchStudentByStudentId(Integer studentId);
	
	List<WtrjStudent> selectStudentsByClassId(Integer classId);
}
