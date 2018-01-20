package cn.com.wtrj.jx.web.portal.service.report.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.mt.dao.report.MtNcAnalysisMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtNcAnalysisDto;
import cn.com.wtrj.jx.web.portal.service.report.IReportAnalysisService;
import cn.com.wtrj.jx.web.portal.service.response.report.AnalysisDataRet;

@Service
public class ReportAnalysisService implements IReportAnalysisService {

	@Autowired
	private MtNcAnalysisMapper mtMapper;

	@Override
	public List<AnalysisDataRet> searchNcAnalysisInfo(Integer userId, Integer year, Integer month,String startDate,String endDate) {
		List<MtNcAnalysisDto> dtos = mtMapper.selectNcAnalysisInfo(userId, year, month,startDate,endDate);

		// 数据统计
		List<AnalysisDataRet> records = new ArrayList<AnalysisDataRet>();
		AnalysisDataRet topData = new AnalysisDataRet();
		topData.setOrgCode("00");
		topData.setOrgName("嘉祥集团");
		Map<String, AnalysisDataRet> segmentMap = new HashMap<String, AnalysisDataRet>();
		for (MtNcAnalysisDto dto : dtos) {
			contvertMoney(dto);

			// 明细数据计算
			this.doNewMethodDetail(dto);

			// 集团数据累加
			addNcData(dto, topData);

			// 板块数据累加
			AnalysisDataRet sgementData = segmentMap.get(dto.getSegmentName());
			if (sgementData == null) {
				sgementData = new AnalysisDataRet();
				sgementData.setSegmentName(dto.getSegmentName());
				sgementData.setOrgName(dto.getSegmentName());

				List<AnalysisDataRet> children = new ArrayList<AnalysisDataRet>();
				sgementData.setChildren(children);

				segmentMap.put(dto.getSegmentName(), sgementData);
			}
			addNcData(dto, sgementData);

			DozerBeanMapper mapper = new DozerBeanMapper();
			AnalysisDataRet child = new AnalysisDataRet();
			mapper.map(dto, child);

			sgementData.getChildren().add(child);

		}

		List<AnalysisDataRet> children = new ArrayList<AnalysisDataRet>();
		for (String key : segmentMap.keySet()) {
			children.add(segmentMap.get(key));
		}
		topData.setChildren(children);
		records.add(topData);
		return records;
	}

	/**************************************************************************************/
	/**
	 * 元转化为万元
	 * 
	 * @param dto
	 */
	private void contvertMoney(MtNcAnalysisDto dto) {
		// 总收入
		dto.setIncome(dataUnitFormat(dto.getIncome()));
		// 总支出
		dto.setExpenditure(dataUnitFormat(dto.getExpenditure()));
		// 资产
		dto.setAsset(dataUnitFormat(dto.getAsset()));
		// 负债
		dto.setDebt(dataUnitFormat(dto.getDebt()));
		// 期间费用
		dto.setFinancial(dataUnitFormat(dto.getFinancial()));
		// 净利润
		dto.setNetProfit(dataUnitFormat(dto.getNetProfit()));
		// 毛利润
		dto.setGrossProfit(dataUnitFormat(dto.getGrossProfit()));
		// 资金
		dto.setCapital(dataUnitFormat(dto.getCapital()));
	}

	private double dataUnitFormat(Double money) {
		BigDecimal m = BigDecimal.valueOf(money == null ? 0 : money.doubleValue());
		m.divide(BigDecimal.valueOf(10000), 4, RoundingMode.HALF_DOWN);
		return m.divide(BigDecimal.valueOf(10000), 4, RoundingMode.HALF_DOWN).doubleValue();
	}

	/**
	 * 数据累加
	 * 
	 * @param source
	 * @param goal
	 */
	private void addNcData(MtNcAnalysisDto source, AnalysisDataRet goal) {
		// 总收入
		goal.setIncome(doDoubleAddition(goal.getIncome(), source.getIncome()));
		// 总支出
		goal.setExpenditure(doDoubleAddition(goal.getExpenditure(), source.getExpenditure()));
		// 资产
		goal.setAsset(doDoubleAddition(goal.getAsset(), source.getAsset()));
		// 负债
		goal.setDebt(doDoubleAddition(goal.getDebt(), source.getDebt()));
		// 期间费用
		goal.setFinancial(doDoubleAddition(goal.getFinancial(), source.getFinancial()));
		// 净利润
		goal.setNetProfit(doDoubleAddition(goal.getNetProfit(), source.getNetProfit()));
		// 毛利润
		goal.setGrossProfit(doDoubleAddition(goal.getGrossProfit(), source.getGrossProfit()));
		// 资金
		goal.setCapital(doDoubleAddition(goal.getCapital(), source.getCapital()));
		// 计算教师个数
		goal.setTeacher((goal.getTeacher() == null ? 0 : goal.getTeacher()) + (source.getTeacher()==null?0:source.getTeacher()));
		// 计算学生个数
		goal.setStudent((goal.getStudent() == null ? 0 : goal.getStudent()) + (source.getStudent()==null?0:source.getStudent()));
		//计算总人数合计
		goal.setEmployeeNum((goal.getEmployeeNum()==null?0:goal.getEmployeeNum())+(source.getEmployeeNum()==null?0:source.getEmployeeNum()));
		this.doNewMethod(goal);
	}

	private double doDoubleAddition(Double data1, Double data2) {
		BigDecimal bd1 = BigDecimal.valueOf(data1 == null ? 0 : data1.doubleValue());
		BigDecimal bd2 = BigDecimal.valueOf(data2 == null ? 0 : data2.doubleValue());
		return bd1.add(bd2).doubleValue();
	}

	// 计算合计内容
	private void doNewMethod(AnalysisDataRet goal) {
		// 计算净利率
		if (goal.getNetProfit() <= 0) {
			goal.setJinlilv("0");
			goal.setShijun("0");
			goal.setRenjun("0");
			goal.setXuejun("0");
			
			goal.setJinlilvVal((double) 0);
			goal.setShijunVal((double) 0);
			goal.setRenjunVal((double) 0);
			goal.setXuejunVal((double) 0);
		} else {
			if (goal.getIncome() <= 0) {
				goal.setJinlilv("-");
				goal.setJinlilvVal((double) 0);
			} else {
				BigDecimal stm = (new BigDecimal(goal.getNetProfit()).multiply(new BigDecimal(100))).divide(new BigDecimal(goal.getIncome()), 2,
						BigDecimal.ROUND_HALF_UP);
				goal.setJinlilvVal(stm.doubleValue());
				goal.setJinlilv(stm.toString());
			}
			if (goal.getTeacher()==null || goal.getTeacher() <= 0) {
				goal.setShijun("-");
				goal.setShijunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getTeacher()), 2, BigDecimal.ROUND_HALF_UP);
				goal.setShijunVal(stm.doubleValue());
				goal.setShijun(stm.toString());
			}
			if (goal.getStudent()==null || goal.getStudent() <= 0) {
				goal.setXuejun("-");
				goal.setXuejunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getStudent()), 2, BigDecimal.ROUND_HALF_UP);
				goal.setXuejunVal(stm.doubleValue());
				goal.setXuejun(stm.toString());
			}
			if (goal.getEmployeeNum()<= 0) {
				goal.setRenjun("-");
				goal.setRenjunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getEmployeeNum()), 2,
						BigDecimal.ROUND_HALF_UP);
				goal.setRenjunVal(stm.doubleValue());
				goal.setRenjun(stm.toString());
			}
		}
		// 计算毛利率
		if (goal.getGrossProfit() <= 0) {
			goal.setMaolilv("0");
			goal.setMaolilvVal((double) 0);
		} else {
			if (goal.getIncome() <= 0) {
				goal.setJinlilv("-");
				goal.setMaolilvVal((double) 0);
			} else {
				BigDecimal stm = (new BigDecimal(goal.getGrossProfit()).multiply(new BigDecimal(100))).divide(new BigDecimal(goal.getIncome()), 2,
						BigDecimal.ROUND_HALF_UP);
				goal.setMaolilvVal(stm.doubleValue());
				goal.setMaolilv(stm.toString());
			}
		}
	}

	// 计算明细内容
	private void doNewMethodDetail(MtNcAnalysisDto goal) {
		// 计算净利率
		if (goal.getNetProfit() <= 0) {
			goal.setJinlilv("0");
			goal.setShijun("0");
			goal.setRenjun("0");
			goal.setXuejun("0");
			
			goal.setJinlilvVal((double) 0);
			goal.setShijunVal((double) 0);
			goal.setRenjunVal((double) 0);
			goal.setXuejunVal((double) 0);
		} else {
			if (goal.getIncome() <= 0) {
				goal.setJinlilv("-");
				goal.setJinlilvVal((double) 0);
			} else {
				BigDecimal stm = (new BigDecimal(goal.getNetProfit()).multiply(new BigDecimal(100))).divide(new BigDecimal(goal.getIncome()), 2,
						BigDecimal.ROUND_HALF_UP);
				goal.setJinlilvVal(stm.doubleValue());
				goal.setJinlilv(stm.toString());
			}
			if (goal.getTeacher()==null || goal.getTeacher() <= 0) {
				goal.setShijun("-");
				goal.setShijunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getTeacher()), 2, BigDecimal.ROUND_HALF_UP);
				goal.setShijunVal(stm.doubleValue());
				goal.setShijun(stm.toString());
			}
			if (goal.getStudent()==null || goal.getStudent() <= 0) {
				goal.setXuejun("-");
				goal.setXuejunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getStudent()), 2, BigDecimal.ROUND_HALF_UP);
				goal.setXuejunVal(stm.doubleValue());
				goal.setXuejun(stm.toString());
			}
			if (goal.getEmployeeNum()==null || goal.getEmployeeNum()<= 0) {
				goal.setRenjun("-");
				goal.setRenjunVal((double) 0);
			} else {
				BigDecimal stm = new BigDecimal(goal.getNetProfit()).divide(new BigDecimal(goal.getEmployeeNum()), 2,
						BigDecimal.ROUND_HALF_UP);
				goal.setRenjunVal(stm.doubleValue());
				goal.setRenjun(stm.toString());
			}
		}
		// 计算毛利率
		if (goal.getGrossProfit() <= 0) {
			goal.setMaolilv("0");
			goal.setMaolilvVal((double) 0);
		} else {
			if (goal.getIncome() <= 0) {
				goal.setJinlilv("-");
				goal.setMaolilvVal((double) 0);
			} else {
				BigDecimal stm = (new BigDecimal(goal.getGrossProfit()).multiply(new BigDecimal(100))).divide(new BigDecimal(goal.getIncome()), 2,
					BigDecimal.ROUND_HALF_UP);
				goal.setMaolilvVal(stm.doubleValue());
				goal.setMaolilv(stm.toString());
				}
			}
	}
}