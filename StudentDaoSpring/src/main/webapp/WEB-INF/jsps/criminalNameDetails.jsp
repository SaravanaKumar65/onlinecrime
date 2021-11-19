<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criminal Details</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 align="center">Search Criminal By Name </h1>
<hr>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Criminal ID</th>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">Gender</th>
      <th scope="col">Identification Mark</th>
      <th scope="col">Area of Crime</th>
      <th scope="col">Type of Crime</th>

    </tr>
  </thead>
  <tbody> 
  
    
    <c:forEach var="ncri" items="${nameList }">
    
    <tr>
      <th scope="row"><c:out value="${ncri.criminalId }"></c:out></th>
      <td><c:out value="${ncri.name }"></c:out> </td>
      <td><c:out value="${ncri.age }"></c:out> </td>
   	  <td><c:out value="${ncri.gender }"></c:out> </td>
   	  <td><c:out value="${ncri.idMark }"></c:out> </td>
   	  <td><c:out value="${ncri.areaOfCrime }"></c:out> </td>
   	  <td><c:out value="${ncri.crimeType }"></c:out> </td>
   	  
    </tr>   
    
  
    
    </c:forEach>
    
    
  </tbody>
</table>

</body>
</html>