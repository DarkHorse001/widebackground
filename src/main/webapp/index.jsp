<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
.dataStatistic{width:400px;height:200px;border:1px solid #ccc;margin:0 auto;margin:10px;overflow:hidden}
#cylindrical{width:400px;height:200px;margin-top:-15px}
#line{width:400px;height:200px;margin-top:-15px}
#pie{width:400px;height:200px;margin-top:-15px}
.contain_top{width:60%;height:50%;margin:0 auto;margin-top:50px;}
td {text-align:center;}
</style>
<section class="rt_wrap content mCustomScrollbar">

 <div class="rt_content">
	 <br>
	 <div class="contain_top" style=""> 
		 <form action="" method="post">
		 	<input type="text" name="province" placeholder="请输入省名称" />
		 	<input type="text" name="city" placeholder="请输入城市名称" />
		 	<input type="text" name="country" placeholder="请输入地级市名称" />
		 	<input type="submit" value="确认提交" > 	
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
		 		<td><input type="button" value="删除">&nbsp;&nbsp;<input type="button" value="编辑"></td>
		 	</tr>
		 </table>
	 </div>
	 <hr>
     <!--点击加载-->
     <script>
     $(document).ready(function(){
		$("#loading").click(function(){
			$(".loading_area").fadeIn();
             $(".loading_area").fadeOut(1500);
			});
		 });
     </script>
     <section class="loading_area">
      <div class="loading_cont">
       <div class="loading_icon"><i></i><i></i><i></i><i></i><i></i></div>
       <div class="loading_txt"><mark>数据正在加载，请稍后！</mark></div>
      </div>
     </section>
     <!--结束加载-->
     <!--弹出框效果-->
     <script>
     $(document).ready(function(){
		 //弹出文本性提示框
		 $("#showPopTxt").click(function(){
			 $(".pop_bg").fadeIn();
			 });
		 //弹出：确认按钮
		 $(".trueBtn").click(function(){
			 alert("你点击了确认！");//测试
			 $(".pop_bg").fadeOut();
			 });
		 //弹出：取消或关闭按钮
		 $(".falseBtn").click(function(){
			 alert("你点击了取消/关闭！");//测试
			 $(".pop_bg").fadeOut();
			 });
		 });
     </script>
     <section class="pop_bg">
      <div class="pop_cont">
       <!--title-->
       <h3>弹出提示标题</h3>
       <!--content-->
       <div class="pop_cont_input">
        <ul>
         <li>
          <span>标题</span>
          <input type="text" placeholder="定义提示语..." class="textbox"/>
         </li>
         <li>
          <span class="ttl">城市</span>
          <select class="select">
           <option>选择省份</option>
          </select>
          <select class="select">
           <option>选择城市</option>
          </select>
          <select class="select">
           <option>选择区/县</option>
          </select>
         </li>
         <li>
          <span class="ttl">地址</span>
          <input type="text" placeholder="定义提示语..." class="textbox"/>
         </li>
         <li>
          <span class="ttl">地址</span>
          <textarea class="textarea" style="height:50px;width:80%;"></textarea>
         </li>
        </ul>
       </div>
       <!--以pop_cont_text分界-->
       <div class="pop_cont_text">
        	这里是文字性提示信息！
       </div>
       <!--bottom:operate->button-->
       <div class="btm_btn">
        <input type="button" value="确认" class="input_btn trueBtn"/>
        <input type="button" value="关闭" class="input_btn falseBtn"/>
       </div>
      </div>
     </section>
     <!--结束：弹出框效果-->

     <section>
      <h2><strong style="color:grey;">常用按钮（水平块元素，无区域限制）</strong></h2>
      <a class="link_btn" id="loading">加载进度效果（点击）</a>
      <button class="link_btn" id="showPopTxt">弹出框效果（点击）</button>
      <input type="button" value="按钮input" class="link_btn"/>
     </section>
      <section>
      <h2><strong style="color:grey;">表单样式（组合）</strong></h2>
      <input type="text" class="textbox" placeholder="默认宽度..."/>
      <input type="text" class="textbox textbox_295" placeholder="class=295px..."/>
      <input type="text" class="textbox textbox_225" placeholder="class=225px..."/>
      <select class="select">
       <option>下拉菜单</option>
       <option>菜单1</option>
      </select>
      <input type="button" value="组合按钮" class="group_btn"/>
     </section>
   
     <section>
      <h2><strong style="color:grey;">页面标题及表格/分页（</strong></h2>
      <div class="page_title">
       <h2 class="fl">商品详情标题</h2>
       <a class="fr top_rt_btn">右侧按钮</a>
      </div>
      <table class="table">
       <tr>
        <th>商品品牌</th>
        <th>分类</th>
        <th>是否精品</th>
        <th>是否促销</th>
        <th>是否新品</th>
        <th>促销价格</th>
        <th>商品价格</th>
        <th>商品详情</th>
        <th>商品销量</th>
       </tr>
       <tr>
       <!-- <div class="cut_title ellipsis"> -->
        <td style="width:265px;">265px宽</td>
        <td>长标题字符串截取</td>
        <td>内容三</td>
        <td>内容四</td>
        <td>内容五</td>
        <td>内容六</td>
        <td>
         <a href="#">表内链接</a>
         <a href="#" class="inner_btn">按钮</a>
        </td>
       </tr>
       <tr>
        <td style="width:265px;">仅适合单行截取</td>
        <td>多行截取程序定义一下。</td>
        <td>内容三</td>
        <td>内容四</td>
        <td>内容五</td>
        <td>内容六</td>
        <td>
         <a href="#">表内链接</a>
         <a href="#" class="inner_btn">按钮</a>
        </td>
       </tr>
      </table>
      <aside class="paging">
       <a>第一页</a>
       <a>1</a>
       <a>2</a>
       <a>3</a>
       <a>…</a>
       <a>1004</a>
       <a>最后一页</a>
      </aside>
     </section>
     <section>
      <h2><strong style="color:grey;">分列内容布局</strong></h2>
      <ul class="ulColumn2">
       <li>
        <span class="item_name" style="width:120px;">商品名称：</span>
        <input type="text" class="textbox textbox_295" placeholder="文本信息提示..."/>
        <span class="errorTips">错误提示信息...</span>
       </li>
       <li>
        <span class="item_name" style="width:120px;">品牌：</span>
        <select class="select">
         <option>选择品牌</option>
        </select>
        <span class="errorTips">错误提示信息...</span>
       </li>
       <li>
        <span class="item_name" style="width:120px;">是否热销：</span>
        <label class="single_selection"><input type="radio" name="name"/>推荐</label>
        <label class="single_selection"><input type="radio" name="name"/>不推荐</label>
       </li>
       <li>
        <span class="item_name" style="width:120px;">摘要：</span>
        <textarea placeholder="摘要信息" class="textarea" style="width:500px;height:100px;"></textarea>
       </li>
       <li>
        <span class="item_name" style="width:120px;">上传图片：</span>
        <label class="uploadImg">
         <input type="file"/>
         <span>上传图片</span>
        </label>
       </li>
       <li>
        <span class="item_name" style="width:120px;"></span>
        <input type="submit" class="link_btn"/>
       </li>
      </ul>
     </section>
     <!--tabStyle-->
     <script>
     $(document).ready(function(){
		 //tab
		 $(".admin_tab li a").click(function(){
		  var liindex = $(".admin_tab li a").index(this);
		  $(this).addClass("active").parent().siblings().find("a").removeClass("active");
		  $(".admin_tab_cont").eq(liindex).fadeIn(150).siblings(".admin_tab_cont").hide();
		 });
		 });
     </script>
     <section>
      <ul class="admin_tab">
       <li><a class="active">自定义标题</a></li>
       <li><a>自定义标题</a></li>
       <li><a>...可追加</a></li>
      </ul>
      <!--tabCont-->
      <div class="admin_tab_cont" style="display:block;">添加时，对其增加一个父级，tabContent01子项无样式，具体情况单独定义。</div>
      <div class="admin_tab_cont">tabContent02，内容根据具体数据二次单独定义，公共样式单独调用</div>
      <div class="admin_tab_cont">可追加</div>
     </section>
          <section>
      <ul class="admin_tab">
       <li><a class="active">自定义标题</a></li>
       <li><a>自定义标题</a></li>
       <li><a>...可追加</a></li>
      </ul>
      <!--tabCont-->
      <div class="admin_tab_cont" style="display:block;">
      <!--左右分栏：左侧栏目-->
       <div class="cont_col_lt mCustomScrollbar" style="height:500px;">
           <table class="table fl">
            <tr>
             <th>角色</th>
             <th>操作</th>
            </tr>
            <tr>
             <td class="center">顶级管理员</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
            <tr>
             <td class="center">采购人员</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
           </table>
           <table class="table fl" style="margin-top:8px;">
            <tr>
             <th>角色</th>
             <th>操作</th>
            </tr>
            <tr>
             <td class="center">顶级管理员</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
            <tr>
             <td class="center">采购人员</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
           </table>
       </div>
       <!--左右分栏：右侧栏-->
       <div class="cont_col_rt">
           <table class="table fl">
            <tr>
             <th>资源</th>
             <th>描述</th>
             <th>操作</th>
            </tr>
            <tr>
             <td class="center">测试</td>
             <td>数据信息过多（扩展性太大），不建议使用此布局，以免数据溢出。</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
            <tr>
             <td class="center">测试</td>
             <td>数据信息过多（扩展性太大），不建议使用此布局，以免数据溢出。</td>
             <td class="center"><a class="inner_btn">DeathGhost</a></td>
            </tr>
           </table>
       </div>
      </div>
      <div class="admin_tab_cont">tabContent02，内容根据具体数据二次单独定义，公共样式单独调用</div>
      <div class="admin_tab_cont">可追加</div>
     </section>
    <!--结束：以下内容则可删除，仅为素材引用参考-->

 </div>
</section>
<script src="js/amcharts.js" type="text/javascript"></script>
<script src="js/serial.js" type="text/javascript"></script>
<script src="js/pie.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function (e) {
        GetSerialChart();
        MakeChart(json);
    });
    var json = [
  { "name": "数据1", "value": "35" },
  { "name": "数据2", "value": "60" },
  { "name": "数据3", "value": "22" },
  { "name": "数据4", "value": "65" },
  { "name": "数据5", "value": "35" },
  { "name": "数据6", "value": "22" },
  { "name": "数据7", "value": "43" },
  { "name": "数据8", "value": "55" }
  ]
    //柱状图  
    function GetSerialChart() {

        chart = new AmCharts.AmSerialChart();
        chart.dataProvider = json;
        //json数据的key  
        chart.categoryField = "name";
        //不选择      
        chart.rotate = false;
        //值越大柱状图面积越大  
        chart.depth3D = 20;
        //柱子旋转角度角度
        chart.angle = 30;
        var mCtCategoryAxis = chart.categoryAxis;
        mCtCategoryAxis.axisColor = "#efefef";
        //背景颜色透明度
        mCtCategoryAxis.fillAlpha = 0.5;
        //背景边框线透明度
        mCtCategoryAxis.gridAlpha = 0;
        mCtCategoryAxis.fillColor = "#efefef";
        var valueAxis = new AmCharts.ValueAxis();
        //左边刻度线颜色  
        valueAxis.axisColor = "#ccc";
        //标题
        valueAxis.title = "3D柱状图Demo";
        //刻度线透明度
        valueAxis.gridAlpha = 0.2;
        chart.addValueAxis(valueAxis);
        var graph = new AmCharts.AmGraph();
        graph.title = "value";
        graph.valueField = "value";
        graph.type = "column";
        //鼠标移入提示信息
        graph.balloonText = "测试数据[[category]] [[value]]";
        //边框透明度
        graph.lineAlpha = 0.3;
        //填充颜色 
        graph.fillColors = "#b9121b";
        graph.fillAlphas = 1;

        chart.addGraph(graph);

        // CURSOR
        var chartCursor = new AmCharts.ChartCursor();
        chartCursor.cursorAlpha = 0;
        chartCursor.zoomable = false;
        chartCursor.categoryBalloonEnabled = false;
        chart.addChartCursor(chartCursor);

        chart.creditsPosition = "top-right";

        //显示在Main div中
        chart.write("cylindrical");
    }
    //折线图
    AmCharts.ready(function () {
        var chart = new AmCharts.AmSerialChart();
        chart.dataProvider = json;
        chart.categoryField = "name";
        chart.angle = 30;
        chart.depth3D = 20;
        //标题
        //chart.addTitle("3D折线图Demo", 15);  
        var graph = new AmCharts.AmGraph();
        chart.addGraph(graph);
        graph.valueField = "value";
        //背景颜色透明度
        graph.fillAlphas = 0.3;
        //类型
        graph.type = "line";
        //圆角
        graph.bullet = "round";
        //线颜色
        graph.lineColor = "#8e3e1f";
        //提示信息
        graph.balloonText = "[[name]]: [[value]]";
        var categoryAxis = chart.categoryAxis;
        categoryAxis.autoGridCount = false;
        categoryAxis.gridCount = json.length;
        categoryAxis.gridPosition = "start";
        chart.write("line");
    });
    //饼图
    //根据json数据生成饼状图，并将饼状图显示到div中
    function MakeChart(value) {
        chartData = eval(value);
        //饼状图
        chart = new AmCharts.AmPieChart();
        chart.dataProvider = chartData;
        //标题数据
        chart.titleField = "name";
        //值数据
        chart.valueField = "value";
        //边框线颜色
        chart.outlineColor = "#fff";
        //边框线的透明度
        chart.outlineAlpha = .8;
        //边框线的狂宽度
        chart.outlineThickness = 1;
        chart.depth3D = 20;
        chart.angle = 30;
        chart.write("pie");
    }
</script>
</body>
</html>
