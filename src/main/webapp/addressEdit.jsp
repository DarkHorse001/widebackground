<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
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
<!--header-->
<header>
 <h1><img src="images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <li><a href="http://www.deathghost.cn" target="_blank" class="website_icon">站点首页</a></li>
  <li><a href="#" class="clear_icon">清除缓存</a></li>
  <li><a href="#" class="admin_icon">DeathGhost</a></li>
  <li><a href="#" class="set_icon">账号设置</a></li>
  <li><a href="login.html" class="quit_icon">安全退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index.jsp">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>常用布局示例</dt>
    <!--当前链接则添加class:active-->
  	<dd><a href="product_list.jsp" >商品信息列表编辑</a></dd>
    <dd><a href="product_detail.jsp" >单个商品详情添加</a></dd>
    <dd><a href="recycle_bin.html" >商品回收站示例</a></dd>
    <dd><a href="addressEdit.jsp" >省市地信息编辑</a></dd>
    <dd><a href="dictoryEdit.jsp" >品牌信息编辑</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>订单信息</dt>
    <dd><a href="order_list.html">订单列表示例</a></dd>
    <dd><a href="order_detail.html">订单详情示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>会员管理</dt>
    <dd><a href="user_list.html">会员列表示例</a></dd>
    <dd><a href="user_detail.html">添加会员（详情）示例</a></dd>
    <dd><a href="user_rank.html">会员等级示例</a></dd>
    <dd><a href="adjust_funding.html">会员资金管理示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>基础设置</dt>
    <dd><a href="setting.html">站点基础设置示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>配送与支付设置</dt>
    <dd><a href="express_list.html">配送方式</a></dd>
    <dd><a href="pay_list.html">支付方式</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>在线统计</dt>
    <dd><a href="discharge_statistic.html">流量统计</a></dd>
    <dd><a href="sales_volume.html">销售额统计</a></dd>
   </dl>
  </li>
  <li>
   <p class="btm_infor">© DeathGhost.cn 版权所有</p>
  </li>
 </ul>
</aside>


<style>
.contain_top{width:60%;height:50%;margin:0 auto;margin-top:50px;}
td {text-align:center;}
</style>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <br>
	 <div class="contain_top" style="width:80%;"> 
		 <form action="" method="post">
		 	<input type="text" name="province" placeholder="请输入省名称" />
		 	<input type="submit" value="确认添加" >
		 	<input type="text" name="city" placeholder="请输入城市名称" />
		 	<input type="submit" value="确认添加" >
		 	<input type="text" name="country" placeholder="请输入地级市名称" />
		 	<input type="submit" value="确认添加" >
		 </form>		 
	 </div>
	 <hr>
	 <div style="width:60%;height:50%;margin:0 auto;"> 
		 <table border="1" width="570" text="align:center" >
		 	<tr><th width="142.5px">省级名称</th><th>市级名称</th><th>县级名称</th><th>操作方式</th></tr>
		 	<tr>
		 		<td>广东省</td>
		 		<td>广州市</td>
		 		<td>番禺区</td>
		 		<td>
			 		<button onclick="return confirm('暂时跳转到index，后面会完善伤处逻辑再重定向index')" ><a href="index.jsp">删除</a></button>&nbsp;&nbsp;
			 		<button ><a href="reEdit.jsp">编辑</a></button>
		 		</td>
		 	</tr>
		 </table>
	 </div>
	 <hr>
 </div>
</section>
</body>
</html>
