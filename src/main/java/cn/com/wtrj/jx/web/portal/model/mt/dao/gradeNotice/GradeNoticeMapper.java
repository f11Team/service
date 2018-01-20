package cn.com.wtrj.jx.web.portal.model.mt.dao.gradeNotice;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;

public interface GradeNoticeMapper {

	int countWtrjRptScoreUpload(@Param("id") Integer id, @Param("schoolCode")String schoolCode, @Param("grade")String grade, @Param("class_id")String class_id);

	List<WtrjRptScoreUpload> searchWtrjRptScoreUpload(@Param("id") Integer id, @Param("schoolCode")String schoolCode, @Param("grade")String grade, @Param("class_id")String class_id,
			@Param("start")int start,@Param("end") int end);

}
