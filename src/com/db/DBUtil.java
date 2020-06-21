package com.db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Servlet implementation class DBUtil
 */
@WebServlet("/DBUtil")
public class DBUtil {
    String driver = null;
	static Connection con = null;
	static PreparedStatement pr = null;
	static ResultSet rs = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
	public static void CloseConnection(ResultSet rs, PreparedStatement pr, Connection con) {
		try {
			if (rs!= null)
				rs.close();
			if (pr != null)
				pr.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		}}
/*
    public DBUtil() {
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
