package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeEmplKey;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiGradeGroup;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtNianjizuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiGradeGroup;

/**
 * KPI年级组管理
 * 
 * @author VI
 *
 */
public interface IKpiNianjizuService {

	void save(WtrjKpiGradeGroup pa, List<WtrjKpiGradeEmplKey> ds);

	void delete(String code);

	List<MtWtrjKpiGradeGroup> findAll(String schoolCode, String searchKey);

	MtWtrjKpiGradeGroup findSingle(String code);

	List<WtrjKpiGradeGroup> findAll(Integer employeeId);

	int countNianjizu(String search);

	List<MtNianjizuDto> searchByPage(Integer start, Integer end, String search);

	boolean addNianjizu(String schoolCode, String nianjizuCode, String nianjizuName);

	/**
	 * 年级组长设定更新
	 * 
	 * @param nianjizuCode
	 * @param employeeId
	 */
	void updBindNianjizuZhang(String nianjizuCode, Integer employeeId);

	int countNianjizuMember(String nianjizuCode, String search);

	List<MtNianjizuMemberDto> searchNianjizuMemberByPage(String nianjizuCode, int start, int end, String search);

	void addBindNianjizuMember(String nianjizuCode, List<Integer> members);

	/**
	 * 删除年级组成员
	 * 
	 * @param nianjizuCode
	 * @param members
	 */
	void deleteBindNianjizuMember(String nianjizuCode, List<Integer> members);

	/**
	 * 删除年级组
	 * 
	 * @param nianjizuCode
	 */
	void deleteNianjizu(String nianjizuCode);

	/**
	 * 更新年级组名称
	 * 
	 * @param nianjizuCode
	 * @param nianjizuName
	 */
	void addNianjizu(String nianjizuCode, String nianjizuName);
}
