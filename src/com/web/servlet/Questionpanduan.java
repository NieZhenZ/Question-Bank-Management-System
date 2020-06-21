package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.bean.Bct;
import com.bean.Paper;
import com.bean.Xzt;
import com.dao.l.BctInterfaceDao;
import com.dao.l.TeacherInterfaceDao;
import com.dao.l.TktInterfaceDao;
import com.dao.l.XztInterfaceDao;
import com.dao.lmpl.BctInterfaceImplDao;
import com.dao.lmpl.PaperInterfaceImplDao;
import com.dao.lmpl.TeacherInterfaceImplDao;
import com.dao.lmpl.TktInterfaceImplDao;
import com.db.DBUtil;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.Timestamp;
import java.text.*;

public class Questionpanduan extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
    public Questionpanduan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        java.util.Date start = new java.util.Date();
        java.sql.Date starttime = new java.sql.Date(start.getTime());
        
        long  time=start.getTime();
        long  day=3*24*60*60*1000;
        time +=day;
        
        java.sql.Date endtime = new java.sql.Date(time);
        
	    String papername = request.getParameter("papername");
	    String message1 = null;
	    String message2 = null;
		Paper paper = new Paper(starttime,endtime,papername);
		System.out.println(paper.toString());
		try {
				con=DBUtil.getConnection();
				if(new PaperInterfaceImplDao().insertname(paper,con)){
					message1 = String.format(
							"恭喜！插入成功");
				    message2 = String.format(
								"<meta http-equiv='refresh' content='0;url=%s'", 
								request.getContextPath()+"/teacher/createPaper.jsp");
					System.out.println("插入成功");
				}else {
					 message1 = String.format(
								"对不起，插入失败！请重新尝试");
				}				
				request.setAttribute("message1",message1);
				request.setAttribute("message2",message2);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}