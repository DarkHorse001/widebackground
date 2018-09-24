package com.gt.wide.background.service;

import com.gt.wide.background.dao.UserDaoImpl;
import com.gt.wide.background.entity.User;

public class UserService {
	/**
	 * 验证用户登录信息
	 * @param id 用户id
	 * @param password 用户输入的密码
	 * @return true 通过验证;false 验证失败
	 */
	public User login(User user){
		UserDaoImpl dao = new UserDaoImpl();
		User u = dao.findUserByName(user.getUsername());
		
		if(user.getPassword().equals(u.getPassword())){
			return u;
		}else{
			return null;
		}
	}
	
	
	public void handleUser(User user){
		UserDaoImpl dao = new UserDaoImpl();
		dao.insert(user);
	}
}

















