<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.iotek.entry.UserInfo"%>
<%@ page import="com.iotek.entry.GoodInfo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		UserInfo userinfo = null;
		GoodInfo goodInfo = null;

		userinfo = (UserInfo) session.getAttribute("userinfo");
		out.print(userinfo.toString());
		goodInfo = (GoodInfo) session.getAttribute("goodinfoitem");
		out.println(goodInfo.toString());
	%>

</body>
</html>