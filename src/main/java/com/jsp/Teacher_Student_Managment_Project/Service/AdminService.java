package com.jsp.Teacher_Student_Managment_Project.Service;

import java.util.List;

import com.jsp.Teacher_Student_Managment_Project.dao.AdminDao;
import com.jsp.Teacher_Student_Managment_Project.dto.Admin;

public class AdminService {

	AdminDao dao = new AdminDao(); 
	
	public void insertAdmin(Admin admin) 
	{
		dao.insertAdmin(admin);
	}
	public void deleteAdmin(int id) 
	{
		int id1 = dao.getById(id); 
		if ( id1 == id ) {
			dao.deleteAdmin(id);
		}else {
			System.out.println("Please check the entered data");  
		}
	}
	public Admin checkDetails(Admin admin)
	{
		return dao.checkDetails(admin); 
	}
}
