package cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtTeacherCourceDto;
import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINS;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtInsDto;

public interface WtrjMtMoralINSMapper {

    List<MtInsDto> selectINSByPage(@Param("start") Integer start,@Param("end") Integer end,@Param("stuId") Integer stuId);
    
    List<MtInsDto> selectINSByPageByTeacherId(@Param("start") Integer start,@Param("end") Integer end,@Param("stuName")String stuName,@Param(value = "authTeacherId")Integer authTeacherId,@Param("classId") Integer classId);

    int countIns(@Param(value = "search")String search, @Param(value = "authTeacherId")Integer authTeacherId);

    List<MtTeacherCourceDto> teacherCourse(@Param("stuId")Integer stuId,@Param("code")String code);

    List<MtTeacherCourceDto> getTeacherInfo(@Param("stuId")Integer stuId);



    List<MtInsDto> lifeTeacherGetINS(@Param("start") Integer start,@Param("end") Integer end,@Param("idsList")List<Integer>idsList,@Param("stuName")String stuName,@Param("classId") Integer classId);


    List<MtInsDto> deYuTeacherGetINS(@Param("start") Integer start,@Param("end") Integer end,@Param("schoolCode")String  schoolCode,@Param("stuName")String stuName,@Param("classId")Integer classId);

    List<WtrjStudent> lifeTeacherGetStudents(@Param("idsList")List<Integer>idsList,@Param("stuName")String stuName);

    List<WtrjStudent> deYuTeacherGetStudents(@Param("schoolCode")String schoolCode, @Param("stuName")String stuName);

    MtInsDto getInsDto(@Param("id")Integer id);

    List<MtInsDto> parentGetStudentById(@Param("id")Integer id);

    MtInsDto getInsDtoById(@Param("id")Integer id);

    int countSelectINSByTeacherId(@Param("stuName")String stuName,@Param(value = "authTeacherId")Integer authTeacherId,@Param("classId") Integer classId);


    List<MtInsDto>selectINSByPageTime(@Param("start") Integer start,@Param("end") Integer end,@Param("stuId") Integer stuId,@Param("creatDateStart") String creatDateStart,@Param("creatDateEnd") String creatDateEnd);
    int countSelectINSByTime(@Param("stuId") Integer stuId,@Param("creatDateStart") String creatDateStart,@Param("creatDateEnd") String creatDateEnd);


}