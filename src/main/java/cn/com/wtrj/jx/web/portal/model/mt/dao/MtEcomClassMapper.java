package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomClass;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtDormBackDelay;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtPermissionClassInfoDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.ClassSchoolDto;

public interface MtEcomClassMapper {

	List<WtrjEcomClass> searchClassByTeacherId(Integer teacherId);

	List<MtDormBackDelay> searchDormBackDelayById(Integer classId);

	void informationToHeadTeacher(int parseInt);

	List<MtDormBackDelay> headTeacherSearchDormBackDelay(Integer teacherId);

	String selectStudentNoById(int id);

	MtDormBackDelay searchMtDormBackDelayByStudentNo(String studentNo);

	List<ClassSchoolDto> getEcomClassBySchoolCode(@Param("schoolCode") String schoolCode);

	void informationToHouseholder(String studentNoStr);
	
	List<WtrjEcomClass> searchBySchoolCodesAndStageAndGrade(@Param("schoolCodes")List<Integer>schoolCodes,@Param("stage")Integer stage,@Param("grade")Integer grade);
	
	List<MtPermissionClassInfoDto> selectPermissionClassInfo(@Param("schoolCode") String schoolCode, @Param("stage") Integer stage, @Param("grade") Integer grade);
}
