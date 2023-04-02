<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student Details</title>
<link rel = "stylesheet" href = "css/insertStudent.css">
</head>
<body>
<header>
	<h1 class="head">Student Registration Form</h1>
</header>
<section class="container">
	<form action="insertStudent" method = "post">
	<label class="text">StudentId</label>
	<br>
	<input class = "filled" type="text" name = "id">
	<br><br>
	<label class="text">StudentName</label>
	<br>
	<input class="filled" type="text" name = "studentname">
	<br><br>
	<label class="text">StudentEmail</label>
	<br>
	<input class="filled"  type="email" name = "mail">
	<br><br>
	<label class="text">StudentDegree</label>
	<br>
	<input class="filled" type="text" name = "degree">
	<br><br>
	<label class="text">teacherId</label>
	<br>
	<input class="filled" type="text" name = "teacherId">
	<br><br>
	<input class="foot" type="submit" value = "Register">

	<button class="foot"><a href="home.jsp">Home</a></button>

	<button class="foot"><a href="logout">Logout</a></button>
	
	<br><br>
	</form>
</section>	
<br><br>
</body>
</html>