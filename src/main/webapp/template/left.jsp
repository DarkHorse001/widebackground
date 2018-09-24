<%@ page contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
					<a href="${pageContext.request.contextPath}/good/goodlist.do" class="active">商品列表示例</a>
				</dd>
				<dd>
					<a href="${pageContext.request.contextPath}/good/good.do">商品详情示例</a>
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
