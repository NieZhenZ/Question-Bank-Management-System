package com.service.I;

import java.sql.SQLException;
import java.util.List;

import com.bean.Paper;

public interface PaperInterfaceBiz {
	/**
	 * 增加一张试卷
	 * @param paper
	 * @return
	 */
	public boolean insert(Paper paper);
	public boolean insertname(Paper paper)throws SQLException;
	public boolean insertxz(Paper paper)throws SQLException;
	public boolean insertk(Paper paper)throws SQLException;
	public boolean insertbc(Paper paper)throws SQLException;
	/**
	 * 删除一张试卷
	 * @param paper
	 * @return
	 */
	public boolean delete(Paper paper);
	
	/**
	 * 更新修改一张试卷
	 * @param paper
	 * @return
	 */
//	public boolean update(Paper paper);
	
	/**
	 * 查询全部试卷
	 * @param 无
	 * @return  Paper 试卷集合
	 */
	public List<Paper> select();
	
	/**
	 * 按知识点查询试卷
	 * @param questionpoint
	 * @return  Paper 试卷集合
	 */
	public List<Paper> select(String questionpoint);
	public List<Paper> showbeforePaper(String username);
	public List<Paper> showafterPaper(String username);
	public List<Paper> shownowPaper(String username);
	
	/**
	 * 根据试卷名查找当前对应的试卷对象
	 * @param papername
	 * @return  Paper 对象
	 */
	public Paper selectInstance(String papername);
}
