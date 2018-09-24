package com.gt.wide.background.controller;

import com.gt.wide.background.base.annotation.RequestMapping;

public class MainController {
	
	@RequestMapping("/index.do")
	public String showIndex(){
		return "index";
	}
}
