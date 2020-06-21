package com.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Bct;
import com.bean.Tkt;
import com.bean.Xzt;
import com.db.DBUtil;

/**
 * Servlet implementation class BachExcel
 */
@WebServlet("/BachExcel")
public class BachExcel {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static void insert(Xzt xzt) throws SQLException {
		Connection con =DBUtil.getConnection();
		String sql="insert into xzt(id,question, answer, optionA, optionB,optionC,optionD,questiontype,questionpoint) values(null,?,?,?,?,?,?,1,?)";
		PreparedStatement ps = con.prepareStatement(sql);
        ps = con.prepareStatement(sql);
		ps.setString(1, xzt.getQuestion());
		ps.setString(2, xzt.getAnswer());
		ps.setString(3, xzt.getOptionA());
		ps.setString(4, xzt.getOptionB());
		ps.setString(5, xzt.getOptionC());
		ps.setString(6, xzt.getOptionD());
		ps.setString(7, xzt.getQuestionpoint());
         boolean flag = ps.execute();
		if(!flag){
			System.out.println("Save data : No. = " + xzt.toString()+ " succeed!");
		}else {
			System.out.println("NoSave data : No. = " + xzt.toString()+ " failed!");

		}
}
	public static void insert(Tkt tkt) throws SQLException {
		Connection con =DBUtil.getConnection();
		String sql="insert into tkt(id,question, answer,questiontype,questionpoint) values(null,?,?,2,?)";
		PreparedStatement ps = con.prepareStatement(sql);
        ps = con.prepareStatement(sql);
		ps.setString(1, tkt.getQuestion());
		ps.setString(2, tkt.getAnswer());
		ps.setString(3, tkt.getQuestionpoint());
         boolean flag = ps.execute();
     	System.out.println("777   "+tkt.getAnswer());
		if(!flag){
			System.out.println("Save data : No. = " + tkt.toString()+ " succeed!");
		}else {
			System.out.println("NoSave data : No. = " + tkt.toString()+ " failed!");

		}
}
	public static void insert(Bct bct) throws SQLException {
		Connection con =DBUtil.getConnection();
		String sql="insert into bct(id,question,questiontype,questionpoint) values(null,?,3,?)";
		PreparedStatement ps = con.prepareStatement(sql);
        ps = con.prepareStatement(sql);
		ps.setString(1, bct.getQuestion());	
		ps.setString(2, bct.getQuestionpoint());
         boolean flag = ps.execute();
		if(!flag){
			System.out.println("Save data : No. = " + bct.toString()+ " succeed!");
		}else {
			System.out.println("NoSave data : No. = " + bct.toString()+ " failed!");

		}
}
/*
    public BachExcel() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
*/
}
