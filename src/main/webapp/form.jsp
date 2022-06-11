<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
<form action="addstudentform">
<h2>Student Form</h2>
<label>Enter Your Name</label>
<input  type="text" name="name"/>
<br>
<label>Enter Your Location</label>
<input type="text" name="location"/>
<br>
<label>Enter Your Role Number</label>
<input type="number" name="role_no"/><br>


<input type="checkbox" name="hobby" value="Playing Cricket"/>
<label for="Playing Cricket">Cricket</label><br>

<input type="checkbox" name="hobby" value="cooking ">
<label for="cooking">cooking</label><br>

<input type="checkbox"  name="hobby" value="reading">
<label  for="reading">reading</label>
<br>
<br>
<input type="submit" value="submit form">
</form>

</body>
</html>