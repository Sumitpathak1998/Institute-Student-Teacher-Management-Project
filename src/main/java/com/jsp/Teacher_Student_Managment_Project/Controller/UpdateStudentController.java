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
import com.jsp.Teacher_Student_Managment_Project.dto.Student;
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class UpdateStudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		if ( httpSession.getAttribute("user") != null ) {
			
			int id = Integer.parseInt(req.getParameter("id")); 
			String name = req.getParameter("studentname");
			String email = req.getParameter("mail"); 
			String degree = req.getParameter("degree"); 
			int teacherId = Integer.parseInt(req.getParameter("teacherId")); 
			
			Student student = new Student();
			
			Teacher teacher = new Teacher(); 
			
			teacher.setTeacherId(teacherId);
			
			student.setStudentId(id);
			student.setStudentName(name);
			student.setStudentEmail(email);
			student.setStudentDegree(degree);
			student.setTeacher(teacher);
			
			TeacherStudentService service = new TeacherStudentService();
			
			int x = service.updateStudent(student); 
			
			PrintWriter printWriter = resp.getWriter(); 
			
			printWriter.write("<html><body>");
			
			if ( x != 0 ) {
				
				printWriter.write("<h3 style = 'color : green' ;>Student Data Update ....Successfully</h3>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("updateStudent.jsp"); 
				
				dispatcher.include(req, resp); 
			}else {
				printWriter.write("<h3 style = 'color : red' ;>Please check the inserted Data</h3>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("updateStudent.jsp"); 
				
				dispatcher.include(req, resp);
			}
		}
	}
}
