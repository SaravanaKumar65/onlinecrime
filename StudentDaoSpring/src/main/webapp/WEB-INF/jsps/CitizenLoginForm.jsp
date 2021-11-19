<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Citizen Login Form</title>
	
</head>
<body>


<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Login Page</h1>

<hr>

<f:form action="/citizenlogin" method="post" modelAttribute="loginData">

Enter Email : <f:input path="username"/> <f:errors path="username"/>
<br><br>

Enter Password : <f:input type="password" path="password"/> <f:errors path="password"/>
<br><br>

<input type="submit" value="Login">

<a href="/signUp" >New user?</a>

</f:form>
</body>
</html>