package cn.com.wtrj.jx.web.portal.model.mt.dao.leave;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomLeaveRec;

public interface MtEcomLeaveRecMapper {
	List<WtrjEcomLeaveRec> findLeaveRecordsByParentId(@Param("parentId")Integer parentId);
	List<WtrjEcomLeaveRec> findLeaveRecordsByStarterParentId(@Param("parentId")Integer parentId);
	List<WtrjEcomLeaveRec> findLeaveRecordsByConfirmParentId(@Param("parentId")Integer parentId);
}
