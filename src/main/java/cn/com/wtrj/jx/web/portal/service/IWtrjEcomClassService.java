package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtDormBackDelay;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.ClassSchoolDto;


/**
 * 
 * @author Administrator
 *
 */
public interface IWtrjEcomClassService {
	List<WtrjEcomClass> searchClassByTeacherId(Integer teacherId);

	List<MtDormBackDelay> searchDormBackDelayById(Integer classId);

	void informationToHeadTeacher(int parseInt);

	List<MtDormBackDelay> headTeacherSearchDormBackDelay(Integer teacherId);

	String selectStudentNoById(int id);

	MtDormBackDelay searchMtDormBackDelayByStudentNo(String studentNo);
	
	/**
	 * 查询指定学校、指定学部、指定年级包含的班级
	 * @param schoolCodes 学校code
	 * @param stage 学部
	 * @param grade 年级
	 * @return
	 */
	List<WtrjEcomClass> searchClassBySchoolAndStageAndGrade(List<Integer> schoolCodes,int stage,int grade);
	
	/**
	 * 按classId查询班级信息
	 * @param classId
	 * @return
	 */
	WtrjEcomClass searchById(int id);


	/**
	 * 根据学校code 查询班级信息
	 * @param schoolCode
	 * @return
	 */
	List<ClassSchoolDto>getEcomClassBySchoolCode(String schoolCode);

	void informationToHouseholder(String studentNoStr);
}
