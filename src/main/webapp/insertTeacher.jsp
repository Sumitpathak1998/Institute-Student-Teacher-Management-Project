<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Teacher Details</title>
<link rel = "stylesheet" href = "css/insertTeacher.css">
</head>
<body>
<header class="head">
	<h1 class="head">Teacher Registration Form</h1>
</header>
<section class="container">
	<form  name = "main" action="insertTeacher" method = "post">
	<label for = "teacher" class="text">TeacherId</label>
	<br>
	<input  class="filled" type="text" name = "userid" id = "teacher">&nbsp;&nbsp;
	<br><br>
	<label for = "name" class="text">Name</label>
	<br>
	<input class="filled" type="text" name = "username" id = "name">&nbsp;&nbsp;
	<br><br>
	<label for = "mail" class="text">Email</label>
	<br>
	<input class="filled" type="email" name = "mail" id = "mail">&nbsp;&nbsp;
	<br><br>
	<label for = "sub" class="text">Subject</label>
	<br>
	<input class="filled" type="text" name = "subject" id = "sub">&nbsp;&nbsp;
	<br><br>
	<input type="submit" value = "Register" class="foot">&nbsp;&nbsp;
	
	<button class="foot"><a href="home.jsp" >Home</a></button>
	
	<button class="foot"><a href="logout">Logout</a></button>
	<br><br>
	</form>
</section>	
</body>
</html>