package com.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bean.Tkt;
import com.dao.l.TktInterfaceDao;
import com.dao.lmpl.TktInterfaceImplDao;
import com.db.DBUtil;
import com.service.I.TktInterfaceBiz;

public class TktInterfaceImplBiz implements TktInterfaceBiz {
	Connection con=DBUtil.getConnection();
	TktInterfaceDao tif= new TktInterfaceImplDao();
	@Override
	public boolean insert(Tkt tkt)throws SQLException  {
		return tif.insert(tkt,con);
	}

	@Override
	public boolean delete(Tkt tkt) {
		return tif.delete(tkt);
	}

	@Override
	public boolean update(Tkt tkt) {
		return tif.update(tkt);
	}

	@Override
	public List<Tkt> select() {
		return tif.select();
	}

	@Override
	public List<Tkt> select(String questionpoint) {
		return tif.select(questionpoint);
	}

}
