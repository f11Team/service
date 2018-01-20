package cn.com.wtrj.jx.web.portal.service.moralStudent;


import java.util.List;
import java.util.Map;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINS;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtInsDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtTeacherCourceDto;

public interface IWtrjMoralINSService {

    WtrjMoralINS getINSById(Integer id);

    int insertINS(WtrjMoralINS wtrjMoralINS);

    int deleteINSById(Integer id);

    int updateINSById(WtrjMoralINS wtrjMoralINS);

    /**
     * 通过学生id 获取实例
     * @param start
     * @param limit
     * @param stuId
     * @return
     */
    List<MtInsDto> selectINSByPage(Integer start,Integer limit,Integer stuId);

    /**
     * 通过学生id 计算实例个数
     * @param stuId
     * @return
     */
    int countINS(Integer stuId);

    /**
     * 通过学生id 获取实例  获取指定时间的数据
     * @param start
     * @param end
     * @param stuId
     * @param creatDateStart
     * @param creatDateEnd
     * @return
     */
    List<MtInsDto>selectINSByPageTime( Integer start,Integer end,Integer stuId, String creatDateStart, String creatDateEnd);


    /**
     * 计算 '通过学生id 获取实例  获取指定时间的数据' 的个数
     * @param stuId
     * @param creatDateStart
     * @param creatDateEnd
     * @return
     */
    int countSelectINSByTime(Integer stuId,String creatDateStart,String creatDateEnd);
    /**
     * 通过老师id 和班级id,学生姓名（模糊）查询
     * @param start
     * @param end
     * @param stuName
     * @param authTeacherId
     * @param classId
     * @return
     */
    
    List<MtInsDto> selectINSByPageByTeacherId(Integer start, Integer end, String stuName,Integer authTeacherId,Integer classId);

    /**
     * 计算 通过老师id 和班级id,学生姓名（模糊）查询 的个数
     * @param stuName
     * @param authTeacherId
     * @param classId
     * @return
     */
    int countSelectINSByTeacherId(String stuName,Integer authTeacherId,Integer classId);

    /**
     * 计算通过老师id 查询实例的个数
     * @param search
     * @param authTeacherId
     * @return
     */
    int countINSByTeacherId(String search, Integer authTeacherId);
    
    int countIns(Integer teacherId, String shoolCode, int role, String classId);
    
    List<WtrjMoralINS> pageIns(Integer teacherId, String shoolCode, int role, String classId, Integer start, Integer end);

    List<MtTeacherCourceDto> teacherCourse(Integer stuId,String code);

    /**
     * 通过主键 更新参数中非空字段
     * @param wtrjMoralINS
     * @return
     */
   int updateByPrimaryKeySelective(WtrjMoralINS wtrjMoralINS);

    /**
     * 更新逻辑删除标志
     * @param id
     * @param flg
     * @return
     */

   int updateFlagById(Integer id,String flg);

    List<MtTeacherCourceDto> getTeacherInfo(Integer stuId);


    /**
     *德育老师查询学生实例
     * @param schoolCode 学校编码
     * @return
     */
    List<MtInsDto> deYuTeacherGetINS(Integer start, Integer end, String schoolCode,String stuName,Integer classId);

    /**
     * 生活老师获取学生信息
     * @param idsList 班级id集合
     * @param stuName 学生名字
     * @return
     */
    List<WtrjStudent> lifeTeacherGetStudents(List<Integer>idsList, String stuName);


    /**
     *
     * 生活老师获取实例
     * @param idsList  班级id集合
     * @return
     */
    List<MtInsDto> lifeTeacherGetINS(Integer start, Integer end, List<Integer>idsList,String stuName,Integer classId);



    /**
     * 德育老师获取学生
     * @param schoolCode 学校code
     * @param stuName 学生名字
     * @return
     */
    List<WtrjStudent> deYuTeacherGetStudents(String schoolCode,String stuName);

    WtrjStudent findStudentInfoById(String stuid);
    
    /**
     * 获取实例详情
     * @param id 实例id
     * @return
     */
    MtInsDto getINSDto(Integer id);


    /**
     * 家长端查询学生信息
     * @param id 家长id
     * @return
     */
    List<MtInsDto> parentGetStudentById(Integer id);


    /**
     * 查询学生信息 返回Dto
     * @param id 实例id
     * @return
     */
    MtInsDto getInsDtoById(Integer id);


    /**
     * 计算实例的的分数
     * @param code 指标code
     * @return
     */
    Map<String, Object> getScoreByStandard(String code);
    
}
