<%@page import="com.iotek.entry.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Order> list=(List)session.getAttribute("order");
	for(int i=0; i<list.size();i++){
		out.println(list.get(0).toString());
	}
	
	%>
</body>
</html>