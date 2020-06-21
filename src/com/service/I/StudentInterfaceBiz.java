package com.service.I;

import java.sql.SQLException;
import java.util.List;

import com.bean.Student;
import com.bean.StudentGrade;

public interface StudentInterfaceBiz {
	public Student select(Student s)throws SQLException;
	public boolean insert(Student s)throws SQLException;
	public boolean updata(Student s)throws SQLException;
	public boolean delete(Student s)throws SQLException;
	public Student login(String username,String password)throws SQLException;
	public Student showuserinfo(String username)throws SQLException;
	public List<StudentGrade> stucj(String username)throws SQLException; 
}