<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>prectice</title>
</head>
<body>
<h2>**********  User Ragistration Form  *******************	</h2>

<%-- <h1>Hello this is value : ${value}</h1> --%>

<h2>The data is   ::  </h2> ${object}
<h1>The Name :</h1>  <b> ${object.getName()}</b>
<h1>The Role No : :</h1>  <b> ${object.getRole_no()} </b>
<br>
<h1>The Location  : :</h1>  <b> ${object.Location()} </b><br><br>

<a href="form">Back to form</a>
</body>
</html> 