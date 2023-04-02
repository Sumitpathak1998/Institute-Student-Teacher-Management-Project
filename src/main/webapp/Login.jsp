<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href = "css/adminLogin.css">
</head>
<body>
<div class="container">
	<h1 class="head">Admin Login</h1>
	<form class="adminlogin" action="adminLogin" method = "post">
	<br>
	<label class="text">UserName</label>
	<br><br>
	<input class="filed" type="text" name = "user">
	<br><br>
	<label class="text">Password</label>
	<br><br>
	<input class="filed" type="password" name = "pass">
	<br><br><br><br>
	<input class="sub" type="submit" value = "login">
	<br> 
</form>
</div>
</body>
</html>