<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Teacher Details</title>
<link rel = "stylesheet" href="css/deleteTeacher.css">
</head>
<body>
<div class="head">
	Delete Teacher Details
</div>
<div class="container">
	<form action="deleteTeacher" method = "post"></form>
	<label class="text">Teacher Id </label>
	<br>
	<input class="filled" type="text" name = "id">
	<br><br>
	<input class="foot" type="submit" value = "Submit">

	<button class="foot"><a href="home.jsp">Home</a></button>

	<button class="foot"><a href="logout">Logout</a></button>
</div>
</form>
</body>
</html>