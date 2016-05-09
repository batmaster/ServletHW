<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

<c:if test="${not empty failed}">
	<font color="red">Wrong username or password, please try username as "admin" and password as "12345678".</font>
</c:if>

<form action="login" method="POST">
	Username:<br>
	<input type="text" name="username" /><br>
	<br>
	Password:<br>
	<input type="password" name="password" /><br>
	<br>
	<input type="submit" value="Login">
</form>

</body>
</html>