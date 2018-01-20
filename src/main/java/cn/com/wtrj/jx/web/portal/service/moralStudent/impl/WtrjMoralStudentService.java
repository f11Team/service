package cn.com.wtrj.jx.web.portal.service.moralStudent.impl;

import cn.com.wtrj.jx.web.portal.model.dao.moralStudent.WtrjMoralStudentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStudentExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent.WtrjMtMoralStudentMapper;
import cn.com.wtrj.jx.web.portal.service.moralStudent.IWtrjMoralStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生服务类
 */
@Service
public class WtrjMoralStudentService implements IWtrjMoralStudentService {

    @Autowired
    private WtrjMoralStudentMapper wtrjMoralStudentMapper;

    @Autowired
    private WtrjMtMoralStudentMapper wtrjMtMoralStudentMapper;

    @Override
    public WtrjMoralStudent getStudentByName(String name) {

        WtrjMoralStudentExample example=new WtrjMoralStudentExample();
        // 先按全部小写查找
        example.createCriteria().andNameEqualTo(name.toLowerCase());
        List<WtrjMoralStudent> students=wtrjMoralStudentMapper.selectByExample(example);
        if (students!=null && students.size()==1){
            return  students.get(0);
        }
        // 如果小写未匹配成功，则按大写查找匹配
        example.clear();
        example.createCriteria().andNameEqualTo(name.toUpperCase());
        students=wtrjMoralStudentMapper.selectByExample(example);
        if (students!=null && students.size()==1){
            return  students.get(0);
        }
        // 大小写都未匹配成功，返回null
        return null;
    }

    @Override
    public WtrjMoralStudent getStudentById(Integer id) {
        return  wtrjMoralStudentMapper.selectByPrimaryKey(id);
    }

    @Override
    public WtrjMoralStudent getStudentByStudId(Integer stuId) {

        WtrjMoralStudentExample example=new WtrjMoralStudentExample();
        example.createCriteria().andStuIdEqualTo(stuId);
        List<WtrjMoralStudent> students= wtrjMoralStudentMapper.selectByExample(example);
        if (students!=null && students.size()==1){
            return  students.get(0);
        }
        return  null;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return  wtrjMoralStudentMapper.deleteByPrimaryKey(id);
    }


    @Override
    public int insertStudent(WtrjMoralStudent wtrjMoralStudent) {
        return wtrjMoralStudentMapper.insert(wtrjMoralStudent);
    }


    @Override
    public List<WtrjMoralStudent> selectStudentsByPage(Integer start, Integer limit) {
        return wtrjMtMoralStudentMapper.selectByPage(start,limit);
    }

    @Override
    public int updateByPrimaryKeySelective(WtrjMoralStudent wtrjMoralStudent) {
        return wtrjMoralStudentMapper.updateByPrimaryKeySelective(wtrjMoralStudent);
    }

    @Override
    public int updateByPrimaryKey(WtrjMoralStudent wtrjMoralStudent) {
        return wtrjMoralStudentMapper.updateByPrimaryKey(wtrjMoralStudent);
    }

    @Override
    public int countStudents() {
        return  wtrjMoralStudentMapper.countByExample(new WtrjMoralStudentExample());
    }

    @Override
    public int updateFlag(Integer id, String flag) {

        WtrjMoralStudent student=new WtrjMoralStudent();
        student.setId(id);
        student.setDelFlg(flag);
        return wtrjMoralStudentMapper.updateByPrimaryKeySelective(student);
    }


}
