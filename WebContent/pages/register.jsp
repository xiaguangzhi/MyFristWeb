<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link href="/MyFristWeb/css/styleRegister.css" rel="stylesheet" type="text/css"
	media="all" />
</head>
<body>
	<div class="register">
		<h2>X X 商 城</h2>

		<div class="reg-top">
			<a href="#"><h3>回到首页</h3></a>
			<h1>注册</h1>

			<form action=" /MyFristWeb/register.do" method="post">
				<input type="text" value="输入账户" name="name"onfocus="this.value='';"
					onblur="if(this.value==''){this.value='输入账户';}"> 
					<input
					type="password" value="password" name="password" onfocus="this.value='';"
					onblur="if(this.value=='') {this.value='password'}"> 
					<input
					type="email" value="xxx@example.com" name="email" onfocus="this.value='';"
					onblur="if(this.value=='') {this.value='输入邮箱'}"> 
					<input
					type="tel" value="123-4567-6789" name="tel" onfocus="this.value='';"
					onblur="if(this.value=='') {this.value='输入手机号'}">
				<div class="sub">
					<input type="submit" value="注册">
				</div>
			</form>


		</div>

	</div>

</body>
</html>