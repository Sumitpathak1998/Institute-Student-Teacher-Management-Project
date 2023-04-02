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
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class DisplayTeacherController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		if ( httpSession.getAttribute("user") != null ) {
			
			TeacherStudentService service = new TeacherStudentService(); 
			
			List<Teacher> list = service.displayTeacher(); 
			
			PrintWriter printWriter = resp.getWriter(); 
			
			printWriter.write("<html><head>");
			
			printWriter.write("<title>Teacher Details</title>");
			
			printWriter.write("<link rel = 'stylesheet' href = 'css/displayTeacher.css'>"); 
			
			printWriter.write("</head>");
			
			printWriter.write("<body>");
			
			printWriter.write("<div class = 'head'>"); 
			
			printWriter.write("Institute Teacher's Details");
			
			printWriter.write("</div>");
			
			printWriter.write("<table class = 'container' border = '1' cellpadding = 20px >");
			
			printWriter.write("<tr class = 'main'><td>TeacherId</td><td>TeacherName</td><td>TeacherEmail</td><td>TeacherSubject</td></tr>");
			
			for ( Teacher teacher : list ) {
				
				printWriter.write("<tr class = 'main'>");
				printWriter.write("<td>"+teacher.getTeacherId()+"</td>");
				printWriter.write("<td>"+teacher.getTeacherName()+"</td>");
				printWriter.write("<td>"+teacher.getTeacherEmail()+"</td>");
				printWriter.write("<td>"+teacher.getTeacherSub()+"</td>");
				printWriter.write("</tr>");
			}
			printWriter.write("</table>");
			
			printWriter.write("</body></html>");
		}
	}
}
