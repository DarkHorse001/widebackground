<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@include file="../template/head.jsp" %>
<body>
	<%@include file="../template/header.jsp" %>
	<%@include file="../template/left.jsp" %>
	
	<section class="rt_wrap content mCustomScrollbar">
		<div class="rt_content">
			<div class="page_title">
				<h2 class="fl">添加用户</h2>
				<a class="fr top_rt_btn">返回用户列表</a>
			</div>
			<form action="handle_user.do" method="post">
				<section>
					<ul class="ulColumn2">
						<li>
							<span class="item_name" style="width: 120px;">用户名：</span>
							<input name="username" type="text" class="textbox textbox_295" placeholder="请输入用户名" /> 
							<!--  <span class="errorTips">错误提示信息...</span> -->
						</li>
						
						<li>
							<span class="item_name" style="width: 120px;">密码：</span> 
							<input name="password" type="password" class="textbox" placeholder="请输入密码" />
							 <!--  <span class="errorTips">错误提示信息...</span> -->
						</li>
						
						<li>
							<span class="item_name" style="width: 120px;">电话号码：</span>
							<input name="telephone" type="text" class="textbox" placeholder="请输入电话号码" />
							 <!--  <span class="errorTips">错误提示信息...</span> -->
						</li>
						
						<li>
							<span class="item_name" style="width: 120px;">性别：</span>
							<input type="radio" name="gender" value="男" id="nan"><label for="nan">男</label> 
							<input type="radio" name="gender" value="女" id="nv"><label for="nv">女</label> <!-- <span class="errorTips">错误提示信息...</span> -->
						</li>
						<li>
							<span class="item_name" style="width: 120px;">生日：</span> 
						 	<input type="date" name="birthday">
						 	<!-- <span class="errorTips">错误提示信息...</span> -->
						 </li>
						<li><span class="item_name" style="width: 120px;"></span> <input
							type="submit" class="link_btn" /></li>
					</ul>
				</section>
			</form>
		</div>
	</section>
</body>
</html>