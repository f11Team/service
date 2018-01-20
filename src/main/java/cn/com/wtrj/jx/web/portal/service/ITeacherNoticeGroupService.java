package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTeacherNoticeGroup;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtTeacherNoticeGroup;

public interface ITeacherNoticeGroupService {
	
	public void saveGroup(WtrjEcomTeacherNoticeGroup param);
	
	public void saveGroupList(List<WtrjEcomTeacherNoticeGroup> params);
	
	public List<MtTeacherNoticeGroup> searchByTeacherId(int teacherId);

	public List<WtrjEcomTeacherNoticeGroup> searchByGroupBode(String groupCode);

	public List<WtrjEcomTeacherNoticeGroup> searchByGroupBodes(List<String> codes);
	/**
	 * 根据分组删除group
	 * @param groupCode group code
	 * @return
	 */
	void deleteGroupByGroupBode(String groupCode);
	/**
	 * 删除分组中的一个成员
	 * @param groupCode 分组代码
	 * @param memberTeacherId 成员老师ID
	 * @return
	 */
	void delMemberByGroupCode(String groupCode,int memberTeacherId);
}
