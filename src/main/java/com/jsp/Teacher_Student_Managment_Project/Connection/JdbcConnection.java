package com.jsp.Teacher_Student_Managment_Project.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static Connection getConnection() 
	{
		try {
			//Step-1 (load the Driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish a Connection
			String url = "jdbc:mysql://localhost:3306/student-teacher";
			String username = "root" ; 
			String password = "root" ; 
			
			Connection connection = DriverManager.getConnection(url, username, password); 
			
			return connection ; 
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return null ;  
	}
}
