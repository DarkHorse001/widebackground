package com.gt.wide.background.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import com.gt.wide.background.base.annotation.RequestMapping;
import com.gt.wide.background.bean.dictory;
import com.gt.wide.background.mapper.dictoryDao;
import com.gt.wide.background.service.dictoryService;


public class dictoryController {
	private dictoryService service = new dictoryService(); 
	@RequestMapping(value="/addDictory.do")
	public String addDictory(HttpServletRequest request) throws SQLException
	{
		System.out.println("controller中的： "+request.getParameter("pid"));
		System.out.println("controller中的： "+request.getParameter("dname"));
		System.out.println("controller中的： "+request.getParameter("ddescription"));
		dictory dic = new dictory();
		dic.setPid(Integer.parseInt(request.getParameter("pid")));
		dic.setDname(request.getParameter("dname"));
		dic.setDdescription(request.getParameter("ddescription"));
		System.out.println("controller中插入之前");
		service.insert(dic);
		return "index";
	}
	@RequestMapping(value="/dictoryUD.do")
	public String showList(HttpServletRequest request) throws SQLException
	{
		System.out.println("进入controller层的showList方法:~~");
		List<dictory> list = new ArrayList<dictory>();
//		dictory dict = new dictory();
//		dict.setDirectory_id(Integer.parseInt(request.getParameter("directory_id")));
//		dict.setPid(Integer.parseInt(request.getParameter("pid")));
//		dict.setDname(request.getParameter("dname"));
//		dict.setDdescription(request.getParameter("ddescription"));
		list = service.showList();
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		System.out.println("controller中的list："+list);
		return "redirect:dictoryUD.jsp";
	}
	@RequestMapping(value="/dictoryDelete.do")
	public String intoDelete(HttpServletRequest request) {
		String id = request.getParameter("directory_id");
		int d_id = Integer.parseInt(id);
		dictoryDao dao = new dictoryDao();
		int result = dao.deleteDictory(d_id);
		System.out.println("删除的结果："+result);
		return "redirect:dictoryUD.do";
	}
	@RequestMapping(value="/dictoryUpdate.do")
	public String updateDirectory(HttpServletRequest request) {
		System.out.println(request.getParameter("directory_id"));
		dictory dict = null;
		dict = service.findEleById(Integer.parseInt(request.getParameter("directory_id")));
		System.out.println("返回的dict: "+dict);
		System.out.println("返回的数据: "+dict.getDdescription());
		HttpSession session = request.getSession();
		session.setAttribute("directory", dict);
		return "redirect:dictoryEdit2.jsp";
	}
	
	@RequestMapping(value="/doUpdate.do")
	public String doUpdateDirectory(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("directory_id"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		String dname = request.getParameter("dname");
		String ddes = request.getParameter("ddescription");
		System.out.println("~~~~~~~~~~~~~"+id+" "+pid+" "+dname+" "+ddes);
		dictory dict = new dictory();
//		dict = (dictory) request.getSession().getAttribute("directory");
		dict.setDdescription(ddes);
		dict.setDirectory_id(id);
		dict.setPid(pid);
		dict.setDname(dname);
//		System.out.println("更新： "+dict.getDdescription());
//		System.out.println("sss: "+dict.getDirectory_id());
		service.doUpdate(dict);
		return "redirect:index.jsp";
	}
	
}
