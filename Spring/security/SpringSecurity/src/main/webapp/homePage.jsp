<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>homePage.jsp</h1>
	<h2><a href="admin.jsp">Admin</a></h2>
	<c:if test="${not empty username}">
		<h2>Hi, ${username} !</h2>
		<a href="<c:url value='logout?${_csrf.parameterName}=${_csrf.token}' />">Logout</a>
	</c:if>
	<c:if test="${empty username}">
		<a href="<c:url value='login' />">Login</a>
	</c:if>
	<c:if test="${not empty message}">
		<h2>${message}</h2>
	</c:if>
</body>
</html>