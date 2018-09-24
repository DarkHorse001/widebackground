package com.gt.wide.background.dao;

import com.gt.wide.background.entity.User;

public interface IUserDao {
	
	/**
	 * 根据user的username查找用户的数据
	 * @param id 用户id
	 * @return 用户对象
	 */
	User findUserByName(String username);
	
	/**
	 * 新增新用户
	 * @param user 新用户信息
	 * @return 包含id的用户信息
	 */
	User insert(User user);
}
