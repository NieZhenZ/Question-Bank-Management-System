package com.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Student;
import com.bean.Teacher;
import com.dao.l.TeacherInterfaceDao;
import com.dao.lmpl.TeacherInterfaceImplDao;
import com.db.DBUtil;
import com.service.I.TeacherInterfaceBiz;

public class TeacherInterfaceImplBiz implements TeacherInterfaceBiz {
	TeacherInterfaceDao ti=new TeacherInterfaceImplDao();
	Connection con=DBUtil.getConnection();
	@Override
	public Teacher select(Teacher t) throws SQLException {
		return ti.select(t, con);
	}

	@Override
	public List<Student> select(String sc) throws SQLException {
		return ti.select(sc, con);
	}

	@Override
	public boolean insert(Student s) throws SQLException {
		return ti.insert(s, con);
	}

	@Override
	public boolean updata(Teacher t) throws SQLException {
		return ti.updata(t, con);
	}

	@Override
	public boolean delete(String studentname,String studentclass) throws SQLException {
		return ti.delete(studentname,studentclass, con);
	}

	@Override
	public Teacher login(String username, String password) throws SQLException {
		return ti.login(username, password);
	}

}
