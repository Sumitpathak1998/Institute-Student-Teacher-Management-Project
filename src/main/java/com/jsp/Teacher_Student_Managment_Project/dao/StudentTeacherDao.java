package com.jsp.Teacher_Student_Managment_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.Teacher_Student_Managment_Project.Connection.JdbcConnection;
import com.jsp.Teacher_Student_Managment_Project.dto.Student;
import com.jsp.Teacher_Student_Managment_Project.dto.Teacher;

public class StudentTeacherDao {

	public Teacher insertTeacher(Teacher teacher) {
	
		Connection connection = JdbcConnection.getConnection(); 
		
		String insert = "insert into teacher values (?,?,?,?)" ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert); 
			
			preparedStatement.setInt(1,teacher.getTeacherId());
			preparedStatement.setString(2, teacher.getTeacherName());
			preparedStatement.setString(3, teacher.getTeacherEmail());
			preparedStatement.setString(4, teacher.getTeacherSub());
			
			preparedStatement.execute(); 
			
			return teacher ; 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null ; 
	}
	public Student insertStudent(Student student) {
		
		Connection connection = JdbcConnection.getConnection(); 
		
		String insert = "insert into student values(?,?,?,?,?)" ; 
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert); 
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setString(4, student.getStudentDegree());
			preparedStatement.setInt(5, student.getTeacher().getTeacherId());
			
			preparedStatement.execute(); 
			
			return student ; 
		}catch ( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null ; 
	}
	public int getByIdTeacher(int id){
		
		Connection connection = JdbcConnection.getConnection();
		
		String select = "select * from teacher where teacherId = ? ";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(select); 
			
			preparedStatement.setInt(1, id);
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			while(set.next()) {
			
				int id1 = set.getInt("teacherId"); 
				System.out.println(id1);
				return  id1 ;
			} 
		}catch ( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch ( SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public int getByIdStudent(int id){
		
		Connection connection = JdbcConnection.getConnection();
		
		String select = "select * from student where studentId = ?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(select); 
			
			preparedStatement.setInt(1,id);
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			while(set.next()) {
				int id1 = set.getInt("studentId");
				return id1 ; 
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public int deleteTeacher(int id) {
		
		Connection connection = JdbcConnection.getConnection(); 
		
		String delete = "delete from teacher where teacherId = ? "; 
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(delete); 
			
			preparedStatement.setInt(1,id);
			
			int x = preparedStatement.executeUpdate(); 
			
			return x ; 
			
		}catch( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public int deleteStudent(int id) {
		
		Connection connection = JdbcConnection.getConnection(); 
		
		String delete = "delete from student where studentId = ?"; 
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(delete); 
			
			preparedStatement.setInt(1, id);
			
			int x = preparedStatement.executeUpdate(); 
			
			return x ; 
			
		}catch( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public int updateTeacher(Teacher teacher) {
		
		Connection connection = JdbcConnection.getConnection(); 
		
		String update = "update teacher set teacherName = ? , teacherEmail = ? , teacherSubject = ? where teacherId = ? "; 
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(update); 
			
			preparedStatement.setString(1, teacher.getTeacherName());
			preparedStatement.setString(2, teacher.getTeacherEmail());
			preparedStatement.setString(3, teacher.getTeacherSub());
			preparedStatement.setInt(4, teacher.getTeacherId());
			
			int x = preparedStatement.executeUpdate();
			
			return x ; 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public int updateStudent(Student student) {
		
		Connection connection = JdbcConnection.getConnection(); 
		
		String update = "update student set studentName = ? , studentEmail = ? , studentDegree = ? , teacherId = ? where studentId = ? " ; 
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(update); 
			
			preparedStatement.setString(1, student.getStudentName());
			preparedStatement.setString(2, student.getStudentEmail());
			preparedStatement.setString(3, student.getStudentDegree());
			preparedStatement.setInt(4, student.getTeacher().getTeacherId());
			preparedStatement.setInt(5, student.getStudentId());
			
			int x = preparedStatement.executeUpdate(); 
			
			return x ; 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ; 
	}
	public List<Teacher> displayTeacher(){
		
		String select = "select * from teacher" ; 
		
		try {
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(select);
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			List<Teacher> l1 = new ArrayList<Teacher>();
			
			while(set.next()) {
				
				Teacher teacher = new Teacher(); 
				
				teacher.setTeacherId(set.getInt("teacherId"));
				teacher.setTeacherName(set.getString("teacherName"));
				teacher.setTeacherEmail(set.getString("teacherEmail"));
				teacher.setTeacherSub(set.getString("teacherSubject"));
				
				l1.add(teacher); 
			}
			return l1 ; 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null ; 
	}
	public List<Student> displayStudent(){
		
		String select = "select * from student" ; 
		
		try {
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(select); 
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			List<Student> l1 = new ArrayList<Student>();
			
			while(set.next()) {
				
				Student student = new Student(); 
				Teacher teacher = new Teacher(); 
				
				student.setStudentId(set.getInt("studentId"));
				student.setStudentName(set.getString("studentName"));
				student.setStudentEmail(set.getString("studentEmail"));
				student.setStudentDegree(set.getString("studentDegree"));
				teacher.setTeacherId(set.getInt("teacherId"));
				student.setTeacher(teacher);
				
				l1.add(student); 
			}
			
			return l1 ; 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null ; 
	}
	public List<Student> displayTeacherStudent(int id){
		
		String select = "select * from teacher natural join student where teacherId = ? ";
		
		String select1 = "select teacher.* , student.* from teacher,student where teacher.teacherId = student.teacherId and teacher.teacherId = ?" ; 
		
		try {
			PreparedStatement preparedStatement = JdbcConnection.getConnection().prepareStatement(select1); 
			
			preparedStatement.setInt(1, id);

			List<Student> l1 = new ArrayList<Student>(); 
			
			ResultSet set = preparedStatement.executeQuery(); 
			
			while(set.next()) {
				
				Student student = new Student(); 
				Teacher teacher = new Teacher(); 
				
				teacher.setTeacherId(set.getInt("teacherId"));
				teacher.setTeacherName(set.getString("teacherName"));
				teacher.setTeacherEmail(set.getString("teacherEmail"));
				teacher.setTeacherSub(set.getString("teacherSubject"));
				
				student.setStudentId(set.getInt("studentId"));
				student.setStudentName(set.getString("studentName"));
				student.setStudentEmail(set.getString("studentEmail"));
				student.setStudentDegree(set.getString("studentDegree"));
				student.setTeacher(teacher);
				
				l1.add(student); 
			}
			
			return l1 ; 
		}catch ( SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcConnection.getConnection().close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null ; 
	}
}
