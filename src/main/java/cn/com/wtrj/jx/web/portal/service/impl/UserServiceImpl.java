package cn.com.wtrj.jx.web.portal.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.TeacherMapper;
import cn.com.wtrj.jx.web.portal.model.dao.UserMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjEmployeeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjUserRoleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.Teacher;
import cn.com.wtrj.jx.web.portal.model.entities.User;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEmployee;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacher;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjTeacherExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserExample.Criteria;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUserRoleKey;
import cn.com.wtrj.jx.web.portal.model.mt.dao.setting.MtUserMapper;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserDto;
import cn.com.wtrj.jx.web.portal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private WtrjUserMapper wtrjUserMapper;
	@Autowired
	private WtrjTeacherMapper wtrjTeacherMapper;

	@Autowired
	private MtUserMapper mtUserMapper;

	@Autowired
	private WtrjEmployeeMapper employeeMapper;

	@Autowired
	private WtrjUserRoleMapper userRoleMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public User getUser(int userId) {

		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void addUser(User user) {

		userMapper.insert(user);
	}

	@Override
	public void deleteUser(int userId) {

		wtrjUserMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public Boolean updateUser(WtrjUser user) {

		// 用户名重复性check
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andNameEqualTo(user.getName()).andIdNotEqualTo(user.getId());
		List<WtrjUser> users = wtrjUserMapper.selectByExample(example);

		if (users != null && users.size() > 0) {
			return false;
		}

		//处理手机更新  手机号相同的用户和教师一起更新
		WtrjUser u = wtrjUserMapper.selectByPrimaryKey(user.getId());
		
		if(u != null) {
			if(!user.getTel().equals(u.getTel())) {
				Teacher t = teacherMapper.findTeacherByPhone(u.getTel());
				if(t != null) {
					t.setPhone(user.getTel());
					teacherMapper.update(t);
				}
				else {
					t = teacherMapper.findTeacherByJobNumber(user.getName());
					if(t != null) {
						t.setPhone(user.getTel());
						teacherMapper.update(t);
					}
				}
			}
		}
		
		wtrjUserMapper.updateByPrimaryKeySelective(user);

		return true;
	}

	@Override
	public User getUserByAccount(String account) {
		
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andNameEqualTo(account);
		Criteria criteria2 = example.createCriteria().andTelEqualTo(account);
		
		example.or(criteria2);
		
		User user = new User();
		

		List<WtrjUser> us = wtrjUserMapper.selectByExample(example);
		if (us.size() > 0) {
			user.setId(us.get(0).getId());
			user.setUsername(us.get(0).getName());
			user.setPassword(us.get(0).getPwd());
			user.setAccount(us.get(0).getName());
			
			// 设定手机号
			user.setPhone(us.get(0).getTel());
			
			if (us.get(0).getEmployeeId() != null) {
				user.setEmployeeId(us.get(0).getEmployeeId());

				// 查询人员档案
				WtrjEmployee e = employeeMapper.selectByPrimaryKey(user.getEmployeeId());
				if (e != null) {
					user.setSchoolCode(e.getSchoolCode());
					user.setEmployeeNumber(e.getEmployeeNumber());
					user.setEmployeeName(e.getEnglishName());
				}
			}
		}
		
		WtrjTeacherExample teacherExample = new WtrjTeacherExample();
		teacherExample.createCriteria().andJobNumberEqualTo(user.getUsername());
		List<WtrjTeacher> list=wtrjTeacherMapper.selectByExample(teacherExample);
		if(list!=null&&list.size()>0){
			user.setTeacherId(list.get(0).getId());
			user.setTeacherName(list.get(0).getName());
		}else if (StringUtils.isNotEmpty(user.getPhone())) {
			
			WtrjTeacherExample anexample = new WtrjTeacherExample();
			anexample.createCriteria().andPhoneEqualTo(user.getPhone());
			List<WtrjTeacher> wtList=wtrjTeacherMapper.selectByExample(anexample);
			if(wtList!=null&&wtList.size()>0){
				user.setTeacherId(wtList.get(0).getId());
				user.setTeacherName(wtList.get(0).getName());
			}
			
		}
		return user;
		// return userMapper.getUserByAccount(account);
	}

	@Override
	public WtrjUser getUserByMobile(String mobile) throws Exception {
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andTelEqualTo(mobile);
		List<WtrjUser> users = wtrjUserMapper.selectByExample(example);
		if (users != null && users.size() > 0) {
			if (users.size() > 1) {
				throw new Exception("用户手机号重复【" + mobile + "】【当前数目：" + users.size() + "】");
			}
			return users.get(0);
		}
		return null;
	}

	@Override
	public WtrjUser searchUserByName(String name) {
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andNameEqualTo(name);
		List<WtrjUser> users = wtrjUserMapper.selectByExample(example);
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public List<WtrjUser> searchUsers() {
		WtrjUserExample example = new WtrjUserExample();
		return wtrjUserMapper.selectByExample(example);
	}

	@Override
	public int countUsers() {
		WtrjUserExample example = new WtrjUserExample();
		return wtrjUserMapper.countByExample(example);
	}

	@Override
	public List<MtUserDto> searchUsersByPage(Integer start, Integer end, String search) {
		return mtUserMapper.selectUserByPage(start, end, search);
	}

	@Override
	public int countUsers(String search) {
		return mtUserMapper.countUsers(search);
	}

	@Override
	public void changePwd(Integer userId, String pwd) {
		WtrjUser record = new WtrjUser();
		record.setId(userId);
		record.setPwd(pwd);

		wtrjUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Boolean addUser(String userName, String password, String tel) {

		// 用户名重复性check
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andNameEqualTo(userName);
		List<WtrjUser> users = wtrjUserMapper.selectByExample(example);

		if (users != null && users.size() > 0) {
			return false;
		}

		// 保存
		WtrjUser record = new WtrjUser();
		record.setName(userName);
		record.setPwd(password);
		record.setTel(tel);

		wtrjUserMapper.insertSelective(record);

		return true;
	}

	@Override
	public void updateUserRoles(Integer userId, List<String> roles) {
		WtrjUserRoleExample example = new WtrjUserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		userRoleMapper.deleteByExample(example);

		if (roles != null) {
			for (String roleId : roles) {
				WtrjUserRoleKey ur = new WtrjUserRoleKey();
				ur.setUserId(userId);
				ur.setRoleId(roleId);

				userRoleMapper.insertSelective(ur);
			}
		}
	}

	@Override
	public void updBindEmployee(Integer userId, Integer employeeId) {

		WtrjUser record = new WtrjUser();
		record.setId(userId);
		record.setEmployeeId(employeeId);

		wtrjUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteBindEmployee(Integer userId) {
		mtUserMapper.deleteBindEmployee(userId);
	}

	@Override
	public List<WtrjUser> searchUsersByIds(List<Integer> ids) {
		
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andIdIn(ids);
		
		return wtrjUserMapper.selectByExample(example);
	}

	@Override
	public WtrjUser searchUserByNameOrPhone(String username) {
		WtrjUserExample example = new WtrjUserExample();
		example.createCriteria().andNameEqualTo(username);
		Criteria criteria2 = example.createCriteria().andTelEqualTo(username);
		
		example.or(criteria2);
		List<WtrjUser> users = wtrjUserMapper.selectByExample(example);
		if (users != null && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
