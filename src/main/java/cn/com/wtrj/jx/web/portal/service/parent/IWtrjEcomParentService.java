package cn.com.wtrj.jx.web.portal.service.parent;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtDormBackDelay;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentInfo;

public interface IWtrjEcomParentService {
	List<MtParentInfo> findWtrjParentsByStudentNo(String studentNo);
	List<WtrjParent> findParentsByStudentName(String studentName);
	WtrjParent findParentInfoByName(String parent);
	List<WtrjParent> findParentsByStudentId(Integer studentId);
}
