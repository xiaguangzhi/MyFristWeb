<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商品</title>
</head>
<body>
<div class="add">
	<h2>增加商品信息</h2>
	<div class="add-center">
	<form action="addgoods.do" method="get">

		商品名<input type="text" name="goods"><br/>
		商品价格<input type="text" name="price"><br/>
		商品类型<input type="text" name="type"><br/>
		缩略图<input type="file"  size="10" name="image1">*(30*30)<br/>
		小尺寸图<input type="file" size="10" name="image2">*(50*50)<br/>
		中尺寸图<input type="file" size="10" name="image3">*(100*100)<br/>
		高清大图<input type="file" size="10" name="image4">*(400*400)<br/>
		商品描述<br/>
		<textarea name="msg" rows="3" cols="20"></textarea>	
		<input type="submit" value="增加">
	</form>
	</div>
</div>
</body>
</html>