package cn.com.wtrj.jx.web.portal.service.visitor;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomVisitor;

public interface IVisitorService {

	void saveVisitItem(WtrjEcomVisitor visitItem);

	List<WtrjEcomVisitor> findVisitorsByTeacherId(Integer userId);

	WtrjEcomVisitor findVisitorById(Integer id);
	
}
