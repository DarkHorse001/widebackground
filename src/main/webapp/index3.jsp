<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<!--[if lt IE 9]>
<script src="../js/html5.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script>

	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
	<header>
	<h1>
		<img src="images/admin_logo.png" />
	</h1>
	<ul class="rt_nav">
		<li><a href="http://www.deathghost.cn" target="_blank"
			class="website_icon">站点首页</a></li>
		<li><a href="#" class="clear_icon">清除缓存</a></li>
		<li><a href="#" class="admin_icon">DeathGhost</a></li>
		<li><a href="#" class="set_icon">账号设置</a></li>
		<li><a href="login.html" class="quit_icon">安全退出</a></li>
	</ul>
	</header>
	<aside class="lt_aside_nav content mCustomScrollbar">
	<h2>
		<a href="#">起始页</a>
	</h2>
	<ul>
		<li>
			<dl>
				<dt>常用布局示例</dt>
				<!--当前链接则添加class:active-->
				<dd>
					<a href="#" class="active">商品列表示例</a>
				</dd>
				<dd>
					<a href="#">商品详情示例</a>
				</dd>
				<dd>
					<a href="#">商品回收站示例</a>
				</dd>
			</dl>
		</li>
		<li>
			<dl>
				<dt>订单信息</dt>
				<dd>
					<a href="#">订单列表示例</a>
				</dd>
				<dd>
					<a href="#">订单详情示例</a>
				</dd>
			</dl>
		</li>
		<li>
			<dl>
				<dt>会员管理</dt>
				<dd>
					<a href="#">会员列表示例</a>
				</dd>
				<dd>
					<a href="#">添加会员（详情）示例</a>
				</dd>
				<dd>
					<a href="#">会员等级示例</a>
				</dd>
				<dd>
					<a href="#">会员资金管理示例</a>
				</dd>
			</dl>
		</li>
		<li>
			<dl>
				<dt>基础设置</dt>
				<dd>
					<a href="#">站点基础设置示例</a>
				</dd>
			</dl>
		</li>
	</ul>
	</aside>


</body>
</html>