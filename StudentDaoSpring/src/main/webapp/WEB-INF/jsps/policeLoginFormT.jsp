<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Police Officer Login Page</title>
<style>
.er{
 color:red;
 }
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Login Page</h1>

<hr>

<f:form action="/login" method="post" modelAttribute="loginPoliceDataT">

Enter Username : <f:input path="username"/> <f:errors path="username" class="er"/>
<br><br>

Enter Password : <f:input type="password" path="password"/> <f:errors path="password" class="er"/>
<br><br>

<input type="submit" value="Login">
<hr>
<a href="/">Go Home</a>
</f:form>
</body>
</html>