package cn.com.wtrj.jx.web.portal.service.moralStudent.impl;


import cn.com.wtrj.jx.web.portal.model.dao.moralStudent.WtrjMoralCountCycleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycle;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycleExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent.WtrjMtMoralCountCycleMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.CountScoreDto;
import cn.com.wtrj.jx.web.portal.service.moralStudent.IWtrjMoralCountCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WtrjMoralCountCycleService implements IWtrjMoralCountCycleService {

    @Autowired
    private WtrjMoralCountCycleMapper wtrjMoralCountCycleMapper;

    @Autowired
    private WtrjMtMoralCountCycleMapper wtrjMtMoralCountCycleMapper;

    @Override
    public int insertCountCycle(WtrjMoralCountCycle wtrjMoralCountCycle) {
        return wtrjMoralCountCycleMapper.insert(wtrjMoralCountCycle);
    }

    @Override
    public int updateDelFlagById(Integer id,String delFlag) {

        WtrjMoralCountCycle wtrjMoralCountCycle=new WtrjMoralCountCycle();
        wtrjMoralCountCycle.setId(id);
        wtrjMoralCountCycle.setBlDelFlg(delFlag);
        return wtrjMoralCountCycleMapper.updateByPrimaryKeySelective(wtrjMoralCountCycle);
    }

    @Override
    public int updateCountCycleById(WtrjMoralCountCycle wtrjMoralCountCycle) {
        return wtrjMoralCountCycleMapper.updateByPrimaryKey(wtrjMoralCountCycle);
    }

    @Override
    public int updateCountCycleByIdSelective(WtrjMoralCountCycle wtrjMoralCountCycle) {
        return wtrjMoralCountCycleMapper.updateByPrimaryKeySelective(wtrjMoralCountCycle);
    }

    @Override
    public WtrjMoralCountCycle getCountCycleById(Integer id) {
        return wtrjMoralCountCycleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<WtrjMoralCountCycle> selectCountCycleByPage(Integer start, Integer end) {
        return wtrjMtMoralCountCycleMapper.selectCountCycleByPage(start,end);
    }

    @Override
    public int countCountCycle() {
        return wtrjMoralCountCycleMapper.countByExample(new WtrjMoralCountCycleExample());
    }

    @Override
    public List<WtrjMoralCountCycle> getMoralCountCycleByDelFlag(String delFalg) {

        WtrjMoralCountCycleExample example=new WtrjMoralCountCycleExample();
        example.createCriteria().andBlDelFlgEqualTo(delFalg);
        return wtrjMoralCountCycleMapper.selectByExample(example);
    }

    @Override
    public List<CountScoreDto> getstudentScoreCountById(Integer stuId) {
        return wtrjMtMoralCountCycleMapper.getstudentScoreCountById(stuId);
    }
}
