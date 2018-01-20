package cn.com.wtrj.jx.web.portal.service.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.BalanceSheetMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.BalanceSheetBean;
import cn.com.wtrj.jx.web.portal.service.IWtrjBalanceSheetService;

/**
 * 资产负债表service实现类
 * 
 * @author jitao
 *
 */
@Service
public class WtrjBalanceSheetServiceImpl implements IWtrjBalanceSheetService {

	@Autowired
	BalanceSheetMapper balanceSheetMapper;

	@Override
	public List<Integer> searchBalanceSheetAllYears() {
		List<Integer> list = balanceSheetMapper.searchBalanceSheetAllYears();
		return list;
	}

	@Override
	public List<BalanceSheetBean> searchBalanceSheetInfoByYear(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate) {
		List<BalanceSheetBean> list = balanceSheetMapper.searchBalanceSheetInfoByYear(year, userId, segementCode, orgCode, startDate, endDate);
		// 按照年月大小排序
		Collections.sort(list, new Comparator<BalanceSheetBean>() {
			@Override
			public int compare(BalanceSheetBean o1, BalanceSheetBean o2) {
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
	public List<BalanceSheetBean> searchBalanceSheetMubiaoByResult(Integer year, Integer userId, String segementCode, String orgCode, String startDate,
			String endDate,List<BalanceSheetBean> mubiaoList) {
		List<BalanceSheetBean> list = balanceSheetMapper.searchBalanceSheetInfoByYear(year, userId, segementCode, orgCode, startDate, endDate);
		/**2017-09-06**/
		for(BalanceSheetBean mubiao:mubiaoList){
			Integer num=0;
			for(BalanceSheetBean rec:list){
				if(mubiao.getYearMonth().equals(rec.getYearMonth())){
					num=1;
					break;
				}
			}
			//当目标数据中存在但是比较数据中没有时，创建一条
			if(num==0){
				BalanceSheetBean recData = new BalanceSheetBean();
				recData.setYear(mubiao.getYear());
				recData.setMonth(mubiao.getMonth());
				recData.setSchool(mubiao.getSchool());
				recData.setProject(mubiao.getProject());
				recData.setId(0);
				recData.setDebt(BigDecimal.ZERO);
				recData.setAsset(BigDecimal.ZERO);
				list.add(recData);
			}
		}
		// 按照年月大小排序
		Collections.sort(list, new Comparator<BalanceSheetBean>() {
			@Override
			public int compare(BalanceSheetBean o1, BalanceSheetBean o2) {
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
	public List<BalanceSheetBean> searchBalanceSheetInfoByProject(int year, int month, int userId) {
		List<BalanceSheetBean> list = balanceSheetMapper.searchBalanceSheetInfoByProject(year, month, userId);
		return list;
	}

	@Override
	public List<BalanceSheetBean> searchBalanceSheetInfoBySchool(String project, int year, int month, int userId) {
		List<BalanceSheetBean> list = balanceSheetMapper.searchBalanceSheetInfoBySchool(project, year, month, userId);
		return list;
	}

}
