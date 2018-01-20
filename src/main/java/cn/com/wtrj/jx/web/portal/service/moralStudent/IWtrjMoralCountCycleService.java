package cn.com.wtrj.jx.web.portal.service.moralStudent;


import cn.com.wtrj.jx.web.portal.model.entities.moralStudent.WtrjMoralCountCycle;
import cn.com.wtrj.jx.web.portal.model.mt.entities.moral.CountScoreDto;

import java.util.List;

public interface IWtrjMoralCountCycleService {


    /**
     * 添加
     * @param wtrjMoralCountCycle
     * @return
     */
    int insertCountCycle(WtrjMoralCountCycle wtrjMoralCountCycle);

    /**
     * 更新逻辑删除标志
     * @param delFlag
     * @return
     */
    int updateDelFlagById(Integer id,String delFlag);


    /**
     * 全字段更新
     * @param wtrjMoralCountCycle
     * @return
     */
    int updateCountCycleById(WtrjMoralCountCycle wtrjMoralCountCycle);


    /**
     * 更新参数实体中不为空的字段
     * @param wtrjMoralCountCycle
     * @return
     */
    int updateCountCycleByIdSelective(WtrjMoralCountCycle wtrjMoralCountCycle);


    /**
     * 根据id获取数据
     * @param id
     * @return
     */
    WtrjMoralCountCycle getCountCycleById(Integer id);


    /**
     * 分页获取数据
     * @param start
     * @param end
     * @return
     */
    List<WtrjMoralCountCycle> selectCountCycleByPage(Integer start,Integer end);

    /**
     * 总记录数
     * @return
     */
    int countCountCycle();

    /**
     * 根据是否逻辑删除来获取统计周期数据
     * @param delFalg  是否逻辑删除
     * @return
     */
    List<WtrjMoralCountCycle> getMoralCountCycleByDelFlag(String delFalg);


    /**
     * 根据学生id 获取学生 评分信息
     * @param stuId
     * @return
     */
    List<CountScoreDto> getstudentScoreCountById(Integer stuId);


}
