<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<link rel = "stylesheet" href="css/display.css">
</head>
<body>
<div class="head">
	Display Student Under Each Teacher
</div>
<div class="container">
	<form action="teacheraccostudent" method="get">
	<label class="text">TeacherId</label>
	<br>
	<input class="filled" type="text" name = "id">
	<br><br>
	<input class="foot" type="submit" value = "Display">
	<button class="foot"><a href="home.jsp">Home</a></button>
	<button class="foot"><a href="logout">Logout</a></button>
	</form>
	<br>
</div>
<br><br>
</body>
</html>