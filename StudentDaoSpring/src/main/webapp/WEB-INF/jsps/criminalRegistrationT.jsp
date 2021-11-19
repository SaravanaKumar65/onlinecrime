<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wanted Criminal Registration Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>
.er{
 color:red;
 }
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Wanted Criminal Registration</h1>
<hr>

<f:form action="/registerCriminalT" method="post" modelAttribute="wcDataT">
Enter Name: <f:input path="name" /> <f:errors path="name" class="er"/>

<br> <br>

Enter Age: <f:input path="age" /> <f:errors path="age" class="er"/>
<br><br>

Enter Gender: <f:radiobutton path="gender" value="male"/>Male
              <f:radiobutton path="gender" value="female"/>Female<f:errors path="gender" class="er"/>
<br><br>

Enter Identification Mark: <f:input path="idMark" /> <f:errors path="idMark" class="er"/>
<br><br>

Enter Area of Crime: <f:input path="areaOfCrime"/> <f:errors path="areaOfCrime" class="er"/>
<br><br>

Enter Crime Type: <f:input path="crimeType" /> <f:errors path="crimeType" class="er"/>
<br><br>

<input type="submit" value="Register">

</f:form>
</body>
</html>