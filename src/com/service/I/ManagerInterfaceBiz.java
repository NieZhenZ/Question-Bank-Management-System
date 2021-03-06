package com.service.I;

import java.sql.SQLException;
import java.util.List;

import com.bean.Manager;
import com.bean.Teacher;

public interface ManagerInterfaceBiz {
	public Manager select(Manager m)throws SQLException;
	public List<Teacher> select()throws SQLException;
	public boolean insert(Teacher t)throws SQLException;
	public boolean delete(String teachername)throws SQLException;
	public Manager login(String username,String password)throws SQLException;
}