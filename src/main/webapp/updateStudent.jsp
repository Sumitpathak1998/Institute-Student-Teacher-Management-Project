<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Details</title>
<link rel = "stylesheet" href="css/updateStudent.css">
</head>
<body>
<div class="head">
	Update Student Details 
</div>
<div class="container">
	<form action="updateStudent" method = "post">
	<label class="text">StudentId</label>
	<br>
	<input class="filled" type="text" name = "id">
	<br><br>
	<label class="text">StudentName</label>
	<br>
	<input class="filled" type="text" name = "studentname">
	<br><br>
	<label class="text">StudentEmail</label>
	<br>
	<input class="filled" type="email" name = "mail">
	<br><br>
	<label class="text">StudentDegree</label>
	<br>
	<input class="filled" type="text" name = "degree">
	<br><br>
	<label class="text">teacherId</label>
	<br>
	<input class="filled" type="text" name = "teacherId">
	<br><br>
	<input class="foot" type="submit" value = "Update">
	<button class="foot"><a href="home.jsp">Home</a></button>
	<button class="foot"><a href="logout">Logout</a></button>
	</form>
	<br>
</div>
<br><br>	
</body>
</html>