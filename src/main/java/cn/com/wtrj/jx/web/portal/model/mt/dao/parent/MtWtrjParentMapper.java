package cn.com.wtrj.jx.web.portal.model.mt.dao.parent;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjParent;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtParentInfo;

public interface MtWtrjParentMapper {
	List<MtParentInfo> findWtrjParentsByStudentNo(String studentNo);

	List<WtrjParent> findParentsByStudentName(String studentName);

	List<WtrjParent> findParentsByStudentId(Integer studentId);
}
