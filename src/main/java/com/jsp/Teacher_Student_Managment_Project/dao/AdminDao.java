package com.jsp.Teacher_Student_Managment_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.Teacher_Student_Managment_Project.Connection.JdbcConnection;
import com.jsp.Teacher_Student_Managment_Project.dto.Admin;

public class AdminDao {

	public void insertAdmin(Admin admin) {
		
		String insert = "insert into admin values( ? , ? ,? )" ; 
		
		try {
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(insert); 
			
			preparedStatement.setInt(1, admin.getAdminId());
			preparedStatement.setString(2, admin.getAdminName());
			preparedStatement.setString(3, admin.getPassword());
			
			preparedStatement.execute(); 
			
			System.out.println("Data Insertd ...");
			
		}catch( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public int getById(int id) {
		
		String select = "select * from admin where adminId = ?";
		
		try {
			
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(select); 
			
			preparedStatement.setInt(1, id);
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			while(set.next()) {
				
				int id1 = set.getInt("adminId");
				return id1 ;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public void deleteAdmin(int id) {
		
		String delete = "delete from admin where adminId = ? " ; 
		
		try {
			
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(delete); 
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.execute();
			
			System.out.println("Data deleted ....");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public Admin checkDetails(Admin admin) {
		
		String select = "select * from admin where adminName = ? AND password = ? "; 
		
//		Connection connection = JdbcConnection.getConnection(); 
		try {
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(select); 
			
			preparedStatement.setString(1, admin.getAdminName());
			preparedStatement.setString(2, admin.getPassword());
			
			ResultSet set = preparedStatement.executeQuery();  
			
			
			
			while(set.next()) { 
			
				Admin admin2 = new Admin();
				
				String user = set.getString("adminName");
				String password = set.getString("password");
				
				admin2.setAdminName(user);
				admin2.setPassword(password);
			
				System.out.println(admin2.getAdminName());
				return admin2 ;
			}
			 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null; 
	}
}

 