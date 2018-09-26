package com.gt.wide.background.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理与主页有关的请求
 * @author qin
 *
 */
@Controller
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping("/index.do")
	public String showIndex(){
		return "index";
	}
}
