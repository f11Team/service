package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStage;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentIncludesClassInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentDto;

public interface MtStudentMapper {
	/**
	 * 按ID查找学生信息(包含成绩)
	 * 
	 * @param id
	 *            学生ID
	 * @return 包含成绩的学生对象
	 */
	MtStudent selectById(@Param(value = "id") int id);

	/**
	 * 查询所有学生的基本信息
	 * 
	 * @return
	 */
	List<WtrjStudent> searchAllStudents();

	/**
	 * 按条件模糊查询学生基本信息并分页显示
	 * 
	 * @param name
	 *            学生姓名
	 * @param idCardNumber
	 *            身份证号
	 * @param startRow
	 *            起始记录数
	 * @param pageSize
	 *            每页显示数量
	 * @return 当前页要显示的学生数据集合
	 */
	List<WtrjStudent> searchByItem(@Param(value = "name") String name,
			@Param(value = "idCardNumber") String idCardNumber, @Param(value = "startRow") int startRow,
			@Param(value = "endRow") int endRow, @Param(value = "schoolCode") String schoolCode);

	/**
	 * 按姓名和身份证号模糊查询学生的总记录数量
	 * 
	 * @param name
	 *            学生姓名
	 * @param idCardNumber
	 *            身份证号
	 * @return 符合条件的学生记录数
	 */
	int selectCountByItem(@Param(value = "name") String name, @Param(value = "idCardNumber") String idCardNumber,
			@Param(value = "schoolCode") String schoolCode);
	
	/**
	 * 按家长手机号查询学生列表
	 * @param phone 家长手机号
	 * @return 学生集合
	 */
	List<StudentDto> searchByParent(String phone);
	
	
	/**
	 * 根据用户输入条件查找与指定教师关联的学生列表
	 * @param teacherId
	 * @param param 
	 * @return
	 */
	List<WtrjStudent> findStudentsByTeacherIdAndParam(@Param(value="teacherId")Integer teacherId, @Param(value="param")String param);

	/**
	 * 查询与指定教师关联的学生信息
	 * @param userId
	 * @return
	 */
	List<WtrjStudent> findStudentsByTeacherId(Integer userId);
	
	/**
	 * 查询指定家长关联的学生id
	 * @param parentId
	 * @return
	 */
	List<WtrjStudent> findStudentsByParentId(Integer parentId);
	
	
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
	List<StudentDto> searchByParentAndSchoolCodes(@Param("phone")String phone,@Param("codes")List<Integer>codes);

	String searchStudentUrl(Integer id);
	
	/**
	 * 根据输入的学生姓名和选择的学校code模糊查询出学生姓名
	 * @param searchName 学生姓名关键字
	 * @param schoolCode 学校code
	 * @return
	 */
	public List<StudentDto> searchStudentsByName(@Param("name") String name, @Param("schoolCode") String schoolCode,@Param("classId") String classId);
	
	
	public List<MtStudent> selectStudentsByPage(@Param(value = "start") Integer start, @Param(value = "end") Integer end,
			@Param(value = "name") String name);

	public int countStudents(@Param("name") String name);
	
	public int countStudentsByTeacherId(WtrjEcomPermission p);

	public void insert(MtStudent student);
	
	public MtStudent selectByPrimaryKey(Integer studentId);
	
	
	/**
	 * 选择班级级联-学校
	 * @return
	 */
	public List<WtrjEcomPermission> selectCascadeSchool(@Param(value="teacherId")String teacherId);

	public List<WtrjEcomPermission> selectCascadeStage(@Param(value="schoolCode") String schoolCode,@Param(value="teacherId")String teacherId);

	public List<String> selectCascadeGrade(@Param(value="schoolCode") String schoolCode, 
			@Param(value="stage") String stage,@Param(value="teacherId")String teacherId);

	public List<WtrjEcomPermission> selectCascadeClasses(@Param(value="schoolCode")String schoolCode,
			 @Param(value="stage") String stage, @Param(value="grade") String grade,@Param(value="teacherId")String teacherId);

	public void update(MtStudent student);

	
	
	public List<MtParent> selectStudentParents(@Param(value="studentId") Integer studentId);

	public List<MtStudent> selectStudentsByPhone(@Param(value="phone") String phone);

	/**
	 * 查找家长关联的学生
	 * @param parentId
	 * @return
	 */
	public List<MtStudent> selectStudentsByParentId(@Param(value="parentId") Integer parentId);

	public void updateStudentPhoto(@Param(value="studentId") Integer studentId, @Param(value="photo") String photo);

	public Integer existIdCardNumber(@Param(value="idCardNumber") String idCardNumber, @Param(value="studentId")Integer studentId);

	public int existStudentNo(@Param(value="studentNo")String studentNo, @Param(value="studentId")Integer studentId);

	public int existCardNo(@Param(value="cardNo")String cardNo, @Param(value="studentId")Integer studentId);

	
	public List<MtStudent> selectStudentsByTeacherPage(@Param(value = "start")int start, @Param(value = "end")int end, @Param("search")String search,@Param("schoolCode")String schoolCode,@Param("grade")String grade,@Param("stage")String stage,@Param("classId")String classId,@Param("teacherId")String teacherId);
	
	
	public List<MtSchoolInfo> selectAllSchool();

	public List<MtStage> selectAllStage(@Param(value="schoolCode") String schoolCode);

	public List<String> selectAllGrade(@Param(value="schoolCode") String schoolCode, 
			@Param(value="stage") String stage);

	public List<MtEcomClass> selectAllClasses(@Param(value="schoolCode")String schoolCode,
			 @Param(value="stage") String stage, @Param(value="grade") String grade); 
	
	public List<MtStudent> selectAllStudents(@Param(value = "start")int start, 
			@Param(value = "end")int end, @Param("search")String search,
			@Param(value="schoolCode")String schoolCode,@Param(value="grade")String grade,
			 @Param(value="stage") String stage,@Param(value="classId")String classId);
	
	public Integer countStudentByYw(WtrjEcomPermission p);
	
	public List<String> selectRoleIdByUserId(@Param(value="userId") String userId);
}
