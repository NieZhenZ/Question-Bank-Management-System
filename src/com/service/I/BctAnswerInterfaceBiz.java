package com.service.I;

import java.sql.SQLException;
import java.util.List;

import com.bean.BctAnswer;



public interface BctAnswerInterfaceBiz {

	public List<BctAnswer> select(String studentclass,String papername)throws SQLException;

}
