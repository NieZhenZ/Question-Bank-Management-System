package com.dao.l;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Student;
import com.bean.StudentGrade;
import com.bean.Students;

public interface StudentInterfaceDao {
	public Student select(Student s,Connection con)throws SQLException;
	public boolean insert(Student s, Connection con)throws SQLException;
	public boolean updata(Student s,Connection con)throws SQLException;
	public boolean delete(Student s,Connection con)throws SQLException;//不可使用
	public boolean deleteid(Students s,Connection con)throws SQLException;
	public Student login(String username, String pwd) throws SQLException;
	public Student showuserinfo(String username)throws SQLException;
	public List<StudentGrade> stucj(String username)throws SQLException; 
}
