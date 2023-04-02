package com.jsp.Teacher_Student_Managment_Project.Service;

import java.util.List;

import com.jsp.Teacher_Student_Managment_Project.dao.StudentTeacherDao;
import com.jsp.Teacher_Student_Managment_Project.dto.Student;
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class TeacherStudentService {

	StudentTeacherDao dao = new StudentTeacherDao(); 
	
	public Teacher insertTeacher(Teacher teacher) 
	{
		return dao.insertTeacher(teacher); 
	}
	public Student insertStudent(Student student) 
	{
		return dao.insertStudent(student); 
	}
	public int deleteTeacher(int id) 
	{
		int id1 = dao.getByIdTeacher(id); 
		if (id1 == id) 
		{
			return dao.deleteTeacher(id);
		}else {
			return 0 ; 
		}
	}
	public int deleteStudent(int id) 
	{
		int id1 = dao.getByIdStudent(id); 
		System.out.println(id1);
		if (id1 == id) 
		{
			int x =  dao.deleteStudent(id);
			return x ; 
		}else {
			return 0 ; 
		} 
	}
	public int updateTeacher(Teacher teacher) 
	{
		int id = dao.getByIdTeacher(teacher.getTeacherId());
		System.out.println(id);
		if ( id == teacher.getTeacherId()) 
		{
			return dao.updateTeacher(teacher); 
		}else {
			return 0 ; 
		}
	}
	public int updateStudent(Student student) 
	{
		int id = dao.getByIdStudent(student.getStudentId()); 
		if ( id == student.getStudentId()) 
		{
			return dao.updateStudent(student); 
		}else {
			return 0 ; 
		}
	}
	public List<Teacher> displayTeacher()
	{
		return dao.displayTeacher(); 
	}
	public List<Student> displayStudent()
	{
		return dao.displayStudent(); 
	}
	public List<Student> displayTeacherStudent(int id)
	{
		int id1 = dao.getByIdTeacher(id); 
		if ( id1 == id) 
		{
			return dao.displayTeacherStudent(id); 
		}else {
			return null ; 
		}
	}
}
