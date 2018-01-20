package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.DictItem;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.Student;

public interface ScoreUploadMapper {

	public List<School> findAllSchool();
	
	public List<Grade> findGradesBySchoolCode(String schoolCode);
	
	public List<SchoolClass> findClassesByGrade(@Param("grade") String grade, @Param("schoolCode") String schoolCode);
	
	public List<SchoolClass> findClassesBySchoolCode(@Param("schoolCode") String schoolCode);
	
	public List<Student> findStudents(@Param("classId") String classId, @Param("grade") String grade, @Param("schoolCode") String schoolCode);
	
	public void saveScoreUploadInfo(Score upload);
	
	public void saveStudentsScore(Score upload);
	
	public List<Score> getScoreUploadByPage(@Param("start") Integer start, @Param("end") Integer end, @Param("teacherId") Integer teacherId);
	
	public int countScoreUploaByPage(Integer teacherId);
	
	public void deleteScoreUpload(String id);
	
	public Score findById(String id);
	
	public int checkScoreUpload(Score upload);
	
	public void deleteStudentScore(Score score);
	
	public void deleteScoreUploadFile(Score upload);
	
	public List<Score> findScoreUploadInsByClassId(String classId);
	
	public List<Score> findScoreMultiInsByClassId(String classId);
	
	public int findScoreUploadCountByClassAndIns(@Param("classId") String classId, @Param("ins") String examInsId);
	
	public List<Score> findScoreUploadInfosByClassAndIns(@Param("start") Integer start, @Param("end") Integer end, @Param("classId") String classId, @Param("ins") String examInsId);
	
	public List<Score> findScoreDetailByInsIdAndClassId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public void saveScoreSum(Score score);
	
	public ArrayList<Score> findScoreSumByClassIdAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public double findScoreSumAvgByClassIdAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public double findScoreSumBottomByClassIdAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public void updateScoreSumInfos(Score score);
	
	public void updateScienceClassNumber(Score score);
	
	public void updateArtsClassNumber(Score score);
	
	public void deleteScoreSumInfosByInsIdAndClassId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
//	public List<MtSchoolInfo> selectSchoolByUserId(@Param("userId")Integer userId);
	
	public List<MtSchoolInfo> selectSchoolByTeacherId(@Param("teacherId")Integer teacherId);

	/**
	 * 20170910 wusm 
	 * 
	 * @param classIds
	 * @return
	 */
	public List<Score> findScoreUploadInsByClassIdArray(@Param("classIds")List<String> classIds);
	

	public List<Score> findScoreUploadInfosByClass(@Param("classId") String classId,@Param("teacherId")String teacherId);
	
	public List<Score> findSingleCourse(Score score);
	
	//班级平均分
	public Integer findClassAvgScore(Score score);
	
	//班级最高分
	public Integer findClassTopScore(Score score);
	
	public List<DictItem> findCourseCodeByClassIdAndInsId(@Param("classId") String classId,@Param("examInsId") String examInsId);
	
	public Double findScienceSumScoreByClassAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId,@Param("studentName")String studentName);
	
	public Double findArtsSumScoreByClassAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId,@Param("studentName")String studentName);

	public List<Score> findScienceScoreByClassIdAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public List<Score> findArtsScoreByClassIdAndInsId(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public Integer findsumScoreRangeCount(@Param("examInsId")String examInsId,@Param("classId") String classId,@Param("startScore")Double startScore,@Param("endScore")Double endScore);

	public Integer findScienceScoreRangeCount(@Param("examInsId")String examInsId,@Param("classId") String classId,@Param("startScore")Double startScore,@Param("endScore")Double endScore);
	
	public Integer findArtsScoreRangeCount(@Param("examInsId")String examInsId,@Param("classId") String classId,@Param("startScore")Double startScore,@Param("endScore")Double endScore);
	
	public Integer findCourseScoreRangeCount(@Param("examInsId")String examInsId,@Param("classId") String classId,@Param("startScore")Double startScore,@Param("endScore")Double endScore,@Param("courseCode")String courseCode);
	
	public String findClassRemarkByClassIdAndInsId(@Param("examInsId")String examInsId,@Param("classId") String classId);
	
}
