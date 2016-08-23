<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员导航页</title>
<link rel="stylesheet" href="/MyFristWeb/css/adminleft.css">
</head>
<body style="height: 600px;">
	<ul class="dropdown">
		<li><a href="#">商品管理</a>
			<ul>
				<li><a href="addGoods.jsp" target="show">增加商品</a></li>
				<li><a href="#" target="show">查询商品</a></li>
				<li><a href="showgoods.jsp" target="show">查看商品</a></li>
			</ul></li>
		<li><a href="#">货架管理</a>
			<ul>
				<li><a href="#">商品上架</a></li>
				<li><a href="#">商品下架</a></li>
				
			</ul></li>
			<li><a href="#">库存管理</a>
			<ul>
				<li><a href="showstock.jsp" target="show">商品库存</a></li>
				<li><a href="#">商品入库</a></li>
				<li><a href="#">商品出库</a></li>
			
				
			</ul></li>
		<li><a href="#">订单管理</a>
			<ul>
				<li><a href="http://www.baidu.com" target="show">查看所有订单</a></li>

				<li><a href="http://www.baidu.com" target="show">查看已发货订单</a></li>
				<li><a href="B.html" target="show">查看未发货订单</a></li>
				<li><a href="http://www.baidu.com" target="show">查看过期订单</a></li>
				<li><a href="B.html" target="show">移除过期订单</a></li>
				<li><a href="http://www.baidu.com" target="show">修改订单</a></li>
				<li><a href="B.html" target="show">删除订单</a></li>
			</ul></li>
	</ul>

	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="/MyFristWeb/js/tendina.js"></script>
	<script>
		$('.dropdown').tendina({
			animate : true,
			speed : 500,
			openCallback : function($clickedEl) {
				console.log($clickedEl);
			},
			closeCallback : function($clickedEl) {
				console.log($clickedEl);
			}
		})
	</script>
</body>
</html>