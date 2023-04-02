package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class UpdateTeacherController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		if ( httpSession.getAttribute("user") != null ) {
			
			int id = Integer.parseInt(req.getParameter("userid"));
			String name = req.getParameter("username"); 
			String email = req.getParameter("mail"); 
			String sub = req.getParameter("subject"); 
			
			Teacher teacher = new Teacher();
			
			teacher.setTeacherId(id);
			teacher.setTeacherName(name);
			teacher.setTeacherEmail(email);
			teacher.setTeacherSub(sub);
			
			TeacherStudentService service = new TeacherStudentService(); 
			
			int x = service.updateTeacher(teacher);  
			
			PrintWriter printWriter = resp.getWriter();
			
			printWriter.write("<html><body>");
			
			if ( x != 0 ) {
				
				printWriter.write("<h3 style = 'color : green'; >Data Update...Sucessfully</h3>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("insertTeacher.jsp"); 
				
				dispatcher.include(req, resp); 
			}else {
				
				printWriter.write("<h3 style = 'color:red' ; >Please check your data</h3>"); 
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("insertTeacher.jsp"); 
				
				dispatcher.include(req, resp); 
			}
			printWriter.write("</html></body>");
		}
	}
}
