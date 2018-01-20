package cn.com.wtrj.jx.web.portal.service.setting.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptRoleIndexMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptUserIndexMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptRoleIndex;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptRoleIndexExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptUserIndex;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptUserIndexExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtRoleRptIndexMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleRptIndexDto;
import cn.com.wtrj.jx.web.portal.service.setting.IRoleRptIndexService;

@Service
@Transactional
public class RoleRptIndexService implements IRoleRptIndexService {

	@Autowired
	private WtrjRptUserIndexMapper indexMapper;

	@Autowired
	private WtrjRptRoleIndexMapper roleMappper;

	@Autowired
	private MtRoleRptIndexMapper mtMapper;

	@Override
	public List<MtRoleRptIndexDto> searchRoleRptIndex(String roleId) {
		return mtMapper.searchRoleRptIndex(roleId);
	}

	@Override
	public void saveRoleRptIndex(String roleId, List<MtRoleRptIndexDto> params) {
		// 删除指标权限
		WtrjRptRoleIndexExample ex = new WtrjRptRoleIndexExample();
		ex.createCriteria().andRoleIdEqualTo(roleId);
		roleMappper.deleteByExample(ex);

		// 更新指标权限
		for (MtRoleRptIndexDto param : params) {
			/** 用户定义指标是否存在 */
			WtrjRptUserIndexExample ex1 = new WtrjRptUserIndexExample();
			ex1.createCriteria().andIndexIdEqualTo(param.getId());
			List<WtrjRptUserIndex> ds1 = indexMapper.selectByExample(ex1);
			if (ds1.size() == 0) {
				WtrjRptUserIndex p = new WtrjRptUserIndex();
				p.setIndexId(param.getId());
				indexMapper.insertSelective(p);
				// 再检索
				ds1 = indexMapper.selectByExample(ex1);
			}

			/** 保存指标权限 */
			WtrjRptRoleIndex pa = new WtrjRptRoleIndex();
			pa.setRoleId(roleId);
			pa.setUserIndexId(ds1.get(0).getId());
			pa.setBlIndexAuth(param.getBlIndexAuth());
			roleMappper.insertSelective(pa);
		}
	}
}
