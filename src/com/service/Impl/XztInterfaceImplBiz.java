package com.service.Impl;

import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;

import com.bean.Xzt;
import com.dao.l.XztInterfaceDao;
import com.dao.lmpl.XztInterfaceImplDao;
import com.db.DBUtil;
import com.service.I.XztInterfaceBiz;

public class XztInterfaceImplBiz implements XztInterfaceBiz {
	Connection con=DBUtil.getConnection();
	XztInterfaceDao xif=new XztInterfaceImplDao();
	@Override
	public boolean insert(Xzt xzt) throws SQLException {
		return xif.insert(xzt,con);
	}

	@Override
	public boolean delete(Xzt xzt) {
		return xif.delete(xzt);
	}

	@Override
	public boolean update(Xzt xzt) {
		return xif.update(xzt);
	}

	@Override
	public List<Xzt> select() {
		return xif.select();
	}

	@Override
	public List<Xzt> select(String questionpoint) {
		return xif.select(questionpoint);
	}

}
