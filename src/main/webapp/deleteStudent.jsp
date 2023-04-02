<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/deleteStudent.css">
</head>
<body>
<div class="head">
	Delete Student Details 
</div>
<div class="container">
	<form action="deleteStudent" method = "post">
	<label class="text">StudentId</label>
	<br>
	<input class="filled" type="text" name = "id">
	<br><br>
	<input class="foot" type="submit" value = "Submit">
	<button class="foot"><a href = "home.jsp">Home</a></button>

	<button class="foot"><a href="logout">Logout</a></button>
	</form>
</div>	
</body>
</html>