<%@page import="com.iotek.entry.Good"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/MyFristWeb/css/addgoods.css" rel="stylesheet" type="text/css">
<title>增加商品</title>
</head>
<body>
<div class="add">
	<h2>增加商品库存</h2>
	<div class="add-center">
	<form action="/MyFristWeb/innerstock.do"  method="get">
	<%
	Good goods=(Good)session.getAttribute("addgoodstock");
	
	%>
	<table>
		<tr>
		<td>商品名:</td>
		<td><%out.println(goods.getGname()); %></td>
		</tr>
		<tr>
		<td>商品价格:</td>
		<td><%out.print(goods.getGprice());%></td>
		</tr>
		<tr>
		<td>增加数量:</td>
		<td><input  id="number"  type="number"  name="number"><br/></td>
		</tr>
		<tr>
		<td>总价格:</td>
		<td>1000</td>
		</tr>

		</table>
		<input type="submit" value="增加">
	</form>
	</div>
</div>
</body>
</html>