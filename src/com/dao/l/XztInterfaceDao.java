package com.dao.l;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Xzt;



/**
 * ѡ�������ݿ�ӿ���
 *
 */
public interface XztInterfaceDao {
	public boolean insert(Xzt xzt, Connection con)throws SQLException;
	public boolean delete(Xzt xzt);
	boolean update(Xzt xzt);
	public List<Xzt> select();
	public List<Xzt> select(String questionpoint);
}