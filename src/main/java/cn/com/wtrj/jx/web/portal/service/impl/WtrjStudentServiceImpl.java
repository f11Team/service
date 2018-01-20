package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjStudentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudentExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtStudentMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStudentIncludesClassInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.StudentDto;
import cn.com.wtrj.jx.web.portal.service.IWtrjStudentService;

/**
 * 学生业务接口实现类
 * 
 * @author admin
 *
 */
@Service
public class WtrjStudentServiceImpl implements IWtrjStudentService {
	@Autowired
	private WtrjStudentMapper wtrjStudentMapper;
	@Autowired
	private MtStudentMapper mtStudentMapper;

	public List<WtrjStudent> searchStudentByNameAndIdCard(String stuName, String stuIdCard) {
		WtrjStudentExample example = new WtrjStudentExample();
		example.createCriteria().andNameEqualTo(stuName).andIdCardNumberEqualTo(stuIdCard);
		return wtrjStudentMapper.selectByExample(example);
	}

	@Override
	public WtrjStudent searchStudentByIdCard(String stuIdCard) {
		WtrjStudentExample example = new WtrjStudentExample();
		// 先按全部小写查找
		example.createCriteria().andIdCardNumberEqualTo(stuIdCard.toLowerCase());
		List<WtrjStudent> stus = wtrjStudentMapper.selectByExample(example);
		// 如果小写匹配成功，找到唯一学生，直接返回
		if (stus != null && stus.size() == 1) {
			return stus.get(0);
		}
		// 如果小写未匹配成功，则按大写查找匹配
		example.clear();
		example.createCriteria().andIdCardNumberEqualTo(stuIdCard.toUpperCase());
		stus = wtrjStudentMapper.selectByExample(example);
		// 如果大写匹配匹配成功，找到唯一的学生，直接返回
		if (stus != null && stus.size() == 1) {
			return stus.get(0);
		}
		// 大小写都未匹配成功，返回null
		return null;
	}

	@Override
	@Transactional
	public int updateByPrimaryKeySelective(WtrjStudent record) {
		return wtrjStudentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public MtStudent selectById(int id) {
		// TODO Auto-generated method stub
		return mtStudentMapper.selectById(id);
	}

	@Override
	public List<WtrjStudent> searchBySchool(String schoolCode) {
		WtrjStudentExample example = new WtrjStudentExample();
		example.setOrderByClause("id");
		example.createCriteria().andSchoolCodeEqualTo(schoolCode).andEntranceSerialNumIsNotNull()
				.andNameNotLike("%测试%");
		return wtrjStudentMapper.selectByExample(example);
	}

	@Override
	public List<WtrjStudent> searchByItem(String name, String idCardNumber, int startRow, int endRow,
			String schoolCode) {

		return mtStudentMapper.searchByItem(name, idCardNumber, startRow, endRow, schoolCode);
	}

	@Override
	public int selectCountByItem(String name, String idCardNumber, String schoolCode) {
		return mtStudentMapper.selectCountByItem(name, idCardNumber, schoolCode);
	}

	@Override
	public List<StudentDto> searchByParent(String phone) {
		
		return mtStudentMapper.searchByParent(phone);
	}

	@Override
	public WtrjStudent selectByPrimaryKey(Integer id) {
		return wtrjStudentMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<WtrjStudent> findStudentsByTeacherIdAndParam(Integer teacherId,String param) {
		return mtStudentMapper.findStudentsByTeacherIdAndParam(teacherId,param);
	}

	/**
	 * 根据学号查询学生信息
	 */
	@Override
	public WtrjStudent searchStudentInfoByStudentNo(String no) {
		WtrjStudentExample example = new WtrjStudentExample();
		example.createCriteria().andStudentNoEqualTo(no);
		List<WtrjStudent> list = wtrjStudentMapper.selectByExample(example);
		if(list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<WtrjStudent> findStudentsByTeacherId(Integer userId) {
		return mtStudentMapper.findStudentsByTeacherId(userId);
	}
	

	@Override
	public List<WtrjStudent> findStudentsByParentId(Integer parentId) {
		return mtStudentMapper.findStudentsByParentId(parentId);
	}

	@Override
	public List<WtrjStudent> findStudentsByHeadTeacher(Integer headTeacherId) {
		return mtStudentMapper.findStudentsByHeadTeacher(headTeacherId);
	}

	@Override
	public MtStudentIncludesClassInfo findStudentAndClassInfoById(Integer studentId) {
		// TODO Auto-generated method stub
		return mtStudentMapper.findStudentAndClassInfoById(studentId);
	}
	
	
	@Override
	public List<StudentDto> searchByParentAndSchoolCodes(String phone,List<Integer>codes) {
		
		return mtStudentMapper.searchByParentAndSchoolCodes(phone,codes);
	}

	@Override
	public String searchStudentUrl(Integer id) {
		return mtStudentMapper.searchStudentUrl(id);
	}
	

	@Override
	public List<WtrjStudent> searchStudentsByTeacherId(Integer teacherId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 根据学校code模糊查询学生姓名
	 */
	@Override
	public List<StudentDto> searchStudentsByName(String name, String schoolCode,String classId) {
		return mtStudentMapper.searchStudentsByName(name, schoolCode,classId);
	}

	@Override
	public WtrjStudent searchStudentByStudentId(Integer studentId) {
		return wtrjStudentMapper.selectByPrimaryKey(studentId);
	}
	/**
	 * 根据老师id查询该老师为班主任的班级学生
	 */
	@Override
	public List<WtrjStudent> selectStudentsByTeacherId(Integer teacherId) {
		return wtrjStudentMapper.selectStudentsByTeacherId(teacherId);
	}
	
	/**
	 * 根据班级id查询学生信息
	 */
	@Override
	public List<WtrjStudent> selectStudentsByClassId(Integer classId) {
		return wtrjStudentMapper.selectStudentsByClassId(classId);
	}
}
