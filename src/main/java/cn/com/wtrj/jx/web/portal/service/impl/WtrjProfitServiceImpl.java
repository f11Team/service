package cn.com.wtrj.jx.web.portal.service.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptNcProfitMapper;
import cn.com.wtrj.jx.web.portal.model.mt.dao.MtProfitMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtIntegerAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtStringAndBigDecimalBean;
import cn.com.wtrj.jx.web.portal.service.IWtrjProfitService;

/**
 * 盈利表service实现类
 * 
 * @author zhangbin
 *
 */
@Service
public class WtrjProfitServiceImpl implements IWtrjProfitService {

	@Autowired
	WtrjRptNcProfitMapper wtrjProfitMapper;

	@Autowired
	MtProfitMapper mtProfitMapper;

	@Override
	public List<Integer> searchYears() {
		return mtProfitMapper.selectYears();
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchProfitByMonth(Integer year, Integer month, Integer userId) {

		return mtProfitMapper.searchProfitByMonth(year, month, userId);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchProfitByMonthAndProject(Integer year, Integer month, String project, Integer userId) {

		return mtProfitMapper.searchProfitByMonthAndProject(year, month, project, userId);
	}

	@Override
	public List<MtIntegerAndBigDecimalBean> searchProfitOneYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate) {
		List<MtIntegerAndBigDecimalBean> list = mtProfitMapper.searchProfitAllYear(year, userId, segementCode, orgCode, startDate, endDate);
		// 按照年月大小排序
		Collections.sort(list, new Comparator<MtIntegerAndBigDecimalBean>() {
			@Override
			public int compare(MtIntegerAndBigDecimalBean o1, MtIntegerAndBigDecimalBean o2) {
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
	
	/**2017-09-05**/
	@Override
	public List<MtIntegerAndBigDecimalBean> searchProfitMubiaoYuResult(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate,List<MtIntegerAndBigDecimalBean> mubiaoList) {
		List<MtIntegerAndBigDecimalBean>result= mtProfitMapper.searchProfitAllYear(year, userId, segementCode, orgCode, startDate, endDate);
		for(MtIntegerAndBigDecimalBean mubiao:mubiaoList){
			Integer num=0;
			for(MtIntegerAndBigDecimalBean rec:result){
				if(mubiao.getYearMonth().equals(rec.getYearMonth())){
					num=1;
					break;
				}
			}
			//当目标数据中存在但是比较数据中没有是，创建一条
			if(num==0){
				MtIntegerAndBigDecimalBean recData = new MtIntegerAndBigDecimalBean();
				recData.setIntName(mubiao.getIntName());
				recData.setYear(mubiao.getYear());
				recData.setSumMaoli(BigDecimal.ZERO);
				recData.setSumValue(BigDecimal.ZERO);
				result.add(recData);
			}
		}
		// 按照年月大小排序
		Collections.sort(result, new Comparator<MtIntegerAndBigDecimalBean>() {
			@Override
			public int compare(MtIntegerAndBigDecimalBean o1, MtIntegerAndBigDecimalBean o2) {
				Integer i=o1.getYearMonth().compareTo(o2.getYearMonth());
				if (i>0) {
					return -1;
				} else if (i<0) {
					return 1;
				}
				return 0;
			}
		});
		return result;
	}

	@Override
	public List<MtIntegerAndBigDecimalBean> searchGrossProfitOneYear(Integer year) {

		return mtProfitMapper.searchGrossProfitAllYear(year);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchGrossProfitByMonth(Integer year, Integer month) {

		return mtProfitMapper.searchGrossProfitByMonth(year, month);
	}

	@Override
	public List<MtStringAndBigDecimalBean> searchGrossProfitByMonthAndProject(Integer year, Integer month, String project) {

		return mtProfitMapper.searchGrossProfitByMonthAndProject(year, month, project);
	}

}
