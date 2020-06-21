package com.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Student;
import com.bean.StudentGrade;
import com.dao.l.StudentInterfaceDao;
import com.dao.lmpl.StudentInterfaceImplDao;
import com.db.DBUtil;
import com.service.I.StudentInterfaceBiz;


public class StudentInterfaceImplBiz implements StudentInterfaceBiz{
	Connection con=DBUtil.getConnection();
	StudentInterfaceDao stu=new StudentInterfaceImplDao();
	@Override
	public Student select(Student s) throws SQLException {
		return stu.select(s, con);
	}

	@Override
	public boolean insert(Student s) throws SQLException {
		return stu.insert(s, con);
	}

	@Override
	public boolean updata(Student s) throws SQLException {
		return stu.updata(s, con);
	}

	@Override
	public boolean delete(Student s) throws SQLException {
		return stu.delete(s, con);
	}

	@Override
	public Student showuserinfo(String username) throws SQLException {
		return stu.showuserinfo(username);
	}

	@Override
	public List<StudentGrade> stucj(String username) throws SQLException {
		return stu.stucj(username);
	}

	@Override
	public Student login(String username, String password) throws SQLException {
		
		return stu.login(username, password);
	}

}

