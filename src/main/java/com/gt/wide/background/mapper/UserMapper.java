package com.gt.wide.background.mapper;

import com.gt.wide.background.bean.User;

/**
 * 处理与用户有关的持久层
 * @author qin
 *
 */
public interface UserMapper {
	
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
