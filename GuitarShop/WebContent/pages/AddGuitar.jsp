<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的吉他</title>
</head>
<body>
<p align="center">请输入新吉他的数据</p>
<form method="get" action="http://localhost:8080/GuitarShop/AddGuitarServlet" >
序&nbsp;&nbsp;号：     <input type="text"   name="sn" ><br/>
制造者：<input type="text" name="builder" ><br/>
价&nbsp;&nbsp;格：<input type="text"  name="price"><br/>
模&nbsp;&nbsp;式：<input type="text"  name="model"><br/>
类&nbsp;&nbsp;型：<input type="text"  name="type"><br/>
背&nbsp;&nbsp;木：<input type="text"  name="bw" ><br/>
顶&nbsp;&nbsp;木：<input type="text"  name="tw" ><br/>
<input type="submit" value="提交">
</form>
</body>
</html>