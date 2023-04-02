package com.jsp.Teacher_Student_Managment_Project.Controller;

import java.util.Scanner;

import com.jsp.Teacher_Student_Managment_Project.Service.AdminService;
import com.jsp.Teacher_Student_Managment_Project.dto.Admin;

public class AdminController {

	public static void main(String[] args) {
		
		AdminService service = new AdminService(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. For Insert Admin \n2. For Delete Admin");
		int select = sc.nextInt(); 
		switch(select) {
		case 1 : {
			Admin admin = new Admin();
			System.out.println("Enter the Admin Id");
			int id = sc.nextInt();
			System.out.println("Enter the Admin UserName");
			String name = sc.next();
			name += sc.nextLine(); 
			System.out.println("Enter the Password");
			String password = sc.next(); 
			
			admin.setAdminId(id);
			admin.setAdminName(name);
			admin.setPassword(password);
			
			service.insertAdmin(admin);
			
		}break; 
		case 2:{
			System.out.println("Enter the Id for delete the Admin Details");
			int id = sc.nextInt(); 
			
			service.deleteAdmin(id);
		}break; 
		}
	}
}
