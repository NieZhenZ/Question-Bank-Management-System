package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Bct;
import com.bean.Paper;
import com.bean.PaperString;
import com.bean.Tkt;
import com.bean.Xzt;
import com.db.DBUtil;

public class QuestionInstance {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;

	public static PaperString changeToPaperString(Paper paper){
		Xzt xzt1=getXzt(paper.getXzt1());
		Xzt xzt2=getXzt(paper.getXzt2());
		Xzt xzt3=getXzt(paper.getXzt3());
		Xzt xzt4=getXzt(paper.getXzt4());
		Xzt xzt5=getXzt(paper.getXzt5());

		Tkt tkt1=getTkt(paper.getTkt1());
		Tkt tkt2=getTkt(paper.getTkt2());
		Tkt tkt3=getTkt(paper.getTkt3());
		Tkt tkt4=getTkt(paper.getTkt4());
		Bct bct1=getBct(paper.getBct1());
		Bct bct2=getBct(paper.getBct2());
		PaperString ps=new PaperString(xzt1, xzt2, xzt3, xzt4, xzt5,tkt1, tkt2, tkt3, tkt4, bct1, bct2);
		ps.setPapername(paper.getPapername());
		ps.setStarttime(paper.getStarttime());
		ps.setEndtime(paper.getEndtime());
		return ps;
		
	}
	
	public static Xzt getXzt(int id) {
		Xzt xzt = new Xzt();
		String sql = "select * from xzt where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				xzt.setId(rs.getInt("id"));
				xzt.setQuestion(rs.getString("question"));
				xzt.setAnswer(rs.getString("answer"));
				xzt.setOptionA(rs.getString("optionA"));
				xzt.setOptionB(rs.getString("optionB"));
				xzt.setOptionC(rs.getString("optionC"));
				xzt.setOptionD(rs.getString("optionD"));
				xzt.setQuestiontype(1);
				xzt.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return xzt;

	}

	public static Tkt getTkt(int id) {
		Tkt tkt = new Tkt();
		String sql = "select * from tkt where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				tkt.setId(rs.getInt("id"));
				tkt.setQuestion(rs.getString("question"));
				tkt.setAnswer(rs.getString("answer"));
				tkt.setQuestiontype(2);
				tkt.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return tkt;

	}

	public static Bct getBct(int id) {
		Bct bct = new Bct();
		String sql = "select * from bct where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				bct.setId(rs.getInt("id"));
				bct.setQuestion(rs.getString("question"));
				bct.setQuestiontype(3);
				bct.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return bct;


	}

}