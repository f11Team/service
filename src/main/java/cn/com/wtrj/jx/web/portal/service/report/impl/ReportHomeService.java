package cn.com.wtrj.jx.web.portal.service.report.impl;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptIndexAnalysisMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexAnalysis;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptIndexAnalysisExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.model.mt.dao.report.MtReportHomeMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtIndexDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptIndexAnalysisDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtRptScoreAnalysisDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.report.MtTeacherOrStudentDto;
import cn.com.wtrj.jx.web.portal.service.report.IReportAnalysisService;
import cn.com.wtrj.jx.web.portal.service.report.IReportHomeService;
import cn.com.wtrj.jx.web.portal.service.report.IReportHrService;
import cn.com.wtrj.jx.web.portal.service.report.IReportScoreService;
import cn.com.wtrj.jx.web.portal.service.report.IReportService;
import cn.com.wtrj.jx.web.portal.service.report.impl.ConstRpt.IndexId;
import cn.com.wtrj.jx.web.portal.service.report.impl.ConstRpt.IndexType;
import cn.com.wtrj.jx.web.portal.service.report.impl.ConstRpt.WarnLevel;
import cn.com.wtrj.jx.web.portal.service.response.report.AnalysisDataRet;
import cn.com.wtrj.jx.web.portal.service.response.report.RptIndexRet;

@Service
public class ReportHomeService implements IReportHomeService {

	@Autowired
	private MtReportHomeMapper mtMapper;

	@Autowired
	private WtrjRptIndexAnalysisMapper analysisMapper;

	@Autowired
	private WtrjUserMapper userMapper;

	@Autowired
	private WtrjEmployeeMapper emMapper;

	@Autowired
	private IReportAnalysisService rptAnalysisService;

	@Autowired
	IReportService rptService;

	@Autowired
	IReportScoreService rptScoreService;

	@Autowired
	IReportHrService rptHrService;

	@Override
	public RptIndexRet searchRptIndex(Integer userId) {
		RptIndexRet re = new RptIndexRet();
		List<MtIndexDto> rs = mtMapper.searchRptIndex(userId);
		// 指标分类
		for (MtIndexDto r : rs) {
			if (r.getTypeCode() == IndexType.type01) {
				re.getNc().add(r);
			} else if (r.getTypeCode() == IndexType.type02) {
				re.getZs().add(r);
			} else if (r.getTypeCode() == IndexType.type03) {
				re.getScore().add(r);
			} else if (r.getTypeCode() == IndexType.type04) {
				re.getEdu().add(r);
			}
		}
		// 指标计算
		/** 财务指标 */
		if (re.getNc().size() > 0) {
			// 经营汇总表报表接口所需参数，首页不需要用
			String startDate = "";
			String endDate = "";
			// 当前年月
			Integer year = Calendar.getInstance().get(Calendar.YEAR);
			Integer month = Calendar.getInstance().get(Calendar.MONTH) + 1;
			// 当前数据
			List<AnalysisDataRet> ds1 = rptAnalysisService.searchNcAnalysisInfo(userId, year, month, startDate, endDate);
			AnalysisDataRet d1 = new AnalysisDataRet();
			if (ds1 != null && ds1.size() > 0) {
				d1 = ds1.get(0);
			}
			// 同比数据
			List<AnalysisDataRet> ds2 = rptAnalysisService.searchNcAnalysisInfo(userId, year - 1, month, startDate, endDate);
			AnalysisDataRet d2 = new AnalysisDataRet();
			if (ds2 != null && ds2.size() > 0) {
				d2 = ds2.get(0);
			}
			for (MtIndexDto r : re.getNc()) {
				// 数据解析
				if (r.getIndexId() == IndexId.index101) {
					/** 总收入 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getIncome());
					Double v2 = getVal(d2.getIncome());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index102) {
					/** 总支出 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getExpenditure());
					Double v2 = getVal(d2.getExpenditure());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index103) {
					/** 净利率 */
					String formatTop = "{0}%{1}（{2}%）";
					String formatPop = "本期{0}%，较上年同期{1}%，{2}{3}%";
					Double v1 = getVal(d1.getJinlilvVal());
					Double v2 = getVal(d2.getMaolilvVal());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setWarnLevel(WarnLevel.Perfect);
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index104) {
					/** 净利润 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getNetProfit());
					Double v2 = getVal(d2.getNetProfit());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index105) {
					/** 人均净利润 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getRenjunVal());
					Double v2 = getVal(d2.getRenjunVal());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index106) {
					/** 师均净利润 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getShijunVal());
					Double v2 = getVal(d2.getShijunVal());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index107) {
					/** 生均净利润 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本期{0}万元，较上年同期{1}万元，{2}{3}万元";
					Double v1 = getVal(d1.getXuejunVal());
					Double v2 = getVal(d2.getXuejunVal());
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				}
			}
		}

		/** 招生指标 */
		if (re.getZs().size() > 0) {
			// Controller层处理
		}

		/** 成绩指标 */
		if (re.getScore().size() > 0) {
			// 最新两次考试
			List<WtrjRptScoreExamIns> es = rptService.searchRoleExamIns(userId);
			// 本次考试
			Double v_avg1 = 0D;
			Double v_max1 = 0D;
			Double v_ok1 = 0D;
			Double v_valid1 = 0D;
			if (es.size() > 0) {
				List<MtRptScoreAnalysisDto> ds1 = rptScoreService.selectScoreAnalysisData(userId, "", es.get(0).getId());
				for (MtRptScoreAnalysisDto d : ds1) {
					v_avg1 += getVal(d.getPjScroe());
					v_max1 += getVal(d.getGrZongfen());
					v_ok1 += getVal(d.getJgLv());
					v_valid1 += getVal(d.getGrYouxiao());
				}
				v_avg1 = v_avg1 / ds1.size();
				v_max1 = v_max1 / ds1.size();
				v_ok1 = v_ok1 / ds1.size();
				v_valid1 = v_valid1 / ds1.size();
			}
			// 上次考试
			Double v_avg2 = 0D;
			Double v_max2 = 0D;
			Double v_ok2 = 0D;
			Double v_valid2 = 0D;
			if (es.size() > 1) {
				List<MtRptScoreAnalysisDto> ds2 = rptScoreService.selectScoreAnalysisData(userId, "", es.get(1).getId());
				for (MtRptScoreAnalysisDto d : ds2) {
					v_avg2 += getVal(d.getPjScroe());
					v_max2 += getVal(d.getGrZongfen());
					v_ok2 += getVal(d.getJgLv());
					v_valid2 += getVal(d.getGrYouxiao());
				}
				v_avg2 = v_avg2 / ds2.size();
				v_max2 = v_max2 / ds2.size();
				v_ok2 = v_ok2 / ds2.size();
				v_valid2 = v_valid2 / ds2.size();
			}
			for (MtIndexDto r : re.getScore()) {
				if (r.getIndexId() == IndexId.index301) {
					/** 总平均分 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本次{0}分，较上次{1}分，{2}{3}分";
					Double v1 = v_avg1;
					Double v2 = v_avg2;
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setWarnLevel(WarnLevel.Warn);
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index302) {
					/** 总分最高分 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本次{0}分，较上次{1}分，{2}{3}分";
					Double v1 = v_max1;
					Double v2 = v_max2;
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index303) {
					/** 及格率 */
					String formatTop = "{0}%{1}（{2}%）";
					String formatPop = "本次{0}%，较上次{1}%，{2}{3}%";
					Double v1 = v_ok1;
					Double v2 = v_ok2;
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				} else if (r.getIndexId() == IndexId.index304) {
					/** 有效分 */
					String formatTop = "{0}{1}（{2}）";
					String formatPop = "本次{0}分，较上次{1}分，{2}{3}分";
					Double v1 = v_valid1;
					Double v2 = v_valid2;
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				}
			}
		}

		/** 人员指标 */
		if (re.getEdu().size() > 0) {
			List<MtTeacherOrStudentDto> ds = rptHrService.searchShishengBidui(userId, "");
			Double v_1 = 0D;
			Double v_2 = 0D;
			if (ds.size() > 0) {
				v_1 = ds.get(0).getRate();
			}
			if (ds.size() > 1) {
				v_2 = ds.get(1).getRate();
			}
			for (MtIndexDto r : re.getEdu()) {
				if (r.getIndexId() == IndexId.index401) {
					/** 总分最高分 */
					String formatTop = "{0}%{1}（{2}%）";
					String formatPop = "本期{0}%，较上年同期{1}%，{2}{3}%";
					Double v1 = v_1;
					Double v2 = v_2;
					Double v3 = Math.abs(v1 - v2);
					String splitTop = "";
					String splitPop = "";
					if (v1 > v2) {
						splitTop = "↑";
						splitPop = "增加";
					} else {
						splitTop = "↓";
						splitPop = "减少";
					}
					Object[] arrTop = new Object[] { v1, splitTop, v2 };
					Object[] arrPop = new Object[] { v1, v2, splitPop, v3 };
					r.setTxtTop(MessageFormat.format(formatTop, arrTop));
					r.setTxtPop(MessageFormat.format(formatPop, arrPop));
					r.setCalcPop(r.getNote());
				}
			}
		}

		/** 管理指标 */
		if (re.getMan().size() > 0) {
			for (MtIndexDto r : re.getMan()) {
				if (r.getIndexId() == IndexId.index501) {

				} else if (r.getIndexId() == IndexId.index502) {

				} else if (r.getIndexId() == IndexId.index503) {

				}
			}
		}
		return re;
	}

	@Override
	public void saveRptIndexAnalysis(MtRptIndexAnalysisDto param) {
		param.setCreateTime(Calendar.getInstance().getTime());
		analysisMapper.insertSelective(param);
	}

	@Override
	public MtRptIndexAnalysisDto searchRptIndexAnalysisOnLast(Integer userIndexId) {
		WtrjRptIndexAnalysisExample ex = new WtrjRptIndexAnalysisExample();
		ex.createCriteria().andUserIndexIdEqualTo(userIndexId);
		ex.setOrderByClause(" CREATE_TIME desc ");
		List<WtrjRptIndexAnalysis> rs = analysisMapper.selectByExample(ex);
		if (rs.size() > 0) {
			Mapper mp = new DozerBeanMapper();
			MtRptIndexAnalysisDto re = mp.map(rs.get(0), MtRptIndexAnalysisDto.class);
			WtrjUser u = userMapper.selectByPrimaryKey(re.getUserId());
			if (u.getEmployeeId() == null) {
				re.setEmployeeName(u.getName());
			} else {
				WtrjEmployee ee = emMapper.selectByPrimaryKey(u.getEmployeeId());
				re.setEmployeeName(ee.getName());
			}
			return re;
		} else {
			return null;
		}
	}

	/**
	 * Null处理
	 * 
	 * @param v
	 * @return
	 */
	private Double getVal(Double v) {
		if (v == null) {
			return 0D;
		}
		return v;
	}

}
