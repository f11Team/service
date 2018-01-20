package cn.com.wtrj.jx.web.portal.service.moralStudent.impl;

import java.io.ObjectStreamClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandard;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtTeacherCourceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.moralStudent.WtrjMoralINSMapper;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINS;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralINSExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent.WtrjMtMoralINSMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.MtInsDto;
import cn.com.wtrj.jx.web.portal.service.moralStudent.IWtrjMoralINSService;


@Service
public class WtrjMoralINSService implements IWtrjMoralINSService {

    @Autowired
    private WtrjMoralINSMapper wtrjMoralINSMapper;
    @Autowired
    private WtrjMtMoralINSMapper wtrjMtMoralINSMapper;

    @Autowired
    private WtrjMoralStandardService wtrjMoralStandardService;

    @Override
    public WtrjMoralINS getINSById(Integer id) {
        return wtrjMoralINSMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertINS(WtrjMoralINS wtrjMoralINS) {
        return wtrjMoralINSMapper.insert(wtrjMoralINS);
    }

    @Override
    public int deleteINSById(Integer id) {
        return wtrjMoralINSMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateINSById(WtrjMoralINS wtrjMoralINS) {
        return wtrjMoralINSMapper.updateByPrimaryKey(wtrjMoralINS);
    }



    @Override
    public List<MtInsDto> selectINSByPage(Integer start,Integer end,Integer stuId) {

        return wtrjMtMoralINSMapper.selectINSByPage(start,end,stuId);
    }

    @Override
    public int countINS(Integer stuId) {
        WtrjMoralINSExample example=new WtrjMoralINSExample();
        example.createCriteria().andStudentIdEqualTo(stuId).andBldDelFlgEqualTo("0");
        return  wtrjMoralINSMapper.countByExample(example);
    }

    @Override
    public List<MtInsDto> selectINSByPageTime(Integer start, Integer end, Integer stuId, String creatDateStart, String creatDateEnd) {
        return wtrjMtMoralINSMapper.selectINSByPageTime(start,end,stuId,creatDateStart,creatDateEnd);
    }

    @Override
    public int countSelectINSByTime(Integer stuId, String creatDateStart, String creatDateEnd) {
        return wtrjMtMoralINSMapper.countSelectINSByTime(stuId,creatDateStart,creatDateEnd);
    }


    @Override
	public List<MtInsDto> selectINSByPageByTeacherId(Integer start, Integer end, String stuName,Integer authTeacherId,Integer classId) {
		return wtrjMtMoralINSMapper.selectINSByPageByTeacherId(start, end, stuName, authTeacherId,classId);
	}

    @Override
    public int countSelectINSByTeacherId(String stuName,Integer authTeacherId,Integer classId) {
        return wtrjMtMoralINSMapper.countSelectINSByTeacherId(stuName, authTeacherId,classId);
    }

    @Override
	public int countINSByTeacherId(String search, Integer authTeacherId) {
		return  wtrjMtMoralINSMapper.countIns(search, authTeacherId);
	}

    @Override
    public List<MtTeacherCourceDto> teacherCourse(Integer stuId, String code) {
        return wtrjMtMoralINSMapper.teacherCourse(stuId,code);
    }

    @Override
    public int updateByPrimaryKeySelective(WtrjMoralINS wtrjMoralINS) {

        return wtrjMoralINSMapper.updateByPrimaryKeySelective(wtrjMoralINS);
    }

    @Override
    public int updateFlagById(Integer id, String flg) {

        WtrjMoralINS wtrjMoralINS=new WtrjMoralINS();
        wtrjMoralINS.setId(id);
        wtrjMoralINS.setBldDelFlg(flg);
        return wtrjMoralINSMapper.updateByPrimaryKeySelective(wtrjMoralINS);
    }

    @Override
    public List<MtTeacherCourceDto> getTeacherInfo(Integer stuId) {
        return wtrjMtMoralINSMapper.getTeacherInfo(stuId);
    }

    @Override
    public List<MtInsDto> deYuTeacherGetINS(Integer start, Integer end, String schoolCode,String stuName,Integer classId) {
        return wtrjMtMoralINSMapper.deYuTeacherGetINS(start,end,schoolCode,stuName,classId);
    }

    @Override
    public List<WtrjStudent> lifeTeacherGetStudents(List<Integer> idsList, String stuName) {
        return wtrjMtMoralINSMapper.lifeTeacherGetStudents(idsList,stuName);
    }

    @Override
    public List<MtInsDto> lifeTeacherGetINS(Integer start, Integer end, List<Integer> idsList,String stuName,Integer classId) {
        return wtrjMtMoralINSMapper.lifeTeacherGetINS(start,end,idsList,stuName,classId);
    }

    @Override
    public List<WtrjStudent> deYuTeacherGetStudents(String schoolCode ,String stuName) {
        return wtrjMtMoralINSMapper.deYuTeacherGetStudents(schoolCode,stuName);
    }

    @Override
    public MtInsDto getINSDto(Integer id) {
        return wtrjMtMoralINSMapper.getInsDto(id);
    }

    @Override
    public List<MtInsDto> parentGetStudentById(Integer id) {
        return wtrjMtMoralINSMapper.parentGetStudentById(id);
    }

    @Override
    public MtInsDto getInsDtoById(Integer id) {
        return wtrjMtMoralINSMapper.getInsDtoById(id);
    }

    @Override
    public Map<String, Object> getScoreByStandard(String code) {
        WtrjMoralStandard standard = wtrjMoralStandardService.getStandardByCode(code);
        if (standard==null)
            return null;
        int min=0;
        min+=standard.getBaseScore();
        int max=min;

        //加分
        if(standard.getType()=="01"){
            max+=standard.getInsScoreMax();
        }
        else {
            min-=standard.getInsScoreMin();
        }
        if (min<0)
            min=0;
        if (max<min)
            max=min;
        Map<String,Object> score=new HashMap<>();
        score.put("min",min);
        score.put("max",max);
        return  score;

    }

	@Override
	public int countIns(Integer teacherId, String shoolCode, int role, String classId) {
		return wtrjMoralINSMapper.countIns(teacherId, shoolCode, role, classId);
	}

	@Override
	public List<WtrjMoralINS> pageIns(Integer teacherId, String shoolCode, int role, String classId, Integer start, Integer end) {
		return wtrjMoralINSMapper.pageIns(teacherId, shoolCode, role, classId, start, end);
	}

	@Override
	public WtrjStudent findStudentInfoById(String stuid) {
		return wtrjMoralINSMapper.findStudentInfoById(stuid);
	}

}
