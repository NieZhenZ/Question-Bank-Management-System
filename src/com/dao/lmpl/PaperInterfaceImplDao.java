package com.dao.lmpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bean.Paper;
import com.dao.l.PaperInterfaceDao;
import com.db.DBUtil;

public class PaperInterfaceImplDao implements PaperInterfaceDao{
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	public boolean insert(Paper paper) {
		 String sql="insert into  paper values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	        try {
				pst=con.prepareStatement(sql);			
	        	pst.setDate(1, (java.sql.Date)paper.getStarttime());
				pst.setDate(2, (java.sql.Date)paper.getEndtime());
				pst.setString(3, paper.getPapername());
				pst.setInt(4, paper.getXzt1());
				pst.setInt(5, paper.getXzt2());
				pst.setInt(6, paper.getXzt3());
				pst.setInt(7, paper.getXzt3());
				pst.setInt(8, paper.getXzt4());
				pst.setInt(9, paper.getXzt5());

				
				pst.setInt(15, paper.getTkt1());
				pst.setInt(16, paper.getTkt2());
				pst.setInt(17, paper.getTkt3());
				pst.setInt(18, paper.getTkt4());
				
				pst.setInt(20, paper.getBct1());
				pst.setInt(21, paper.getBct2());				
				int n=pst.executeUpdate();		
				if(n>0) {
					b=true;
				}
	        	} catch (SQLException e) {
					e.printStackTrace();
				}
	        finally {
				DBUtil.CloseConnection(rs, pst, con);
			}
			return b;
	}

	@Override
	public boolean delete(Paper paper) {
		String sql = "delete from paper  where id = ? ";
		try {
		pst=con.prepareStatement(sql);
		pst.setInt(1, paper.getId());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return b;
	}

	//@Override
	//public boolean update(Paper paper) {
		
	//}

	@Override
	public List<Paper> select() {
		Paper pap=null;
		List<Paper> list  = new ArrayList<Paper>();	
		String sql = "select * from paper";
		try {
			
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				pap=new Paper();
				pap.setId(rs.getInt(1));
				pap.setStarttime(rs.getDate(2));
				pap.setEndtime(rs.getDate(3));
				pap.setPapername(rs.getString(4));
				pap.setXzt1(rs.getInt(5));
				pap.setXzt2(rs.getInt(6));
				pap.setXzt3(rs.getInt(7));
				pap.setXzt4(rs.getInt(8));
				pap.setXzt5(rs.getInt(9));

				
				
				pap.setTkt1(rs.getInt(10));
				pap.setTkt2(rs.getInt(11));
				pap.setTkt3(rs.getInt(12));
				pap.setTkt4(rs.getInt(13));
			
				pap.setBct1(rs.getInt(14));
				pap.setBct2(rs.getInt(15));
				
				list.add(pap);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

	@Override
	public List<Paper> select(String questionpoint) {
		Paper pap=null;
		List<Paper> list  = new ArrayList<Paper>();	
		String sql = "select * from paper where questionpoint=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, questionpoint);
			rs = pst.executeQuery();
			while(rs.next()) {
				pap=new Paper();
				pap.setId(rs.getInt(1));
				pap.setStarttime(rs.getDate(2));
				pap.setEndtime(rs.getDate(3));
				pap.setPapername(rs.getString(4));
				pap.setXzt1(rs.getInt(5));
				pap.setXzt2(rs.getInt(6));
				pap.setXzt3(rs.getInt(7));
				pap.setXzt4(rs.getInt(8));
				pap.setXzt5(rs.getInt(9));

				
				
				pap.setTkt1(rs.getInt(10));
				pap.setTkt2(rs.getInt(11));
				pap.setTkt3(rs.getInt(12));
				pap.setTkt4(rs.getInt(13));
			
				pap.setBct1(rs.getInt(14));
				pap.setBct2(rs.getInt(15));
				
				list.add(pap);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

	@Override
	public List<Paper> showbeforePaper(String username) {
		//已经结束的考试
		List<Paper> before=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper pap=null;
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
				 pap=new Paper();
					pap.setId(rs.getInt(1));
					pap.setStarttime(rs.getDate(2));
					pap.setEndtime(rs.getDate(3));
					pap.setPapername(rs.getString(4));
					pap.setXzt1(rs.getInt(5));
					pap.setXzt2(rs.getInt(6));
					pap.setXzt3(rs.getInt(7));
					pap.setXzt4(rs.getInt(8));
					pap.setXzt5(rs.getInt(9));

					
					
					pap.setTkt1(rs.getInt(10));
					pap.setTkt2(rs.getInt(11));
					pap.setTkt3(rs.getInt(12));
					pap.setTkt4(rs.getInt(13));
				
					pap.setBct1(rs.getInt(14));
					pap.setBct2(rs.getInt(15));
					
				if (pap.getEndtime().toString().compareTo(d) < 0||IsDone(username,pap.getPapername())) {
					before.add(pap);
				}
			 }		 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return before;	
	}
	
	
	@Override
	public List<Paper> showafterPaper(String username) {
		//未来的考试
		List<Paper> after=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper pap=null;
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
				pap= new Paper();
					pap.setId(rs.getInt(1));
					pap.setStarttime(rs.getDate(2));
					pap.setEndtime(rs.getDate(3));
					pap.setPapername(rs.getString(4));
					pap.setXzt1(rs.getInt(5));
					pap.setXzt2(rs.getInt(6));
					pap.setXzt3(rs.getInt(7));
					pap.setXzt4(rs.getInt(8));
					pap.setXzt5(rs.getInt(9));

					
					
					pap.setTkt1(rs.getInt(10));
					pap.setTkt2(rs.getInt(11));
					pap.setTkt3(rs.getInt(12));
					pap.setTkt4(rs.getInt(13));
				
					pap.setBct1(rs.getInt(14));
					pap.setBct2(rs.getInt(15));
					
				
				 if (pap.getStarttime().toString().compareTo(d)>0||!IsDone(username,pap.getPapername())) {
					after.add(pap);
				}}}	 
		 catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return after;	
	}
	
	@Override
	public List<Paper> shownowPaper(String username) {
		//当前可以进行的考试
		List<Paper> now=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper pap=null;
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
				 pap=new Paper();
					pap.setId(rs.getInt(1));
					pap.setStarttime(rs.getDate(2));
					pap.setEndtime(rs.getDate(3));
					pap.setPapername(rs.getString(4));
					pap.setXzt1(rs.getInt(5));
					pap.setXzt2(rs.getInt(6));
					pap.setXzt3(rs.getInt(7));
					pap.setXzt4(rs.getInt(8));
					pap.setXzt5(rs.getInt(9));

					
					
					pap.setTkt1(rs.getInt(10));
					pap.setTkt2(rs.getInt(11));
					pap.setTkt3(rs.getInt(12));
					pap.setTkt4(rs.getInt(13));
				
					pap.setBct1(rs.getInt(14));
					pap.setBct2(rs.getInt(15));
						
				if(pap.getStarttime().toString().compareTo(d)<0&&pap.getEndtime().toString().compareTo(d)>0&&!IsDone(username, pap.getPapername())) {
					now.add(pap);						 		 
		} }}catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return now;	
	}

	@Override
	public Paper selectInstance(String papername) {
		Paper pap=new Paper();
		String sql = "select * from paper where papername=?";
		Connection con=null;
		try {
			con=DBUtil.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, papername);
			rs = pst.executeQuery();
			while(rs.next()) {
				pap.setId(rs.getInt(1));
				pap.setStarttime(rs.getDate(2));
				pap.setEndtime(rs.getDate(3));
				pap.setPapername(rs.getString(4));
				pap.setXzt1(rs.getInt(5));
				pap.setXzt2(rs.getInt(6));
				pap.setXzt3(rs.getInt(7));
				pap.setXzt4(rs.getInt(8));
				pap.setXzt5(rs.getInt(9));

				
				pap.setTkt1(rs.getInt(10));
				pap.setTkt2(rs.getInt(11));
				pap.setTkt3(rs.getInt(12));
				pap.setTkt4(rs.getInt(13));
			
				pap.setBct1(rs.getInt(14));
				pap.setBct2(rs.getInt(15));
				
				
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return pap;
	}

	@Override
	public boolean IsDone(String username, String papername) {
	
		String sql="select * from studentgrade where username=? and papername=?";
		  con=DBUtil.getConnection();
		  try {
			pst=con.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, papername);
			rs=pst.executeQuery();
			if (rs.next()) {
			     return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}	
		return false;
	}

	@Override
	public boolean insertname(Paper paper,Connection con) throws SQLException {
		 String sql="insert into paper(starttime,endtime,papername) values(?,?,?)";
				pst=con.prepareStatement(sql);			
	        	pst.setDate(1, (java.sql.Date)paper.getStarttime());
				pst.setDate(2, (java.sql.Date)paper.getEndtime());
				pst.setString(3, paper.getPapername());
				int n=pst.executeUpdate();		
				if(n>0) {
					b=true;
				}
				DBUtil.CloseConnection(rs, pst, con);
			
			return b;
	}

	@Override
	public boolean insertxz(Paper paper, Connection con) throws SQLException {
		 String sql="update paper set xzt1=?,xzt2=?,xzt3=?,xzt4=?,xzt5=? where id=6";
			pst=con.prepareStatement(sql);			
     	    pst.setInt(1, paper.getXzt1());
     	    pst.setInt(2, paper.getXzt2());
     	    pst.setInt(3, paper.getXzt3());
     	    pst.setInt(4, paper.getXzt4());
     	    pst.setInt(5, paper.getXzt5());
			int n=pst.executeUpdate();		
			if(n>0) {
				b=true;
			}
			DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	public boolean insertk(Paper paper, Connection con) throws SQLException {
		 String sql="update paper set tkt1=?,tkt2=?,tkt3=?,tkt4=? where id=6";
	    pst=con.prepareStatement(sql);			
  	    pst.setInt(1, paper.getTkt1());
  	    pst.setInt(2, paper.getTkt2());
  	    pst.setInt(3, paper.getTkt3());
  	    pst.setInt(4, paper.getTkt4());
			int n=pst.executeUpdate();		
			if(n>0) {
				b=true;
			}
			DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	public boolean insertbc(Paper paper, Connection con) throws SQLException {
		 String sql="update paper set bct1=?,bct2=? where id=6";
		    pst=con.prepareStatement(sql);			
	  	    pst.setInt(1, paper.getBct1());
	  	    pst.setInt(2, paper.getBct2());
				int n=pst.executeUpdate();		
				if(n>0) {
					b=true;
				}
				DBUtil.CloseConnection(rs, pst, con);
			return b;
	}

}
