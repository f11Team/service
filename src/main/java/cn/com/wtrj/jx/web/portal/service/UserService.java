package cn.com.wtrj.jx.web.portal.service;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.User;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjUser;
import cn.com.wtrj.jx.web.portal.model.mt.entities.setting.MtUserDto;

public interface UserService {
	
	User getUser(int userId);
	
	void addUser(User user);
	
	void deleteUser(int userId);
	
	/**
	 * @description 获取用户信息
	 * @author wchuang
	 * @time 2016年8月22日 下午12:01:15
	 */
	User getUserByAccount(String account);

	/**
	 * 获取指定手机号的用户信息
	 * 
	 * @param username
	 * @return
	 * @throws Exception 
	 */
	WtrjUser getUserByMobile(String mobile) throws Exception;
	
	WtrjUser searchUserByName(String name);
	
	/**
	 * 获取所有用户信息
	 * 
	 * @return
	 */
	List<WtrjUser> searchUsers();
	
	int countUsers();

	/**
	 * 根据指定条件分页获取用户信息
	 * 
	 * @param start
	 * @param limit
	 * @param search
	 * @return
	 */
	List<MtUserDto> searchUsersByPage(Integer start, Integer limit, String search);

	/**
	 * 根据指定条件检索用户数量
	 * @param search
	 * @return
	 */
	int countUsers(String search);
	
	void changePwd(Integer userId, String pwd);

	Boolean addUser(String userName, String password, String tel);

	Boolean updateUser(WtrjUser user);

	void updateUserRoles(Integer userId, List<String> roles);

	void updBindEmployee(Integer userId, Integer employeeId);

	/**
	 * 接触用户绑定员工信息
	 * 
	 * @param userId
	 */
	void deleteBindEmployee(Integer userId);
	
	List<WtrjUser> searchUsersByIds(List<Integer> ids);

	WtrjUser searchUserByNameOrPhone(String username);

}
