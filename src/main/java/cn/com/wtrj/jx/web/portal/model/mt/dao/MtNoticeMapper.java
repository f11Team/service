package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassParentDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassTeacherDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseClassDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtNoticeSendStatus;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentNoticeSendStatus;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolTeacherInfo;



public interface MtNoticeMapper {
	public List<MtClassParentDto> selectClassParents(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") Integer stage, @Param(value = "grade") Integer grade,
			@Param(value = "classNo") Integer classNo);

	public List<MtClassParentDto> selectCourseParents(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") Integer stage, @Param(value = "grade") Integer grade,
			@Param(value = "course") String course);

	public List<MtCourseClassDto> selectCourseClasses(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") Integer stage, @Param(value = "grade") Integer grade,
			@Param(value = "course") String course);

	public List<MtClassTeacherDto> selectClassTeachers(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") Integer stage, @Param(value = "grade") Integer grade,
			@Param(value = "classNo") Integer classNo, @Param(value = "course") String course);

	/**
	 * 获取行政教师（非班主任、任课老师、生辅老师）
	 * 
	 * @param schoolCode
	 * @param stage
	 * @return
	 */
	public List<MtSchoolTeacherInfo> selectSchoolStageTeachers(@Param(value = "schoolCode") String schoolCode,
			@Param(value = "stage") String stage);
	
	public List<MtSchoolTeacherInfo> selectSchoolTeachers(@Param(value = "schoolCode") String schoolCode);
	
	public List<MtNoticeSendStatus> selectShortMsgNoticeSendStatus(@Param(value = "msgCode") String msgCode);
	
	public List<MtNoticeSendStatus> selectWxNoticeSendStatus(@Param(value = "msgCode") String msgCode);
	
	public List<MtParentNoticeSendStatus> selectParentNoticeSendStatus(@Param(value = "msgCode") String msgCode);
}
