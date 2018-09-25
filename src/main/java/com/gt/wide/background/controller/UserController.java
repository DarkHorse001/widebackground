package com.gt.wide.background.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gt.wide.background.entity.User;
import com.gt.wide.background.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/tologin.do")
	public String toLogin(){
		return "/login/login";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request) throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		User user = new User();
		
		String username = request.getParameter("username");
		System.out.println(username);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		user.setUsername(username);
		user.setPassword(pwd);
		UserService userService = new UserService();
		HttpSession session = request.getSession();
		
		User u = userService.login(user);
		
		if(u!=null){
			session.setAttribute("username", user.getUsername());
			System.out.println(session);
			System.out.println("index");
			return "redirect:index.do";
		}else{
			return "/login/login";
		}
	}
	
	@RequestMapping("/register.do")
	public String show(){
		return "person/register";
	}
	
	@RequestMapping("/handle_user.do")
	public String userHandle(HttpServletRequest request)throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String telephone = request.getParameter("telephone");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setTelephone(telephone);
		user.setGender(gender);
		user.setBirthday(birthday);
		
		UserService userService = new UserService();
		userService.handleUser(user);
		return "index";
	}
}





















