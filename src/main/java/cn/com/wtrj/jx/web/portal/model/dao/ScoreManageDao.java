package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.Dict;
import cn.com.wtrj.jx.web.portal.model.entities.SearchInput;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRuleExt;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;

//对应ScoreMapper.xml
public interface ScoreManageDao {
	
	public List<WtrjRptScoreExamClass> findExamClassesPage(SearchInput input);
	
	public List<WtrjRptScoreExamClass> findRecoveryExamClassesPage(SearchInput input);

	public int findExamClassesCount(SearchInput input);
	
	public int findRecoveryExamClassesCount(SearchInput input);
	
	public List<TeacherPermission> findTeacherSchools(@Param("teacherId") int teacherId);
	
	public List<Integer> findTeacherStages(@Param("schoolCode") String schoolCode, @Param("teacherId") int teacherId);
	
	public List<Integer> findAllGrades(@Param("schoolCode") String schoolCode, @Param("stage") int stage);
	
	public List<TeacherPermission> findAllClasses(@Param("schoolCode") String schoolCode, @Param("stage") int stage, @Param("grade") int grade);
	
	public List<TeacherPermission> findTeacherRoles(@Param("schoolCode") String schoolCode, @Param("stage") int stage, 
			@Param("teacherId") int teacherId, @Param("roleType") String roleType);
	
	public int validateExamIns(WtrjRptScoreExamIns examIns);
	
	public void saveExamIns(WtrjRptScoreExamIns examIns);
	
	public void saveExamClass(WtrjRptScoreExamClass examClass);
	
	public WtrjRptScoreExamIns findExamInsById(int id);
	
	public List<WtrjStudent> findStudentsByClassId(int classId);
	
	public void saveScoreRule(WtrjScoreRuleExt rule);
	
	public void saveScoreUpload(WtrjRptScoreUpload upload);
	
	public void updateScoreRule(WtrjScoreRuleExt rule);
	
	public WtrjScoreRuleExt findScoreRule( @Param("examInsId") int examInsId,  @Param("courseCode") String courseCode,  @Param("classId") int classId);
	
	public void saveScoreDetail(WtrjRptScoreDetail scoreDetail);
	
	public List<WtrjRptScoreDetail> findScoreDetails(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void deleteScoreDetail(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void deleteScoreUpload(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void deleteAllScoreDetail(@Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public void deleteAllScoreUpload(@Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public void deleteScoreRule(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void deleteScoreExamClass(@Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public void deleteScoreExamClassCourse(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void deleteScoreExamIns(int id);
	
	public void updateExamClassUploadState(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("uploadState") String uploadState);
	
	public void updateExamClassSendState(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("sendState") String sendState);
	
	public void updateExamClassMsgCode(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("msgCode") String msgCode
			,@Param("sendState") String sendState,@Param("sendCondition") String sendCondition);
	
	public List<WtrjRptScoreUpload> findUploadCourses( @Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public List<WtrjRptScoreUpload> findRecoveryUploadCourses( @Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public WtrjRptScoreUpload findScoreUpload(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public List<Dict> findScoreRemarkTypeByState(String stateCode);
	
	public List<Dict> findScoreRemarkLevelByType(String typeCode);
	
	public List<Dict> findScoreRemarkCommentByLevel(String levelCode);
	
	public List<WtrjStudent> findStudentGradeOrder(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);
	
	public void updateStudentGradeOrder(@Param("id") String id, @Param("orderNumber")  int orderNumber);
	
	public void recoveryScoreDetail(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void recoveryScoreUpload(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void recoveryScoreRule(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void recoveryScoreExamClass(@Param("examInsId") int examInsId,  @Param("classId") int classId);
	
	public void recoveryScoreExamClassCourse(@Param("examInsId") int examInsId,  @Param("classId") int classId, @Param("courseCode") String courseCode);
	
	public void recoveryScoreExamIns(int id);
	
	public WtrjRptScoreExamClass findExamClassByExamIdAndClassId(@Param("examInsId")Integer examInsId,@Param("classId")Integer classId);
	
	public double findGradeAvgScore(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);
	
	public double findGradeTopScore(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);

	public double findGradeMinScore(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);
	
	public List<WtrjRptScoreSum> findScienceScoreNumByGradeIdAndInsId(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);

	public List<WtrjRptScoreSum> findArtsScoreNumByGradeIdAndInsId(@Param("stage") int stage, @Param("grade") int grade,@Param("examInsId")  int examInsId);

	public void updateGradeScoreSum(WtrjRptScoreSum scoreSum);
	
	public List<String> findCourseCodeByGradeIdAndInsIdAndStage(@Param("grade") int grade,@Param("examInsId")  int examInsId);

	public Double findScienceScore(@Param("examInsId") int examInsId,  @Param("classId") int classId);

	public Double findArtsScore(@Param("examInsId") int examInsId,  @Param("classId") int classId);

	public String findClassRemark(@Param("examInsId") int examInsId,  @Param("classId") int classId);

}
