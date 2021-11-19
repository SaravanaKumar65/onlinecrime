<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Form</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Admin Login Page</h1>

<hr>

<f:form action="/admin" method="post" modelAttribute="loginData">

Enter Username : <f:input path="username"/> <f:errors path="username"/>
<br><br>

Enter Password : <f:input path="password"/> <f:errors path="password"/>
<br><br>

<input type="submit" value="Login">

</f:form>
</body>
</html>