package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStage;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudent;

public interface StudentService {

	int countStudents(String search);
	
	int countStudentsByTeacherId(WtrjEcomPermission p);

	List<MtStudent> searchStudentsByPage(int start, int end, String search);
	
	List<MtStudent> selectStudentsByTeacherPage(int start, int end,@Param("search")String search,String schoolCode,String grade,String stage,String classId,String teacherId);

	void addStudent(MtStudent student);

	List<WtrjEcomPermission> searchCascadeSchool(String teacherId);

	List<WtrjEcomPermission> searchCascadeStage(String schoolCode,String teacherId);

	List<String> searchCascadeGrade(String schoolCode, String stage,String teacherId);

	List<WtrjEcomPermission> searchCascadeClasses(String schoolCode, String stage,
			String grade,String teacherId);

	MtStudent getStudent(Integer studentId);

	void editStudent(MtStudent student);

	List<MtParent> findStudentParents(Integer studentId);

	void addStudentParents(MtParent parent, String studentId);
	/**
	 * 
	 * @param parent
	 * @param studentId
	 * @param flag 0-手机号不重复 1-手机号重复
	 */
	void addStudentParents(MtParent parent, String studentId, int flag);

	/**
	 * 级联删除学生家长关联信息表+家长信息表
	 * @param parentId
	 * @param studentId
	 */
	void deleteStudentParents(Integer parentId,Integer studentId);
	
	/**
	 * 只删除学生家长关联信息表
	 * @param parentId
	 * @param studentId
	 */
	void deleteStudentParentsRelation(Integer parentId, Integer studentId);
	/**
	 * 根据家长手机号获取绑定的学生信息
	 * @param phone
	 * @return
	 */
	List<MtStudent> findStudentsByPhone(String phone);

	/**
	 * 查找家长关联的学生
	 * @param parentId
	 * @return
	 */
	List<MtStudent> findStudentsByParentId(Integer parentId);

	void deleteStudent(Integer studentId);

	void editStudentPhoto(Integer studentId, String photo);

	Integer existIdCardNumber(String idCardNumber, Integer studentId);

	int existStudentNo(String studentNo, Integer studentId);

	int existCardNo(String cardNo, Integer studentId);

	
	//--------------------修改家长手机号----------------------
		void modifyNewParentPhoneNotParentTable(MtParent parent, Integer studentId);
		void modifyNewParentPhoneNotRelationStud(MtParent parent,
				Integer studentId);
		void modifyNewParentPhoneWithRelationStud(MtParent parent,
				Integer studentId);
		//--------------------修改家长手机号----------------------
	

	
		List<MtSchoolInfo> searchAllSchool();

		List<MtStage> searchAllStage(String schoolCode);

		List<String> searchAllGrade(String schoolCode, String stage);

		List<MtEcomClass> searchAllClasses(String schoolCode, String stage,
				String grade);
		List<MtStudent> selectAllStudents(int start, int end, String search,String schoolCode, String stage,
				String grade,String classId);
		Integer countStudentByYw(WtrjEcomPermission p);
		
		public List<String> selectRoleIdByUserId(String userId);
}
