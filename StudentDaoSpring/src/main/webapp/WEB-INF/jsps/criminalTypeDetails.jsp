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
<h1 align="center">Search Criminal By Type </h1>
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
  
    
    <c:forEach var="tcri" items="${crimeList }">
    
    <tr>
      <th scope="row"><c:out value="${tcri.criminalId }"></c:out></th>
      <td><c:out value="${tcri.name }"></c:out> </td>
      <td><c:out value="${tcri.age }"></c:out> </td>
   	  <td><c:out value="${tcri.gender }"></c:out> </td>
   	  <td><c:out value="${tcri.idMark }"></c:out> </td>
   	  <td><c:out value="${tcri.areaOfCrime }"></c:out> </td>
   	  <td><c:out value="${tcri.crimeType }"></c:out> </td>
   	  
    </tr>   
    
  
    
    </c:forEach>
    
    
  </tbody>
</table>

</body>
</html>