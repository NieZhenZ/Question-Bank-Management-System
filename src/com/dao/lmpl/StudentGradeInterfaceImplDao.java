package com.dao.lmpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentGrade;
import com.dao.l.StudentGradeInterfaceDao;
import com.db.DBUtil;

public class StudentGradeInterfaceImplDao implements StudentGradeInterfaceDao {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;

	
	/**
	 * ����һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	@Override
	public boolean insert(StudentGrade studentGrade) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="insert into studentgrade (username,xztscore,tktscore,papername)values (?,?,?,?)";
        try {
			pr=con.prepareStatement(sql);
			pr.setString(1, studentGrade.getUsername());
			pr.setInt(2, studentGrade.getXztscore());
			pr.setInt(3, studentGrade.getTktscore());
			pr.setString(4, studentGrade.getPapername());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
	
		
		return row>0;
	}
	/**
	 * ɾ��һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	@Override
	public boolean delete(StudentGrade studentGrade) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="delete from studentgrade where username=? and papername=?";
        try {
        	pr=con.prepareStatement(sql);
			pr.setString(1, studentGrade.getUsername());
			pr.setString(2, studentGrade.getPapername());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	
	/**
	 * �޸�һ��ѧ���ɼ���¼
	 * @param studentGrade
	 * @return
	 */
	@Override
	public boolean update(int bctscore,String username,String papername) {
		int row=0;
        con=DBUtil.getConnection();
        //��Ŀ���಻���
        String sql="update studentgrade set bctscore=? where username=? and papername=?";
        try {
			pr=con.prepareStatement(sql);	
			
			pr.setInt(1, bctscore);
			pr.setString(2,username );
		
			pr.setString(3, papername);

			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}
	/**
	 * ��ѯĳ��ѧ����ȫ���ɼ���¼
	 * @param username ѧ������
	 * @return ĳ��ѧ����ȫ���ɼ���¼StudentGrade
	 */
	@Override
	public List<StudentGrade> select(String username) {
		List<StudentGrade> list=new ArrayList<StudentGrade>();
		String sql="select * from studentgrade where username=?";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			pr.setString(1, username);
			rs=pr.executeQuery();
			while (rs.next()) {
				StudentGrade sgrade=new StudentGrade();
				sgrade.setId(rs.getInt("id"));
				sgrade.setUsername(username);
				sgrade.setXztscore(rs.getInt("xztscore"));
				sgrade.setTktscore(rs.getInt("tktscore"));
				sgrade.setBctscore(rs.getInt("bctscore"));
				sgrade.setPapername(rs.getString("papername"));
				list.add(sgrade);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}
	
/**
 * ��ѯĳ���Ծ���ĳ���༶��ȫ���ɼ���¼
 * @param studentclass ѧ�����ڰ༶
 * @param  papername �Ծ���
 * @return ĳ���Ծ��ȫ���ɼ���¼
 */
	@Override
	public List<StudentGrade> select(String studentclass, String papername) {
		System.out.println("<<<<<<<<<<<<<<<,");
		List<StudentGrade> list=new ArrayList<StudentGrade>();
		//String sql="select * from StudentGrade where username =(select username  from student where studentclass=? and papername=?";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement("select * from studentgrade ");
		//	pr.setString(1, studentclass);
			//pr.setString(2, papername);
			rs=pr.executeQuery();
			while (rs.next()) {
				StudentGrade sgrade=new StudentGrade();
				sgrade.setId(rs.getInt("id"));
				System.out.println(rs.getInt("id")+"<<<<<<<<<<<<<<<,");
				sgrade.setUsername(rs.getString("username"));
				sgrade.setXztscore(rs.getInt("xztscore"));
				sgrade.setTktscore(rs.getInt("tktscore"));
				sgrade.setBctscore(rs.getInt("bctscore"));
				sgrade.setPapername(rs.getString("papername"));
				list.add(sgrade);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			  System.out.println(list);
			DBUtil.CloseConnection(rs, pr, con);
		}	
		
		return list;
	}
@Override
public boolean updatesc(StudentGrade studentgrade, Connection con) throws SQLException {
	int row=0;
    //con=DBUtil.getConnection();
    //��Ŀ���಻���
    String sql="update studentgrade set bctscore=? where username=? and papername=?";
    try {
		pr=con.prepareStatement(sql);	
		
		pr.setInt(1,studentgrade.getBctscore());
		pr.setString(2,studentgrade.getUsername());
	
		pr.setString(3,studentgrade.getPapername());

		row=pr.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.CloseConnection(rs, pr, con);
	}
	return row>0;
}

/*
public boolean insert(StudentGrade studentGrade) {
	// TODO Auto-generated method stub
	return false;
}
*/
}
