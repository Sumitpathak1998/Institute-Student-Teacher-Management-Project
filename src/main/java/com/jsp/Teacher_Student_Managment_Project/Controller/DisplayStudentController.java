package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.Teacher_Student_Managment_Project.Service.TeacherStudentService;
import com.jsp.Teacher_Student_Managment_Project.dto.Student;
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class DisplayStudentController extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		if( httpSession.getAttribute("user")!= null) {
			
			TeacherStudentService service = new TeacherStudentService(); 
			
			List<Student> list = service.displayStudent(); 
			
			System.out.println(list);
			PrintWriter printWriter = resp.getWriter(); 
			
			printWriter.write("<html>");
			
			printWriter.write("<head>");
			
			printWriter.write("<title>Display</title>");
			
			printWriter.write("<link rel = 'stylesheet' href = 'css/displayStudent.css'>");
			
			printWriter.write("</head>");
			
			printWriter.write("<body>"); 
			
			printWriter.write("<div class = 'head'>"); 
			
			printWriter.write("Institute Student's Details"); 
			
			printWriter.write("</div>"); 
			
			printWriter.write("<table class = 'container' border = '1' cellpadding = 10px >");
			
			printWriter.write("<tr class = 'main'><td>StudentId</td><td>StudentName</td><td>StudentEmail</td><td>StudentDegree</td><td>TeacherId</td></tr>");
		
			for( Student student : list) {
				
				printWriter.write("<tr class = 'main'>");
				printWriter.write("<td>"+student.getStudentId()+"</td>"); 
				printWriter.write("<td>"+student.getStudentName()+"</td>"); 
				printWriter.write("<td>"+student.getStudentEmail()+"</td>");
				printWriter.write("<td>"+student.getStudentDegree()+"</td>"); 
				printWriter.write("<td>"+student.getTeacher().getTeacherId()+"</td>");
				printWriter.write("</tr>"); 
			}
			
			printWriter.write("</table>");
			
			printWriter.write("</body></html>"); 
		}
	}
}
