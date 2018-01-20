package cn.com.wtrj.jx.web.portal.service.moralStudent;

import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudent;

import java.util.List;


public interface IWtrjMoralStudentService {


    WtrjMoralStudent getStudentByName(String name);

    WtrjMoralStudent getStudentById(Integer id);

    WtrjMoralStudent getStudentByStudId(Integer stuId);

    int deleteByPrimaryKey(Integer id);

    int insertStudent(WtrjMoralStudent wtrjMoralStudent);

    List<WtrjMoralStudent> selectStudentsByPage(Integer start, Integer limit);

    int updateByPrimaryKeySelective(WtrjMoralStudent wtrjMoralStudent);

    int updateByPrimaryKey(WtrjMoralStudent wtrjMoralStudent);

    int countStudents();

    int updateFlag(Integer id,String flag);

}
