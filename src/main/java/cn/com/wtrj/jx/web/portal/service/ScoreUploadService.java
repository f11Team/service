package cn.com.wtrj.jx.web.portal.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.DictItem;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.Student;

public interface ScoreUploadService {

	
	public List<School> findAllSchool();
	
	/**
	 * 获取教师的学校权限，暂时从教师表获取学校字段
	 * 20170910 wusm TODO
	 * @param teacherId
	 * @return
	 */
//	public List<MtSchoolInfo> searchSchoolByUserId(Integer useId);
	
	public List<MtSchoolInfo> searchSchoolByTeacherId(Integer teacherId);
	
	public List<Grade> findGradesBySchoolCode(String schoolCode);
	
	public List<SchoolClass> findClassesByGrade(String grade, String schoolCode);
	
	public List<Student> findStudents(String classId, String grade, String schoolCode);
	
	public void saveScoreUploadInfo(Score upload, List<Score> scores);
	
	public void saveStudentsScore(List<Score> scores);
	
	public List<Score> getScoreUploadByPage(Integer start, Integer end, Integer teacherId);
	
	public int countScoreUploaByPage(Integer teacherId);
	
	public void deleteScoreUpload(String id);
	
	public Score findById(String id);
	
	public int checkScoreUpload(Score upload);
	
	public void deleteStudentScore(Score score);
	
	public void deleteScoreUploadFile(Score upload);
	
	public List<Score> findScoreUploadInsByClassId(String classId);
	
	public List<Score> findScoreMultiInsByClassId(String classId);
	
	public List<Score> findScoreUploadInsByClassIdList(List<String> classIds);
	
	public int findScoreUploadCountByClassAndIns(String classId, String examInsId);
	
	public List<Score> findScoreUploadInfosByClassAndIns(Integer start, Integer end,String classId, String examInsId);

	public List<Score> findScoreUploadInfosByClass(String classId,String teacherId);
	
	public void sumScore(String classId, String examInsId,String classRemark);
	
	public void singleScore(Integer classId,Integer examInsId,String courseCode);
	
	public List<Score> findSingleCourse(Score score);
	
	//班级平均分
	public Integer findClassAvgScore(Score score);
		
	//班级最高分
	public Integer findClassTopScore(Score score);
	
	public List<DictItem> findCourseCodeByClassIdAndInsId(String classId,String examInsId);
	
	public String findClassRemarkByClassIdAndInsId(String examInsId,String classId);
	
}
