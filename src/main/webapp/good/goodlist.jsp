<%@ page contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<%@ include file="../template/head.jsp"%>
<body>
	<%@ include file="../template/header.jsp"%>
	<%@ include file="../template/left.jsp"%>
	<section class="rt_wrap content mCustomScrollbar">
	<div class="rt_content">
		<div class="page_title">
			<h2 class="fl">商品列表示例</h2>
			<a href="${pageContext.request.contextPath}/good/good.do" class="fr top_rt_btn add_icon">添加商品</a>
		</div>
		<section class="mtb">
			<form action="goodLists.do" method = "post">
				<select class="select" name ="directoryId" >
					<c:forEach items="${directorys}" var="directory" varStatus="sd">
		         	<option value=${directory.directoryId } >${directory.dname}</option>
			        </c:forEach>
				</select> 
				<input type="text" class="textbox textbox_225"placeholder="输入产品关键词或产品货号..." />
				<input type="submit" value="查询"  /> 
			</form>
		</section>
		<table class="table">
			<tr>
				<!-- <th>缩略图</th> -->
				<th>产品名称</th>
				<th>类别</th>
				<th>品牌</th>
				<th>种类</th>
				<th>单价</th>
				<th>精品</th>
				<th>促销</th>
				<th>新品</th>
				<th>库存</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${goodLists }" var="goodlist" varStatus="goodsatus">
				<tr>
					<!-- <td class="center"><img src="upload/goods01.jpg" width="50"
					height="50" /></td> -->
					<td>${goodlist.name }</td>
					<td class="center">${goodlist.dname }</td>
					<td class="center">${goodlist.brandName }</td>
					<td class="center">${goodlist.kindName }</td>
					<td class="center"><strong class="rmb_icon">${goodlist.price }</strong></td>
					<td class="center"><a >${goodlist.quality }</a></td>
					<td class="center"><a >${goodlist.promation }</a></td>
					<td class="center"><a >${goodlist.goodNew }</a></td>
					<td class="center">${goodlist.count }</td>
					<td class="center"><a
						href="${pageContext.request.contextPath}/good/good.do?id=${goodlist.id }" title="编辑" class="link_icon">&#101;</a>
						<a href="${pageContext.request.contextPath}/good/del.do?id=${goodlist.id }" title="删除" class="link_icon">&#100;</a></td>
				</tr>
				
			</c:forEach>
			
		</table>
		<aside class="paging"> <a>第一页</a> <a>1</a> <a>2</a> <a>3</a> <a>…</a>
		<a>1004</a> <a>最后一页</a> </aside>
	</div>
	</section>
</body>
</html>