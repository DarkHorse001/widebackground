package com.gt.wide.background.base.web;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.gt.wide.background.base.common.Handler;
import com.gt.wide.background.base.common.HandlerMapping;

/**
 * 控制器：负责接收所有请求，然后依据HandlerMapping 的配置调用对应的
 * service包下的Controller（处理器）来处理，再根据处理器返回的处理结构（视图名）调用
 * 对应的jsp;
 * 
 *
 */
public class DispatcherServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private HandlerMapping handlerMapping;
	/**
	 *在init方法里面，通过读取smatrmvc.xml文件，获得处理器类名，
	 *然后将处理器实例化，接下来，将处理器实例交给HandlerMapping来处理
	 *
	 */
	public void init() throws ServletException{
		SAXReader reader = new SAXReader();
		System.out.println("获取文件流");
		InputStream in = getClass().getClassLoader().getResourceAsStream("wide.xml");
		//存放service实例的集合
		List beans = new ArrayList();
		try {
			Document doc = reader.read(in);
			Element root = doc.getRootElement();
			List<Element> elements = root.elements();
			for (Element ele : elements) {
				String className = ele.attributeValue("class");
				System.out.println("className:"+ className);
				Object bean = Class.forName(className).newInstance();
				beans.add(bean);
			}
			System.out.println(beans);
			//将service实例集合交给HandlerMapping处理
			handlerMapping = new HandlerMapping();
			handlerMapping.process(beans);
			System.out.println("1111");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获得请求资源路径
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		//获得应用路径
		String contextPath=getServletContext().getContextPath();
		System.out.println("contextPath:"+contextPath);
		//截取请求路径
		String path=uri.substring(contextPath.length());
		System.out.println("path:"+path);
		Handler handler=handlerMapping.getHandler(path);
		Method mh=handler.getMh();
		Object obj=handler.getObj();
		Object returnVal=null;
		try {
			//获取方法的参数类型，如果有则
			Class[] types=mh.getParameterTypes();
			Object[] params=new Object[types.length];
			if(types.length>0){
				for(int i=0;i<types.length;i++){
					if(types[i]==HttpServletRequest.class){
						params[i]=request;
					}else if(types[i]==HttpServletResponse.class){
						params[i] =response;
					}
				}
				returnVal=mh.invoke(obj, params);
				System.out.println("returnVal:"+returnVal);
			}else{
				returnVal=mh.invoke(obj);
			}
			String viewName=returnVal.toString();
			System.out.println("viewName:"+viewName);
			if(viewName.startsWith("redirect:")){
				//重定向
				String redirectPath=contextPath+"/"+viewName.substring("redirect:".length());
				response.sendRedirect(redirectPath);
			}else{
				//转发
				String jspPath=viewName+".jsp";
				request.getRequestDispatcher(jspPath).forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}













