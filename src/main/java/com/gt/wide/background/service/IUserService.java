package com.gt.wide.background.service;

import com.gt.wide.background.bean.User;

/**
 * 处理与用户有关的服务
 * @author qin
 *
 */
public interface IUserService {
	/**
	 * 检查用户登录
	 * @param user 登陆的用户信息
	 * @return 存在用户则返回用户对象，不存在返回null
	 */
	User login(User user);
	
	/**
	 * 注册用户
	 * @param user 新用户的信息
	 * @return 包含id的新用户信息
	 */
	User handleUser(User user);
}
