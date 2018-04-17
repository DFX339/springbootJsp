<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>显示用户信息</title>
</head>
<body>
	<h1>HELLO THIS IS SHOWUSER JSP.</h1>
	<h2>${user.id }</h2>
	<h2>${user.username }</h2>
	<h2>${user.password }</h2>
	<a href="/SpringbootJsp/skip.do">转到skip.jsp</a>
</body>
</html>