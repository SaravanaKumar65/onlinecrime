<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criminal Update Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Criminal Update Page</h1>
<hr>

<f:form action="/updateCriDetails" method="post" modelAttribute="upcriminal">
Employee Id : <f:input path="criminalId" readonly="true"/>

<br><br>

Enter Name: <f:input path="name" /> <f:errors path="name"/>

<br> <br>

Enter Age: <f:input path="age" /> <f:errors path="age"/>
<br><br>

Enter Gender: <f:radiobutton path="gender" value="male"/>Male
              <f:radiobutton path="gender" value="female"/>Female<f:errors path="gender"/>
<br><br>

Enter Identification Mark: <f:input path="idMark" /> <f:errors path="idMark"/>
<br><br>

Enter Area of Crime: <f:input path="areaOfCrime"/> <f:errors path="areaOfCrime"/>
<br><br>

Enter Crime Type: <f:input path="crimeType" /> <f:errors path="crimeType"/>
<br><br>

<input type="submit" value="Update">

</f:form>

</body>
</html>