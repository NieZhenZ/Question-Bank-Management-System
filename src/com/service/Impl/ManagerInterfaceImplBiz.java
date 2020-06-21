package com.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Manager;
import com.bean.Teacher;
import com.dao.l.ManagerInterfaceDao;
import com.dao.lmpl.ManagerInterfaceImplDao;
import com.db.DBUtil;
import com.service.I.ManagerInterfaceBiz;

public class ManagerInterfaceImplBiz implements ManagerInterfaceBiz {
	ManagerInterfaceDao mi=new ManagerInterfaceImplDao();
	Connection con=DBUtil.getConnection();
	@Override
	public Manager select(Manager m) throws SQLException {
		return mi.select(m, con);
	}

	@Override
	public List<Teacher> select() throws SQLException {
		return mi.select(con);
	}

	@Override
	public boolean insert(Teacher t) throws SQLException {
		return mi.insert(t, con);
	}

	@Override
	public boolean delete(String teachername) throws SQLException {
		return mi.delete(teachername, con);
	}

	@Override
	public Manager login(String username, String password) throws SQLException {
		return mi.login(username, password);
	}

}
