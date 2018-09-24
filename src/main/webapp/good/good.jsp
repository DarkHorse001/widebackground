<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<%@include file="../template/head.jsp" %>
<body>
<!--header-->
	<%@ include file="../template/header.jsp" %>
	<%@ include file="../template/left.jsp" %>

<form action="handle_good.do" method="post">
	<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">商品详情示例</h2>
       <a  class="fr top_rt_btn" href="#">返回产品列表</a>
      </div>
     <section>
      <ul class="ulColumn2">
       <li>
        <span class="item_name"  style="width:120px;">商品名称：</span>
        <input name="name" type="text"  class="textbox textbox_295" placeholder="商品名称..."/>
        <!-- <span class="errorTips">错误提示信息...</span> -->
       </li>
       <!-- <li>
        <span class="item_name" style="width:120px;">商品货号：</span>
        <input name="id" type="text" class="textbox" placeholder="商品货号..."/>
        <span class="errorTips">错误提示信息...</span>
       </li> -->
       
       <li>
        <span class="item_name" style="width:120px;">目录：</span>
        <select class="select" name="dname">
         <option>选择类别</option>
         <c:forEach items="${directorys}" var="d" varStatus="sd">
         	<option value=${d.directoryId } >${d.dname}</option>
         </c:forEach>
        </select>
        <!-- <span class="errorTips">错误提示信息...</span> -->
       </li>
       
       <li>
        <span class="item_name" style="width:120px;">品牌：</span>
        <select class="select" name="brandName">
         <option>选择品牌</option>
         <c:forEach items="${brands}" var="b" varStatus="sb">
         	<option value=${b.brandId } >${b.brandName }</option>
         </c:forEach>
        </select>
        <!-- <span class="errorTips">错误提示信息...</span> -->
       </li>
       
       <li>
        <span class="item_name" style="width:120px;">种类：</span>
        <select class="select" name="kindName">
         <option>选择产品种类</option>
         <c:forEach items="${kinds}" var="k" varStatus="sk">
         	<option value=${k.kindId } >${k.kindName }</option>
         </c:forEach>
        </select>
        <!-- <span class="errorTips">错误提示信息...</span> -->
       </li>
       
        <li>
       		 <span class="item_name" style="width:120px;">价格：</span>
       		 <input type="text" name="price" />
       </li>
       
       <li>
        <span class="item_name" style="width:120px;">推荐：</span>
        <label class="single_selection"><input type="radio" name="quality" value="true"/>是否精品</label>
        <label class="single_selection"><input type="radio" name="promation" value="true"/>是否促销</label>
        <label class="single_selection"><input type="radio" name="isNew" value="true"/>是否新品</label>
       </li>
       
       <li>
       		 <span class="item_name" style="width:120px;">促销价格：</span>
       		 <input type="text" name="promotionPrice" />
       </li>
       
       <li>
       		 <span class="item_name" style="width:120px;">库存：</span>
       		 <input type="text" name="count" />
       </li>
       
     <!-- <li>
        <span class="item_name" style="width:120px;">上传图片：</span>
        <label class="uploadImg">
         <input type="file"/>
         <span>上传图片</span>
        </label>
       </li> -->
       <li>
        <span class="item_name" style="width:120px;">产品详情：</span>
        <textarea rows="10" cols="100" name = "detail" style="width:1024px;height:500px;margin-left:120px;margin-top:0;"></textarea>
       </li>
       <li>
        <span class="item_name" style="width:120px;"></span>
        <input type="submit" value="添加" class="link_btn"/>
       </li>
      </ul>
     </section>
 </div>
</section>
	

</form>
</body>
</html>