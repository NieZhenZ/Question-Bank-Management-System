package com.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.bean.BctAnswer;
import com.dao.l.BctAnswerInterfaceDao;
import com.dao.lmpl.BctAnswerInterfaceImplDao;
import com.service.I.BctAnswerInterfaceBiz;

public class BctAnswerInterfaceImplBiz implements BctAnswerInterfaceBiz {
              BctAnswerInterfaceDao bfc=new BctAnswerInterfaceImplDao();
	@Override
	public List<BctAnswer> select(String studentclass, String papername) throws SQLException {
		return bfc.select(studentclass, papername);
	}

}
