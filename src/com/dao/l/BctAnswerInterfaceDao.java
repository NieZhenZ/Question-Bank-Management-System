package com.dao.l;

import java.util.List;

import com.bean.BctAnswer;

public interface BctAnswerInterfaceDao {
	
public List<BctAnswer> select(String studentclass,String papername);
public List<BctAnswer> selectwp(String studentclass,String papername);
public boolean insert(BctAnswer bctanswer);
}