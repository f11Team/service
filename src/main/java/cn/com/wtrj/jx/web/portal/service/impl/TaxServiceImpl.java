package cn.com.wtrj.jx.web.portal.service.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.TaxMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.TaxBean;
import cn.com.wtrj.jx.web.portal.service.TaxService;

/**
 * 税务表业务逻辑实现类
 * 
 * @author jitao
 *
 */
@Service
public class TaxServiceImpl implements TaxService {
	@Autowired
	TaxMapper taxMapper;

	@Override
	public List<Integer> searchTaxAllYears() {
		List<Integer> list = taxMapper.searchTaxAllYears();
		return list;
	}

	@Override
	public List<TaxBean> searchTaxInfoByYear(int year, int userId) {
		List<TaxBean> list = taxMapper.searchTaxInfoByYear(year, userId);
		return list;
	}

	@Override
	public List<TaxBean> searchTaxInfoByProject(int year, int month, int userId) {
		List<TaxBean> list = taxMapper.searchTaxInfoByProject(year, month, userId);
		return list;
	}

	@Override
	public List<TaxBean> searchTaxInfoBySchool(Integer year, Integer userId, String segementCode, String orgCode, String startDate, String endDate) {
		List<TaxBean> list = taxMapper.searchTaxInfoBySchool(year, userId, segementCode, orgCode, startDate, endDate);
		// 按照年月大小排序
		Collections.sort(list, new Comparator<TaxBean>() {
			@Override
			public int compare(TaxBean o1, TaxBean o2) {
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
	public List<TaxBean> searchTaxInfoMubiaoByResult(Integer year, Integer userId, String segementCode, String orgCode, String startDate, String endDate,
			List<TaxBean>mubiaoList) {
		List<TaxBean> list = taxMapper.searchTaxInfoBySchool(year, userId, segementCode, orgCode, startDate, endDate);
		
		/**2017-09-06**/
		for(TaxBean mubiao:mubiaoList){
			Integer num=0;
			for(TaxBean rec:list){
				if(mubiao.getYearMonth().equals(rec.getYearMonth())){
					num=1;
					break;
				}
			}
			//当目标数据中存在但是比较数据中没有时，创建一条
			if(num==0){
				TaxBean recData = new TaxBean();
				recData.setYear(mubiao.getYear());
				recData.setMonth(mubiao.getMonth());
				recData.setSchool(mubiao.getSchool());
				recData.setProject(mubiao.getProject());
				recData.setId(0);
				recData.setTax(BigDecimal.ZERO);
				list.add(recData);
			}
		}
		// 按照年月大小排序
		Collections.sort(list, new Comparator<TaxBean>() {
			@Override
			public int compare(TaxBean o1, TaxBean o2) {
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
}
