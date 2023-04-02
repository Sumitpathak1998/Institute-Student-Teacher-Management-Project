<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Details</title>
<link rel = "stylesheet" href = "css/updateTeacher.css">
</head>
<body>
<div class="head">
	Update Teacher Details
</div>
<div class="container">
	<form action="updateTeacher" method = "post">
	<label class="text" for = "teacher">TeacherId</label>
	<br>
	<input class="filled" type="text" name = "userid" id = "teacher">&nbsp;&nbsp;
	<br><br>
	<label class="text" for = "name">Name</label>
	<br>
	<input class="filled" type="text" name = "username" id = "name">&nbsp;&nbsp;
	<br><br>
	<label class="text" for = "mail">Email</label>
	<br>
	<input class="filled" type="email" name = "mail" id = "mail">&nbsp;&nbsp;
	<br><br>
	<label class="text" for = "sub">Subject</label>
	<br>
	<input class="filled" type="text" name = "subject" id = "sub">&nbsp;&nbsp;
	<br><br>
	<input class="foot" type="submit" value = "Update">
	<button class="foot"><a href="home.jsp">Home</a></button>
	<button class="foot"><a href="logout">Logout</a></button> 	
	</form>
	<br><br>
</div>
<br><br>
</body>
</html>