<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Date"%>
<%@page import="com.iotek.entry.GoodInfo"%>
<%@page import="com.iotek.entry.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支付页面</title>
</head>
<body>

	<%
		UserInfo userinfo = null;
		GoodInfo goodinfo = null;

		userinfo = (UserInfo) session.getAttribute("userinfo");

		goodinfo = (GoodInfo) session.getAttribute("goodinfoitem");
		out.print(goodinfo.toString());
	%>
	<h3>用户名:${userinfo.name}</h3>
	<h3>账户余额:${userinfo.money}</h3>
	<h3>用户地址:&nbsp;${userinfo.province}省&nbsp;${userinfo.city}市&nbsp;${userinfo.county}县&nbsp;${userinfo.road}街道</h3>
	<h3>
		待支付商品:<%=goodinfo.getGname()%></h3>
	<img alt="${goodinfo.gname}"
		src="../<%=URLDecoder.decode(goodinfo.getImage1(), "UTF-8")%>" />
	<h3>数量:&nbsp;1&nbsp;</h3>
	<h3>
		金额:<%=goodinfo.getGprice()%></h3>
	<h3>
		当前时间:<%=new Date().toLocaleString().toString().trim()%></h3>
	<form action="/MyFristWeb/pay.do" method="post">
		请输入密码验证<input type="password" name="checkpass"><br /> <input
			type="submit" id="pay" value="支付">
	</form>

</body>
</html>