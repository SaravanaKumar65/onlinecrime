<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="cyan">
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>



<h1 align="center">SignUp Page</h1>

<hr>

<h3 style="color: red">${flag }</h3>


<f:form action="/signUp" method="post" modelAttribute="poData">
Enter AdminName: <f:input path="name" /> <f:errors path="name"/>

<br> <br>

Enter Email Id: <f:input path="email" /> <f:errors path="email"/>
<br><br>

Enter Password: <f:input path="password" /> <f:errors path="password"/>
<br><br>

Enter age: <f:input path="age" /> <f:errors path="age"/>
<br><br>

Enter Designation: <f:input path="designation" /> <f:errors path="designation"/>
<br><br>

Enter Salary: <f:input path="salary" /> <f:errors path="salary"/>
<br><br>



<input type="submit" value="Signup">

</f:form>


</body>
</html>