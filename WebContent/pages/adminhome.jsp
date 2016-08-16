<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理主页</title>
</head>
<frameset rows="15%,85%">

<frame src="admintop.jsp" noresize="noresize">
    <frameset cols="15%,*">

<frame src="adminleft.jsp"  noresize="noresize">
<frame src="/MyFristWeb/showgoods.do?currentpage=1" name="show">
</frameset>
</frameset>
</html>