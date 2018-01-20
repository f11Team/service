package cn.com.wtrj.jx.web.portal.service.kpi.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInfoAttachMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInfoDetailMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInfoMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiInsMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjKpiTemplateMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfo;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoAttach;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoAttachExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoDetailExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiInfoExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplate;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiTemplateExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.kpi.MtKpiPingjiaMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfo;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoJwDetail;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiInfoJwEmployee;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtKpiPingjiaDto;
import cn.com.wtrj.jx.web.portal.service.kpi.IKpiPingjiaService;

@Service
@Transactional
public class KpiPingjiaService implements IKpiPingjiaService {

	@Autowired
	WtrjKpiInsMapper insMapper;

	@Autowired
	WtrjKpiInfoMapper infoMapper;

	@Autowired
	WtrjKpiInfoDetailMapper detailMapper;

	@Autowired
	WtrjKpiInfoAttachMapper attachMapper;

	@Autowired
	MtKpiPingjiaMapper mtKpiMapper;

	@Autowired
	WtrjKpiTemplateMapper tplMapper;

	@Override
	public List<MtKpiPingjiaDto> selectPingjiaItemTc(Integer employeeId, Integer kpiInsId) {
		return mtKpiMapper.selectPingjiaItemTc(employeeId, kpiInsId);
	}

	@Override
	public List<MtKpiPingjiaDto> selectPingjiaItemJy(Integer employeeId, Integer kpiInsId) {
		return mtKpiMapper.selectPingjiaItemJy(employeeId, kpiInsId);
	}

	@Override
	public List<MtKpiPingjiaDto> selectPingjiaItemNj(Integer employeeId, Integer kpiInsId) {
		return mtKpiMapper.selectPingjiaItemNj(employeeId, kpiInsId);
	}

	@Override
	public List<MtKpiPingjiaDto> selectPingjiaItemJw(Integer employeeId, Integer kpiInsId) {
		return mtKpiMapper.selectPingjiaItemJw(employeeId, kpiInsId);
	}

	@Override
	public List<WtrjKpiInfoAttach> selectPingjiaItemAttach(Integer employeeId, Integer kpiInsId) {
		WtrjKpiInfoAttachExample ex = new WtrjKpiInfoAttachExample();
		ex.createCriteria().andKpiInsEqualTo(kpiInsId).andEmployeeIdEqualTo(employeeId);
		return attachMapper.selectByExample(ex);
	}

	@Override
	public void savePingjia(List<WtrjKpiInfoDetail> details, WtrjKpiInfo info) {
		for (WtrjKpiInfoDetail detail : details) {
			/** 保存评价明细 */
			if (detail.getId() == null || detail.getId() == 0) {
				detailMapper.insertSelective(detail);
			} else {
				detailMapper.updateByPrimaryKeySelective(detail);
			}
		}

		/** 保存绩效考核汇总 */
		info.setKpiScore(getVal(info.getZipingScore()).add(getVal(info.getJiaoyanzuPingjiaScoreAct()))
				.add(getVal(info.getNianjiPingjiaScoreAct())).add(getVal(info.getJiaowuScoreAct())));
		info.setKpiScoreAct(info.getKpiScore().multiply(new BigDecimal("0.7")));
		info.setTotalScore(info.getKpiScoreAct().add(getVal(info.getJiaoxueScore()))
				.add(getVal(info.getStuPingjiaScoreAct())));
		if (info.getId() == null || info.getId() == 0) {
			infoMapper.insertSelective(info);
		} else {
			infoMapper.updateByPrimaryKeySelective(info);
		}
	}

	@Override
	public void saveKpiInfo(List<MtKpiInfo> params) {
		for (MtKpiInfo param : params) {
			WtrjKpiInfo info = infoMapper.selectByPrimaryKey(param.getId());
			info.setId(param.getId());
			info.setJiaoxueScore(getVal(param.getJiaoxueScore()));
			info.setStuPingjiaScore(getVal(param.getStuPingjiaScore()));
			info.setStuPingjiaScoreAct(info.getStuPingjiaScore().multiply(new BigDecimal("0.1")));
			info.setTotalScore(getVal(info.getKpiScoreAct()).add(getVal(info.getJiaoxueScore())).add(
					getVal(info.getStuPingjiaScoreAct())));
			infoMapper.updateByPrimaryKeySelective(info);
		}
	}

	/**
	 * Null返回0
	 * 
	 * @param val
	 * @return
	 */
	private BigDecimal getVal(BigDecimal val) {
		if (val == null) {
			return BigDecimal.ZERO;
		} else {
			return val;
		}
	}

	@Override
	public WtrjKpiInfo getKpiInfo(Integer kpiInsId, Integer employeeId) {
		WtrjKpiInfoExample ex = new WtrjKpiInfoExample();
		ex.createCriteria().andKpiInsEqualTo(kpiInsId).andEmployeeIdEqualTo(employeeId);
		List<WtrjKpiInfo> infos = infoMapper.selectByExample(ex);
		if (infos.size() > 0) {
			return infos.get(0);
		} else {
			return new WtrjKpiInfo();
		}
	}

	@Override
	public WtrjKpiInfoAttach selectAttach(Integer attachId) {
		return attachMapper.selectByPrimaryKey(attachId);
	}

	@Override
	public void deleteAttach(Integer attachId) {
		attachMapper.deleteByPrimaryKey(attachId);
	}

	@Override
	public void saveAttach(List<WtrjKpiInfoAttach> attaches) {
		for (WtrjKpiInfoAttach attach : attaches) {
			attachMapper.insertSelective(attach);
		}
	}

	@Override
	public void savePingjiaNew(List<MtKpiInfoJwEmployee> params) {
		Date cTime = Calendar.getInstance().getTime();
		if (params != null && params.size() > 0) {
			WtrjKpiIns ins = insMapper.selectByPrimaryKey(params.get(0).getKpiInsId());

			WtrjKpiTemplateExample ex = new WtrjKpiTemplateExample();
			ex.createCriteria().andTmplCodeEqualTo(ins.getJiaowuTmplCode());
			List<WtrjKpiTemplate> tpls = tplMapper.selectByExample(ex);

			for (MtKpiInfoJwEmployee param : params) {
				BigDecimal kpiScore = BigDecimal.ZERO;
				WtrjKpiInfo info = getKpiInfo(param.getKpiInsId(), param.getEmployeeId());

				if (param.getDs() != null) {
					for (MtKpiInfoJwDetail d : param.getDs()) {
						WtrjKpiInfoDetail p = new WtrjKpiInfoDetail();
						p.setKpiIns(param.getKpiInsId());
						p.setEmployeeId(param.getEmployeeId());
						p.setKpiTmplCode(tpls.get(0).getTmplCode());
						p.setKpiItemCode(d.getItemCode());
						p.setKpiItemScore(getVal(d.getItemScore()));
						p.setKpiItemTxt(d.getItemTxt());
						// 评分合计
						kpiScore = kpiScore.add(p.getKpiItemScore());

						/** 保存评价明细 */
						WtrjKpiInfoDetailExample ex1 = new WtrjKpiInfoDetailExample();
						ex1.createCriteria().andKpiInsEqualTo(p.getKpiIns()).andEmployeeIdEqualTo(p.getEmployeeId())
								.andKpiTmplCodeEqualTo(p.getKpiTmplCode()).andKpiItemCodeEqualTo(p.getKpiItemCode());
						List<WtrjKpiInfoDetail> ps = detailMapper.selectByExample(ex1);
						if (ps.size() > 0) {
							p.setId(ps.get(0).getId());
							detailMapper.updateByPrimaryKeySelective(p);
						} else {
							detailMapper.insertSelective(p);
						}
					}
				}

				/** 保存绩效考核汇总 */
				info.setKpiIns(param.getKpiInsId());
				info.setEmployeeId(param.getEmployeeId());
				info.setJiaowuScoreAct(kpiScore);
				info.setJiaowuPingjiaTime(cTime);
				info.setKpiScore(getVal(info.getZipingScore()).add(getVal(info.getJiaoyanzuPingjiaScoreAct()))
						.add(getVal(info.getNianjiPingjiaScoreAct())).add(getVal(info.getJiaowuScoreAct())));
				info.setKpiScoreAct(info.getKpiScore().multiply(new BigDecimal("0.7")));
				info.setTotalScore(info.getKpiScoreAct().add(getVal(info.getJiaoxueScore()))
						.add(getVal(info.getStuPingjiaScoreAct())));
				if (info.getId() == null || info.getId() == 0) {
					infoMapper.insertSelective(info);
				} else {
					infoMapper.updateByPrimaryKeySelective(info);
				}
			}
		}
	}
}