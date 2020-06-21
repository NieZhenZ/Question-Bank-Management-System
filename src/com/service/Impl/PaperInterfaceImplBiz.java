package com.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.bean.Paper;
import com.dao.l.PaperInterfaceDao;
import com.dao.lmpl.PaperInterfaceImplDao;
import com.service.I.PaperInterfaceBiz;

public class PaperInterfaceImplBiz implements PaperInterfaceBiz {
PaperInterfaceDao pif=new PaperInterfaceImplDao();
	@Override
	public boolean insert(Paper paper) {
		return pif.insert(paper);
	}

	@Override
	public boolean delete(Paper paper) {
		return pif.delete(paper);
	}

	@Override
	public List<Paper> select() {
		return pif.select();
	}

	@Override
	public List<Paper> select(String questionpoint) {
		return pif.select(questionpoint);
	}

	@Override
	public List<Paper> showbeforePaper(String username) {
		return pif.showbeforePaper(username);
	}

	@Override
	public List<Paper> showafterPaper(String username) {
		return pif.showafterPaper(username);
	}

	@Override
	public List<Paper> shownowPaper(String username) {
		return pif.shownowPaper(username);
	}

	@Override
	public Paper selectInstance(String papername) {

		return pif.selectInstance(papername);
	}

	@Override
	public boolean insertname(Paper paper) throws SQLException {
		return pif.insert(paper);
	}
	public boolean insertxz(Paper paper) throws SQLException {
		return pif.insert(paper);
	}
	public boolean insertk(Paper paper) throws SQLException {
		return pif.insert(paper);
	}
	public boolean insertbc(Paper paper) throws SQLException {
		return pif.insert(paper);
	}
}
