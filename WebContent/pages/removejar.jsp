<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/MyFristWeb/css/table.css" rel="stylesheet" type="text/css"
	 />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>所有商品信息</title>
</head>
<body>
	<table  border="1" cellpadding="4" cellspacing="0" bordercolor="#2A3AA"  width="85%"
		align="center">
		
		
		<caption><h3>所有商品</h3></caption>

		<tr>

			<td>商品ID</td>
			<td>商品名</td>
			<td>商品价格</td>
			<td>商品类型</td>
			<td colspan="3" align="center">操作</td>
		</tr>

		<c:forEach items="${sessionScope.goodList}" var="good">
			<tr>

				<td><c:out value="${good.id}"></c:out></td>
				<td><c:out value="${ good.gname.trim()}"></c:out></td>
				<td><c:out value="${ good.gprice}"></c:out></td>
				<td><c:out value="${ good.goodtype}"></c:out></td>
				<td><a href="">删除</a></td>
				<td><a href="">修改</a></td>
				<td><a href="">详情</a></td>
				
			</tr>
		</c:forEach>

	</table>

</body>
</html>