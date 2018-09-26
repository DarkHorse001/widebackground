package com.gt.wide.background.controller;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import com.gt.wide.background.base.annotation.RequestMapping;
import com.gt.wide.background.bean.Brand;
import com.gt.wide.background.bean.Directory;
import com.gt.wide.background.bean.Good;
import com.gt.wide.background.bean.GoodInfo;
import com.gt.wide.background.bean.GoodList;
import com.gt.wide.background.bean.Kind;
import com.gt.wide.background.service.BrandServiceImpl;
import com.gt.wide.background.service.DirectoryServiceImpl;
import com.gt.wide.background.service.GoodInfoServiceImpl;
import com.gt.wide.background.service.GoodListServiceImpl;
import com.gt.wide.background.service.GoodServiceImpl;
import com.gt.wide.background.service.IBrandService;
import com.gt.wide.background.service.IDirectoryService;
import com.gt.wide.background.service.IGoodInfoService;
import com.gt.wide.background.service.IGoodListService;
import com.gt.wide.background.service.IGoodService;
import com.gt.wide.background.service.IKindService;
import com.gt.wide.background.service.KindServiceImpl;

/**
 * 处理与商品有关的请求
 * @author qin
 *
 */
@Controller
@RequestMapping("/kind")
public class GoodController {
	
	private IGoodService goodService = new GoodServiceImpl();
	private IGoodInfoService goodInfoservice = new GoodInfoServiceImpl();
	private IGoodListService goodListService = new GoodListServiceImpl();
	private IDirectoryService directoryService = new DirectoryServiceImpl();
	private IBrandService brandService = new BrandServiceImpl();
	private IKindService kindService = new KindServiceImpl();
	
	@RequestMapping("/good/good.do")
	public String showGood(HttpServletRequest request){
		
		try {
			request.setCharacterEncoding("utf-8");
			List<Directory> directorys = directoryService.findDirectoryByAll();
			List<Brand> brands = brandService.findDirectoryByAll();
			List<Kind> kinds = kindService.findDirectoryByAll();
			request.setAttribute("directorys", directorys);
			request.setAttribute("brands", brands);
			request.setAttribute("kinds", kinds);
			System.out.println(directorys);
			System.out.println(brands);
			System.out.println(kinds);
		} catch (UnsupportedEncodingException e) {
		}
		return "/good/good";
	}
	
	@RequestMapping("/good/goodlist.do")
	public String goodList(HttpServletRequest request){
		try {
			request.setCharacterEncoding("utf-8");
			String id =request.getParameter("id");
			List<Directory> directorys = directoryService.findDirectoryByAll();
			request.setAttribute("directorys", directorys);
			
			//user只是打开商品列表
			if(id==null){
				return "/good/goodlist";
			}
			
			//user添加商品后转发过来的
			if(!"".equals(id)){
				Integer i = Integer.parseInt(id);
				GoodList goodList =goodListService.findGoodListById(i);
				List<GoodList> goodLists = new ArrayList<GoodList>();
				goodLists.add(goodList);
				request.setAttribute("goodLists", goodLists);
			}
			return "/good/goodlist";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}
		
	}
	
	@RequestMapping("/good/handle_good.do")
	public String handleGood(HttpServletRequest request){
		try {
			System.out.println("handleGood入口");
			request.setCharacterEncoding("utf-8");
			String name = request.getParameter("name");
			Integer directoryId = Integer.parseInt(request.getParameter("dname"));
			System.out.println(directoryId);
			Integer brandId = Integer.parseInt(request.getParameter("brandName"));
			Integer kindId = Integer.parseInt(request.getParameter("kindName"));
			Double price = Double.parseDouble(request.getParameter("price"));
			boolean quality = Boolean.parseBoolean(request.getParameter("quality"));
			boolean promation = Boolean.parseBoolean(request.getParameter("promation"));
			boolean isNew = Boolean.parseBoolean(request.getParameter("isNew"));
			Double promotionPrice = Double.parseDouble(request.getParameter("promotionPrice")==""||request.getParameter("promotionPrice")==null?"0":request.getParameter("promotionPrice"));
			Integer count = Integer.parseInt(request.getParameter("count"));
			String detail = request.getParameter("detail");
			Good good = new Good(0, name, directoryId, brandId, kindId, quality, promation, isNew, price, promotionPrice, count, 0, "D:\\a.jpg", false, new Date(), new Date(), "张三");
			System.out.println(good);
			Good data = goodService.findGoodByName(name);
			
			System.out.println(data);
			
			if(data == null){
				good = goodService.addGood(good);
				GoodInfo goodInfo = new GoodInfo(0, good.getId(), detail, new Date(), new Date(), "张三");
				
				goodInfo = goodInfoservice.addGoodInfo(goodInfo);
				return "redirect:good/goodlist.do?id="+good.getId();
			}else{
				request.setAttribute("msg", "已经存在该商品");
				return "/error";
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}
		
	}
	
	@RequestMapping("/good/goodLists.do")
	public String goodLists(HttpServletRequest request){
		try {
			request.setCharacterEncoding("utf-8");
			String directoryId = request.getParameter("directoryId");
			List<Directory> directorys = directoryService.findDirectoryByAll();
			request.setAttribute("directorys", directorys);
			
			//用户修改id（不存在或为空）
			if(directoryId==null || directoryId.isEmpty()){
				return "/good/goodlist";
			}
			
			Integer dir = Integer.parseInt(directoryId);
			List<GoodList> goodLists = goodListService.findGoodListByDirectoryId(dir);
			System.out.println(goodLists.size());
			request.setAttribute("goodLists", goodLists);
			return "/good/goodlist";
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}
		
	}
	
	@RequestMapping("/good/del.do")
	public String delGood(HttpServletRequest request){
		try {
			request.setCharacterEncoding("utf-8");
			String idStr = request.getParameter("id");
			//用户修改id（不存在或为空）
			if(idStr == null || idStr.isEmpty()){
				request.setAttribute("msg", "商品不存在");
				return "/error";
			}
			
			List<Directory> directorys = directoryService.findDirectoryByAll();
			request.setAttribute("directorys", directorys);
			
			Integer id = Integer.parseInt(idStr);
			goodService.delGoodById(id);
			return "/susscess";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "系统繁忙，请稍后重试");
			return "/error";
		}
	}
}















