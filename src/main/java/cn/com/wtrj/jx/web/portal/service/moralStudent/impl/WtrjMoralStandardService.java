package cn.com.wtrj.jx.web.portal.service.moralStudent.impl;


import cn.com.wtrj.jx.web.portal.model.dao.moralStudent.WtrjMoralStandardMapper;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandard;
import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandardExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.moralStudent.WtrjMtMoralStandardMapper;
import cn.com.wtrj.jx.web.portal.service.moralStudent.IWtrjMoralStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WtrjMoralStandardService implements IWtrjMoralStandardService {


    @Autowired
    private WtrjMoralStandardMapper wtrjMoralStandardMapper;

    @Autowired
    private WtrjMtMoralStandardMapper wtrjMtMoralStandardMapper;

    @Override
    public WtrjMoralStandard getStandardByCode(String code) {
        return wtrjMoralStandardMapper.selectByPrimaryKey(code);
    }

    @Override
    public int insertStandard(WtrjMoralStandard wtrjMoralStandard) {
        return wtrjMoralStandardMapper.insert(wtrjMoralStandard);
    }

    @Override
    public List<WtrjMoralStandard> selectStandardByPage(Integer start, Integer limit) {
        return wtrjMtMoralStandardMapper.selectStandardByPage(start,limit);
    }

    @Override
    public WtrjMoralStandard getStandardByCodeAndINSNum(String code, Integer num) {

        WtrjMoralStandardExample example=new WtrjMoralStandardExample();
        example.createCriteria().andCodeEqualTo(code).andInsNumEqualTo(num);
        List<WtrjMoralStandard>standards=  wtrjMoralStandardMapper.selectByExample(example);
        if(standards!=null && standards.size()==1){
            return  standards.get(0);
        }
        return  null;
    }

    @Override
    public int countStandards() {
        WtrjMoralStandardExample example= new WtrjMoralStandardExample();
        return wtrjMoralStandardMapper.countByExample(example);
    }

    @Override
    public int updateFlag(String code, String flag) {

        WtrjMoralStandard standard =new WtrjMoralStandard();
        standard.setBlDelFlg(flag);
        standard.setCode(code);
        return wtrjMoralStandardMapper.updateByPrimaryKeySelective(standard);
    }

    @Override
    public int updateStandardByCode(WtrjMoralStandard standard) {
        return wtrjMoralStandardMapper.updateByPrimaryKey(standard);
    }

    @Override
    public int deleteStandardByCode(String code) {
        return wtrjMoralStandardMapper.deleteByPrimaryKey(code);
    }

    @Override
    public int updateAll(WtrjMoralStandard wtrjMoralStandard,String code) {
        WtrjMoralStandardExample example= new WtrjMoralStandardExample();
        example.createCriteria().andCodeEqualTo(code);
        return  wtrjMoralStandardMapper.updateByExample(wtrjMoralStandard,example);
    }

    @Override
    public List<WtrjMoralStandard> getAll() {

        WtrjMoralStandardExample example= new WtrjMoralStandardExample();
        example.createCriteria().andBlDelFlgEqualTo("0");
        return wtrjMoralStandardMapper.selectByExample(example);
    }
}
