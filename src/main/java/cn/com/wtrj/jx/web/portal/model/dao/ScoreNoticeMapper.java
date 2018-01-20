package cn.com.wtrj.jx.web.portal.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.service.dto.Score;

public interface ScoreNoticeMapper {
	
	public List<TeacherPermission> findTeacherClasses(Integer teacherId);
	
	public List<TeacherPermission> findRkTeacherClasses(Integer teacherId);
	
	public List<Score> findScoreSumByClassAndExamIns(@Param("classId") String classId, @Param("examInsId") String examInsId);
	
	public List<Score> findStudentDetailScore(@Param("classId") String classId, @Param("examInsId") String examInsId, @Param("studentName") String studentName);
		
}
