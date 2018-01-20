package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjDepartmentMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartment;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartmentExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjDepartmentExample.Criteria;
import cn.com.wtrj.jx.web.portal.service.DepartmentCrudService;
/**
 * 部门增删改查
 * @author sx
 *
 */
@Service
public class DepartmentCrudServiceImpl implements DepartmentCrudService {

	@Resource
	private WtrjDepartmentMapper wtrjdepartmentMapper;
	
	/**
	 * 查询所有数据
	 */
	@Override
	public List<WtrjDepartment> departmentQuery() {
		WtrjDepartmentExample wtrjDepartmentExample = new WtrjDepartmentExample();
		Criteria criteria = wtrjDepartmentExample.createCriteria();
		criteria.andCodeIsNotNull();
		List<WtrjDepartment> list = wtrjdepartmentMapper.selectByExample(wtrjDepartmentExample);
		return list;
	}
	/**
	 * 以code删除
	 */
	@Override
	public int departmentDelete(WtrjDepartment wdm) {
		WtrjDepartmentExample wtrjDepartmentExample = new WtrjDepartmentExample();
		Criteria criteria = wtrjDepartmentExample.createCriteria();
		//模糊条件
		criteria.andCodeLike(wdm.getCode()+'%');
		int num = wtrjdepartmentMapper.deleteByExample(wtrjDepartmentExample);
		return num;
	}
	/**
	 * 更新
	 */
	@Override
	public int departmentUpdate(WtrjDepartment wdm) {
		int numUpdate = wtrjdepartmentMapper.updateByPrimaryKeySelective(wdm);
		return numUpdate;
	}
	/**
	 * 添加
	 */
	@Override
	public int departmentAdd(WtrjDepartment wdm) {
		int numAdd = wtrjdepartmentMapper.insert(wdm);
		return numAdd;
	}
	/**
	 * 以code查询
	 */
	@Override
	public String departmentQueryCode(WtrjDepartment wdm) {
		String code = wdm.getCode();
		String str = null;
		WtrjDepartment wtrjDepartment = wtrjdepartmentMapper.selectByPrimaryKey(code);
		if(!"".equals(wtrjDepartment) && wtrjDepartment != null){
			str = wtrjDepartment.getCode();
			return str;
		}
		return str;
	}

}
