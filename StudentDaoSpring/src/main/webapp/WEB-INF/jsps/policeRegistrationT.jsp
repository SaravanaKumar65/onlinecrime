<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Police Registration Page</title>
<style>
.er{
 color:red;
 }
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>


<h1 align="center">Police Registration Screen</h1>
<hr>

<f:form action="/registerPoliceT" method="post" modelAttribute="poDataT">
Enter Name: <f:input path="name" /> <f:errors path="name" class="er"/>

<br> <br>

Enter Email Id: <f:input path="email" /> <f:errors path="email" class="er"/>
<br><br>

Enter Password: <f:input type="password" path="password" /> <f:errors path="password" class="er"/>
<br><br>

Enter Age: <f:input path="age" /> <f:errors path="age" class="er"/>
<br><br>

Enter DOB: <f:input path="dob" placeholder="dd/MM/yyyy" type="date"/> <f:errors path="dob" class="er"/>
<br><br>

Enter Gender: <f:radiobutton path="gender" value="male"/>Male
              <f:radiobutton path="gender" value="female"/>Female<f:errors path="gender" class="er"/>
<br><br>

Enter Designation: <f:select path="designation">
                   <f:option value="">Select Designation</f:option>
                   <f:option value="constable">Constable</f:option>
                   <f:option value="constable">Officer</f:option> 
</f:select>
<f:errors path="designation" class="er"/>
<br><br>

Enter Salary: <f:input path="salary" /> <f:errors path="salary" class="er"/>
<br><br>
<input type="submit" value="Register">

</f:form>
</body>
</html>