<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Police Officer Home</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h1 align="center">Police Officer Home</h1>
<h1 align="center">Welcome ${PoliceDataT.name }</h1>
<a href="/criminal" class="btn btn-primary">View All Wanted Criminals</a>
<br><br>
<a href="rCriminal" class="btn btn-primary">Add New Criminal</a>
<br><br>
<a href="/search" class="btn btn-primary">Search Criminal</a>
<br><br>
<a href="/logout" class="btn btn-primary">Logout</a>
<br><br>

</body>
</html>