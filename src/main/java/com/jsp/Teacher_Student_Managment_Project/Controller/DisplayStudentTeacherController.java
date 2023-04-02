package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.Teacher_Student_Managment_Project.Service.TeacherStudentService;
import com.jsp.Teacher_Student_Managment_Project.dto.Student;

public class DisplayStudentTeacherController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		if ( httpSession.getAttribute("user") != null) {
			
			int id = Integer.parseInt(req.getParameter("id")); 
			
			TeacherStudentService service = new TeacherStudentService(); 
			
			List<Student> list = service.displayTeacherStudent(id); 
			
			PrintWriter printWriter = resp.getWriter(); 
			
			printWriter.write("<html>");
			
			printWriter.write("<head>");
			
			printWriter.write("<title>Display</title>");
			
			printWriter.write("<link rel = 'stylesheet' href = 'css/displayStudentTeacher.css'>"); 
			
			printWriter.write("</head>");
			
			printWriter.write("<body>");
			
			printWriter.write("<div class = 'head'>");
			
			printWriter.write("Student Under Teacher Id "+id);
			
			printWriter.write("</div>"); 
			
			printWriter.write("<table class = 'container' border = '1' cellpadding = 10px >");
			
			printWriter.write("<tr class = 'main'><td>StudentId</td><td>StudentName</td><td>StudentEmail</td><td>StudentDegree</td><td>TeacherId</td><td>TeacherName</td><td>TeacherEmail</td><td>TeacherSubject</td></tr>");
			
			for ( Student student : list) {
			
				printWriter.write("<tr class = 'main'>"); 
				printWriter.write("<td>"+student.getStudentId()+"</td>");
				printWriter.write("<td>"+student.getStudentName()+"</td>");
				printWriter.write("<td>"+student.getStudentEmail()+"</td>");
				printWriter.write("<td>"+student.getStudentDegree()+"</td>");
				printWriter.write("<td>"+student.getTeacher().getTeacherId()+"</td>");
				printWriter.write("<td>"+student.getTeacher().getTeacherName()+"</td>");
				printWriter.write("<td>"+student.getTeacher().getTeacherEmail()+"</td>");
				printWriter.write("<td>"+student.getTeacher().getTeacherSub()+"</td>");
				printWriter.write("</tr>"); 
				
			}
			printWriter.write("</table>");
			
			printWriter.write("</body></html>"); 
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("displayStudentTeacher.jsp"); 
			
			dispatcher.include(req, resp);
			
		}
	}
}
