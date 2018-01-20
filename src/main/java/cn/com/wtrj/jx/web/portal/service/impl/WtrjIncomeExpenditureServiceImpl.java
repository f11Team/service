package cn.com.wtrj.jx.web.portal.service.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.IncomeExpenditureMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.IncomeExpenditureBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtOrgShouzhiValueDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectMothShouzhiDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtProjectShouzhiValueDto;
import cn.com.wtrj.jx.web.portal.service.IWtrjIncomeExpenditureService;

/**
 * 收入支出表业务逻辑实现层
 * 
 * @author jitao
 *
 */
@Service
public class WtrjIncomeExpenditureServiceImpl implements IWtrjIncomeExpenditureService {

	@Autowired
	IncomeExpenditureMapper mtShouzhiMapper;

	@Override
	public List<Integer> searchAllYears() {
		List<Integer> list = mtShouzhiMapper.searchAllYears();
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoByYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByYear(year, userId, segementCode, orgCode, startDate, endDate);
		// 按照年月大小倒序
		Collections.sort(list, new Comparator<IncomeExpenditureBean>() {
			@Override
			public int compare(IncomeExpenditureBean o1, IncomeExpenditureBean o2) {
				Integer i=o1.getYearMonth().compareTo(o2.getYearMonth());
				if (i>0) {
					return -1;
				} else if (i<0) {
					return 1;
				}
				return 0;
			}
		});
		return list;
	}
	/**2017-09-06**/
	@Override
	public List<IncomeExpenditureBean> searchInfoMubiaoYuResult(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate,List<IncomeExpenditureBean>mubiaoList) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByYear(year, userId, segementCode, orgCode, startDate, endDate);
		
		for(IncomeExpenditureBean mubiao:mubiaoList){
			Integer num=0;
			for(IncomeExpenditureBean rec:list){
				if(mubiao.getYearMonth().equals(rec.getYearMonth())){
					num=1;
					break;
				}
			}
			//当目标数据中存在但是比较数据中没有时，创建一条
			if(num==0){
				IncomeExpenditureBean recData = new IncomeExpenditureBean();
				recData.setYear(mubiao.getYear());
				recData.setMonth(mubiao.getMonth());
				recData.setschool(mubiao.getschool());
				recData.setproject(mubiao.getproject());
				recData.setId(0);
				recData.setIncome(BigDecimal.ZERO);
				recData.setExpenditure(BigDecimal.ZERO);
				list.add(recData);
			}
		}
		// 按照年月大小排序
		Collections.sort(list, new Comparator<IncomeExpenditureBean>() {
			@Override
			public int compare(IncomeExpenditureBean o1, IncomeExpenditureBean o2) {
				Integer i=o1.getYearMonth().compareTo(o2.getYearMonth());
				if (i>0) {
					return -1;
				} else if (i<0) {
					return 1;
				}
				return 0;
			}
		});
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoByProject(int year, int month, int userId) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByProject(year, month, userId);
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoBySchool(String project, int year, int month, int userId) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoBySchool(project, year, month, userId);
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoByProject2(int year, int userId) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByProject2(year, userId);
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoByProjectAndYear(int year, String project, int userId) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByProjectAndYear(year, project, userId);
		return list;
	}

	@Override
	public List<IncomeExpenditureBean> searchInfoByProjectAndYearAndMonth(int year, int month, String project, int userId) {
		List<IncomeExpenditureBean> list = mtShouzhiMapper.searchInfoByProjectAndYearAndMonth(year, month, project, userId);
		return list;
	}

	@Override
	public List<MtProjectMothShouzhiDto> searchProjectShouzhiByMonth(int year, int userId) {
		return mtShouzhiMapper.selectProjectDataByMonth(year, userId);
	}

	@Override
	public List<MtProjectShouzhiValueDto> searchProjectShouruData(int year, int month, int userId) {
		return mtShouzhiMapper.selectShouruByProject(year, month, userId);
	}

	@Override
	public List<MtProjectShouzhiValueDto> searchProjectZhichuData(int year, int month, int userId) {
		return mtShouzhiMapper.selectZhichuByProject(year, month, userId);
	}

	@Override
	public List<MtOrgShouzhiValueDto> searchOrgShouruDta(String project, int year, int month, int userId) {
		return mtShouzhiMapper.selectOrgShouruData(project, year, month, userId);
	}

	@Override
	public List<MtOrgShouzhiValueDto> searchOrgZhichuDta(String project, int year, int month, int userId) {
		return mtShouzhiMapper.selectOrgZhichuData(project, year, month, userId);
	}

}