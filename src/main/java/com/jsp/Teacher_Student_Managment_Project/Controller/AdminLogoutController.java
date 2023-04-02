package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogoutController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().invalidate();
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp"); 
		
		dispatcher.include(req, resp);
	}

}
