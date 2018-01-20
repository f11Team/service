package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjParentMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjStuParentRelationshipMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjStudentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationship;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuParentRelationshipKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtStudentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtdmParentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtEcomClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStage;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudent;
import cn.com.wtrj.jx.web.portal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private MtStudentMapper studentMapper;

	@Autowired
	private WtrjStudentMapper wtrjStudentMapper;
	
	@Autowired
	private WtrjParentMapper wtrjParentMapper;
	
	@Autowired
	private WtrjStuParentRelationshipMapper wtrjParentRelationMapper;
	
	@Autowired
	private MtdmParentMapper mtdmParentMapper;
	
	@Override
	public List<MtStudent> searchStudentsByPage(int start, int end,
			String search) {
		return studentMapper.selectStudentsByPage(start, end, search);
	}
	
	@Override
	public int countStudents(String search) {
		return studentMapper.countStudents(search);
	}
	
	@Override
	public void addStudent(MtStudent student) {
		studentMapper.insert(student);
	}
	
	
	//级联操作
	@Override
	public List<WtrjEcomPermission> searchCascadeSchool(String teacherId) {
		return studentMapper.selectCascadeSchool(teacherId);
	}
	@Override
	public List<WtrjEcomPermission> searchCascadeStage(String schoolCode,String teacherId) {
		System.out.println("schoolCode:" + schoolCode);
		return studentMapper.selectCascadeStage(schoolCode,teacherId);
	}
	
	@Override
	public List<String> searchCascadeGrade(String schoolCode, String stage,String teacherId) {
		return studentMapper.selectCascadeGrade(schoolCode,stage,teacherId);
	}
	
	@Override
	public List<WtrjEcomPermission> searchCascadeClasses(String schoolCode,
			String stage, String grade,String teacherId) {
		return studentMapper.selectCascadeClasses(schoolCode,stage,grade,teacherId);
	}
	
	@Override
	public MtStudent getStudent(Integer studentId) {
		return studentMapper.selectByPrimaryKey(studentId);
	}
	
	@Override
	public void editStudent(MtStudent student) {
		studentMapper.update(student);		
	}
	
	@Override
	public void deleteStudent(Integer studentId) {
		wtrjStudentMapper.deleteByPrimaryKey(studentId);
	}
	
	
	@Override
	public List<MtParent> findStudentParents(Integer studentId) {
		 return studentMapper.selectStudentParents(studentId);
	}
	
	 @Override
	public void addStudentParents(MtParent parent, String studentId) {
		 this.addStudentParents(parent,studentId,0); //手机号不重复
		
	}
	 @Override
	public void addStudentParents(MtParent parent, String studentId, int flag) {
		if(flag == 0){
			//添加家长表
			 wtrjParentMapper.insert(parent);
			//添加关联表
			 WtrjStuParentRelationship relation = new WtrjStuParentRelationship();
			 relation.setStudentId(Integer.parseInt(studentId));
			 relation.setParentId(parent.getId());
			 wtrjParentRelationMapper.insert(relation);
		} else {
			//flag:1 --手机号重复，只添加关联关系
			//添加关联表
			 WtrjStuParentRelationship relation = new WtrjStuParentRelationship();
			 relation.setStudentId(Integer.parseInt(studentId));
			 //获取手机号对应家长的ID
			 relation.setParentId(mtdmParentMapper.getParentByPhone(parent.getPhone()).getId());
			 wtrjParentRelationMapper.insert(relation);
		}
		
	}
	 
	 @Override
	 @Transactional
	public void deleteStudentParents(Integer parentId,Integer studentId) {
		 //删除关联记录
		 WtrjStuParentRelationshipKey pks = new WtrjStuParentRelationshipKey();
		 pks.setParentId(parentId);
		 pks.setStudentId(studentId);
		 wtrjParentRelationMapper.deleteByPrimaryKey(pks);
		 
		 //删除家长记录
		 wtrjParentMapper.deleteByPrimaryKey(parentId);
	}
	 
	 @Override
	public void deleteStudentParentsRelation(Integer parentId,
			Integer studentId) {
		//删除关联记录
		 WtrjStuParentRelationshipKey pks = new WtrjStuParentRelationshipKey();
		 pks.setParentId(parentId);
		 pks.setStudentId(studentId);
		 wtrjParentRelationMapper.deleteByPrimaryKey(pks);
		
	}
	 
	 @Override
	public List<MtStudent> findStudentsByPhone(String phone) {
		return studentMapper.selectStudentsByPhone(phone);
	}
	 
	@Override
	public List<MtStudent> findStudentsByParentId(Integer parentId) {
		return studentMapper.selectStudentsByParentId(parentId);
	}
	
	@Override
	public void editStudentPhoto(Integer studentId, String photo) {
		studentMapper.updateStudentPhoto(studentId,photo);	
	}
	
	
	@Override
	public Integer existIdCardNumber(String idCardNumber, Integer studentId) {
		return studentMapper.existIdCardNumber(idCardNumber,studentId);
	}
	
	@Override
	public int existStudentNo(String studentNo, Integer studentId) {
		return studentMapper.existStudentNo(studentNo,studentId);
	}
	
	@Override
	public int existCardNo(String cardNo, Integer studentId) {
		return studentMapper.existCardNo(cardNo,studentId);
	}
	
	//--------------------修改家长手机号----------------------
		@Override
		public void modifyNewParentPhoneNotParentTable(MtParent parent,
				Integer studentId) {
			//1.新手机号未在parent表，需要新增
			//2.与当前学生建立关联
			//3.旧手机号处理，更好的解决方式是提示用户
			//3.1 解除旧手机号与当前学生关联
			//3.2 旧手机号关联了其他学生
				//不删除parent表
			//3.3 旧手机号没有关联其他学生
				//删除parent

			Integer oldParentId = parent.getId();//旧手机号对应的parentId
			WtrjParent oldParent = wtrjParentMapper.selectByPrimaryKey(parent.getId());
			
			
			//1.
			wtrjParentMapper.insertSelective(parent);//parentId变为新的
			//2.
			WtrjStuParentRelationship wsr = new WtrjStuParentRelationship();
			wsr.setParentId(parent.getId());
			wsr.setStudentId(studentId);
			wtrjParentRelationMapper.insertSelective(wsr);
			//3.
			//3.1
			WtrjStuParentRelationshipKey key = new WtrjStuParentRelationshipKey();
			key.setParentId(oldParent.getId());
			key.setStudentId(studentId);
			wtrjParentRelationMapper.deleteByPrimaryKey(key);
			
			List<MtStudent> studentList = studentMapper.selectStudentsByPhone(oldParent.getPhone());
			if(null == studentList || 0 == studentList.size()){
				//3.3 旧手机号没有关联其他学生 删除parent
				wtrjParentMapper.deleteByPrimaryKey(oldParentId);
			} else {
				//3.2 旧手机号关联了其他学生 不删除parent表
				
			}
			
			
			
		}
		
		@Override
		public void modifyNewParentPhoneNotRelationStud(MtParent parent,
				Integer studentId) {
			//新手机号在parent表-未关联任何学生
			//1.更新 新号码家长表
			//2.建立新关联
			//3.旧手机号处理
			//3.1 解除旧手机号与当前学生关联
			//3.2 旧手机号关联了其他学生
				//不删除parent表
			//3.3 旧手机号对应的parentId没有关联其他学生
				//删除parent
			
			WtrjParent oldParent = wtrjParentMapper.selectByPrimaryKey(parent.getId());
			
			
			//1.
			MtParent newParent = mtdmParentMapper.getParentByPhone(parent.getPhone());
			newParent.setName(parent.getName());
			newParent.setSex(parent.getSex());
			mtdmParentMapper.update(newParent);
			
			//2.
			WtrjStuParentRelationship wsr = new WtrjStuParentRelationship();
			wsr.setParentId(newParent.getId());
			wsr.setStudentId(studentId);
			wtrjParentRelationMapper.insertSelective(wsr);
			
			//3.旧手机号处理
			//3.1解除旧手机号与当前学生关联
			WtrjStuParentRelationshipKey key = new WtrjStuParentRelationshipKey();
			key.setParentId(oldParent.getId());
			key.setStudentId(studentId);
			wtrjParentRelationMapper.deleteByPrimaryKey(key);
			
//			List<MtStudent> studentList = studentMapper.selectStudentsByPhone(oldParent.getPhone());
//			if(null == studentList || 0 == studentList.size()){
//				//3.3 旧手机号对应的parentId没有关联其他学生,但是更新了家长表
//			} else {
//				//3.2 旧手机号关联了其他学生 不删除parent表
//				
//			}
			
			
		}
		
		@Override
		public void modifyNewParentPhoneWithRelationStud(MtParent parent,
				Integer studentId) {
			//新手机号在parent表-关联学生
			//1.更新家长表
			//2.建立新关联
			//3.旧手机号处理
			//3.1 解除旧手机号与当前学生关联
			//3.2 旧手机号关联了其他学生
				//不删除parent表
			//3.3 旧手机号没有关联其他学生
				//删除parent
			
			Integer oldParentId = parent.getId();//旧手机号对应的parentId
//			WtrjParent oldParent = wtrjParentMapper.selectByPrimaryKey(parent.getId());
			
			
			//1.
			MtParent newParent = mtdmParentMapper.getParentByPhone(parent.getPhone());
			newParent.setName(parent.getName());
			newParent.setSex(parent.getSex());
			mtdmParentMapper.update(newParent);
			
			//2.
			WtrjStuParentRelationship wsr = new WtrjStuParentRelationship();
			wsr.setParentId(newParent.getId());
			wsr.setStudentId(studentId);
			wtrjParentRelationMapper.insertSelective(wsr);
			
			//3.旧手机号处理
			//3.1解除旧手机号与当前学生关联
			WtrjStuParentRelationshipKey key = new WtrjStuParentRelationshipKey();
			key.setParentId(parent.getId());
			key.setStudentId(studentId);
			wtrjParentRelationMapper.deleteByPrimaryKey(key);
			
//			List<MtStudent> studentList = studentMapper.selectStudentsByPhone(oldParent.getPhone());
//			if(null == studentList || 0 == studentList.size()){
//				//3.3 旧手机号对应的parentId没有关联其他学生  删除parent
//			} else {
//				//3.2 旧手机号关联了其他学生 不删除parent表
//				
//			}
			
			
			
		}

		@Override
		public int countStudentsByTeacherId(WtrjEcomPermission p) {
			return studentMapper.countStudentsByTeacherId(p);
		}

		@Override
		public List<MtStudent> selectStudentsByTeacherPage(int start, int end, String search, String schoolCode,
				String grade, String stage, String classId, String teacherId) {
			return studentMapper.selectStudentsByTeacherPage(start, end, search, schoolCode, grade, stage, classId, teacherId);
		}

		@Override
		public List<MtSchoolInfo> searchAllSchool() {
			return studentMapper.selectAllSchool();
		}

		@Override
		public List<MtStage> searchAllStage(String schoolCode) {
			return studentMapper.selectAllStage(schoolCode);
		}

		@Override
		public List<String> searchAllGrade(String schoolCode, String stage) {
			return studentMapper.selectAllGrade(schoolCode, stage);
		}

		@Override
		public List<MtEcomClass> searchAllClasses(String schoolCode, String stage, String grade) {
			return studentMapper.selectAllClasses(schoolCode, stage, grade);
		}

		@Override
		public List<MtStudent> selectAllStudents(int start, int end, String search,String schoolCode, String stage, String grade, String classId) {
			return studentMapper.selectAllStudents(start,end,search,schoolCode, stage, grade, classId);
		}

		@Override
		public Integer countStudentByYw(WtrjEcomPermission p) {
			return studentMapper.countStudentByYw(p);
		}
		
		@Override
		public List<String> selectRoleIdByUserId(String userId) {
			return studentMapper.selectRoleIdByUserId(userId);
		}
		
		//--------------------修改家长手机号----------------------
}
