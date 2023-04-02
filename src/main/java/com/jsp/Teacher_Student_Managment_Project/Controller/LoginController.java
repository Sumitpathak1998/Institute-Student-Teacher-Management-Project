package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.jsp.Teacher_Student_Managment_Project.Service.AdminService;
import com.jsp.Teacher_Student_Managment_Project.dto.Admin;

public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); 
		
		String username = req.getParameter("user"); 
		String password = req.getParameter("pass"); 
		
		AdminService service = new AdminService();
		
		Admin admin = new Admin(); 
		
		admin.setAdminName(username);
		admin.setPassword(password);
		
		Admin admin2 = service.checkDetails(admin); 
		
		System.out.println(admin2.getAdminName());
		System.out.println(admin2.getPassword());
		
		PrintWriter printWriter = resp.getWriter(); 
		
		printWriter.write("<html><body>");
		
		if( username.equalsIgnoreCase(admin2.getAdminName()) && password.equalsIgnoreCase(admin2.getPassword())) 
		{
			httpSession.setAttribute("user", username);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp"); 
		
			dispatcher.forward(req, resp);
		}else {
			printWriter.write("<h3>Check your Credential</h3>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp"); 
			
			dispatcher.include(req, resp); 
		}
		printWriter.write("</body></html>"); 
	}
}
