package cn.com.wtrj.jx.web.portal.service.moralStudent;


import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralStandard;

import java.util.List;

public interface IWtrjMoralStandardService {

    WtrjMoralStandard getStandardByCode(String code);

    int insertStandard(WtrjMoralStandard wtrjMoralStandard);

    List<WtrjMoralStandard>selectStandardByPage(Integer start, Integer limit);

    WtrjMoralStandard getStandardByCodeAndINSNum(String code, Integer num);

    int countStandards();

    int updateFlag(String code,String flag);

    int updateStandardByCode(WtrjMoralStandard standard);

    int deleteStandardByCode(String code);

    int updateAll(WtrjMoralStandard wtrjMoralStandard,String code);

    List<WtrjMoralStandard> getAll();


}
