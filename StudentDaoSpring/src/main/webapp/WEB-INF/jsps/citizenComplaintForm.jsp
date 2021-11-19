<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint Registration</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<h1 align="center">Complaint Form</h1>

<hr>

<f:form action="/registerComplaint" method="post" modelAttribute="citizenComplaintData">

 Complainant Name : <f:input path="username"/> <f:errors path="username"/>
<br><br> 

Complainant Email : <f:input path="email"/> <f:errors path="email"/>
<br><br>

Complainant Age : <f:input path="age"/> <f:errors path="age"/>
<br><br>

Complainant Mobile : <f:input path="mobile"/> <f:errors path="mobile"/>
<br><br>

Type of Crime: 
<f:select path="typeofcrime">
		<option value="theft">Theft</option>
		<option value="domesticViolence">Domestic Violence </option>
		<option value="murder">Murder</option>
		<option value="sucide">Sucide</option>
		<option value="harassment">Harassment</option>
		<option value="dowry">Dowry</option>
</f:select>
<br><br>

Crime Date : <f:input path="crimedate" placeholder="dd/mm/yyyy" type="date"/><f:errors path="crimedate"></f:errors>
<br><br>


Date of Complaint Registration : <f:input path="dateT" type="date" placeholder="dd/mm/yyyy"/> <f:errors path="dateT"/>
<br><br>





Crime Description: <f:textarea path="description"/><f:errors path="description"/>

<br><br>

<input type="submit" value="Submit">

</f:form>
</body>
</html>