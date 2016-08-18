<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link href="/MyFristWeb/css/styleLogin.css" rel="stylesheet" type="text/css"
	media="all" />
</head>
<body>
	<div class="login">
		<h2>X X 商 城</h2>

		<div class="login-top">
			<a href="../index.jsp"><h3>回到首页</h3></a>
			<h1>登录</h1>

			<form action="/MyFristWeb/login.do" method="post">
				<input type="text" value="user" name="name" onfocus="this.value='';"
					onblur="if(this.value==''){this.value='输入账户;}">
				 <input
					type="password" value="password" name="password"
					onfocus="this.value='';"
					onblur="if(this.value=='') {this.value='password'}">
				<div class="forgot">

					<a href="http://www.baidu.com">忘记密码??</a> <input type="submit"
						value="登录">
				</div>
			</form>


		</div>
		<div class="login-bottom">
			<h3>
				新用户&nbsp;<a href="register.jsp">注册</a>Here</h3>
		</div>
	</div>
</body>
</html>