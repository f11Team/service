package cn.com.wtrj.jx.web.portal.service.kpi;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiJiaoYanZu;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjKpiResearchEmplKey;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtJiaoyanzuMemberDto;
import cn.com.wtrj.jx.web.portal.model.mt.entities.kpi.MtWtrjKpiJiaoYanZu;

/**
 * KPI教研组管理
 * 
 * @author VI
 *
 */
public interface IKpiJiaoyanzuService {

	void save(WtrjKpiJiaoYanZu pa, List<WtrjKpiResearchEmplKey> ds);

	void delete(String code);

	List<MtWtrjKpiJiaoYanZu> findAll(String schoolCode, String searchKey);

	MtWtrjKpiJiaoYanZu findSingle(String code);

	List<WtrjKpiJiaoYanZu> findAll(Integer employeeId);

	int countJiaoyanzu(String search);

	List<MtJiaoyanzuDto> searchByPage(Integer start, Integer end, String search);

	boolean addJiaoyanzu(String schoolCode, String jiaozyanzuCode, String jiaozyanzuName);

	void updJiaoyanzu(String jiaoyanzuCode, String jiaoyanzuName);

	void updJiaoyanzuzhang(String jiaoyanzuCode, Integer employeeId);

	void deleteJiaoyanzuMember(String jiaoyanzuCode, List<Integer> members);

	int countJiaoyanzuMember(String jiaoyanzuCode, String search);

	List<MtJiaoyanzuMemberDto> searchJiaoyanzuMemberByPage(String jiaoyanzuCode, Integer start, Integer end, String search);

	/**
	 * 教研组成员添加
	 * 
	 * @param jiaoyanzuCode
	 * @param members
	 */
	void addBindJiaoyanzuMember(String jiaoyanzuCode, List<Integer> members);
}
