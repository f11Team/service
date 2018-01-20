package cn.com.wtrj.jx.web.portal.service.setting;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtRoleRptIndexDto;

public interface IRoleRptIndexService {

	List<MtRoleRptIndexDto> searchRoleRptIndex(String roleId);

	void saveRoleRptIndex(String roleId, List<MtRoleRptIndexDto> params);

}
