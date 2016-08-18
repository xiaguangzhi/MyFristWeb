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
	<h2>增加商品信息</h2>
	<div class="add-center">
	<form action="/MyFristWeb/addGoods.do" enctype="multipart/form-data"  method="post">
	<table>
		<tr>
		<td>商品名:</td>
		<td><input type="text" name="goods"></td>
		</tr>
		<tr>
		<td>商品价格:</td>
		<td><input type="text" name="price"></td>
		</tr>
		<tr>
		<td>商品类型:</td>
		<td><input type="text"  name="type"><br/></td>
		</tr>
		<tr>
		<td>缩略图片:</td>
		<td><input type="file"  size="10" name="image1"></td>
		</tr>
		<tr>
		<td>小尺寸图:</td>
		<td><input type="file"  name="image2"></td>
		</tr>
		<tr>
		<td>中尺寸图:</td>
		<td><input type="file"  name="image3"></td>
		</tr>
		<tr>
		<td>高清大图:</td>
		<td><input type="file"  name="image4"></td>
		</tr>
		<tr>
		<td>商品描述:</td>
		<td><textarea name="msg" rows="3" cols="30"></textarea>	</td>
		</tr>
		</table>
		<input type="submit" value="增加">
	</form>
	</div>
</div>
</body>
</html>