<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.iotek.entry.User" %>
	<%@page import="java.util.Date" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/MyFristWeb/css/index.css">
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Insert title here</title>
</head>
<body>
	<!-- 页面顶端 -->
	<section>
		<div class="index-top">
			<a>
			<%out.print(new Date().toLocaleString());%>
			</a> 
			<%
			String s=null;
			String userpath=null;
			User user=(User)session.getAttribute("user");
				if(user==null){
					s="登录";
					userpath="/MyFristWeb/pages/userLogin.jsp";
				}else{
					s=user.getName();
					userpath="/MyFristWeb/pages/loginSuccess.jsp";
				}
				
				%>
			
			
			<a href=<%=userpath %>><%=s%></a>
		</div>
		<div class="index-top-my">
			<a href="#">我的订单</a> <a href="#">我的购物车</a> <a href="#">关于我们</a> <a
				href="#">联系我们</a>
		</div>
	</section>
	<hr>
	<!-- 首页查询 -->

	<div class="index-top-search">
		<div class="index-top-img">
			<a href="#"><img src="/MyFristWeb/images/topsearch.png"
				border="1" width="100%" height="100%"></a>
		</div>

		<div class="index-search">
			<form action="" method="get">
				<input type="text" name="searchinfo"> <input type="submit"
					value="查找">
			</form>
		</div>
		<div class="index-cart">
			<a href="/MyFristWeb/pages/adminhome.jsp"><img alt="购物车"src="/MyFristWeb/images/topsearch.png"
				border="1" width="100px" height="50px"></a>
		</div>

	</div>


	
	<!-- 商品展示 -->

	<div class="goods">
		<h2>浏览商品</h2>

		<div class="goodbar">
			<iframe src="/MyFristWeb/pages/homeleft.html" scrolling="no"
				width="100%" height=400px frameborder="no" border="0"
				marginwidth="0" marginheight="0" 
				allowtransparency="yes"></iframe>
		</div>
		<div class="goods_info">
		<!-- <table  border="1" cellpadding="4" cellspacing="0" bordercolor="#2A3AA"  width="85%"
		align="center"> -->
		<%int i=1; %>
		<c:forEach items="${sessionScope.goodInfoList}" var="good">
				<div class="goods_info_item">
				<form action="#" method="get">
					<a href="/MyFristWeb/goodinfo.do?goodid=${good.id}">
					<img alt="${good.gname.trim()}" src="${good.image1}"></a>
					<a href="/MyFristWeb/goodinfo.do?goodid=${good.id}"><c:out value="${good.gname.trim()}"></c:out></a>
					<a><c:out value="${good.gprice}"></c:out></a>
					
					<input type="submit" value="直接购买">
					</form>
				
				</div>
				
		</c:forEach>

	<!-- </table> -->
			
		</div>

	</div>


	<!-- 首页末尾 -->
	<div class="index-bottom">

		<h3 class="youlike">
			<span class=""> <strong>你可能喜欢</strong>

			</span>
		</h3>


	</div>

</body>
</html>