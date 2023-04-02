<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-Teacher Home Page</title>
<link rel = "stylesheet" href="css/home.css">
</head>
<body>
<header class="head">
		<h2>Welcome to Teacher Student Management Page</h2>
</header>
<section class="container">
	<article class="content">
	<a  href="insertTeacher.jsp"><button class="main">InsertTeacher</button></a>

 	<a  href="insertStudent.jsp"><button class="main">InsertStudent</button></a>

	</article>
	<article class="content">
	<a  href="deleteTeacher.jsp"><button class="main">DeleteTeacher</button></a>

	<a  href ="deleteStudent.jsp"><button class="main">DeleteStudent</button></a>
	
	</article>
	<article class="content">
	<a  href="updateTeacher.jsp"><button class="main">UpdateTeacher</button></a>

	<a  href="updateStudent.jsp"><button class="main">UpdateStudent</button></a>

	</article>
	<article class="content">
	<a  href="displayTeacher"><button class="main">DisplayTeacher</button></a>

	<a  href="displayStudent"><button class="main">DisplayStudent</button></a>

	<a  href="displayStudentTeacher.jsp"><button class="main">See Number of Student</button></a>
	 
	</article>
	<br>
	<a  href="logout"><button class="foot" >Logout</button></a>
</section>
</body>
</html>